package com.example.bottombardemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 时间：2018/11/9 13:16
 * 姓名：韩晓康
 * 功能：
 */
public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View  view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_home, container, false);
        return view;
    }

}
