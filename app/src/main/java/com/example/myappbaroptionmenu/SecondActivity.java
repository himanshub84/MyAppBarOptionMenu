 package com.example.myappbaroptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

 public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_menu,menu);
         return true;
     }

     @Override
     public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         switch (item.getItemId()){
             case R.id.subject1:
                 Toast.makeText(getApplicationContext(),"ENGLISH ITEM IS SELECTED",Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.subject2:
                 Toast.makeText(getApplicationContext(),"HINDI ITEM IS SELECTED",Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.subject3:
                 Toast.makeText(getApplicationContext(),"MATH ITEM IS SELECTED",Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.subject4:
                 Toast.makeText(getApplicationContext(),"SCIENCE ITEM IS SELECTED",Toast.LENGTH_SHORT).show();
                 return true;
             default:
                 return super.onOptionsItemSelected(item);
         }
     }

     public void LaunchFirstActivity(View view) {
         Intent i=new Intent(this,MainActivity.class);
         startActivity(i);
     }
 }