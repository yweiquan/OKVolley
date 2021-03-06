OKVolley
==========
Use [OKHttp][1] as the transport layer for [Volley][2], and you can use [GSON][3] to convert a JSON string to an equivalent Java object.

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

#License
```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```

[1]:https://github.com/square/okhttp
[2]:https://android.googlesource.com/platform/frameworks/volley
[3]:https://github.com/google/gson