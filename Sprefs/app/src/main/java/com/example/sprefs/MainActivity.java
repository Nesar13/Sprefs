package com.example.sprefs;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button enterButton;
    private TextView showText;
    private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterButton=findViewById(R.id.enter_button);
        editText=findViewById(R.id.name_textId);
        showText=findViewById(R.id.show_text);







    }
}
