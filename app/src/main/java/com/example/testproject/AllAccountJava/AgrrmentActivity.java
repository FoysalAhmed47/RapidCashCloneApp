package com.example.testproject.AllAccountJava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.testproject.AccountActivity;
import com.example.testproject.R;

public class AgrrmentActivity extends AppCompatActivity {

    ImageView backtoAccount,refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agrrment);

        backtoAccount=findViewById(R.id.image_back_agreement);
        backtoAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgrrmentActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
