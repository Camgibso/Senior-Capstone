package com.example.bigbluebuttion;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.bigbluebuttion.Login.LoginFragment;
import com.example.bigbluebutton.R;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

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

            case R.id.menu1:
                Intent j = new Intent(getApplicationContext(), setting.class);
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
}
