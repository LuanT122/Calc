package com.example.calc;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.calc.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    Button btn_C, btn_CE, btn_BS, btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7,btn_8, btn_9, btn_Add, btn_Minus, btn_Multiply, btn_Bracket, btn_Percent;
    Button btn_Division, btn_Dot, btn_Equals;
    TextView tvInput, tvOutput;
    Double process ;
    Boolean checkBracket = false;

    static String backSpace(String s) {
        String Res="";
        for(int i=0; i<s.length()-1; i++) Res+=s.charAt(i);
        return Res;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_C = findViewById(R.id.btn_C);
        btn_CE = findViewById(R.id.btn_CE);
        btn_BS = findViewById(R.id.btn_BS);


        btn_Add = findViewById(R.id.btn_Add);
        btn_Minus = findViewById(R.id.btn_Minus);
        btn_Multiply = findViewById(R.id.btn_Multiply);
        btn_Division = findViewById(R.id.btn_Divide);
        btn_Dot = findViewById(R.id.btn_Dot);
        btn_Equals = findViewById(R.id.btn_Equals);

        tvInput = findViewById(R.id.textView4);
        tvOutput = findViewById(R.id.textView5);


        process = 0.0;
        
        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
                process = 0.0;
            }
        });

        btn_CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                
            }
        });

        btn_BS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("" + backSpace(tvInput.getText().toString()));
                
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                tvInput.setText(tvInput.getText() + "0");
                process = Double.parseDouble(String.valueOf(tvInput.getText()));
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                tvInput.setText(tvInput.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                tvInput.setText(tvInput.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                tvInput.setText(tvInput.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                tvInput.setText(tvInput.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                tvInput.setText(tvInput.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                tvInput.setText(tvInput.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                tvInput.setText(tvInput.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                tvInput.setText(tvInput.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                tvInput.setText(tvInput.getText() + "9");
            }
        });


        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process = process + Double.parseDouble(tvInput.getText().toString());
                tvOutput.setText( "+" + process);
                tvInput.setText("0");


            }
        });

        btn_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                process = process - Double.parseDouble(tvInput.getText().toString());
                tvOutput.setText( "-" + process);
                tvInput.setText("0");

            }
        });
        btn_Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process = process * Double.parseDouble(tvInput.getText().toString());
                tvOutput.setText( "x" + process);
                tvInput.setText("0");


            }
        });
        btn_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 
                process = process / Double.parseDouble(tvInput.getText().toString());
                tvOutput.setText( "/" + process);
                tvInput.setText("0");


            }

        });
        btn_Equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tvInput.setText("" + process );


            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}