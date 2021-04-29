package com.example.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        StringBuffer toppings = new StringBuffer();
        toppings.append("Toppings:");
        if  (((CheckBox) findViewById(R.id.checkbox1_chocolate)).isChecked()) {
            toppings.append(" " + getString(R.string.chocolate_syrup));
        }
        if  (((CheckBox) findViewById(R.id.checkbox2_sprinkles)).isChecked()) {
            toppings.append(" " + getString(R.string.sprinkles));
        }
        if  (((CheckBox) findViewById(R.id.checkbox3_nuts)).isChecked()) {
            toppings.append(" " + getString(R.string.crushed_nuts));
        }
        if  (((CheckBox) findViewById(R.id.checkbox4_cherries)).isChecked()) {
            toppings.append(" " + getString(R.string.cherries));
        }
        if  (((CheckBox) findViewById(R.id.checkbox5_orio)).isChecked()) {
            toppings.append(" " + getString(R.string.orio_cookie_crumbles));
        }
        displayToast(toppings);
    }

    public void displayToast(StringBuffer message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}