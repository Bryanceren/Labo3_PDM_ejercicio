package com.example.ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    TextView mtext;
    Button submit2;
    String text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mtext=findViewById(R.id.txtnew);
        submit2=findViewById(R.id.submit2);
        Intent intentonuevo = getIntent();
        text2="Texto equis";
        if(intentonuevo!=null){
            text2=intentonuevo.getStringExtra(AppConstants.txt1_key);
        }
        mtext.setText(text2);
        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentonuevo2=new Intent();
                intentonuevo2.setAction(Intent.ACTION_SEND);
                intentonuevo2.setType("text/plain");
                intentonuevo2.putExtra(Intent.EXTRA_TEXT,text2);
                startActivity(intentonuevo2);
            }
        });
    }
}
