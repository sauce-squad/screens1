 package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchMainActivity2 (View v){
        Intent i =new Intent(this, MainActivity2.class);
        startActivity(i);
    }
     public void  launchMainActivity5 (View v){
         Intent i =new Intent(this, MainActivity5.class);
         startActivity(i);
     }
 }