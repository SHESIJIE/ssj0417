package shesijie.bawei.com.ssj0417;

import android.app.Application;
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.List;

public class MyApp extends Application {
    private static RequestQueue queue;

    @Override
    public void onCreate() {
        super.onCreate ();
        queue = Volley.newRequestQueue ( getApplicationContext () );
    }
   public static RequestQueue getQueue(){
        return queue;
    }
}
