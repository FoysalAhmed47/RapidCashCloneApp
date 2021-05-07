package com.example.testproject.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


import com.example.testproject.OnlineServiceActivity;
import com.example.testproject.R;
import com.example.testproject.RegisterActivity;
import com.example.testproject.StartActivity;


public class LoanFragment extends Fragment {
    Button button;
    ImageView imageView;
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_loan, container, false);

        imageView=view.findViewById(R.id.frgmnt_help_loan);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), OnlineServiceActivity.class);
                startActivity(intent);
            }
        });

        button = (Button) view.findViewById(R.id.login_regtr_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction t = getFragmentManager().beginTransaction();
                Fragment mFrag = new RegisterFragment();
                t.replace(R.id.fragment_container, mFrag);
                t.commit();
            }
        });
        return view;

    }


}
