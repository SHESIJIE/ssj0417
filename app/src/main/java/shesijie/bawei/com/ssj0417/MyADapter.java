package shesijie.bawei.com.ssj0417;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyADapter  extends BaseAdapter {
    private List<MyBean.ResultBean> list;
    private Context context;

    public MyADapter(List<MyBean.ResultBean> list , Context context) {
        this.list = list;
        this.context = context;
    }
    @Override
    public int getCount() {
        return list.size ();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position , View convertView , ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate ( context , R.layout.item_list , null );
            holder = new ViewHolder ();
            holder.imageView = convertView.findViewById ( R.id.list_ima );
            holder.textView = convertView.findViewById ( R.id.list_name );
            holder.textView1 = convertView.findViewById ( R.id.list_title );
            convertView.setTag ( holder );
        } else {
            holder = (ViewHolder) convertView.getTag (  );
        }
        holder.textView1.setText ( list.get ( position ).getName () );
       holder.textView.setText ( list.get ( position ) .getSummary ());

        Glide.with ( context ).load ( list.get ( position ).getImageUrl () ).into ( holder.imageView );
        return convertView;
    }
    class ViewHolder{
        TextView textView;
        TextView textView1;
        ImageView imageView;
    }
}
