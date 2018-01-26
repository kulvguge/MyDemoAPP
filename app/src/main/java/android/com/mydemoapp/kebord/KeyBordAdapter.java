package android.com.mydemoapp.kebord;

import android.com.mydemoapp.R;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */

public class KeyBordAdapter extends RecyclerView.Adapter<KeyBordAdapter.MyHolder> {
    private List<KeyNum> list;
    private Context context;

    public KeyBordAdapter(Context context, List<KeyNum> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(context).inflate(R.layout.item_keybord, null, false);
                break;
            case 1:
                view = LayoutInflater.from(context).inflate(R.layout.item_back, null, false);
                break;
            case 2:
                view = LayoutInflater.from(context).inflate(R.layout.item_del, null, false);
                break;
            default:
                break;
        }
        return new MyHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        int type = getItemViewType(position);
        switch (type) {
            case 0:
                holder.layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                holder.tvNum.setText(list.get(position).getNum()+"");
                holder.tvText.setText(list.get(position).getLetters());
                break;
            case 1:
                holder.layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, list.get(position).getType(), Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 2:
                holder.layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, list.get(position).getType(), Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getType();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        public LinearLayout layout;
        private TextView tvNum, tvText;

        public MyHolder(View itemView, int type) {
            super(itemView);
            switch (type) {
                case 0:
                    layout = itemView.findViewById(R.id.layout);
                    tvNum = itemView.findViewById(R.id.num);
                    tvText = itemView.findViewById(R.id.text);
                    break;
                case 1:
                    layout = itemView.findViewById(R.id.layout);
                    break;
                case 2:
                    layout = itemView.findViewById(R.id.layout);
                    break;

            }


        }
    }
}
