package yeji.mjc.foodiemate.frige;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import yeji.mjc.foodiemate.R;
import yeji.mjc.foodiemate.frige.FridgeAdapter;
import yeji.mjc.foodiemate.frige.Item;

public class Frigesujin extends Fragment {

    //리사이클러뷰 변수 선언
    public RecyclerView recyclerView;
    public RecyclerView.Adapter adapter_refidge;
    public ArrayList<Item> items = new ArrayList<Item>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fridge_main, container, false);
        recyclerView = view.findViewById(R.id.fridgeRecyclerView);
        recyclerView.setHasFixedSize(true);
        return view;
    }

    public void onStart(){
        super.onStart();

        for(int i=0;i<14;i++){
            items.add(new Item(R.drawable.potato,"감자","20개","D-16"));
        }

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        recyclerView.setAdapter(new FridgeAdapter(items));
    }
}