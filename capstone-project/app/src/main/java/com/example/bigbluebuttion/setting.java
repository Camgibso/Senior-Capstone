package com.example.bigbluebuttion;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bigbluebuttion.Login.LoginFragment;
import com.example.bigbluebutton.R;

public class setting extends AppCompatActivity {
    Switch s_email, s_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        //email switch
        s_email = (Switch)findViewById(R.id.switchemail);
        s_email.setTextOn("Email Alert ON ");
        s_email.setTextOff("Email Alert OFF");

        s_email.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            String s_email1;
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    s_email1 = s_email.getTextOn().toString();
                    toastMessage(s_email1);
                } else {
                    s_email1 = s_email.getTextOff().toString();
                    toastMessage(s_email1);
                }
            }
        });

        //phone switch

        s_phone = (Switch)findViewById(R.id.switchphone);
        s_phone.setTextOn("Phone Alert ON");
        s_phone.setTextOff("Phone Alert OFF");
        s_phone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            String s_email1;
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    s_email1 = s_phone.getTextOn().toString();
                    toastMessage(s_email1);
                } else {
                    s_email1 = s_phone.getTextOff().toString();
                    toastMessage(s_email1);
                }
            }
        });

    }
    //menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu2:
                Intent j = new Intent(getApplicationContext(), about.class);
                startActivity(j);
                return true;
            case R.id.menu3:
                Intent startIntent = new Intent(getApplicationContext(), LoginFragment.class);
                startActivity(startIntent);
                return true;
            case R.id.menu4:

                Intent i = new Intent(getApplicationContext(), home.class);
                startActivity(i);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    //toast Message
    private void toastMessage(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
