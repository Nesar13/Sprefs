package com.example.sprefs;

import androidx.appcompat.app.AppCompatActivity;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button enterButton;
    private TextView showText;
    private EditText enterMessage;
    private final static String MESSAGE_ID = "messages";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterButton = findViewById(R.id.enter_button);
        enterMessage = findViewById(R.id.name_textId);
        showText = findViewById(R.id.show_text);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = enterMessage.getText().toString().trim();

                //setting up the interface sharePreferences
                //Create a final static string Message ID, and a private Int
                SharedPreferences sharedPreferences = getSharedPreferences(MESSAGE_ID, MODE_PRIVATE);


                //sharedPreferences must go through the editor first
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString("key", message);


                editor.apply(); //saving to disk

            }
        });

        SharedPreferences getSharedData = getSharedPreferences(MESSAGE_ID, MODE_PRIVATE);


        //setting default value to a string 
        String value= getSharedData.getString("message", "nothing to do");




    }
}
