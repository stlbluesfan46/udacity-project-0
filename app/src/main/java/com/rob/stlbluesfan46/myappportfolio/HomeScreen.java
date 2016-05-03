package com.rob.stlbluesfan46.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void sendMessage(View view) {
        CharSequence buttonText = "NULL";

        switch (view.getId()) {
            case R.id.button1:
                buttonText = getString(R.string.button1);
                break;

            case R.id.button2:
                buttonText = getString(R.string.button2);
                break;

            case R.id.button3:
                buttonText = getString(R.string.button3);
                break;

            case R.id.button4:
                buttonText = getString(R.string.button4);
                break;

            case R.id.button5:
                buttonText = getString(R.string.button5);
                break;

            case R.id.button6:
                buttonText = getString(R.string.button6);
                break;
        }

        CharSequence text = "This button will launch my " + buttonText + " app!";
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
        toast.show();
    }
}
