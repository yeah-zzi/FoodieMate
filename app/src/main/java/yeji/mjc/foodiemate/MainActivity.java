package yeji.mjc.foodiemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import yeji.mjc.foodiemate.comunity.TipActivity;
import yeji.mjc.foodiemate.frige.FridgeActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FridgeActivity.class);
                startActivity(intent);
            }
        });
        //test yeji
        //test yeji
    }
}