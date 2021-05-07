package com.example.testproject.AllAccountJava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.testproject.AccountActivity;
import com.example.testproject.OnlineServiceActivity;
import com.example.testproject.R;

public class SettingsActivity extends AppCompatActivity {

    ImageView backtoAccount,gotoOnlineService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        gotoOnlineService=findViewById(R.id.online_help_setting);
        gotoOnlineService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, OnlineServiceActivity.class);
                startActivity(intent);
            }
        });

        backtoAccount=findViewById(R.id.image_back_setting);
        backtoAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
