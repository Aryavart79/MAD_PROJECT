package com.example.attendanceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Project1 extends AppCompatActivity {
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
    switch(item.getItemId())
    {
        case R.id.hou:
            Intent intent2=new Intent(Project1.this,MainActivity.class);
            startActivity(intent2);
            return true;
        case R.id.newStu:
            Intent intent3=new Intent(Project1.this,AddNewStudent.class);
            startActivity(intent3);
            return true;
        case R.id.remStu:
            Intent intent5=new Intent(Project1.this,RemoveStudent.class);
            startActivity(intent5);
            return true;
        case R.id.Contact:
            Intent intent4=new Intent(Project1.this,ContactUs.class);
            startActivity(intent4);
            return true;
        default:
            return false;
    }
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);
    }
}