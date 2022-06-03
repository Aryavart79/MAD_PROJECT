package com.example.attendanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void dis(View view){
        Toast.makeText(this, "Try Contacting Owner", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username=(TextView) findViewById(R.id.user);
        TextView password=(TextView) findViewById(R.id.pass);

        Button login=(Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( (username.getText().toString().equals("aryavartsingh78@gmail.com")) || (username.getText().toString().equals("samarpitji@gmail.com")) && password.getText().toString().equals("project@123") )
                {
                    Intent intent1=new Intent(MainActivity.this,Project1.class);
                    startActivity(intent1);

                }
                else{
                    Toast.makeText(MainActivity.this, "Incorrect Password,Please Enter Correct Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}