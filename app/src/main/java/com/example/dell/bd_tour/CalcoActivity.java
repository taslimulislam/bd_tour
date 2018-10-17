package com.example.dell.bd_tour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;

import java.text.NumberFormat;

public class CalcoActivity extends AppCompatActivity {


    int quantity1= 0,tea_price1= 0;
    int quantity2= 0,tea_price2= 0;
    int quantity3= 0,tea_price3= 0;


    public EditText input_for_price1;
    public EditText input_for_price2;
    public EditText input_for_price3;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calco);
        getSupportActionBar().setTitle("হিসাব");

        input_for_price1 = (EditText)findViewById(R.id.editText_price1);
        input_for_price2 = (EditText)findViewById(R.id.editText_price2);
        input_for_price3 = (EditText)findViewById(R.id.editText_price3);



    }

    public int coffe_price1(){
        String price_of_coffe = input_for_price1.getText().toString();
        tea_price1 = Integer.parseInt(price_of_coffe);
        return tea_price1;

    }
    public void incqnt1(View view){
        quantity1 = quantity1 + 1;
        display1(quantity1);


    }
    public  void decqnt1(View view){
        quantity1 = quantity1 - 1;
        if (quantity1 < 0){
            quantity1 = 0;
            display1(quantity1);

        }
        else {
            display1(quantity1);

        }


    }
    public void display1(int number){
        TextView quantity_in_text1 = (TextView)findViewById(R.id.quantity_display1);
        quantity_in_text1.setText(""+ number);
    }
    public void submitorder1(View view){
        int price1, total1;

        price1 = coffe_price1();
        total1 = price1 * quantity1;
        display_price1(total1);


    }

    public void display_price1(int total_price1){
        TextView Total_price_View1 = (TextView)findViewById(R.id.total_price1);
        Total_price_View1.setText(NumberFormat.getCurrencyInstance().format(total_price1));

    }
    public void resetvalue1(View view){
        display1(0);
        display_price1(0);
        input_for_price1.setText("");

    }

    //for 2


    public int coffe_price2(){
        String price_of_coffe2 = input_for_price2.getText().toString();
        tea_price2 = Integer.parseInt(price_of_coffe2);
        return tea_price2;

    }
    public void incqnt2(View view){
        quantity2 = quantity2 + 1;
        display2(quantity2);


    }
    public  void decqnt2(View view){
        quantity2 = quantity2 - 1;
        if (quantity2 < 0){
            quantity2 = 0;
            display2(quantity2);

        }
        else {
            display2(quantity2);

        }


    }
    public void display2(int number){
        TextView quantity_in_text2 = (TextView)findViewById(R.id.quantity_display2);
        quantity_in_text2.setText(""+ number);
    }
    public void submitorder2(View view){
        int price2, total2;

        price2 = coffe_price2();
        total2 = price2 * quantity2;
        display_price2(total2);


    }

    public void display_price2(int total_price2){
        TextView Total_price_View2 = (TextView)findViewById(R.id.total_price2);
        Total_price_View2.setText(NumberFormat.getCurrencyInstance().format(total_price2));

    }
    public void resetvalue2(View view){
        display2(0);
        display_price2(0);
        input_for_price2.setText("");

    }

    //for3

    public int coffe_price3(){
        String price_of_coffe3 = input_for_price3.getText().toString();
        tea_price3 = Integer.parseInt(price_of_coffe3);
        return tea_price3;

    }
    public void incqnt3(View view){
        quantity3 = quantity3 + 1;
        display3(quantity3);


    }
    public  void decqnt3(View view){
        quantity3 = quantity3 - 1;
        if (quantity3 < 0){
            quantity3 = 0;
            display3(quantity3);

        }
        else {
            display3(quantity3);

        }




    }
    public void display3(int number){
        TextView quantity_in_text3 = (TextView)findViewById(R.id.quantity_display3);
        quantity_in_text3.setText(""+ number);
    }
    public void submitorder3(View view){
        int price3, total3;

        price3 = coffe_price3();
        total3 = price3 * quantity3;
        display_price3(total3);



    }

    public void display_price3(int total_price3){
        TextView Total_price_View3 = (TextView)findViewById(R.id.total_price3);
        Total_price_View3.setText(NumberFormat.getCurrencyInstance().format(total_price3));

    }
    public void resetvalue3(View view){
        display3(0);
        display_price3(0);
        input_for_price3.setText("");





    }



    public void submitorder4(View view){
        int price41, total4, price42, price43;


        price41 = coffe_price1();
        price42 = coffe_price2();
        price43 = coffe_price3();
        total4 = price41 + price42 + price43;
        display_price4(total4);


    }

    public void display_price4(int total_price4){
        TextView Total_price_View4 = (TextView)findViewById(R.id.total_price4);
        Total_price_View4.setText(NumberFormat.getCurrencyInstance().format(total_price4));

    }

    public void resetvalue4(View view){

        display1(0);
        display2(0);
        display3(0);
        display_price1(0);
        display_price2(0);
        display_price3(0);
        display_price4(0);
        input_for_price1.setText("");
        input_for_price2.setText("");
        input_for_price3.setText("");





    }
}



