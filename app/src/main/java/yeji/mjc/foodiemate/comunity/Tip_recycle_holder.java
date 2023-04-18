package yeji.mjc.foodiemate.comunity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import yeji.mjc.foodiemate.R;

public class Tip_recycle_holder extends RecyclerView.ViewHolder {

    TextView id,like,comment,content;
    ImageView tip_img;


    public Tip_recycle_holder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.writer_id);
        like = itemView.findViewById(R.id.like_count);
        comment = itemView.findViewById(R.id.comment_count);
        content = itemView.findViewById(R.id.content);
        tip_img = itemView.findViewById(R.id.tip_post_img);
    }


}