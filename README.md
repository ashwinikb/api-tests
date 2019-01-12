# API Automation Tests [![Build Status](https://travis-ci.org/ashwinikb/api-tests.svg?branch=master)](https://travis-ci.org/ashwinikb/api-tests/)

    API's 
        1. OpenWeatherMap API
        2. Quandle's stock quote API

#### Setup
    OpenWeatherMap API Tests
        1. Get APP ID from https://openweathermap.org/appid
        2. Update openWeatherMapAppId under src/test/resources/configuration.properties

    Quandle API Tests 
        1. Get API KEY from https://docs.quandl.com/
        2. Update quandlApiKey under src/test/resources/configuration.properties
                
#### Run
    mvn clean test
        
