package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        e1=findViewById(R.id.editTextText);
        e2=findViewById(R.id.editTextText2);
        t1=findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=e1.getText().toString().toString();
                String value2=e2.getText().toString().toString();
                if (value1.isEmpty()){
                    e1.setError("Empty");
                    return;
                } else if (value2.isEmpty()) {
                    e2.setError("Empty");
                    return;
                }
                Float num1=Float.parseFloat(e1.getText().toString());
                Float num2=Float.parseFloat((e2.getText().toString()));
                Float c=num1+num2;
                t1.setText("SUM="+c);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=e1.getText().toString().toString();
                String value2=e2.getText().toString().toString();
                if (value1.isEmpty()){
                    e1.setError("Empty");
                    return;
                } else if (value2.isEmpty()) {
                    e2.setError("Empty");
                    return;
                }
                Float num1=Float.parseFloat(e1.getText().toString());
                Float num2=Float.parseFloat((e2.getText().toString()));
                Float c=num1-num2;
                t1.setText("SUB="+c);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=e1.getText().toString().toString();
                String value2=e2.getText().toString().toString();
                if (value1.isEmpty()){
                    e1.setError("Empty");
                    return;
                } else if (value2.isEmpty()) {
                    e2.setError("Empty");
                    return;
                }
                Float num1=Float.parseFloat(e1.getText().toString());
                Float num2=Float.parseFloat((e2.getText().toString()));
                Float c=num1*num2;
                t1.setText("MUL="+c);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=e1.getText().toString().toString();
                String value2=e2.getText().toString().toString();
                if (value1.isEmpty()){
                    e1.setError("Empty");
                    return;
                } else if (value2.isEmpty()) {
                    e2.setError("Empty");
                    return;
                } else if (value2.equals("0")) {
                    e2.setError("Cannot be Zero");
                    return;
                }
                Float num1=Float.parseFloat(e1.getText().toString());
                Float num2=Float.parseFloat((e2.getText().toString()));
                Float c=num1/num2;
                t1.setText("DIV="+c);
            }
        });
    }
}