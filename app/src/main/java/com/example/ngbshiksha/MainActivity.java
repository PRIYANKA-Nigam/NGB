package com.example.ngbshiksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editTextTextPersonName4);
        e2=(EditText)findViewById(R.id.editTextNumberPassword4);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("oilindia")&&e2.getText().toString().equals("12345")){
                    Intent i=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);
                    finish();
                }
                else {
                    Toast.makeText(MainActivity.this,"Wrong Login credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}