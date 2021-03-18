package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDisplay;
    private  double n1,n2,res;
    private String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnzero(View view){
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText()+"0");
    }
    public void btnOne(View view){
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText()+"1");
    }
    public void btnDos(View view){
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText()+"2");
    }
    public void btnthree(View view){
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText()+"3");
    }
    public void btnFour(View view){
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText()+"4");
    }
    public void btnFive(View view){
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText()+"5");
    }
    public void btnSix(View view){
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText()+"6");
    }
    public void btnSeven(View view){
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText()+"7");
    }
    public void btnEight(View view){
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText()+"8");
    }
    public void btnNine(View view){
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText()+"9");
    }
    public void btnPoint(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvResultado);
        tvDisplay.setText(tvDisplay.getText() + ".");

    }
        public void onClickOperacionCapturaNumero1 (View view){
            tvDisplay = (TextView) findViewById(R.id.tvResultado);
            n1 = Double.parseDouble(tvDisplay.getText().toString());
            tvDisplay.setText(" ");

    }
    public void Sumar(View view){
        try {
            Operador = "+";
            onClickOperacionCapturaNumero1(view);
        }catch (NumberFormatException nfe){}

    }
    public void Restar(View view){
        try {
            Operador = "-";
            onClickOperacionCapturaNumero1(view);
        }catch (NumberFormatException nfe){}

    }
    public void Multiplicacion(View view){
        try {
            Operador = "*";
            onClickOperacionCapturaNumero1(view);
        }catch (NumberFormatException nfe){}

    }
    public void Division(View view){
        try {
            Operador = "/";
            onClickOperacionCapturaNumero1(view);
        }catch (NumberFormatException nfe){}

    }
    public void btnIgual(View view) {
        tvDisplay = (TextView) findViewById(R.id.tvResultado);
        n2 = Double.parseDouble(tvDisplay.getText().toString());
        if (Operador.equals("+")) {
            res = n1 + n2;
        } else if (Operador.equals("-")) {
            res = n1 - n2;
        } else if (Operador.equals("*")) {
            res = n1 * n2;
        } else if (Operador.equals("/")) {
            res = n1 / n2;
        }

        tvDisplay.setText(" " + res);

        }
    public void Borrar(View view){
        n1 = 0.0;
        n2 = 0.0;
        tvDisplay = (TextView)findViewById(R.id.tvResultado);
        tvDisplay.setText(" ");
    }
}


