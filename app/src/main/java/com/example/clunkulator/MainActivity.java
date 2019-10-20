package com.example.clunkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8,
            btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_eq,
            btn_clr, btn_lParen, btn_rParen, btn_PosNeg,
            btn_decimal;

    float[] floatNums = new float [] {1, 2};
    floatNums = null;

    public float[] getFloatNums() {
        return floatNums;
    }

    public void setFloatNums(float[] floatNums) {
        this.floatNums = floatNums;
    }

    EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_eq = (Button) findViewById(R.id.btn_eq);
        btn_clr = (Button) findViewById(R.id.btn_clr);
        btn_lParen = (Button) findViewById(R.id.btn_lParen);
        btn_rParen = (Button) findViewById(R.id.btn_rParen);
        btn_PosNeg = (Button) findViewById(R.id.btn_PosNeg);
        btn_decimal = (Button) findViewById(R.id.btn_decimal);
        display = (EditText) findViewById(R.id.edText1);

    }
}
