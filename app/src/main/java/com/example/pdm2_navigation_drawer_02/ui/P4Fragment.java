package com.example.pdm2_navigation_drawer_02.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.pdm2_navigation_drawer_02.R;

public class P4Fragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_p4, container, false);

//        TextView tvTitle = root.findViewById((R.id.tv_title));
//        tvTitle.setText(R.string.menu_p4);

//        ImageView ivTitle = root.findViewById((R.id.iv_title));
//        ivTitle.setImageResource(R.drawable.icon_coracao);

        return root;
    }
}