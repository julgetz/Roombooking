package com.example.julia.roombooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnReg = (Button)findViewById(R.id.btnreg);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regIntent = new Intent(getApplicationContext(), RegistreringActivity.class);
                startActivity(regIntent);
            }
        });


    }


/*
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnLogin:

                break;

            case R.id.btnreg:

                break;

        }

    }
    */
}
