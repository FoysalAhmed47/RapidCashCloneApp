package com.example.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testproject.AllAccountJava.AgrrmentActivity;
import com.example.testproject.AllAccountJava.IntroActivity;
import com.example.testproject.AllAccountJava.LoanRecordActivity;
import com.example.testproject.AllAccountJava.MessageActivity;
import com.example.testproject.AllAccountJava.ObjectionActivity;
import com.example.testproject.AllAccountJava.RepaymentActivity;
import com.example.testproject.AllAccountJava.SettingsActivity;

public class AccountActivity extends AppCompatActivity implements View.OnClickListener {

    private long backPressedTime;
    private Toast backToast;
    ImageView imgaccount,backToHome;
    TextView repayment,loanrecord,coupon,message,share,contact,onlineservs,objection,introduction,settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        repayment=findViewById(R.id.repayment_text_account);
        loanrecord=findViewById(R.id.loanrecord_text_account);
        coupon=findViewById(R.id.coupon_text_account);
        message=findViewById(R.id.message_text_account);
        share=findViewById(R.id.share_text_account);
        contact=findViewById(R.id.contact_text_account);
        onlineservs=findViewById(R.id.onlinesrvs_text_account);
        objection=findViewById(R.id.objection_text_account);
        introduction=findViewById(R.id.intro_text_account);
        settings=findViewById(R.id.setting_text_account);

        repayment.setOnClickListener(this);
        loanrecord.setOnClickListener(this);
        coupon.setOnClickListener(this);
        message.setOnClickListener(this);
        share.setOnClickListener(this);
        contact.setOnClickListener(this);
        onlineservs.setOnClickListener(this);
        objection.setOnClickListener(this);
        introduction.setOnClickListener(this);
        settings.setOnClickListener(this);

        backToHome=findViewById(R.id.image_back_accunt);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        imgaccount=findViewById(R.id.image_help_account);
        imgaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this, OnlineServiceActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.repayment_text_account:
                Intent intent1 = new Intent(AccountActivity.this, RepaymentActivity.class);
                startActivity(intent1);
                break;

            case R.id.loanrecord_text_account:
                Intent intent2 = new Intent(AccountActivity.this, LoanRecordActivity.class);
                startActivity(intent2);
                break;

            case R.id.coupon_text_account:
                Intent intent3 = new Intent(AccountActivity.this, CouponActivity.class);
                startActivity(intent3);
                break;

            case R.id.message_text_account:
                Intent intent4 = new Intent(AccountActivity.this, MessageActivity.class);
                startActivity(intent4);
                break;

            case R.id.share_text_account:
                Intent intent5 = new Intent(AccountActivity.this, ShareActivity.class);
                startActivity(intent5);
                break;

            case R.id.contact_text_account:
                Intent intent6 = new Intent(AccountActivity.this, AgrrmentActivity.class);
                startActivity(intent6);
                break;

            case R.id.onlinesrvs_text_account:
                Intent intent7 = new Intent(AccountActivity.this, OnlineServiceActivity.class);
                startActivity(intent7);
                break;

            case R.id.objection_text_account:
                Intent intent8 = new Intent(AccountActivity.this, ObjectionActivity.class);
                startActivity(intent8);
                break;

            case R.id.intro_text_account:
                Intent intent9 = new Intent(AccountActivity.this, IntroActivity.class);
                startActivity(intent9);
                break;

            case R.id.setting_text_account:
                Intent intent10 = new Intent(AccountActivity.this, SettingsActivity.class);
                startActivity(intent10);
                break;
        }
    }
}
