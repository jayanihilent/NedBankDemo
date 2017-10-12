package com.example.devrathrathee.nedbankdemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private final String PIN_ONE_VALIDATION = "1", PIN_TWO_VALIDATION = "2", PIN_THREE_VALIDATION = "3", PIN_FOUR_VALIDATION = "4",
                         PIN_FIVE_VALIDATION = "5";
    boolean isTextChanged = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText pinOne_EditText = findViewById(R.id.pinOne_EditText);
        final EditText pinTwo_EditText = findViewById(R.id.pinTwo_EditText);
        final EditText pinThree_EditText = findViewById(R.id.pinThree_EditText);
        final EditText pinFour_EditText = findViewById(R.id.pinFour_EditText);
        final EditText pinFive_EditText = findViewById(R.id.pinFive_EditText);
        final EditText pinSix_EditText = findViewById(R.id.pinSix_EditText);

        pinOne_EditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                pinTwo_EditText.requestFocus();
            }
        });

        pinTwo_EditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                pinThree_EditText.requestFocus();
            }
        });


        pinThree_EditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                pinFour_EditText.requestFocus();
            }
        });

        pinFour_EditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                pinFive_EditText.requestFocus();
            }
        });



        pinFive_EditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                isTextChanged = true;
            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (pinOne_EditText.getText().toString().equals(PIN_ONE_VALIDATION) &&
                        pinTwo_EditText.getText().toString().equals(PIN_TWO_VALIDATION) &&
                        pinThree_EditText.getText().toString().equals(PIN_THREE_VALIDATION) &&
                        pinFour_EditText.getText().toString().equals(PIN_FOUR_VALIDATION) &&
                        pinFive_EditText.getText().toString().equals(PIN_FIVE_VALIDATION)) {
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                } else {
                    Toast.makeText(MainActivity.this, MainActivity.this.getResources().getString(R.string.str_provide_valid_pin), Toast.LENGTH_SHORT).show();

                    pinSix_EditText.requestFocus();

                    pinOne_EditText.setText("");
                    pinOne_EditText.clearFocus();

                    pinTwo_EditText.setText("");
                    pinTwo_EditText.clearFocus();

                    pinThree_EditText.setText("");
                    pinThree_EditText.clearFocus();

                    pinFour_EditText.setText("");
                    pinFour_EditText.clearFocus();

                    pinFive_EditText.setText("");
                    pinFive_EditText.clearFocus();


                    //  pinOne_EditText.requestFocus();
                }



            }
        });

        pinSix_EditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (pinOne_EditText.getText().toString().equals(PIN_ONE_VALIDATION) &&
                        pinTwo_EditText.getText().toString().equals(PIN_TWO_VALIDATION) &&
                        pinThree_EditText.getText().toString().equals(PIN_THREE_VALIDATION) &&
                        pinFour_EditText.getText().toString().equals(PIN_FOUR_VALIDATION) &&
                        pinFive_EditText.getText().toString().equals(PIN_FIVE_VALIDATION)) {
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                } else {
                    Toast.makeText(MainActivity.this, MainActivity.this.getResources().getString(R.string.str_provide_valid_pin), Toast.LENGTH_SHORT).show();

                    pinSix_EditText.requestFocus();

                    pinOne_EditText.setText("");
                    pinOne_EditText.clearFocus();

                    pinTwo_EditText.setText("");
                    pinTwo_EditText.clearFocus();

                    pinThree_EditText.setText("");
                    pinThree_EditText.clearFocus();

                    pinFour_EditText.setText("");
                    pinFour_EditText.clearFocus();

                    pinFive_EditText.setText("");
                    pinFive_EditText.clearFocus();


                    //  pinOne_EditText.requestFocus();
                }



            }
        });

        pinSix_EditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b) {
                    if (pinOne_EditText.getText().toString().equals(PIN_ONE_VALIDATION) &&
                            pinTwo_EditText.getText().toString().equals(PIN_TWO_VALIDATION) &&
                            pinThree_EditText.getText().toString().equals(PIN_THREE_VALIDATION) &&
                            pinFour_EditText.getText().toString().equals(PIN_FOUR_VALIDATION) &&
                            pinFive_EditText.getText().toString().equals(PIN_FIVE_VALIDATION)) {
                        startActivity(new Intent(MainActivity.this, HomeActivity.class));
                    } else {
                        Toast.makeText(MainActivity.this, MainActivity.this.getResources().getString(R.string.str_provide_valid_pin), Toast.LENGTH_SHORT).show();

                        pinSix_EditText.requestFocus();

                        pinOne_EditText.setText("");
                        pinOne_EditText.clearFocus();

                        pinTwo_EditText.setText("");
                        pinTwo_EditText.clearFocus();

                        pinThree_EditText.setText("");
                        pinThree_EditText.clearFocus();

                        pinFour_EditText.setText("");
                        pinFour_EditText.clearFocus();

                        pinFive_EditText.setText("");
                        pinFive_EditText.clearFocus();


                        //  pinOne_EditText.requestFocus();
                    }
                }
            }
        });
    }
}
