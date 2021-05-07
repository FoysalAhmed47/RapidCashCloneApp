package com.example.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EmergencyQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_question);



        ImageView imageViewbck=findViewById(R.id.title_image_back_emrgqus);
        imageViewbck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyQuestion.this, HomeActivity.class);
                startActivity(intent);
            }
        });

       ImageView imgcoupon=findViewById(R.id.titleimg_help_emrgqus);
        imgcoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyQuestion.this, OnlineServiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
