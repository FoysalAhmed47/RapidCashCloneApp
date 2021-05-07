package com.example.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WitnessActivity extends AppCompatActivity {

    TextView PInformation,WInformation,EContact,DesInformation,NIDPic;
    ImageView backToHme,gotoOnlinSrvs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_witness);

        PInformation=findViewById(R.id.personal_information);
        WInformation=findViewById(R.id.work_information);
        EContact=findViewById(R.id.emergency_contract);
        DesInformation=findViewById(R.id.description_information);
        NIDPic=findViewById(R.id.photo_upload);

        backToHme=findViewById(R.id.image_back_witness);
        backToHme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WitnessActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        PInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WitnessActivity.this, PInformationActivity.class);
                startActivity(intent);
            }
        });

        WInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WitnessActivity.this, WorkInformation.class);
                startActivity(intent);
            }
        });

        EContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WitnessActivity.this, EmergencyInformation.class);
                startActivity(intent);
            }
        });

        DesInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WitnessActivity.this, DescriptionInformationActivity.class);
                startActivity(intent);
            }
        });

        NIDPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WitnessActivity.this, NIDInformationActivity.class);
                startActivity(intent);
            }
        });

        gotoOnlinSrvs=findViewById(R.id.title_image_help_witness);
        gotoOnlinSrvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WitnessActivity.this, OnlineServiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
