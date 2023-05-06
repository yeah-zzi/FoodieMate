package yeji.mjc.foodiemate;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyPagesujin extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.mypage, container, false);
        View User = view.findViewById(R.id.User);
        View Friend = view.findViewById(R.id.Friend);
        View Bell = view.findViewById(R.id.Bell);
        View Tutorial = view.findViewById(R.id.Tutorial);

        return view;
    }
}