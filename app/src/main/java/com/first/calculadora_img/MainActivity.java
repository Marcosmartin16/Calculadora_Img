package com.first.calculadora_img;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Pantalla;
    String oldNumber="";
    String op="+";
    boolean isNewOp = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pantalla = findViewById(R.id.pantalla);
    }

    public void numberEvent(View view){
        if(isNewOp)
            Pantalla.setText("");
        isNewOp=false;
        String numero = Pantalla.getText().toString();
        switch (view.getId()){
            case R.id.btn0:
                numero+="0";
                break;
            case R.id.btn1:
                numero+="1";
                break;
            case R.id.btn2:
                numero+="2";
                break;
            case R.id.btn3:
                numero+="3";
                break;
            case R.id.btn4:
                numero+="4";
                break;
            case R.id.btn5:
                numero+="5";
                break;
            case R.id.btn6:
                numero+="6";
                break;
            case R.id.btn7:
                numero+="7";
                break;
            case R.id.btn8:
                numero+="8";
                break;
            case R.id.btn9:
                numero+="9";
                break;
            case R.id.btnpunto:
                numero+=".";
                break;
        }
        Pantalla.setText(numero);
    }

    public void operatorEvent(View view) {
        isNewOp=true;
        oldNumber=Pantalla.getText().toString();
        switch(view.getId()){
            case R.id.btnsum:
                op="+";
                break;
            case R.id.btnrest:
                op="-";
                break;
            case R.id.btnmult:
                op="*";
                break;
            case R.id.btndiv:
                op="/";
                break;
        }
    }

    public void equalEvent(View view) {
        String newNumber = Pantalla.getText().toString();
        double result=0.0;
        switch(op){
            case"+":
                result = Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
                break;
            case"-":
                result = Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                break;
            case"*":
                result = Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                break;
            case"/":
                result = Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                break;
        }
        Pantalla.setText(result+"");
    }

    public void acEvent(View view) {
        Pantalla.setText("0");
        isNewOp=true;
    }


}