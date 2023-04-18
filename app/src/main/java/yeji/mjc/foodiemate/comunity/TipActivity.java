package yeji.mjc.foodiemate.comunity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import yeji.mjc.foodiemate.R;

public class TipActivity extends AppCompatActivity implements View.OnClickListener{

    ColorStateList def;
    TextView life_info,tip,food_battle,select;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip_main);

        //커뮤티니 메뉴바 구현
        life_info = findViewById(R.id.life_info);
        tip = findViewById(R.id.tip);
        food_battle = findViewById(R.id.food_battle);

        life_info.setOnClickListener(this);
        tip.setOnClickListener(this);
        food_battle.setOnClickListener(this);

        select = findViewById(R.id.select);
        def = tip.getTextColors();


        //이거어때 리사이클러바 구현
        List<TipItem> tipItems = new ArrayList<TipItem>();
        tipItems.add(new TipItem("Geuli**","4","5","식빵을 기름으로 없애보세요",R.drawable.bread));
        tipItems.add(new TipItem("Geuli**","4","5","식빵을 기름으로 없애보세요",R.drawable.bread));
        tipItems.add(new TipItem("Geuli**","4","5","식빵을 기름으로 없애보세요",R.drawable.bread));
        tipItems.add(new TipItem("Geuli**","4","5","식빵을 기름으로 없애보세요",R.drawable.bread));
        tipItems.add(new TipItem("Geuli**","4","5","식빵을 기름으로 없애보세요",R.drawable.bread));
        tipItems.add(new TipItem("Geuli**","4","5","식빵을 기름으로 없애보세요",R.drawable.bread));


        RecyclerView recyclerView = findViewById(R.id.tipRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TipAdapter(getApplicationContext(),tipItems));
    }

    //커뮤니티 메뉴바 선택 애니메이션 효과
    public void onClick(View view){
        if(view.getId() == R.id.life_info){
            select.animate().x(70).setDuration(100);
        }else if(view.getId()==R.id.tip){
            int size = tip.getWidth() + 75;
            select.animate().x(size).setDuration(100);
        }else if(view.getId()==R.id.food_battle){
            int size = tip.getWidth() * 2 + 85;
            select.animate().x(size).setDuration(100);
        }
    }
}
