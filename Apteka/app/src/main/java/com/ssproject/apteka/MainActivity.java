package com.ssproject.apteka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ImageView iv_doctors = (ImageView) findViewById(R.id.iv_doctors);
        iv_doctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(this, List_doctors.class);
                startActivity(intent);
            }
        });*/

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_doctors:
                Intent intent = new Intent(this, List_doctors.class);
                startActivity(intent);
                break;
            case R.id.iv_pharmacies:
                intent = new Intent(this, List_pharmacies.class);
                startActivity(intent);
                break;
            case R.id.iv_tablets:
                intent = new Intent(this, List_tablets.class);
                startActivity(intent);
                break;
            case R.id.iv_others:
                intent = new Intent(this, List_doctors.class);
                startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
