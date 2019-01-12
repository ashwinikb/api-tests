package com.github.ashwinikb.stockdata;

import com.github.ashwinikb.Configuration;
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

        String url = Configuration.getConfigurationValue("quandlEndPoint") + "AAPL.json?api_key=" + Configuration.getConfigurationValue("quandlApiKey");

        Response response = RestAssured.get(url);

        String responseBody = response.getBody().asString();
        LOG.info("Response Body is : " + responseBody);
    }
}
