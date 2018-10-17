package com.example.dell.bd_tour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rajshahiActivity extends AppCompatActivity {

    public Button rj1_btn;
    public Button rj2_btn;
    public Button rj3_btn;
    public Button rj4_btn;
    public Button rj5_btn;
    public Button rj6_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);

        getSupportActionBar().setTitle("রাজশাহী বিভাগ");

        rj1_btn = (Button)findViewById(R.id.rajshai1_btn);
        rj1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(rajshahiActivity.this,raj1Activity.class);
                startActivity(a);
            }
        });

        rj2_btn = (Button)findViewById(R.id.rajshai2_btn);
        rj2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(rajshahiActivity.this,raj2Activity.class);
                startActivity(a);
            }
        });

        rj3_btn = (Button)findViewById(R.id.rajshai3_btn);
        rj3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(rajshahiActivity.this,raj3Activity.class);
                startActivity(a);
            }
        });

        rj4_btn = (Button)findViewById(R.id.rajshai4_btn);
        rj4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(rajshahiActivity.this,raj4Activity.class);
                startActivity(a);
            }
        });



        rj5_btn = (Button)findViewById(R.id.rajshai5_btn);
        rj5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(rajshahiActivity.this,raj5Activity.class);
                startActivity(a);
            }
        });

        rj6_btn = (Button)findViewById(R.id.rajshai6_btn);
        rj6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(rajshahiActivity.this,raj6Activity.class);
                startActivity(a);
            }
        });
    }
}
