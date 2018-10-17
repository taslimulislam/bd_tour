package com.example.dell.bd_tour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class barishalActivity extends AppCompatActivity {

    public Button bari1_btn;
    public Button bari2_btn;
    public Button bari3_btn;
    public Button bari4_btn;
    public Button bari5_btn;
    public Button bari6_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barishal);

        getSupportActionBar().setTitle("বরিশাল বিভাগ");

      bari1_btn = (Button)findViewById(R.id.barisal1_btn);
      bari1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(barishalActivity.this,bari1Activity.class);
                startActivity(a);
            }
        });

        bari2_btn = (Button)findViewById(R.id.barisal2_btn);
        bari2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(barishalActivity.this,bari2Activity.class);
                startActivity(a);
            }
        });

        bari3_btn = (Button)findViewById(R.id.barisal3_btn);
        bari3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(barishalActivity.this,bari3Activity.class);
                startActivity(a);
            }
        });

        bari4_btn = (Button)findViewById(R.id.barisal4_btn);
        bari4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(barishalActivity.this,bari4Activity.class);
                startActivity(a);
            }
        });

        bari5_btn = (Button)findViewById(R.id.barisal5_btn);
        bari5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(barishalActivity.this,bari5Activity.class);
                startActivity(a);
            }
        });

        bari6_btn = (Button)findViewById(R.id.barisal6_btn);
        bari6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(barishalActivity.this,bari6Activity.class);
                startActivity(a);
            }
        });


    }
}
