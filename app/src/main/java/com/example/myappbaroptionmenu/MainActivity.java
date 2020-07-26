package com.example.myappbaroptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Home:
                Toast.makeText(getApplicationContext(),"Home menu item Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.AboutUs:
                Toast.makeText(getApplicationContext(),"AboutUs menu item Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Contact:
                Toast.makeText(getApplicationContext(),"Contact menu item Selected",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void GoogleOpen(MenuItem item) {
        Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(i1);
    }

    public void InstaOpen(MenuItem item) {
        Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com.com"));
        startActivity(i2);
    }

    public void FacebookOpen(MenuItem item) {
        Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com"));
        startActivity(i3);
    }
}