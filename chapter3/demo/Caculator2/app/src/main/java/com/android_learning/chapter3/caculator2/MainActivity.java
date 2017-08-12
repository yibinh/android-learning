package com.android_learning.chapter3.caculator2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnAdd;
    private Button btnEquals;
    private TextView tvResult;
    private boolean isTypingNumber;
    private int firstNum = 0;
    private int secondNum = 0;
    private String operatorString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildControls();
    }

    private void buildControls() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        tvResult = (TextView) findViewById(R.id.tvResult);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberClicked(v);
            }
        };

        btn0.setOnClickListener(listener);
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
        btn9.setOnClickListener(listener);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OperatorClicked(v);
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualsClicked(v);
            }
        });
        tvResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tvResult.setText("");
            }
        });
    }

    private void EqualsClicked(View v) {
        isTypingNumber = false;
        secondNum = Integer.parseInt(tvResult.getText().toString());
        String result = String.valueOf(firstNum + secondNum);
        tvResult.setText(result);
    }

    private void OperatorClicked(View v) {
        isTypingNumber = false;
        firstNum = Integer.parseInt(tvResult.getText().toString());

        operatorString = ((Button) v).getText().toString();
    }

    private void NumberClicked(View v) {
        String num = ((Button) v).getText().toString();

        if (isTypingNumber) {
            tvResult.setText(tvResult.getText() + num);
        } else {
            tvResult.setText(num);
            isTypingNumber = true;
        }
    }
}

