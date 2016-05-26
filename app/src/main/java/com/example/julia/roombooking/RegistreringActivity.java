package com.example.julia.roombooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistreringActivity extends AppCompatActivity implements View.OnClickListener {

    private String bruker_type_id = "";

    private EditText etFornavn;
    private EditText etEtternavn;
    private EditText etEmail;
    private EditText etBekreftEmail;
    private EditText etPassord;
    




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrering);
    }

    @Override
    public void onClick(View v) {

    }
}
