package shesijie.bawei.com.ssj0417;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

public class HttpVollet {
    private static HttpVollet httpVollet = new HttpVollet ();
    StringRequest stringRequest;

    public static final  HttpVollet getInstance(){
        return httpVollet;
    }
    public void GetVolley(String url, final VolleyCallBack modelCallBack){
        stringRequest = new StringRequest ( Request.Method.GET , url , new Response.Listener<String> () {
             @Override
             public void onResponse(String response) {
                 modelCallBack.onSuccess ( response );
             }
         } , new Response.ErrorListener () {
             @Override
             public void onErrorResponse(VolleyError error) {
                 modelCallBack.onError ( error );
             }
         } );
        stringRequest.setTag ( "testTag" );
        MyApp.getQueue ().add ( stringRequest);
    }
    public interface VolleyCallBack{
        void onSuccess(String result);
        void onError(VolleyError error);
    }
}
