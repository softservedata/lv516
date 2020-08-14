package com.ssproject.apteka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Pharmacy extends AppCompatActivity {

    ImageView mainImage;
    TextView title, adress, description;

    //String desc[];

    String data1, data2, data3;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);

        mainImage = findViewById(R.id.iv);
        title = findViewById(R.id.text1);
        adress = findViewById(R.id.text2);
        description = findViewById(R.id.text3);

        getData();
        setData();
    }

    private void getData(){
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") &&
                getIntent().hasExtra("data2") && getIntent().hasExtra("data3")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getStringExtra("data3");
            myImage = getIntent().getIntExtra("myImage", 1);
        }else{
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }

    }

    private  void setData(){
        title.setText(data1);
        adress.setText(data2);
        description.setText(data3);
        mainImage.setImageResource(myImage);

    }
}
