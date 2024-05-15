package com.example.elearnig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class helpPannel extends AppCompatActivity {
    private Button homeBtn;
    private Button catalogBtn;
    private Button downloadBtn;
    private Button helpBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_pannel);
        homeBtn=findViewById(R.id.homeBtn);
        catalogBtn=findViewById(R.id.catalog);
        downloadBtn=findViewById(R.id.downloads);
        helpBtn=findViewById(R.id.helpBtn);




        //button
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homePage=new Intent(com.example.elearnig.helpPannel.this,com.example.elearnig.homePage.class);
                startActivity(homePage);
            }
        });


        catalogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent catalogPage=new Intent(com.example.elearnig.helpPannel.this, MainActivity.class);
                startActivity(catalogPage);
            }
        });



        downloadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloadPage=new Intent(com.example.elearnig.helpPannel.this, downloads.class);
                startActivity(downloadPage);
            }
        });





        helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpPage=new Intent(com.example.elearnig.helpPannel.this, helpPannel.class);
                startActivity(helpPage);
            }
        });

    }
}