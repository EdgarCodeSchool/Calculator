package codeschollandroid.b.com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTotal;
    private Button btn_ac;
    private Button btn_plusminus;
    private Button btn_percent;
    private Button btn_div;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_mul;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_sub;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_add;
    private Button btn_0;
    private Button btn_dot;
    private Button btn_equal;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTotal = findViewById(R.id.tv_result);
        btn_plusminus = findViewById(R.id.btn_plusminus);
        btn_percent = findViewById(R.id.btn_percent);
        btn_div = findViewById(R.id.btn_div);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_mul = findViewById(R.id.btn_mul);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_sub = findViewById(R.id.btn_sub);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_equal = findViewById(R.id.btn_equal);
        btn_add = findViewById(R.id.btn_add);
        btn_0 = findViewById(R.id.btn_0);
        btn_dot = findViewById(R.id.btn_dot);
        btn_ac = findViewById(R.id.btn_ac);


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumber(1);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumber(2);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumber(3);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumber(4);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumber(5);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumber(6);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumber(7);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumber(8);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumber(9);
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumber(0);
            }

        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               tvTotal.setText("0");
            }
        });
    }

    private void showNumber(int number) {
        if(tvTotal.getText().equals("0")){
            tvTotal.setText(String.valueOf(number));
        }else{
        tvTotal.setText(tvTotal.getText().toString() + String.valueOf(number));
        }
    }


}
