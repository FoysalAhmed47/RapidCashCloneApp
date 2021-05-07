package com.example.testproject.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testproject.OnlineServiceActivity;
import com.example.testproject.R;

public class RegisterFragment extends Fragment {

    ImageView imgOnlineSirvs,backToLogin;
    TextView RegToLogin;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        backToLogin=view.findViewById(R.id.register_title_image_back);
        backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction t = getFragmentManager().beginTransaction();
                Fragment mFrag = new WitnessFragment();
                t.replace(R.id.fragment_container, mFrag);
                t.commit();
            }
        });

        RegToLogin=view.findViewById(R.id.register_to_login);
        RegToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction t = getFragmentManager().beginTransaction();
                Fragment mFrag = new WitnessFragment();
                t.replace(R.id.fragment_container, mFrag);
                t.commit();
            }
        });

        imgOnlineSirvs=view.findViewById(R.id.onlne_srvs_register);
        imgOnlineSirvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), OnlineServiceActivity.class);
                startActivity(intent);
            }
        });

        return view;

    }
}
