package com.example.julia.roombooking;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;


public class RegisterAsyncTask extends AsyncTask<Pair<List<NameValuePair>, HttpClient>, Void, String> {

    private  String UrlRegiserUSer = "https://android-rombooking-mbruksaas.c9users.io/registerUser.php.";
    private Context context = null;
    private ProgressDialog progressDialog;
    public static HttpClient httpClient;

    public RegisterAsyncTask(Context context){
        this.context = context;}


    @Override
    protected String doInBackground(Pair<List<NameValuePair>, HttpClient>... params) {

        Pair pair = params[0];
        List<NameValuePair> urlParams = (List<NameValuePair>)pair.first;

        try {
            // url to the server method we are going to use

            HttpPost httpPost = new HttpPost(UrlRegiserUSer);
            httpPost.setEntity(new UrlEncodedFormEntity(urlParams));
            HttpResponse response = httpClient.execute(httpPost);

            if (response.getStatusLine().getStatusCode() == 200)
            {
                return EntityUtils.toString(response.getEntity());
            }
            return response.getStatusLine().getStatusCode() + " " + response.getStatusLine().getReasonPhrase();
        }
        catch (ClientProtocolException e)
        {
            return e.getMessage();
        }
        catch (IOException e)
        {
            return e.getMessage();
        }
    }

}