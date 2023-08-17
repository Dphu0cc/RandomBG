package com.example.randombg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    List<Integer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.myLinearLayout);
        list.add(R.drawable.bk1);
        list.add(R.drawable.bk2);
        list.add(R.drawable.bk3);
        list.add(R.drawable.bk4);
        list.add(R.drawable.bk5);

        Random random = new Random();
        int vitri = random.nextInt(list.size());

        linearLayout.setBackgroundResource(list.get(vitri));
    }
}