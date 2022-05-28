package com.xxoo.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;

public class HttpClientUtil {


    /**
     * okhttp3 POST请求
     * @return response
     */
    public static Response okHttpPostClient(HashMap<String,Object> paramMap){
        // 创建一个OkHttpClient实例
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        // 创建一个Request实例
        Request request = new Request.Builder()
                .url("http://www.baidu.com")
                .addHeader("aaa","")
                .method("", (RequestBody) paramMap.get(""))
                .build();

        // 使用 OkHttpClient 创建一个Call并执行 execute()方法，得到一个Response对象。
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }



    /**
     * okhttp3 Get请求
     * @return response
     */
    public static Response okHttpGetClient(HashMap<String,Object> paramMap){
        // 创建一个OkHttpClient实例
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        // 创建一个Request实例
        Request request = new Request.Builder().url("http://www.baidu.com").build();

        // 使用 OkHttpClient 创建一个Call并执行 execute()方法，得到一个Response对象。
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }



}
