package com.example.testproject.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testproject.HomeActivity;
import com.example.testproject.OnlineServiceActivity;
import com.example.testproject.R;
import com.example.testproject.RegisterActivity;

public class WitnessFragment extends Fragment {
TextView Regtxtpage;
Button LoginBtn;
ImageView cancelimg;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        cancelimg=(ImageView)view.findViewById(R.id.login_cencel_id);
        cancelimg.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction t = getFragmentManager().beginTransaction();
                Fragment mFrag = new LoanFragment();
                t.replace(R.id.fragment_container, mFrag);
                t.commit();
            }
        });

        LoginBtn= view.findViewById(R.id.login_btn_witness);
        LoginBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity().getApplication(), HomeActivity.class);
                startActivity(intent);
            }
        });

        Regtxtpage = view.findViewById(R.id.login_to_reg);
        Regtxtpage.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = new Intent(getActivity().getApplication(), RegisterActivity.class);
//                startActivity(intent);
                FragmentTransaction t = getFragmentManager().beginTransaction();
                Fragment mFrag = new RegisterFragment();
                t.replace(R.id.fragment_container, mFrag);
                t.commit();
            }
        });
        return view;
    }
}
