package kz.course.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9;
    Button button_c, button_plmin;
    TextView tvSan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);

        button_c = findViewById(R.id.button_c);
        button_plmin = findViewById(R.id.button_plmin);

        tvSan = findViewById(R.id.tv_san);
        View.OnClickListener buttonSandar = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idd = view.getId();
                String aldingiSan = tvSan.getText().toString();
                String basilganSan = "";
                String songiResult = "";

                if (idd == R.id.button_0) {
                    basilganSan = "0";
                }
                else if (idd == R.id.button_1) {
                    basilganSan = "1";
                }
                else if (idd == R.id.button_2) {
                    basilganSan = "2";
                }
                else if (idd == R.id.button_3) {
                    basilganSan = "3";
                }
                else if (idd == R.id.button_4) {
                    basilganSan = "4";
                }
                else if (idd == R.id.button_5) {
                    basilganSan = "5";
                }
                else if (idd == R.id.button_6) {
                    basilganSan = "6";
                }
                else if (idd == R.id.button_7) {
                    basilganSan = "7";
                }
                else if (idd == R.id.button_8) {
                    basilganSan = "8";
                }
                else if (idd == R.id.button_9) {
                    basilganSan = "9";
                }

                if (!aldingiSan.equals("0")) songiResult = aldingiSan + basilganSan;
                else songiResult = basilganSan;
                tvSan.setText(songiResult);
            }
        };
        button_0.setOnClickListener(buttonSandar);
        button_1.setOnClickListener(buttonSandar);
        button_2.setOnClickListener(buttonSandar);
        button_3.setOnClickListener(buttonSandar);
        button_4.setOnClickListener(buttonSandar);
        button_5.setOnClickListener(buttonSandar);
        button_6.setOnClickListener(buttonSandar);
        button_7.setOnClickListener(buttonSandar);
        button_8.setOnClickListener(buttonSandar);
        button_9.setOnClickListener(buttonSandar);

        View.OnClickListener button_c_plmin = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int iddd = view.getId();

                if (iddd == R.id.button_c) {
                    tvSan.setText("0");
                }
                else if (iddd == R.id.button_plmin) {
                    String sanText = tvSan.getText().toString();
                    int san = Integer.parseInt(sanText);

                    if(san > 0) tvSan.setText("-"+sanText);
                    else {
                        san = san * (-1);
                        tvSan.setText(""+san);
                    }
                }
            }
        };

        button_c.setOnClickListener(button_c_plmin);
        button_plmin.setOnClickListener(button_c_plmin);
    }
}