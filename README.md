OKVolley
==========
Fork from official Volley library, add OKHttp and GSON request.

#Usage
```
        GsonRequest request = new GsonRequest(url, ExampleModels.class, null, new Response.Listener() {
            @Override
            public void onResponse(Object response) {
                // TODO
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO
            }
        });
        OKVolley.getInstance(context).getRequestQueue().add(request);
```
And also, Volley provides ready-to-use JsonArrayRequest and JsonArrayObject classes if you prefer to take that approach.