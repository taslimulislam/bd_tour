package com.example.dell.bd_tour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class khulnaActivity extends AppCompatActivity {
    public Button kh1_btn;
    public Button kh2_btn;
    public Button kh3_btn;
    public Button kh4_btn;
    public Button kh5_btn;
    public Button kh6_btn;
    public Button kh7_btn;
    public Button kh8_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);

        getSupportActionBar().setTitle("খুলনা বিভাগ");


        kh1_btn = (Button)findViewById(R.id.khulna1_btn);
        kh1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(khulnaActivity.this,khulna1Activity.class);
                startActivity(a);
            }
        });

        kh2_btn = (Button)findViewById(R.id.khulna2_btn);
        kh2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(khulnaActivity.this,khulna2Activity.class);
                startActivity(a);
            }
        });

        kh3_btn = (Button)findViewById(R.id.khulna3_btn);
        kh3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(khulnaActivity.this,khulna3Activity.class);
                startActivity(a);
            }
        });

        kh4_btn = (Button)findViewById(R.id.khulna4_btn);
        kh4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(khulnaActivity.this,khulna4Activity.class);
                startActivity(a);
            }
        });

        kh5_btn = (Button)findViewById(R.id.khulna5_btn);
        kh5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(khulnaActivity.this,khulna5Activity.class);
                startActivity(a);
            }
        });

        kh6_btn = (Button)findViewById(R.id.khulna6_btn);
        kh6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(khulnaActivity.this,khulna6Activity.class);
                startActivity(a);
            }
        });

        kh7_btn = (Button)findViewById(R.id.khulna7_btn);
        kh7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(khulnaActivity.this,khulna7Activity.class);
                startActivity(a);
            }
        });

        kh8_btn = (Button)findViewById(R.id.khulna8_btn);
        kh8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(khulnaActivity.this,khulna8Activity.class);
                startActivity(a);
            }
        });




    }
}
