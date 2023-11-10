package com.example.actvitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.actvitylifecycle.R;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate called");
    }
    @Override

    protected void onStart() {
        super.onStart();
        showToast("OnStartcalled");
    }

    @Override

    protected void onRestart() {
        super.onRestart();
        showToast("onRestartecalled");
    }

    @Override

    protected void onResume() {
        super.onResume();
        showToast("onResumecalled");
    }

    @Override

    protected void onPause() {
        super.onPause();
        showToast("onPauseCalled");
    }
    @Override

    protected void onStop() {
        super.onStop();
        showToast("onStopCalled");
    }
    @Override

    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroyCalled");
    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }





}