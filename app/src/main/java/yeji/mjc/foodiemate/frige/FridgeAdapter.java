package yeji.mjc.foodiemate.frige;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import yeji.mjc.foodiemate.R;

public class FridgeAdapter extends RecyclerView.Adapter<Fridge_recycle_holder> {

    //Context context;
    ArrayList<Item> items;

    public FridgeAdapter(ArrayList<Item> items) {
        this.items = items;
    }

    public Fridge_recycle_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fridge_recyclerview,parent,false);
        return new Fridge_recycle_holder(v);
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
