package com.upgrade.challenge.testing.API.testEndPoints;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
import static org.assertj.core.api.Assertions.assertThat;

public class states {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static String endpoint = "https://credapi.credify.tech/api/loanapp/v1/states";
  private Response response;

  @BeforeClass
  private void getResponse() {
    response = get(endpoint);
    logger.info(response.asString());
    int statusCode = response.statusCode();
    logger.info("Response code is <"+statusCode+">");
    assertThat(response.statusCode()).isEqualTo(200);
  }

  @Test
  public void test1_statesTotalSize48() {

    //get all valid states' name from https://simple.wikipedia.org/wiki/List_of_U.S._states
    // and use this as reference
    String all50statesName = ",Alabama,Alaska,Arizona,Arkansas,California,Colorado,Connecticut,Delaware,Florida,Georgia,Hawaii,"
        + "Idaho,Illinois,Indiana,Iowa,Kansas,Kentucky,Louisiana,Maine,Maryland,Massachusetts,Michigan,Minnesota,Mississippi,Missouri,Montana,Nebraska,Nevada,New Hampshire,New Jersey,New Mexico,New York,North Carolina,North Dakota,Ohio,Oklahoma,Oregon,Pennsylvania,Rhode Island,South Carolina,South Dakota,Tennessee,Texas,Utah,Vermont,Virginia,Washington,West Virginia,Wisconsin,Wyoming,";

    //Verify total state count is 48
    int stateTotalSize = response.jsonPath().getList("states.label").size();
    logger.info("total state count is <"+stateTotalSize+">");
    assertThat(stateTotalSize).isEqualTo(48);

    //Verify state name are valid
    List<String> stateList = response.jsonPath().getList("states.label");
    int validStateCount = 0;
    List<String> invalidStates = new ArrayList<>();
    for (String state : stateList) {

      if(all50statesName.contains("," + state + ",")) {
        validStateCount++;
        logger.debug("Verify state <" + state + "> is valid");
      }else {
        invalidStates.add(state);
        logger.info("Verify state <" + state + "> is NOT valid");
      }
    }
    assertThat(invalidStates.size()).isEqualTo(0);
  }

  @Test
  public void test2_onlyOneStateAge19() {

    //Validate only one state has min age of 19
    int stateSizeForAge19 = response.jsonPath().getList("states.findAll { states -> states.minAge == 19}.label").size();
    logger.info("count of states have minAge of 19: <" + stateSizeForAge19 + ">");
    assertThat(stateSizeForAge19).isEqualTo(1);

    //Find out the state which has min age of 19, and print state name to console
    String stateNameForAge19 = response.jsonPath().getString("states.findAll { states -> states.minAge == 19}.label");
    logger.info("state has minAge of 19 is: <" + stateNameForAge19 + ">");
    System.out.println(stateNameForAge19 + " is the state has a min age of 19");
  }

  @Test
  public void test3_GeorgiaIsOnlyStateHasAmount3005() {

    //Validate only one state has min loan amount of 3005
    int stateSizeForAmount3005 = response.jsonPath().getList("states.findAll { states -> states.minLoanAmount == 3005}.label").size();
    logger.info("count of states have minLoanAmount of 3005: <"+ stateSizeForAmount3005 +">");
    assertThat(stateSizeForAmount3005).isEqualTo(1);

    //Validate that state's name is Georgia
    String stateNameForAmount3005 = response.jsonPath().getString("states.findAll { states -> states.minLoanAmount == 3005}.label");
    logger.info("state has minLoanAmount of 3005 is: <"+ stateNameForAmount3005 +">");
    assertThat(stateNameForAmount3005).isEqualTo("[Georgia]");
  }
}
