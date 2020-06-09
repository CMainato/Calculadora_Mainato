package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.InputMismatchException;


public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);


    }

        public void Sumar(View view){

        try {


            String valor1=et1.getText().toString();
            String valor2=et2.getText().toString();
            int n1=Integer.parseInt(valor1);
            int n2=Integer.parseInt(valor2);
            int resultado=n1+n2;
            String res=String.valueOf(resultado);
            tv1.setText(res);
        } catch (InputMismatchException ex){

            tv1.setText("Ingresa los dos valores");
        }
        }

    public void Resta(View view){

        try{
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int resultado=n1-n2;
        String res=String.valueOf(resultado);
        tv1.setText(res);
    } catch (InputMismatchException ex){

        tv1.setText("Ingresa los dos valores");
    }
}

    public void Multip(View view){

        try{
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int resultado=n1*n2;
        String res=String.valueOf(resultado);
        tv1.setText(res);
        } catch (InputMismatchException ex){

            tv1.setText("Ingresa los dos valores");
        }
    }


    public void Div(View view){

        try {


        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int resultado=n1/n2;
        String res=String.valueOf(resultado);
        tv1.setText(res);
        }catch (ArithmeticException ex){
            tv1.setText("Nopuedes dividir para 0");
        }catch (InputMismatchException ex){
            tv1.setText("Ingresa los dos valores");
        }
    }


    public void Sen(View view){
        String valor1=et1.getText().toString();
        double n1=Double.parseDouble(valor1);
        double anguloRadianes =Math.toRadians(n1);
        double resultado=Math.sin(anguloRadianes);
        String res=String.valueOf(resultado);
        tv1.setText(res);
    }

    public void Cos(View view){
        String valor1=et1.getText().toString();
        double n1=Double.parseDouble(valor1);
        double anguloRadianes =Math.toRadians(n1);
        double resultado=Math.cos(anguloRadianes);
        String res=String.valueOf(resultado);
        tv1.setText(res);
    }

    public void Tan(View view){
        String valor1=et1.getText().toString();
        double n1=Double.parseDouble(valor1);
        double anguloRadianes =Math.toRadians(n1);
        double resultado=Math.tan(anguloRadianes);
        String res=String.valueOf(resultado);
        tv1.setText(res);
    }

}