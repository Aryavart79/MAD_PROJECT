package com.example.attendanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddNewStudent extends AppCompatActivity {
    public void dis2(){
        Toast.makeText(this, "Your Request For Adding A New Student Has Been Submitted", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_student);
        TextView enroll=(TextView) findViewById(R.id.enr);
        TextView name=(TextView) findViewById(R.id.nam);
        TextView branch=(TextView) findViewById(R.id.bar);

        Button Submit=(Button) findViewById(R.id.button3);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddNewStudent.this, "Your Request For Adding A New Student Has Been Submitted Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}