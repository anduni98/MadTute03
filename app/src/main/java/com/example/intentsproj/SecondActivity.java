package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView textView;

    Integer no1,no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=(TextView)findViewById(R.id.textView5);
        Button button=(Button)findViewById(R.id.button2);
        Button button1=(Button)findViewById(R.id.button3);
        Button button2=(Button)findViewById(R.id.button5);
        Button button3=(Button)findViewById(R.id.button4);

         num1 = (EditText) findViewById(R.id.editTextTextPersonName);
        Intent intent = getIntent();
        String numb1 = intent.getStringExtra("n1");
        num1.setText(numb1);

        num2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String numb2 = intent.getStringExtra("n2");
        num2.setText(numb2);


        //convert ti integer values

        no1 = Integer.parseInt(numb1);
        no2 = Integer.parseInt(numb2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(no1+"+"+no2+"="+(no1+no2));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(no1+"+"+no2+"="+(no1-no2));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(no1+"+"+no2+"="+(no1/no2));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(no1+"+"+no2+"="+(no1*no2));
            }
        });
    }

}