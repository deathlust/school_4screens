package ru.spb.deathlust.fourscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    public void clicked(View view) {
        Intent intent = new Intent(this, DActivity.class);
        startActivity(intent);
    }

    public void clickedBack(View view) {
        Intent intent = new Intent(this, BActivity.class);
        startActivity(intent);
    }
}
