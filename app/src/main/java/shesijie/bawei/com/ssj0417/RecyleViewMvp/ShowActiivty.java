package shesijie.bawei.com.ssj0417.RecyleViewMvp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.List;

import shesijie.bawei.com.ssj0417.MyADapter;
import shesijie.bawei.com.ssj0417.MyBean;
import shesijie.bawei.com.ssj0417.R;
import shesijie.bawei.com.ssj0417.RecycleAdapter;


public class ShowActiivty extends AppCompatActivity implements RecycleViewContanst.IReView {


    RecyclerView recycleListView;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_show_actiivty );
        recycleListView = findViewById ( R.id.rectcle );
        recycleListView.setLayoutManager ( new LinearLayoutManager ( this ) );
       RecycleViewPresenter recycleViewPresenter = new RecycleViewPresenter ();
       recycleViewPresenter.OnAttch ( this );
       /* listView = findViewById ( R.id.showList );*/
    }

    @Override
    public void getPresenter(String data) {
        Gson gson = new Gson ();
        MyBean myBean = gson.fromJson ( data , MyBean.class );
        List<MyBean.ResultBean> list = myBean.getResult ();
       /* listView.setAdapter ( new MyADapter ( list,this ) );*/
        recycleListView.setAdapter ( new RecycleAdapter ( this,list ) );
    }
}
