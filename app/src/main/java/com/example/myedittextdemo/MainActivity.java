package com.example.myedittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button subButton, addButton;
    private TextView result;
    private EditText inputOne, inputTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subButton=(Button)findViewById(R.id.buttonSub);
        addButton=(Button)findViewById(R.id.buttonAdd);

        result = (TextView)findViewById(R.id.ResultId);
        inputOne=(EditText)findViewById(R.id.editText1);
        inputTwo=(EditText)findViewById(R.id.editText2);
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String number1 = inputOne.getText().toString();
        String number2 = inputTwo.getText().toString();

        double num1=Double.parseDouble(number1);
        double num2=Double.parseDouble(number2);

        if(view.getId()==R.id.buttonAdd){

            double sum = num1+num2;
            result.setText("Result: "+sum);
        }
        if(view.getId()==R.id.buttonSub){
            double sub = num1-num2;
            result.setText("Result: "+sub);
        }


    }
}