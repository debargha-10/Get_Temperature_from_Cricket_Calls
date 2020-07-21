package com.example.crickettempapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button btn1;
    TextView tv2;
    RadioGroup radgrp;
    RadioButton radbtnc,radbtnf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        btn1= findViewById(R.id.btn1);
        tv2=findViewById(R.id.tv2);
        radgrp=findViewById(R.id.radgrp);
        radbtnf =findViewById(R.id.radbtnf);
        radbtnc =findViewById(R.id.radbtnc);
        tv2.setVisibility(View.GONE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=et1.getText().toString().trim();
                double temp1=Double.parseDouble(temp);
                double finaltemp;
                int selected=radgrp.getCheckedRadioButtonId();
                char scale='C';
                if (selected==radbtnf.getId())
                    {
                        scale='F';
                    }
                finaltemp=temp1/3.0+4.0;
                if (scale=='F')
                {
                    finaltemp=finaltemp*9.0/5.0+32.0;
                }

                String text="The approximate temperature outside is: "+finaltemp+"°"+scale;
                tv2.setText(text);
                tv2.setVisibility(View.VISIBLE);
            }
        });



    }
}