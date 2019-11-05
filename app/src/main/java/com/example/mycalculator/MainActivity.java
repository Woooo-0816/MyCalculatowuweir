package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button left_button = (Button) findViewById(R.id.left_button);
        left_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("(");
                } else {
                    txt.setText(txt.getText().toString() + "(");
                }
            }
        });

        Button right_button = (Button) findViewById(R.id.right_button);
        right_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText(")");
                } else {
                    txt.setText(txt.getText().toString() + ")");
                }
            }
        });

        Button plus_button = (Button) findViewById(R.id.plus_button);
        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("+");
                } else {
                    txt.setText(txt.getText().toString() + "+");
                }
            }
        });

        Button one_button = (Button) findViewById(R.id.one_button);
        one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("1");
                } else {
                    txt.setText(txt.getText().toString() + "1");
                }
            }
        });

        Button two_button = (Button) findViewById(R.id.two_button);
        two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("2");
                } else {
                    txt.setText(txt.getText().toString() + "2");
                }
            }
        });

        Button three_button = (Button) findViewById(R.id.three_button);
        three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("3");
                } else {
                    txt.setText(txt.getText().toString() + "3");
                }
            }
        });

        Button minus_button = (Button) findViewById(R.id.minus_button);
        minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("-");
                } else {
                    txt.setText(txt.getText().toString() + "-");
                }
            }
        });

        Button four_button = (Button) findViewById(R.id.four_button);
        four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("4");
                } else {
                    txt.setText(txt.getText().toString() + "4");
                }
            }
        });

        Button five_button = (Button) findViewById(R.id.five_button);
        five_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("5");
                } else {
                    txt.setText(txt.getText().toString() + "5");
                }
            }
        });

        Button six_button = (Button) findViewById(R.id.six_button);
        six_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("6");
                } else {
                    txt.setText(txt.getText().toString() + "6");
                }
            }
        });

        Button multiplication_button = (Button) findViewById(R.id.multiplication_button);
        multiplication_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("*");
                } else {
                    txt.setText(txt.getText().toString() + "*");
                }
            }
        });

        Button seven_button = (Button) findViewById(R.id.seven_button);
        seven_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("7");
                } else {
                    txt.setText(txt.getText().toString() + "7");
                }
            }
        });

        Button eight_button = (Button) findViewById(R.id.eight_button);
        eight_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("8");
                } else {
                    txt.setText(txt.getText().toString() + "8");
                }
            }
        });

        Button nine_button = (Button) findViewById(R.id.nine_button);
        nine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("9");
                } else {
                    txt.setText(txt.getText().toString() + "9");
                }
            }
        });

        Button division_button = (Button) findViewById(R.id.division_button);
        division_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("/");
                } else {
                    txt.setText(txt.getText().toString() + "/");
                }
            }
        });

        Button point_button = (Button) findViewById(R.id.point_button);
        point_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("0.");
                } else {
                    txt.setText(txt.getText().toString() + ".");
                }
            }
        });

        Button zero_button = (Button) findViewById(R.id.zero_button);
        zero_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                if (txt.getText().toString().equals("0")) {
                    txt.setText("0");
                } else {
                    txt.setText(txt.getText().toString() + "0");
                }
            }
        });

        Button clear_button = (Button) findViewById(R.id.clear_button);
        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                txt.setText("0");
            }
        });

        Button equal_button = (Button) findViewById(R.id.equal_button);
        equal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                try{
                    String middle=txt.getText().toString();
                    char[] mid = middle.toCharArray();
                    mid = zhan.cutString(mid);
                    List list = zhan.transferToBehind(mid);
                    BigDecimal comeOut = zhan.calculator(list);
                    txt.setText(comeOut.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
                }
            }
        });

        Button sin_button = (Button) findViewById(R.id.sin_button);
        sin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                double a = Math.toRadians(Double.parseDouble(txt.getText().toString()));
                String str=""+Math.sin(a);
                txt.setText(str);
            }
        });

        Button cos_button = (Button) findViewById(R.id.cos_button);
        cos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                double a = Math.toRadians(Double.parseDouble(txt.getText().toString()));
                String str=""+Math.cos(a);
                txt.setText(str);
            }
        });

        Button back_button = (Button) findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                String s = txt.getText().toString();
                s = s.substring(0,s.length()-1);
                if(s.length()==0){
                    txt.setText("0");
                }else{
                    txt.setText(s);
                }
            }
        });

        Button binary_button = (Button) findViewById(R.id.binary_button);
        binary_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                try{
                    int num=Integer.parseInt( txt.getText().toString() );
                    String s=Integer.toBinaryString(num);
                    txt.setText(s);
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
                }

            }
        });

        Button more_button = (Button) findViewById(R.id.more_button);
        more_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                String data=txt.getText().toString();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("extra_data",data);
                startActivity(intent);
            }
        });


    }
}




