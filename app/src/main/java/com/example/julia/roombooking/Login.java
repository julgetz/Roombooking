package com.example.julia.roombooking;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

public class Login extends ActionBarActivity implements View.OnClickListener {

    private Gson gson;

    EditText brukernavn;
    EditText epost;
    EditText passord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_bruker);

       // brukernavn = (EditText)findViewById(R.id.et_brukernavn);
        //epost = (EditText)findViewById(R.id.et_epost);
        //passord = (EditText)findViewById(R.id.et_passord);
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override

    protected void onStop(){
        super.onStop();
    }


    public View OnCreatView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

      View view = inflater.inflate(R.layout.login_bruker, container, false);

      Button btnLogin = (Button) view.findViewById(R.id.btnLogin);
      btnLogin.setOnClickListener(this);
      Button btnRegisterNewUser = (Button) view.findViewById(R.id.btnreg);
      btnRegisterNewUser.setOnClickListener(this);



        // brukernavn = (EditText)view.findViewById(R.id.);
      //passord= (EditText)view.findViewById(R.id.et_passord);

      return view;
  }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnLogin:
                //loginadmin();
                // lag metode
                break;

            case R.id.btnreg:

                break;

    }
}




}
