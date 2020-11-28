package com.example.piechartjavareal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2,edt3,edt4;

    public void draw(View view) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(edt1.getText().toString()));
        arrayList.add(Integer.valueOf(edt2.getText().toString()));
        arrayList.add(Integer.valueOf(edt3.getText().toString()));
        arrayList.add(Integer.valueOf(edt4.getText().toString()));

        Intent intent = new Intent(this,pieChart.class);
        intent.putIntegerArrayListExtra("arrayList",arrayList);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt_1);
        edt2 = findViewById(R.id.edt_2);
        edt3 = findViewById(R.id.edt_3);
        edt4 = findViewById(R.id.edt_4);
    }
}