package shesijie.bawei.com.ssj0417.RecyleViewMvp;

import com.android.volley.VolleyError;

import shesijie.bawei.com.ssj0417.HttpVollet;

public class RecycleViewModel implements RecycleViewContanst.IReModel {
    private String url = "http://172.17.8.100/movieApi/movie/v1/findReleaseMovieList?page=1&count=20";

    @Override
    public void show(final ReModelCallBack reModelCallBack) {
        HttpVollet.getInstance ().GetVolley ( url, new HttpVollet.VolleyCallBack () {
            @Override
            public void onSuccess(String result) {
                reModelCallBack.onSuccess ( result );
            }

            @Override
            public void onError(VolleyError error) {

            }
        } );
    }
}
