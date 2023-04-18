package yeji.mjc.foodiemate.frige;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import yeji.mjc.foodiemate.R;

public class FridgeAdapter extends RecyclerView.Adapter<Fridge_recycle_holder> {

    Context context;
    List<Item> items;

    public FridgeAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    public Fridge_recycle_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Fridge_recycle_holder(LayoutInflater.from(context).inflate(R.layout.fridge_recyclerview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Fridge_recycle_holder holder, int position) {
        holder.food_img.setImageResource(items.get(position).getFood_img());
        holder.food_name.setText(items.get(position).getFood_name());
        holder.food_count.setText(items.get(position).getFood_count());
        holder.food_date.setText(items.get(position).getFood_date());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
