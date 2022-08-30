package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn ;
    TextView textBMI , textDescript , weight , height ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        textBMI = (TextView) findViewById(R.id.textView2);
        textDescript = (TextView) findViewById(R.id.textView3);
        weight = (TextView) findViewById(R.id.weightNumber);
        height = (TextView) findViewById(R.id.heightNumber);
    }
    public void btnHandleBMI(View v){
        Double weightConvert = Double.parseDouble(weight.getText().toString()) ;
        Double heightConvert = Double.parseDouble(height.getText().toString()) / 100;
        Double result = ( weightConvert ) / ((heightConvert * heightConvert) ) ;
        textBMI.setText(result.toString().substring(0,5));
        if(result > 35){
            textDescript.setText("Nguoi beo phi do III");
        }else if (result >= 30){
            textDescript.setText("Nguoi beo phi do II");
        }else if (result >= 25){
            textDescript.setText("Nguoi beo phi do I");
        }else if (result >= 18){
            textDescript.setText("Nguoi binh thuong");
        }else {
            textDescript.setText("Nguoi gay");
        }
    }
}