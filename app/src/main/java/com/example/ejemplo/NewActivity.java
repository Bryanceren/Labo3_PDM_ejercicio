package com.example.ejemplo;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class NewActivity extends AppCompatActivity {
    TextView new_user;
    TextView new_pass;
    TextView new_mail;
    TextView new_gender;
    ImageView submit2;
    String text1;
    String text2;
    String text3;
    String text4;
    JSONObject jsonx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        new_user=findViewById(R.id.txt_new_user);
        new_pass=findViewById(R.id.txt_new_pass);
        new_mail=findViewById(R.id.txt_new_email);
        new_gender=findViewById(R.id.txt_new_gender);
        submit2=findViewById(R.id.submit2);
        jsonx=new JSONObject();
        Intent intentonuevo = getIntent();
        text1=text2=text3=text4="Texto equis";
        if(intentonuevo!=null){
            text1=intentonuevo.getStringExtra(AppConstants.txt1_key);
            text2=intentonuevo.getStringExtra(AppConstants.txt2_key);
            text3=intentonuevo.getStringExtra(AppConstants.txt3_key);
            text4=intentonuevo.getStringExtra(AppConstants.txt4_key);
        }

        new_user.setText(text1);
        new_pass.setText(text2);
        new_mail.setText(text3);
        new_gender.setText(text4);
        try {
            jsonx.put("user",text1);
            jsonx.put("pass",text2);
            jsonx.put("mail",text3);
            jsonx.put("gender",text4);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentonuevo2=new Intent();
                intentonuevo2.setAction(Intent.ACTION_SEND);
                intentonuevo2.setType("text/plain");
                intentonuevo2.putExtra(Intent.EXTRA_TEXT,jsonx.toString());
                startActivity(intentonuevo2);
            }
        });
    }
}
