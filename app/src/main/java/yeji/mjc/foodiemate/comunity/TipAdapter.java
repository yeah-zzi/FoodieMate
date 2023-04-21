package yeji.mjc.foodiemate.comunity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import yeji.mjc.foodiemate.R;
import yeji.mjc.foodiemate.frige.Fridge_recycle_holder;
import yeji.mjc.foodiemate.frige.Item;

public class TipAdapter extends RecyclerView.Adapter<Tip_recycle_holder>{

    ArrayList<TipItem> items;

    public TipAdapter(ArrayList<TipItem> items) {
        this.items = items;
    }

    public yeji.mjc.foodiemate.comunity.Tip_recycle_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tip_recyclerview,parent,false);
        return new Tip_recycle_holder(v);
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
