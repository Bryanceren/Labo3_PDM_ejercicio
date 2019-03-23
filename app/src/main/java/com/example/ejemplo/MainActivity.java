package com.example.ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button action_submit;
    EditText usuario;
    EditText pass;
    EditText mail;
    EditText gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action_submit=findViewById(R.id.btn1);
        usuario=findViewById(R.id.txt_user);
        pass=findViewById(R.id.txt_pass);
        mail=findViewById(R.id.txt_email);
        gender=findViewById(R.id.txt_gender);

        action_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento= new Intent(MainActivity.this,NewActivity.class);
                intento.putExtra(AppConstants.txt1_key, usuario.getText().toString());
                intento.putExtra(AppConstants.txt2_key, pass.getText().toString());
                intento.putExtra(AppConstants.txt3_key, mail.getText().toString());
                intento.putExtra(AppConstants.txt4_key, gender.getText().toString());

                startActivity(intento);
            }
        });
    }
}
