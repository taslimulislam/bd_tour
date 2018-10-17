package com.example.dell.bd_tour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dhakaActivity extends AppCompatActivity {
    public Button dh1_btn;
    public Button dh2_btn;
    public Button dh3_btn;
    public Button dh4_btn;
    public Button dh5_btn;
    public Button dh6_btn;
    public Button dh7_btn;
    public Button dh8_btn;
    public Button dh9_btn;
    public Button dh10_btn;
    public Button dh11_btn;
    public Button dh12_btn;
    public Button dh13_btn;
    public Button dh14_btn;
    public Button dh15_btn;
    public Button dh16_btn;
    public Button dh17_btn;
    public Button dh18_btn;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);

        getSupportActionBar().setTitle("ঢাকা বিভাগ");

        dh1_btn = (Button)findViewById(R.id.dhaka1_btn);
        dh1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka1Activity.class);
                startActivity(a);
            }
        });

        dh2_btn = (Button)findViewById(R.id.dhaka2_btn);
        dh2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka2Activity.class);
                startActivity(a);
            }
        });

        dh3_btn = (Button)findViewById(R.id.dhaka3_btn);
        dh3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka3Activity.class);
                startActivity(a);
            }
        });

        dh4_btn = (Button)findViewById(R.id.dhaka4_btn);
        dh4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka4Activity.class);
                startActivity(a);
            }
        });

        dh5_btn = (Button)findViewById(R.id.dhaka5_btn);
        dh5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka5Activity.class);
                startActivity(a);
            }
        });

        dh6_btn = (Button)findViewById(R.id.dhaka6_btn);
        dh6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka6Activity.class);
                startActivity(a);
            }
        });

        dh7_btn = (Button)findViewById(R.id.dhaka7_btn);
        dh7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka7Activity.class);
                startActivity(a);
            }
        });

        dh8_btn = (Button)findViewById(R.id.dhaka8_btn);
        dh8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka8Activity.class);
                startActivity(a);
            }
        });


        dh9_btn = (Button)findViewById(R.id.dhaka9_btn);
        dh9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka9Activity.class);
                startActivity(a);
            }
        });

        dh10_btn = (Button)findViewById(R.id.dhaka10_btn);
        dh10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka10Activity.class);
                startActivity(a);
            }
        });

        dh11_btn = (Button)findViewById(R.id.dhaka11_btn);
        dh11_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka11Activity.class);
                startActivity(a);
            }
        });



        dh12_btn = (Button)findViewById(R.id.dhaka12_btn);
        dh12_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka12Activity.class);
                startActivity(a);
            }
        });

        dh13_btn = (Button)findViewById(R.id.dhaka13_btn);
        dh13_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka13Activity.class);
                startActivity(a);
            }
        });

        dh14_btn = (Button)findViewById(R.id.dhaka14_btn);
        dh14_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka14Activity.class);
                startActivity(a);
            }
        });

        dh15_btn = (Button)findViewById(R.id.dhaka15_btn);
        dh15_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka15Activity.class);
                startActivity(a);
            }
        });

        dh16_btn = (Button)findViewById(R.id.dhaka16_btn);
        dh16_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka16Activity.class);
                startActivity(a);
            }
        });

        dh17_btn = (Button)findViewById(R.id.dhaka17_btn);
        dh17_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,dhaka17Activity.class);
                startActivity(a);
            }
        });

        dh18_btn = (Button)findViewById(R.id.dhaka18_btn);
        dh18_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(dhakaActivity.this,CalcoActivity.class);
                startActivity(a);
            }
        });


    }
}
