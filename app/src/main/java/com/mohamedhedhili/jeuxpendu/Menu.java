package com.mohamedhedhili.jeuxpendu;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
  Button btn_play   ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn_play = (Button)findViewById(R.id.btn_play);
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Theme.class);
                startActivity(i);
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(Menu.this);
        builder.setMessage("Category");
        builder.setMessage("Category"); // Message to be displayed


        LayoutInflater li = getLayoutInflater();
        View view = li.inflate(R.layout.alert_dialogue_menu, null);
    }
}
