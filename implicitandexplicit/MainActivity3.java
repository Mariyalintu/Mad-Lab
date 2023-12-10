package com.example.exp_imp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.marvel.com/movies"));
        startActivity(intent);
    }
}