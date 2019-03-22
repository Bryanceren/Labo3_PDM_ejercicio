package com.example.ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    TextView sharedtext;
    private String textaux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        sharedtext=findViewById(R.id.quemado);
        textaux="texto quemado";
        Intent nuevointento=getIntent();

        if (nuevointento!=null){
            textaux=nuevointento.getStringExtra(Intent.EXTRA_TEXT);
        }
        sharedtext.setText(textaux);
    }
}
