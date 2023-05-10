package yeji.mjc.foodiemate.mypage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import yeji.mjc.foodiemate.R;
import yeji.mjc.foodiemate.frige.Frigesujin;
import yeji.mjc.foodiemate.mypage.Bellset;
import yeji.mjc.foodiemate.mypage.UserInfoChange;

public class AddFriend extends AppCompatActivity {

    ImageView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_friend);

        search=findViewById(R.id.search);
        search.bringToFront();

        }
    }



