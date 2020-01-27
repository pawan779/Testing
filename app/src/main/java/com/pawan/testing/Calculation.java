package com.pawan.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculation extends AppCompatActivity {
EditText etFirst,etSecond;
Button btnSum,btnSub,btnDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        etFirst=findViewById(R.id.etFirst);
        etSecond=findViewById(R.id.etSecond);
        btnSum=findViewById(R.id.btnSum);
        btnSub=findViewById(R.id.btnSub);
        btnDiv=findViewById(R.id.btnDiv);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Sum();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub();

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Div();
            }
        });
    }

    private void Div() {
        float first=Float.parseFloat(etFirst.getText().toString());
        float second=Float.parseFloat(etSecond.getText().toString());

        Arthmetic arthmetic=new Arthmetic();
        float result=arthmetic.divide(first,second);

        Intent intent=new Intent(Calculation.this,ResultActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }

    private void Sub() {
        float first=Float.parseFloat(etFirst.getText().toString());
        float second=Float.parseFloat(etSecond.getText().toString());

        Arthmetic arthmetic=new Arthmetic();
        float result=arthmetic.subtract(first,second);

        Intent intent=new Intent(Calculation.this,ResultActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }

    private void Sum() {
        float first=Float.parseFloat(etFirst.getText().toString());
        float second=Float.parseFloat(etSecond.getText().toString());

        Arthmetic arthmetic=new Arthmetic();
        float result=arthmetic.add(first,second);

        Intent intent=new Intent(Calculation.this,ResultActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }
}
