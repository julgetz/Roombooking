package com.example.julia.roombooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setLogo(R.mipmap.logo);
        ab.setDisplayShowHomeEnabled(true);
        ab.setDisplayUseLogoEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.instillinger:

                break;
            case R.id.login:
                Intent loginIntent = new Intent(this, LoginActivity.class);
                startActivity(loginIntent);

                break;
            case R.id.ins:
                break;
            case R.id.hjelp:
                break;
            case R.id.avslutt:
                break;
            case R.id.book_rom:
                Intent romBookingIntent = new Intent(this, RomBookingActivity.class);
                startActivity(romBookingIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

