package com.example.helloworld;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HelloWorldTest {

  @Test
  public void testHelloWorld() {
    when().
        get("http://test-env-1.jvv4dzm6jh.us-west-2.elasticbeanstalk.com/").
    then().
        statusCode(200).
        body(containsString("Hello World1"));
  }

}