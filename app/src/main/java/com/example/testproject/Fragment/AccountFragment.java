package com.example.testproject.Fragment;

import android.app.Activity;
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
import android.widget.Toast;

import com.example.testproject.AccountActivity;
import com.example.testproject.AllAccountJava.AgrrmentActivity;
import com.example.testproject.AllAccountJava.IntroActivity;
import com.example.testproject.AllAccountJava.MessageActivity;
import com.example.testproject.AllAccountJava.ObjectionActivity;
import com.example.testproject.AllAccountJava.RepaymentActivity;
import com.example.testproject.OnlineServiceActivity;
import com.example.testproject.R;
import com.example.testproject.ShareActivity;

public class AccountFragment extends Fragment implements View.OnClickListener {
    private long backPressedTime;
    private Toast backToast;
    ImageView OnsrvsBtn;
    TextView ToLogin,ToReg,frgrepayment,frgloanrecord,frgcoupon,frgmessage,frgshare,frgcontact,frgonlineservs,frgobjection,
            frgintroduction,frgsettings;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        frgrepayment=view.findViewById(R.id.repayment_text_frgmnt);
        frgloanrecord=view.findViewById(R.id.loanrecord_text_frgmnt);
        frgcoupon=view.findViewById(R.id.coupon_text_frgmnt);
        frgmessage=view.findViewById(R.id.message_text_frgmnt);
        frgshare=view.findViewById(R.id.share_text_frgmnt);
        frgcontact=view.findViewById(R.id.contact_text_frgmnt);
        frgonlineservs=view.findViewById(R.id.onlinesrvs_text_frgmnt);
        frgobjection=view.findViewById(R.id.objection_text_frgmnt);
        frgintroduction=view.findViewById(R.id.intro_text_frgmnt);
        frgsettings=view.findViewById(R.id.setting_text_frgmnt);

        frgrepayment.setOnClickListener(this);
        frgloanrecord.setOnClickListener(this);
        frgcoupon.setOnClickListener(this);
        frgmessage.setOnClickListener(this);
        frgshare.setOnClickListener(this);
        frgcontact.setOnClickListener(this);
        frgonlineservs.setOnClickListener(this);
        frgobjection.setOnClickListener(this);
        frgintroduction.setOnClickListener(this);
        frgsettings.setOnClickListener(this);


        OnsrvsBtn=view.findViewById(R.id.frgmnt_help_account);
        OnsrvsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity().getApplication(), OnlineServiceActivity.class);
                startActivity(intent);
            }
        });

        ToLogin=view.findViewById(R.id.login_account_text);
        ToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction t = getFragmentManager().beginTransaction();
                Fragment mFrag = new WitnessFragment();
                t.replace(R.id.fragment_container, mFrag);
                t.commit();
            }
        });

        ToReg=view.findViewById(R.id.register_account_text);
        ToReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction t = getFragmentManager().beginTransaction();
                Fragment mFrag = new RegisterFragment();
                t.replace(R.id.fragment_container, mFrag);
                t.commit();
            }
        });

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.repayment_text_frgmnt:
                FragmentTransaction t = getFragmentManager().beginTransaction();
                Fragment mFrag = new WitnessFragment();
                t.replace(R.id.fragment_container, mFrag);
                t.commit();
                break;

            case R.id.loanrecord_text_frgmnt:
                FragmentTransaction t1 = getFragmentManager().beginTransaction();
                Fragment mFrag1 = new WitnessFragment();
                t1.replace(R.id.fragment_container, mFrag1);
                t1.commit();
                break;

            case R.id.coupon_text_frgmnt:
                FragmentTransaction t2 = getFragmentManager().beginTransaction();
                Fragment mFrag2 = new WitnessFragment();
                t2.replace(R.id.fragment_container, mFrag2);
                t2.commit();
                break;

            case R.id.message_text_frgmnt:
                FragmentTransaction t3 = getFragmentManager().beginTransaction();
                Fragment mFrag3 = new WitnessFragment();
                t3.replace(R.id.fragment_container, mFrag3);
                t3.commit();
                break;

            case R.id.setting_text_frgmnt:
                FragmentTransaction t4 = getFragmentManager().beginTransaction();
                Fragment mFrag4 = new WitnessFragment();
                t4.replace(R.id.fragment_container, mFrag4);
                t4.commit();
                break;

            case R.id.share_text_frgmnt:
                Intent intent1 = new Intent(getActivity().getApplication(), ShareActivity.class);
                startActivity(intent1);
                break;

            case R.id.contact_text_frgmnt:
                Intent intent2 = new Intent(getActivity().getApplication(), AgrrmentActivity.class);
                startActivity(intent2);
                break;

            case R.id.onlinesrvs_text_frgmnt:
                Intent intent3 = new Intent(getActivity().getApplication(), OnlineServiceActivity.class);
                startActivity(intent3);
                break;

            case R.id.intro_text_frgmnt:
                Intent intent4 = new Intent(getActivity().getApplication(), IntroActivity.class);
                startActivity(intent4);
                break;

            case R.id.objection_text_frgmnt:
                Intent intent5 = new Intent(getActivity().getApplication(), ObjectionActivity.class);
                startActivity(intent5);
                break;
        }
    }
}


