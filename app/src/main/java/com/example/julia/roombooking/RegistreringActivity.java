package com.example.julia.roombooking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.Executor;

public class RegistreringActivity extends AppCompatActivity implements View.OnClickListener {

    public static Executor httpClient;
    private String bruker_type_id = "";

    private String bruker_kode;

    private EditText etFornavn;
    private EditText etEtternavn;
    private EditText etEmail;
    private EditText etBekreftEmail;
    private EditText etPassord;
    private EditText etBekreftPassord;

    private Button btRegister;

    private User user;


    public RegistreringActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrering);

        // registerings knapp
        btRegister = (Button) findViewById(R.id.bt_reg_register);

        // register referer til disse edittext feltene

        etFornavn = (EditText) findViewById(R.id.et_reg_fornavn);
        etEtternavn = (EditText) findViewById(R.id.et_reg_etternavn);
        etEmail = (EditText) findViewById(R.id.et_reg_email);
        etBekreftEmail = (EditText) findViewById(R.id.et_reg_bekreft_email);
        etPassord = (EditText) findViewById(R.id.et_reg_passord);
        etBekreftPassord = (EditText) findViewById(R.id.et_reg_bekreft_passord);


    }

    public void setBrukerType(String bruker_type_id) {

        this.bruker_type_id = bruker_type_id;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_reg_register:
                //lag metode register user
                break;

        }
    }


    public User newUser() {

        User user = new User();

        user.setFornavn(etFornavn.getText().toString());
        user.setEtternavn(etEtternavn.getText().toString());
        user.setEpost(etEmail.getText().toString());
        user.setPassord(etPassord.getText().toString());

        if (user.equals("ikke loget inn ")) {
            // gjør noe
        } else if (user.equals("login")) {
            //gjør noe
        } else {
            // ikke gjøre noe
        }

        return user;
    }


    public void registerUser() {

    }



    }






