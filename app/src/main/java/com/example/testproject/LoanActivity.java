package com.example.testproject;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoanActivity extends AppCompatActivity {

    Button submitBtn;
    TextView txtcoupon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);

        ImageView imageView=findViewById(R.id.title_image_back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoanActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        ImageView img=findViewById(R.id.title_image_help);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoanActivity.this, OnlineServiceActivity.class);
                startActivity(intent);
            }
        });


        submitBtn=findViewById(R.id.loan_submit_btn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoanActivity.this, PInformationActivity.class);
                startActivity(intent);
            }
        });
        txtcoupon=findViewById(R.id.coupon_id);
        txtcoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoanActivity.this, CouponActivity.class);
                startActivity(intent);
            }
        });

    }
}
