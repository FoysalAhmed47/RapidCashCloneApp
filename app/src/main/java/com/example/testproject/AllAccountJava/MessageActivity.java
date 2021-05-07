package com.example.testproject.AllAccountJava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.testproject.AccountActivity;
import com.example.testproject.OnlineServiceActivity;
import com.example.testproject.R;

public class MessageActivity extends AppCompatActivity {

    ImageView backtoAccountActivity,gotoOnlineService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        gotoOnlineService=findViewById(R.id.message_onlinesrvs);
        gotoOnlineService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MessageActivity.this, OnlineServiceActivity.class);
                startActivity(intent);
            }
        });

        backtoAccountActivity=findViewById(R.id.image_back_message);
        backtoAccountActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MessageActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
