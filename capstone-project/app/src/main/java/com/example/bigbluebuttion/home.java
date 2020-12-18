package com.example.bigbluebuttion;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bigbluebuttion.Login.LoginFragment;
import com.example.bigbluebutton.R;

public class home extends AppCompatActivity {
    Button home_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homebutton);
        home_button = findViewById(R.id.homePress);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                toastMessage("Turn on /off Big Blue Button ");
                System.out.println("aaple fuckyou");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu1:
                Intent i = new Intent(home.this, setting.class);
                startActivity(i);
                return true;
            case R.id.menu2:
                Intent j = new Intent(home.this, about.class);
                startActivity(j);
                return true;
            case R.id.menu3:
                Intent startIntent = new Intent(getApplicationContext(), LoginFragment.class);
                startActivity(startIntent);
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

