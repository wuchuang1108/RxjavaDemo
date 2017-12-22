package com.rxjavademo;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wuchaung on 2017/11/26.
 * <p>
 * 说明:
 */

public interface Api {
    @GET("login/")

    Call getData(@Query("name") String name, @Query("password") String pw);
}
