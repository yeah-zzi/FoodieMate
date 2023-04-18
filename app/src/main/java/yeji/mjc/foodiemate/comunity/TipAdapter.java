package yeji.mjc.foodiemate.comunity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import yeji.mjc.foodiemate.R;

public class TipAdapter extends RecyclerView.Adapter<yeji.mjc.foodiemate.comunity.Tip_recycle_holder>{

    Context context;
    List<yeji.mjc.foodiemate.comunity.TipItem> items;

    public TipAdapter(Context context, List<yeji.mjc.foodiemate.comunity.TipItem> items) {
        this.context = context;
        this.items = items;
    }

    public yeji.mjc.foodiemate.comunity.Tip_recycle_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new yeji.mjc.foodiemate.comunity.Tip_recycle_holder(LayoutInflater.from(context).inflate(R.layout.tip_recyclerview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull yeji.mjc.foodiemate.comunity.Tip_recycle_holder holder, int position) {
        holder.tip_img.setImageResource(items.get(position).getTip_img());
        holder.id.setText(items.get(position).getId());
        holder.like.setText(items.get(position).getLike());
        holder.comment.setText(items.get(position).getComment());
        holder.content.setText(items.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
