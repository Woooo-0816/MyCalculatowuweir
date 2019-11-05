package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent= getIntent();
        String data=intent.getStringExtra("extra_data");
        TextView txt = (TextView) findViewById(R.id.txt);
        txt.setText(data);

        Button clear_button = (Button) findViewById(R.id.clear_button);
        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                txt.setText("0");
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

        Button btd_button = (Button) findViewById(R.id.btd_button);//二进制转十进制
        btd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                String data=txt.getText().toString();
                try{
                    String new_data=Integer.valueOf(data,2).toString();
                    txt.setText(new_data);
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
                }
            }
        });

        Button dtb_button = (Button) findViewById(R.id.dtb_button);//十进制转二进制
        dtb_button.setOnClickListener(new View.OnClickListener() {
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

        Button dto_button = (Button) findViewById(R.id.dto_button);//十进制转八进制
        dto_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                try{
                    int num=Integer.parseInt( txt.getText().toString() );
                    String s=Integer.toOctalString(num);
                    txt.setText(s);
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
                }
            }
        });

        Button otd_button = (Button) findViewById(R.id.otd_button);//八进制转十进制
        otd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                try{
                    String data=txt.getText().toString();
                    String new_data=Integer.valueOf(data,8).toString();
                    txt.setText(new_data);
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
                }
            }
        });

        Button dth_button = (Button) findViewById(R.id.dth_button);//十进制转十六进制
        dth_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                try{
                    int num=Integer.parseInt( txt.getText().toString() );
                    String s=Integer.toHexString(num);
                    txt.setText(s);
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
                }
            }
        });

        Button htd_button = (Button) findViewById(R.id.htd_button);//十六进制转十进制
        htd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                try{
                    String data=txt.getText().toString();
                    String new_data=Integer.valueOf(data,16).toString();
                    txt.setText(new_data);
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
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

        Button mmtocm_button = (Button) findViewById(R.id.mmtocm_button);
        mmtocm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                try{
                    double new_data = Double.valueOf(txt.getText().toString())/10;
                    String s=""+new_data;
                    txt.setText(s);
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
                }
            }
        });

        Button cmtom_button = (Button) findViewById(R.id.cmtom_button);
        cmtom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                try{
                    double new_data = Double.valueOf(txt.getText().toString())/10;
                    String s=""+new_data;
                    txt.setText(s);
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
                }
            }
        });

        Button mtokm_button = (Button) findViewById(R.id.mtokm_button);
        mtokm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                try{
                    double new_data = Double.valueOf(txt.getText().toString())/1000;
                    String s=""+new_data;
                    txt.setText(s);
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
                }
            }
        });

        Button mtoinch_button = (Button) findViewById(R.id.mtoinch_button);
        mtoinch_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) findViewById(R.id.txt);
                try{
                    double new_data = Double.valueOf(txt.getText().toString())*3.281;
                    String s=""+new_data;
                    txt.setText(s);
                } catch (Exception e) {
                    e.printStackTrace();
                    txt.setText("ERROR");
                }
            }
        });

        Button help_button = (Button) findViewById(R.id.help_button);
        help_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"帮助：\n"+"二→十:二进制转十进制\n"+ "十→二:十进制转二进制\n"+
                        "十→八:十进制转八进制\n"+"八→十:八进制转十进制\n"+"十→十六:十进制转十六进制\n"+"十六→十:十六进制转十进制\n",Toast.LENGTH_LONG).show();
            }
        });

    }
}
