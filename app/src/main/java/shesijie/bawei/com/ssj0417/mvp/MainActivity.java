package shesijie.bawei.com.ssj0417.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.List;

import shesijie.bawei.com.ssj0417.MyADapter;
import shesijie.bawei.com.ssj0417.MyBean;
import shesijie.bawei.com.ssj0417.R;

public class MainActivity extends AppCompatActivity implements Contaner.IView {

    MyBean myBean;
    ListView listView;
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        listView = findViewById ( R.id.list );

        presenter = new Presenter ();
        presenter.onAttch ( this );
    }

    @Override
    public void getPresenter(String data) {
        Gson gson = new Gson ();
        myBean = gson.fromJson ( data , MyBean.class );
        List<MyBean.ResultBean> list = myBean.getResult ();
        listView.setAdapter ( new MyADapter ( list,MainActivity.this) );
    }
}
