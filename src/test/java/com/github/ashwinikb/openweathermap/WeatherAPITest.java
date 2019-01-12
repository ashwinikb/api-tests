package com.github.ashwinikb.openweathermap;

import com.github.ashwinikb.Configuration;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.Map;

import static io.restassured.RestAssured.get;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WeatherAPITest {

    private static final Logger LOG = LogManager.getLogger(WeatherAPITest.class);


    @Test
    public void weather() {

        String openweathermapEndPoint = Configuration.getConfigurationValue("openweathermapEndPoint");
        String openWeatherMapAppId = Configuration.getConfigurationValue("openWeatherMapAppId");

        String url = openweathermapEndPoint + "?q=London,uk" + "&APPID=" + openWeatherMapAppId;

        Response response = get(url);
        ResponseBody body = response.getBody();
        int statusCode = response.getStatusCode();
        String contentType = response.getContentType();
        Map<String, String> cookies = response.getCookies();
        Headers headers = response.getHeaders();
        long time = response.getTime();


        assertEquals(200, statusCode);
        assertEquals("application/json; charset=utf-8", contentType);

        LOG.info("Response Body:" + body.prettyPrint());
        LOG.info("statusCode:" + statusCode);
        LOG.info("contentType:" + contentType);
        LOG.info("headers:" + headers);
        LOG.info("time:" + time);


    }
}
