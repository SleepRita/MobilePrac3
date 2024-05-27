package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import android.util.DisplayMetrics;

import org.w3c.dom.Text;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        TextView tv = findViewById(R.id.text1);
        ConstraintLayout.LayoutParams prm = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        prm.setMargins(40,40,40,40);
        tv.setLayoutParams(prm);
        tv.setPadding(40,40,40,40);
        tv.setText("Look!");
        tv.setTextSize(24);

        TextView tv2 = findViewById(R.id.text2);
        tv2.setLayoutParams(new ViewGroup.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        tv2.setTextSize(35);
        tv2.setText("Cat is lying on the sofa.");

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        System.out.println(height+" "+width);
    }
}