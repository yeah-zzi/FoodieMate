package yeji.mjc.foodiemate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import yeji.mjc.foodiemate.FoodSearch.FoodSearch;
import yeji.mjc.foodiemate.FoodSearch.FridgePlus;
import yeji.mjc.foodiemate.comunity.Comsujin;
import yeji.mjc.foodiemate.comunity.TipComment;
import yeji.mjc.foodiemate.frige.Frigesujin;

public class MainActivity extends AppCompatActivity {

    //플로팅 버튼
    private Animation rotateOpen;
    private Animation rotateClose;
    private Animation fromBottom;
    private Animation toBottom;
    FloatingActionButton tab, tab2, tab3;
    private boolean cliked = false;

    // 하단바 연결
    BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rotateOpen = AnimationUtils.loadAnimation(this, R.anim.rotate_open_anim);
        rotateClose = AnimationUtils.loadAnimation(this,R.anim.rotate_close_anim);
        fromBottom = AnimationUtils.loadAnimation(this,R.anim.from_bottom_anim);
        toBottom = AnimationUtils.loadAnimation(this,R.anim.to_bottom_anim);

        // + 버튼
        tab = findViewById(R.id.tab);
        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddButtonCliked();
            }
        });

        // 바코드 버튼
        tab2 = findViewById(R.id.tab2);
        tab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "ㅇㅇ", Toast.LENGTH_SHORT).show();
                Intent fridge2PlusIntent = new Intent(MainActivity.this, TipComment.class);
                startActivity(fridge2PlusIntent);
            }
        });

        // 직접입력 버튼
        tab3 = findViewById(R.id.tab3);
        tab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //그림이 만든 냉장고추가 팝업창 설정
                Intent fridgePlusIntent = new Intent(MainActivity.this, FridgePlus.class);
                startActivity(fridgePlusIntent);
            }
        });

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        //FrameLayout에 xml 띄우기
        getSupportFragmentManager().beginTransaction().add(R.id.container, new Frigesujin()).commit();

        //바텀 네비게이션뷰 안의 아이템 설정
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.f:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Frigesujin()).commit();
                        break;
                    case R.id.c:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Cartsujin()).commit();
                        break;
                    case R.id.p:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new MyPagesujin()).commit();
                        break;
                    case R.id.co:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Comsujin()).commit();
                        break;
                }
                return true;
            }
        });
    }

    // 클릭 이벤트
    private void onAddButtonCliked(){
        setVisibility(cliked);
        setAnimation(cliked);
        cliked = !cliked;
    }

    // 보여짐 사라짐
    private void setVisibility(boolean cliked){

        if(!cliked){
            tab2.setVisibility(tab2.VISIBLE);
            tab3.setVisibility(tab3.VISIBLE);
        } else {
            tab2.setVisibility(tab2.INVISIBLE);
            tab3.setVisibility(tab3.INVISIBLE);
        }
    }

    // 애니메이션
    private  void setAnimation(boolean cliked){

        if(!cliked){
            tab.startAnimation(rotateOpen);
            tab2.startAnimation(fromBottom);
            tab3.startAnimation(fromBottom);
        } else {
            tab.startAnimation(rotateClose);
            tab2.startAnimation(toBottom);
            tab3.startAnimation(toBottom);
        }
    }
}


