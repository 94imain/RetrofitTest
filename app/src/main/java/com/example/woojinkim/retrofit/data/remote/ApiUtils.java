package com.example.woojinkim.retrofit.data.remote;

/**
 * Created by woojinkim on 2017. 10. 24..
 */

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://52.79.180.194:3000/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}