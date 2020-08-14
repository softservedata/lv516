package com.ssproject.apteka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class List_doctors extends AppCompatActivity {

    ListView listView;
    ArrayList<itemDoctorModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_doctors);

        listView = findViewById(R.id.list_view);
        arrayList = new ArrayList<>();

        try {
            JSONObject object = new JSONObject(readJSON());
            JSONArray array = object.getJSONArray("doctors");
            for (int i = 0; i < array.length(); i++) {

                JSONObject jsonObject = array.getJSONObject(i);
                String type = jsonObject.getString("type");
                String name = jsonObject.getString("name");
                String email = jsonObject.getString("email");

                itemDoctorModel model = new itemDoctorModel();
                model.setType(type);
                model.setName(name);
                model.setEmail(email);
                arrayList.add(model);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        AdapterDoctor adapter = new AdapterDoctor(this, arrayList);
        listView.setAdapter(adapter);
    }

        public String readJSON() {
            String json = null;

            try {
                InputStream inputStream = getAssets().open("doctors.json");
                int size = inputStream.available();
                byte[] buffer = new byte[size];
                //read value in the byte array
                inputStream.read(buffer);
                inputStream.close();
                //convert byte to string
                json = new String(buffer, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            return json;
        }
}
