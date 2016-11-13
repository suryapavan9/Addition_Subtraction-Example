package com.example.android.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = (TextView) findViewById(R.id.button);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        String f = b.getString("f");
        String s = b.getString("s");
        String op = b.getString("op");

        if(op.equals("add")) {
            tv1.setText("sum is : " + (Integer.parseInt(f) + Integer.parseInt(s)));
        }
        else if (op.equals("sub"))
        {
            tv1.setText("subtract is : " +(Integer.parseInt(f) - Integer.parseInt(s)));
        }
    }
}
