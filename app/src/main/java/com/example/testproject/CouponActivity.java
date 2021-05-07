package com.example.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CouponActivity extends AppCompatActivity {

    ImageView imgcoupon,imageViewbck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);

        imageViewbck=findViewById(R.id.image_back_coupon);
        imageViewbck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CouponActivity.this, LoanActivity.class);
                startActivity(intent);
            }
        });

        imgcoupon=findViewById(R.id.titleimg_help_coupon);
        imgcoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CouponActivity.this, OnlineServiceActivity.class);
                startActivity(intent);
            }
        });
    }

}
