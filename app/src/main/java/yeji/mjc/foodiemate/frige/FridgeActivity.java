package yeji.mjc.foodiemate.frige;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import yeji.mjc.foodiemate.R;

public class FridgeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fridge_main);

        //냉장고 자바
        ImageView recipe = findViewById(R.id.recipe);
        ImageView bell = findViewById(R.id.bell);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.potato,"감자","20개","D-16"));
        items.add(new Item(R.drawable.potato,"감자","20개","D-16"));
        items.add(new Item(R.drawable.potato,"감자","20개","D-16"));

        items.add(new Item(R.drawable.potato,"감자","20개","D-16"));
        items.add(new Item(R.drawable.potato,"감자","20개","D-16"));
        items.add(new Item(R.drawable.potato,"감자","20개","D-16"));

        RecyclerView recyclerView = findViewById(R.id.fridgeRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(new yeji.mjc.foodiemate.frige.FridgeAdapter(getApplicationContext(),items));
    }
}
