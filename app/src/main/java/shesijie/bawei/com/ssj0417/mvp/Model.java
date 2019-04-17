package shesijie.bawei.com.ssj0417.mvp;

import com.android.volley.VolleyError;

import shesijie.bawei.com.ssj0417.HttpVollet;

public class Model implements Contaner.IModel {
    private String url = "http://172.17.8.100/movieApi/movie/v1/findReleaseMovieList?page=1&count=20";
    @Override
    public void show(final ModelCallBack modelCallBack) {
       HttpVollet.getInstance ().GetVolley ( url, new HttpVollet.VolleyCallBack () {
           @Override
           public void onSuccess(String result) {
               modelCallBack.onSuccess ( result );
           }

           @Override
           public void onError(VolleyError error) {

           }
       } );
    }
}
