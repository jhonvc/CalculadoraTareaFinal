package com.example.micalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    TextView tvInput,tvOuput;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnMenos,btnplus,btnMultiplicar,btnDividir,btnIgual,btnClear,btnPunto,btnParentesis,btnPorcentaje;
    String proceso;
    boolean checkBracket=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        btnplus=findViewById(R.id.btnPlus);
        btnMenos=findViewById(R.id.btnMenos);
        btnDividir=findViewById(R.id.btnDivision);
        btnMultiplicar=findViewById(R.id.btnMultiplicar);

        btnIgual=findViewById(R.id.btnIgual);

        btnClear=findViewById(R.id.btnEliminar);
        btnPunto=findViewById(R.id.btnPunto);

        btnPorcentaje=findViewById(R.id.btnPorcentaje);
        btnParentesis=findViewById(R.id.btnParentesis);

        tvInput=findViewById(R.id.caja1);
        tvOuput=findViewById(R.id.caja2);

        tvInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOuput.setText("");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"9");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"+");
            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"-");
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"x");
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"÷");
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+".");
            }
        });
        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                tvInput.setText(proceso+"%");
            }
        });
        btnParentesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBracket){
                    proceso=tvInput.getText().toString();
                    tvInput.setText(proceso+")");
                    checkBracket=false;

                }else {
                    proceso=tvInput.getText().toString();
                    tvInput.setText(proceso+"(");
                    checkBracket=true;

                }

            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso=tvInput.getText().toString();
                proceso=proceso.replace("x","*");
                proceso=proceso.replace("%","/100");
                Context rhino=Context.enter();
                rhino.setOptimizationLevel(-1);
                String finalresultado="";
                try {
                    Scriptable scriptable=rhino.initSafeStandardObjects();
                    

                }catch (Exception e){
                    finalresultado="0";
                }
                tvOuput.setText(finalresultado);

            }
        });



    }
}
