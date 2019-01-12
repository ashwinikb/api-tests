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

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/WIKI/FB/?api_key=xcBsR69LBykRKhCP3zjk");

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is : " + responseBody);
    }
}
