package com.example.calculator_marshall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private TextView prev;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button clear;
    private Button all;
    private Button plus;
    private Button minus;
    private Button divide;
    private Button times;
    private Button dot;
    private Button equals;
    private Button sign;
    private String num;
    private double current;
    private double total;
    private boolean decimal;
    private int dec;
    private double past;
    private char act;
    private boolean con;

    private int pow (int base, int exp) {
        int ans = 1;
        for (int i = 0; i < exp; i++)
            ans *= base;
        return ans;
    }

    private void calc() {
        if (act == '+') {
            total = past + current;
            prev.setText(prev.getText().toString() + " + " + current);
        }
        else if (act == '-') {
            total = past - current;
            prev.setText(prev.getText().toString() + " - " + current);
        }
        else if (act == '*') {
            total = past * current;
            prev.setText(prev.getText().toString() + " * " + current);
        }
        else if (act == '/') {
            total = past / current;
            prev.setText(prev.getText().toString() + " / " + current);
        }

        past = total;
        current = 0.0;

        num = total + "";
        act = 'n';
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        clear = findViewById(R.id.clear);
        all = findViewById(R.id.cAll);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);
        times = findViewById(R.id.times);
        dot = findViewById(R.id.dot);
        equals = findViewById(R.id.equals);
        sign = findViewById(R.id.sign);
        prev = findViewById(R.id.last);
        dec = 0;

        num = "";
        act = 'n';
        //lAct = 'n';
        current = 0.0;
        total = 0.0;
        past = 0.0;

        decimal = false;
        con = false;

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "";
                current = 0;
                dec = 0;
                text.setText("0");
                num = "";
                decimal = false;
            }
        });

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("0");
                prev.setText("Inputs cleared");
                current = 0;
                num = "";
                dec = 0;
                decimal = false;
                total = 0;
                past = 0;
                act = 'n';
                con = false;
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal)
                    dec++;

                num += "1";
                current = (current * 10) + 1;
                text.setText(num);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal)
                    dec++;

                num += "2";
                current = (current * 10) + 2;
                text.setText(num);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal)
                    dec++;

                num += "3";
                current = (current * 10) + 3;
                text.setText(num);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal)
                    dec++;

                num += "4";
                current = (current * 10) + 4;
                text.setText(num);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal)
                    dec++;

                num += "5";
                current = (current * 10) + 5;
                text.setText(num);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal)
                    dec++;

                num += "6";
                current = (current * 10) + 6;
                text.setText(num);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal)
                    dec++;

                num += "7";
                current = (current * 10) + 7;
                text.setText(num);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal)
                    dec++;

                num += "8";
                current = (current * 10) + 8;
                text.setText(num);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal)
                    dec++;

                num += "9";
                current = (current * 10) + 9;
                text.setText(num);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal)
                    dec++;

                if (current != 0.0) {
                    num += "0";
                    current *= 10;
                    text.setText(num);
                }
            }
        });



        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                current *= -1;

                if (current > 0) {
                    num = num.replace("-", "");
                    text.setText(num);
                }
                else if (current == 0) {
                    num = "0";
                    text.setText(num);
                }
                else {
                    num = "-" + num;
                    text.setText(num);
                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!decimal) {
                    decimal = true;
                    num += ".";
                    text.setText(num);
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (past == 0.0 && total == 0.0) {
                    prev.setText("");
                }
                decimal = false;

                if (current != 0.0)
                    past = current;


                past /= pow(10, dec);
                dec = 0;

                prev.setText(prev.getText().toString() + past);

                current = 0;

                num += "  +  ";
                text.setText(num);
                num = "";

                act = '+';
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (past == 0.0 && total == 0.0) {
                    prev.setText("");
                }
                decimal = false;

                if (current != 0.0)
                    past = current;

                past /= pow(10, dec);
                dec = 0;

                prev.setText(prev.getText().toString() + past);

                current = 0;

                num += "  -  ";
                text.setText(num);
                num = "";

                act = '-';
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (past == 0.0 && total == 0.0) {
                    prev.setText("");
                }
                decimal = false;

                if (current != 0.0)
                    past = current;

                past /= pow(10, dec);
                dec = 0;

                prev.setText(prev.getText().toString() + past + " ");

                current = 0;

                num += "  *  ";
                text.setText(num);
                num = "";

                act = '*';
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (past == 0.0 && total == 0.0) {
                    prev.setText("");
                }

                decimal = false;

                if (current != 0.0)
                    past = current;

                past /= pow(10, dec);
                dec = 0;

                prev.setText(prev.getText().toString() + past + " ");

                current = 0;

                num += "  /  ";
                text.setText(num);
                num = "";

                act = '/';
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                current /= pow(10, dec);
                calc();
                text.setText(total + "");
                decimal = false;
                con = true;
                dec = 0;
                num = "";
            }
        });

    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);


        String value = num;
        outState.putString("key", value);

        double value2 = current;
        outState.putDouble("key2", value2);
        double value3 = past;
        outState.putDouble("key3", value3);
        double value4 = total;
        outState.putDouble("key4", value4);
        char value5 = act;
        outState.putChar("key5", value5);
        boolean value6 = decimal;
        outState.putBoolean("key6", value6);
        int value7 = dec;
        outState.putInt("key7", value7);
        String value8 = prev.getText().toString();
        outState.putString("key8", value8);
    }

    @Override
    protected void onRestoreInstanceState (@NonNull Bundle savedInstanceSate) {
        super.onRestoreInstanceState(savedInstanceSate);

        String value1 = savedInstanceSate.getString("key");
        num = value1;
        current = savedInstanceSate.getDouble("key2");
        past = savedInstanceSate.getDouble("key3");
        total = savedInstanceSate.getDouble("key4");
        act = savedInstanceSate.getChar("key5");
        decimal = savedInstanceSate.getBoolean("key6");
        dec = savedInstanceSate.getInt("key7");
        String value8 = savedInstanceSate.getString("key8");
        prev.setText(value8);
        if (num != "")
            text.setText(num);
        else
            text.setText(total + "");
    }

}
