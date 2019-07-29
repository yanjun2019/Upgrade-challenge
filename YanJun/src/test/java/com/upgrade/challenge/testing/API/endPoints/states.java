package com.upgrade.challenge.testing.API.endPoints;

import java.util.List;
import java.util.stream.Stream;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

import org.hamcrest.Matchers.*;
import org.openqa.selenium.json.Json;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.testng.Assert.assertTrue;

public class states {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static String endpoint = "https://credapi.credify.tech/api/loanapp/v1/states";
  private Response response;

  @BeforeClass
  private void getResponse() {
    response = get(endpoint);
    logger.info(response.asString());
  }

  @Test
  public void test1_statesTotalSize48() {

    String all50statesName = ",Alabama,Alaska,Arizona,Arkansas,California,Colorado,Connecticut,Delaware,Florida,Georgia,Hawaii,"
        + "Idaho,Illinois,Indiana,Iowa,Kansas,Kentucky,Louisiana,Maine,Maryland,Massachusetts,Michigan,Minnesota,Mississippi,Missouri,Montana,Nebraska,Nevada,New Hampshire,New Jersey,New Mexico,New York,North Carolina,North Dakota,Ohio,Oklahoma,Oregon,Pennsylvania,Rhode Island,South Carolina,South Dakota,Tennessee,Texas,Utah,Vermont,Virginia,Washington,West Virginia,Wisconsin,Wyoming,";

    //Verify state name are valid
    List<String> stateList = response.jsonPath().getList("states.label");
    for(String state : stateList ) {
      assertTrue(all50statesName.contains(","+state+","));
    }


    }



    //given().get(endpoint).then().statusCode(200).body("states.find { it.minLoanAmount == 3005}.label", equalTo("Georgia"));
    int stateTotalSize = response.jsonPath().getList("states.label").size();
    logger.info("stateTotalSize: <"+ stateTotalSize +">");
    int stateSizeForAge19 = response.jsonPath().getList("states.findAll { states -> states.minAge == 19}.label").size();
    logger.info("stateSizeForAge19: <"+ stateSizeForAge19 +">");
    String stateNameForAge19 = response.jsonPath().getString("states.findAll { states -> states.minAge == 19}.label");
    logger.info("stateNameForAge19: <"+ stateNameForAge19 +">");
    int stateSizeForAmount3005 = response.jsonPath().getList("states.findAll { states -> states.minLoanAmount == 3005}.label").size();
    logger.info("stateSizeForAmount3005: <"+ stateSizeForAmount3005 +">");
    String stateNameForAmount3005 = response.jsonPath().getString("states.findAll { states -> states.minLoanAmount == 3005}.label");
    logger.info("stateNameForAmount3005: <"+ stateNameForAmount3005 +">");

  }
}
