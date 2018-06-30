package com.example.justiceteyi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRadioButton(View view) {
        RadioButton checked = (RadioButton) findViewbyid(R.id.nkrumah);
        checked.isCheck();

        if (checked) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            return;

        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }

    }//question two

    public void onClickRadioButton(View view) {
        RadioButton checked = (RadioButton) findViewbyid(R.id.march);
        checked.isCheck();

        if (checked) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            return;

        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }
    //question three
    public void onClickRadioButton(View view) {
        RadioButton checked = (RadioButton) findViewbyid(R.id.appiah);
        checked.isCheck();

        if (checked) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            return;

        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            return;
        }

    }//question four
    public void onClickRadioButton(View view) {
        RadioButton checked = (RadioButton) findViewbyid(R.id.addo);
        checked.isCheck();

        if (checked) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            return;

        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            return;
        }

    }
    public void onClickRadioButton(View view) {
        RadioButton checked = (RadioButton) findViewbyid(R.id.appiah);
        checked.isCheck();

        if (checked) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            return;

        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }

    public void onClickRadioButton(View view) {
        RadioButton checked = (RadioButton) findViewbyid(R.id.r_addo);
        checked.isCheck();

        if (checked) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            return;

        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }}
}

