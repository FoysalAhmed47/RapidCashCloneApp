package com.example.testproject;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testproject.Fragment.AccountFragment;
import com.example.testproject.Fragment.LoanFragment;
import com.example.testproject.Fragment.WitnessFragment;

public class RegisterActivity extends AppCompatActivity {

    ImageView imgonline,imgback;
    TextView Loginpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        imgonline=findViewById(R.id.online_srvs_register);
        imgonline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,OnlineServiceActivity.class);
                startActivity(intent);
            }
        });

        imgback=findViewById(R.id.register_title_image_back);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm=getSupportFragmentManager();
                AccountFragment witnessFragment=new AccountFragment();
                fm.beginTransaction().replace(R.id.register_activity, witnessFragment).commit();

            }
        });
    }
}
