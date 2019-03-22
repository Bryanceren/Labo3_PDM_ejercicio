package com.example.ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button action_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action_submit=findViewById(R.id.btn1);
        action_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento= new Intent(MainActivity.this,NewActivity.class);
                intento.putExtra(AppConstants.txt1_key, "Texto desde mainactivity");
                startActivity(intento);
            }
        });
    }
}
