package yeji.mjc.foodiemate.frige;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import yeji.mjc.foodiemate.R;

public class Fridge_recycle_holder extends RecyclerView.ViewHolder {

    ImageView food_img;
    TextView food_name;
    TextView food_count;
    TextView food_date;

    public Fridge_recycle_holder(@NonNull View itemView) {
        super(itemView);

        food_img = itemView.findViewById(R.id.food_img);
        food_name = itemView.findViewById(R.id.food_name);
        food_count = itemView.findViewById(R.id.food_count);
        food_date = itemView.findViewById(R.id.food_date);


    }
}
