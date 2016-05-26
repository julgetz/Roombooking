package com.example.julia.roombooking;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class RegisterAsyncTask extends AsyncTask<URL, Void , String> {

    private  String UrlRegiserUSer = "https://android-rombooking-mbruksaas.c9users.io/registerUser.php.";
    private Context context = null;
    private ProgressDialog progressDialog;






    public RegisterAsyncTask(Context context){
        this.context = context;
    }





    @Override
    protected String doInBackground(URL... params) {

        UrlRegiserUSer += params[0];

         URL regUrl;
        String stringText = "";

        try{

            regUrl = new URL(UrlRegiserUSer);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(regUrl.openStream()));
            String StringBuffer;



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return stringText;
    }
}