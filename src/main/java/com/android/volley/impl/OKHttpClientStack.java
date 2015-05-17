package com.android.volley.impl;

import com.android.volley.toolbox.HurlStack;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;

import org.apache.http.client.HttpClient;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * An HttpStack that performs request over an {@link HttpClient}.
 */
public class OKHttpClientStack extends HurlStack {

    private final OkUrlFactory mFactory;

    public OKHttpClientStack() {
        this(new OkHttpClient());
    }

    public OKHttpClientStack(OkHttpClient client) {
        if (client == null) {
            throw new NullPointerException("Client must not be null.");
        }
        mFactory = new OkUrlFactory(client);
    }

    @Override
    protected HttpURLConnection createConnection(URL url) throws IOException {
        return mFactory.open(url);
    }
}