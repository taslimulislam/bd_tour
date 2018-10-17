package com.example.dell.bd_tour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
        }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i=0;i<mainGrid.getChildCount();i++)
        {

            CardView cardView =(CardView)mainGrid.getChildAt(i);
            final  int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI== 0)
                    {
                        Intent intent = new Intent(MainActivity.this,dhakaActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI== 1)
                    {
                        Intent intent = new Intent(MainActivity.this,chittagongActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI== 2)
                    {
                        Intent intent = new Intent(MainActivity.this,slyhetActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI== 3)
                    {
                        Intent intent = new Intent(MainActivity.this,khulnaActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI== 4)
                    {
                        Intent intent = new Intent(MainActivity.this,barishalActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI== 5)
                    {
                        Intent intent = new Intent(MainActivity.this,rajshahiActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }


}

