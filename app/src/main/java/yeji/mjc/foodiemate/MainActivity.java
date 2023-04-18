package yeji.mjc.foodiemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import yeji.mjc.foodiemate.comunity.TipActivity;
import yeji.mjc.foodiemate.frige.FridgeActivity;

public class MainActivity extends AppCompatActivity {

    private Animation rotateOpen;
    private Animation rotateClose;
    private Animation fromBottom;
    private Animation toBottom;

    FloatingActionButton tab, tab2, tab3;

    private boolean cliked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barcode_register);

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
                Toast.makeText(MainActivity.this, "ㅇㅇ", Toast.LENGTH_SHORT).show();
            }
        });

        // 직접입력 버튼
        tab3 = findViewById(R.id.tab3);
        tab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "dzdz",Toast.LENGTH_SHORT).show();
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

        //test yeji
        //test yeji
        //dddddddd