package shesijie.bawei.com.ssj0417;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.holder> {
    private String name;
    private String logo;
    private Context context;
    private List<MyBean.ResultBean> list;
    String title;

    public RecycleAdapter(Context context , List<MyBean.ResultBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecycleAdapter.holder onCreateViewHolder(@NonNull ViewGroup viewGroup , int i) {
        View view = View.inflate ( context,R.layout.item_list,null );
        return new holder ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.holder holder , int i) {
        name = list.get(i).getName();
        logo = list.get(i).getImageUrl ();
        title = list.get ( i ).getSummary ();
        holder.textView.setText(name);
        holder.textView1.setText ( title );
        Glide.with(context).load(logo).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size ();
    }
    public class holder extends RecyclerView.ViewHolder{
        private TextView textView;
        private TextView textView1;
        private ImageView imageView;
        public holder(@NonNull View itemView) {
            super ( itemView );
            textView1 = itemView.findViewById ( R.id.list_name );
            imageView = itemView.findViewById ( R.id.list_ima );
            textView = itemView.findViewById ( R.id.list_title );
        }
    }
}
