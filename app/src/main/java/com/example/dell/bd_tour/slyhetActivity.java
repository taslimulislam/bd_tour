package com.example.dell.bd_tour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class slyhetActivity extends AppCompatActivity {
    public Button sly1_btn;
    public Button sly2_btn;
    public Button sly3_btn;
    public Button sly4_btn;
    public Button sly5_btn;
    public Button sly6_btn;
    public Button sly7_btn;
    public Button sly8_btn;
    public Button sly9_btn;
    public Button sly10_btn;
    public Button sly11_btn;
    public Button sly12_btn;
    public Button sly13_btn;
    public Button sly14_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slyhet);

        getSupportActionBar().setTitle("সিলেট বিভাগ");

        sly1_btn = (Button)findViewById(R.id.slyhet1_btn);
        sly1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly1Activity.class);
                startActivity(a);
            }
        });

        sly2_btn = (Button)findViewById(R.id.slyhet2_btn);
        sly2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly2Activity.class);
                startActivity(a);
            }
        });

        sly3_btn = (Button)findViewById(R.id.slyhet3_btn);
        sly3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly3Activity.class);
                startActivity(a);
            }
        });

        sly4_btn = (Button)findViewById(R.id.slyhet4_btn);
        sly4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly4Activity.class);
                startActivity(a);
            }
        });

        sly5_btn = (Button)findViewById(R.id.slyhet5_btn);
        sly5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly5Activity.class);
                startActivity(a);
            }
        });


        sly6_btn = (Button)findViewById(R.id.slyhet6_btn);
        sly6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly6Activity.class);
                startActivity(a);
            }
        });

        sly7_btn = (Button)findViewById(R.id.slyhet7_btn);
        sly7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly7Activity.class);
                startActivity(a);
            }
        });

        sly8_btn = (Button)findViewById(R.id.slyhet8_btn);
        sly8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly8Activity.class);
                startActivity(a);
            }
        });

        sly9_btn = (Button)findViewById(R.id.slyhet9_btn);
        sly9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly9Activity.class);
                startActivity(a);
            }
        });



        sly10_btn = (Button)findViewById(R.id.slyhet10_btn);
        sly10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly10Activity.class);
                startActivity(a);
            }
        });

        sly11_btn = (Button)findViewById(R.id.slyhet11_btn);
        sly11_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly11Activity.class);
                startActivity(a);
            }
        });

        sly12_btn = (Button)findViewById(R.id.slyhet12_btn);
        sly12_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly12Activity.class);
                startActivity(a);
            }
        });

        sly13_btn = (Button)findViewById(R.id.slyhet13_btn);
        sly13_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly13Activity.class);
                startActivity(a);
            }
        });

        sly14_btn = (Button)findViewById(R.id.slyhet14_btn);
        sly14_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(slyhetActivity.this,sly14Activity.class);
                startActivity(a);
            }
        });



    }
}
