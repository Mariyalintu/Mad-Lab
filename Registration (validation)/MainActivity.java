package com.example.registration4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    CheckBox c1;
    EditText e1,e2,e3;
    RadioGroup rg1;
    private boolean isEmailValid(String email){
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button3);
        e1=findViewById(R.id.editTextTextEmailAddress);
        e2=findViewById(R.id.editTextTextPassword);
        e3=findViewById(R.id.editTextTextPassword2);
        c1=findViewById(R.id.checkBox);
        rg1=findViewById(R.id.radioGroup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=e1.getText().toString();
                String pass=e2.getText().toString();
                String cpass=e3.getText().toString();
                
                //Password validation
                if (email.isEmpty()){
                    e1.setError("Empty");
                    return;
                }
                else if(isEmailValid(email)){

                }
                else {
                    e1.setError("Invalid email");
                    return;
                }
                if(pass.isEmpty()){
                    e2.setError("EMPTY");
                    return;
                } else if (cpass.isEmpty()) {
                    e3.setError("Empty");
                    return;
                } else if (pass.equals(cpass)) {

                }
                else {
                    e3.setError("Password Missmatch");
                    return;
                }
                
                
                //Radio Button validation
                if(rg1.getCheckedRadioButtonId()==-1){
                    Toast.makeText(MainActivity.this,"Select Gender",Toast.LENGTH_SHORT).show();
                    return;
                }
                
                //Checkbox validation
                
                if(!c1.isChecked()){
                    Toast.makeText(MainActivity.this,"Please agree to the terms and conditions",Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    Toast.makeText(MainActivity.this,"Registration Success",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}