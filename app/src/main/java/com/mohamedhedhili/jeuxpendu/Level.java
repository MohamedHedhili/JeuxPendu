package com.mohamedhedhili.jeuxpendu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level extends AppCompatActivity {
 private  Button btn_level1 , btn_level2 , btn_level3 , btn_level4 , btn_level5  ;
  private   String nameFile ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
         btn_level1 =  (Button)findViewById(R.id.btn_level1) ;
        btn_level2 =  (Button)findViewById(R.id.btn_level2) ;
        btn_level3 =  (Button)findViewById(R.id.btn_level3) ;
        btn_level4 =  (Button)findViewById(R.id.btn_level4) ;
        btn_level5 =  (Button)findViewById(R.id.btn_level5) ;
        Bundle extras  =  getIntent().getExtras() ;
      nameFile = extras.getString("nameFile");

        btn_level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  =  new Intent(Level.this , MainActivity.class);
                i.putExtra("nameFile",nameFile);
                i.putExtra("deb",0);
                i.putExtra("fin",10);
                startActivity(i);
            }
        });

        btn_level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  =  new Intent(Level.this , MainActivity.class);
                i.putExtra("nameFile",nameFile);
                i.putExtra("deb",10);
                i.putExtra("fin",20);
                startActivity(i);
            }
        });
        btn_level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  =  new Intent(Level.this , MainActivity.class);
                i.putExtra("nameFile",nameFile);
                i.putExtra("deb",20);
                i.putExtra("fin",30);
                startActivity(i);
            }
        });
        btn_level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i  =  new Intent(Level.this , MainActivity.class);
                i.putExtra("nameFile",nameFile);
                i.putExtra("deb",30);
                i.putExtra("fin",40);
                startActivity(i);
            }
        });
        btn_level5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  =  new Intent(Level.this , MainActivity.class);
                i.putExtra("nameFile",nameFile);
                i.putExtra("deb",40);
                i.putExtra("fin",50);
                startActivity(i);
            }
        });
    }
}
