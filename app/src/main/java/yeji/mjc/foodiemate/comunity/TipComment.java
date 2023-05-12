package yeji.mjc.foodiemate.comunity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import yeji.mjc.foodiemate.R;

public class TipComment extends Activity {

    //리사이클러뷰 변수 선언
    public RecyclerView recyclerView;
    public ArrayList<Tip_comment_item> items = new ArrayList<Tip_comment_item>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip_comment);
        recyclerView = findViewById(R.id.tip_comment_recycler);
        recyclerView.setHasFixedSize(true);
    }


    public void onStart(){
        super.onStart();

        for(int i=0;i<14;i++){
            items.add(new Tip_comment_item(R.drawable.cat,"Guelim","좋은 팁 감사링"));
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TipCommentAdapter(items));
    }
}