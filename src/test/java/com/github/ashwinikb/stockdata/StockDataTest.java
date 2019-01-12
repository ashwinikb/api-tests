package com.github.ashwinikb.stockdata;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class StockDataTest {

    private static final Logger LOG = LogManager.getLogger(StockDataTest.class);

    @Test
    public void stockDetails() {
        RestAssured.baseURI = "https://www.quandl.com/api/v3/databases";

        //Update with api_key
        String api_key = "";
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/WIKI/FB/?api_key=" + api_key);

        String responseBody = response.getBody().asString();
        LOG.info("Response Body is : " + responseBody);
    }
}
