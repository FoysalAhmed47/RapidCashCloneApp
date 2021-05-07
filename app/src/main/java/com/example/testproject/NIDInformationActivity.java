package com.example.testproject;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.baoyachi.stepview.HorizontalStepView;
import com.baoyachi.stepview.bean.StepBean;

import java.util.ArrayList;
import java.util.List;

public class NIDInformationActivity extends AppCompatActivity {

    ImageView img,imageView;
    TextView FrontPic,BackPic,SelfieNID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nidinformation);

        img=findViewById(R.id.NID_image_help);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NIDInformationActivity.this, OnlineServiceActivity.class);
                startActivity(intent);
            }
        });

        TextView submitlater=findViewById(R.id.submit_latera_NID);
        submitlater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NIDInformationActivity.this, WitnessActivity.class);
                startActivity(intent);
            }
        });

        imageView=findViewById(R.id.NID_image_back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NIDInformationActivity.this, DescriptionInformationActivity.class);
                startActivity(intent);
            }
        });

        //Custom AlerDialog NID picture taken

        //Front Picture
        FrontPic=findViewById(R.id.NID_fontpic);
        FrontPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ViewGroup viewGroup=findViewById(android.R.id.content);

                Button NextBtn;

                AlertDialog.Builder builder = new AlertDialog.Builder(NIDInformationActivity.this);
                View view= LayoutInflater.from(NIDInformationActivity.this).inflate(R.layout.dialog_layout,viewGroup,false);
                builder.setCancelable(false);
                builder.setView(view);

                AlertDialog alertDialog=builder.create();
                alertDialog.setCancelable(true);

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                NextBtn=view.findViewById(R.id.confirm_picture_btn);
                NextBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Intent=new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                        startActivity(Intent);

                    }
                });
                alertDialog.show();
            }
        });

        //Bck Picture
        BackPic=findViewById(R.id.NID_backpic);
        BackPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ViewGroup viewGroup=findViewById(android.R.id.content);

                Button NextBtn;

                AlertDialog.Builder builder = new AlertDialog.Builder(NIDInformationActivity.this);
                View view= LayoutInflater.from(NIDInformationActivity.this).inflate(R.layout.dialog_layout,viewGroup,false);
                builder.setCancelable(false);
                builder.setView(view);

                AlertDialog alertDialog=builder.create();
                alertDialog.setCancelable(true);

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                NextBtn=view.findViewById(R.id.confirm_picture_btn);
                NextBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Intent=new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                        startActivity(Intent);
                    }
                });
                alertDialog.show();
            }
        });

        //Selfie with NID
        SelfieNID=findViewById(R.id.selfiewith_NID);
        SelfieNID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ViewGroup viewGroup=findViewById(android.R.id.content);

                Button NextBtn;

                AlertDialog.Builder builder = new AlertDialog.Builder(NIDInformationActivity.this);
                View view= LayoutInflater.from(NIDInformationActivity.this).inflate(R.layout.dialog_layout,viewGroup,false);
                builder.setCancelable(false);
                builder.setView(view);

                AlertDialog alertDialog=builder.create();
                alertDialog.setCancelable(true);

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                NextBtn=view.findViewById(R.id.confirm_picture_btn);
                NextBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Intent=new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                        startActivity(Intent);
                    }
                });
                alertDialog.show();
            }
        });


//Steapper
        HorizontalStepView setpview5 = findViewById(R.id.step_view);
        List<StepBean> stepsBeanList = new ArrayList<>();
        StepBean stepBean0 = new StepBean("1",-1);
        StepBean stepBean1 = new StepBean("2",-1);
        StepBean stepBean2 = new StepBean("3",-1);
        StepBean stepBean3 = new StepBean("4",-1);
        StepBean stepBean4 = new StepBean("5",-1);
        stepsBeanList.add(stepBean0);
        stepsBeanList.add(stepBean1);
        stepsBeanList.add(stepBean2);
        stepsBeanList.add(stepBean3);
        stepsBeanList.add(stepBean4);

        setpview5
                .setStepViewTexts(stepsBeanList)
                .setTextSize(12)
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_red_light))
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getApplicationContext(),R.drawable.complted))
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.default_icon))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.default_icon));
    }
}
