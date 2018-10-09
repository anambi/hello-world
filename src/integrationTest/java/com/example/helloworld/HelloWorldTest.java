package com.example.helloworld;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HelloWorldTest {

  @Test
  public void testHelloWorld() {
    when().
        get("http://localhost:8080/").
    then().
        statusCode(200).
        body(containsString("Hello World"));
  }

}
