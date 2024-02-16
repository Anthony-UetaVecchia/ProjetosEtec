package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variaveis Globais
    double vnum1, vnum2, vres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Código da Calculadora
        Button btn_somar = (Button) findViewById(R.id.btn_somar);
        Button btn_sub = (Button) findViewById(R.id.btn_sub);
        Button btn_mult = (Button) findViewById(R.id.btn_mult);
        Button btn_div = (Button) findViewById(R.id.btn_div);
        Button btn_clear = (Button) findViewById(R.id.btn_clear);

        EditText et_valor1 = (EditText) findViewById(R.id.et_valor1);
        EditText et_valor2 = (EditText) findViewById(R.id.et_valor2);

        TextView tv_res = (TextView) findViewById(R.id.tv_res);

        //Soma
        btn_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vnum1=Double.parseDouble(et_valor1.getText().toString());
                vnum2=Double.parseDouble(et_valor2.getText().toString());
                vres = vnum1 + vnum2;
                tv_res.setText(String.valueOf(vres));
            }
        });

        //Subtração
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vnum1=Double.parseDouble(et_valor1.getText().toString());
                vnum2=Double.parseDouble(et_valor2.getText().toString());
                vres = vnum1 - vnum2;
                tv_res.setText(String.valueOf(vres));
            }
        });

        //Multiplicação
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vnum1=Double.parseDouble(et_valor1.getText().toString());
                vnum2=Double.parseDouble(et_valor2.getText().toString());
                vres = vnum1 * vnum2;
                tv_res.setText(String.valueOf(vres));
            }
        });

        //Divisão
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vnum1=Double.parseDouble(et_valor1.getText().toString());
                vnum2=Double.parseDouble(et_valor2.getText().toString());
                vres = vnum1 / vnum2;
                tv_res.setText(String.valueOf(vres));
            }
        });

        //Limpar
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_valor1.setText("0");
                et_valor2.setText("0");
                tv_res.setText("");
            }
        });
    }
}