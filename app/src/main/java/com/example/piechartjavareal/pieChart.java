package com.example.piechartjavareal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.androidplot.pie.PieChart;
import com.androidplot.pie.Segment;
import com.androidplot.pie.SegmentFormatter;

import java.util.ArrayList;

public class pieChart extends AppCompatActivity {

    ArrayList<Integer> arrayList;
    PieChart pieChart;

    Segment s1;
    Segment s2;
    Segment s3;
    Segment s4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        pieChart = findViewById(R.id.pieChart);

        arrayList = getIntent().getIntegerArrayListExtra("arrayList");


        s1 = new Segment("S1",arrayList.get(0));
        s2 = new Segment("S2",arrayList.get(1));
        s3 = new Segment("S3",arrayList.get(2));
        s4 = new Segment("S4",arrayList.get(3));

        SegmentFormatter sf1 = new SegmentFormatter(Color.BLUE);
        SegmentFormatter sf2 = new SegmentFormatter(Color.YELLOW);
        SegmentFormatter sf3 = new SegmentFormatter(Color.RED);
        SegmentFormatter sf4 = new SegmentFormatter(Color.GRAY);

        pieChart.addSegment(s1,sf1);
        pieChart.addSegment(s2,sf2);
        pieChart.addSegment(s3,sf3);
        pieChart.addSegment(s4,sf4);
    }
}