package com.android.volley.impl;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * OKVolley singleton
 */
public class OKVolley {

	private static OKVolley okVolley = null;

	private static RequestQueue queue = null;

	public static OKVolley getInstance(Context context) {
        if (okVolley == null || queue == null){
            synchronized (OKVolley.class){
                if (okVolley == null || queue == null) {
                    okVolley = new OKVolley(context.getApplicationContext());
                }
            }
        }
		return okVolley;
	}

	private OKVolley(Context context) {
		queue = Volley.newRequestQueue(context, new OKHttpClientStack());
	}

    public RequestQueue getRequestQueue(){
        return queue;
    }

    public void stop() {
        if (queue != null) {
            queue.stop();
        }
        if (okVolley != null) {
            okVolley = null;
        }
    }

}
