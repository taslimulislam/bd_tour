package com.example.dell.bd_tour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NoteActivity extends AppCompatActivity {

    public Button add_btn,Show_btn;
    public EditText input_field;
    String user_name;
    datatabaseHelper mDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);


        add_btn = (Button)findViewById(R.id.ADD_btn);
        input_field = (EditText)findViewById(R.id.editText_input);
        Show_btn = (Button)findViewById(R.id.button_Show);
        mDB = new datatabaseHelper(this);
        Show_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),list_of_data.class);
                startActivity(i);



            }
        });
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_name = input_field.getText().toString();
                if (user_name.length()!=0){
                    sendDataToDatabase(user_name);
                    input_field.setText("");
                }
                else {
                    Toast.makeText(getApplicationContext(),"plz enter name",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    public void sendDataToDatabase(String name){

        boolean inserted_data = mDB.addDATA(name);
        if (inserted_data){
            Toast.makeText(this,"your name has been saved" , Toast.LENGTH_SHORT).show();

        }
        else {

            Toast.makeText(this,"your name has not been saved",Toast.LENGTH_LONG).show();
        }
    }



}
