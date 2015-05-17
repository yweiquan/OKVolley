package com.android.volley.impl;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Created by Will on 15/5/17.
 */
public class ExampleUsage {

    final String url = "http://www.example.api/model.json";

    public ExampleUsage(Context context) {

        GsonRequest request = new GsonRequest(url, ExampleModels.class, null, new Response.Listener() {
            @Override
            public void onResponse(Object response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        OKVolley.getInstance(context).getRequestQueue().add(request);
    }

    public static class ExampleModels{
        public int id;
        public String name;
        public String img;
    }
}
