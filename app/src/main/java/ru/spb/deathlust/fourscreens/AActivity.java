package ru.spb.deathlust.fourscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

    }

    public void clicked(View view) {
        Intent intent = new Intent(this, BActivity.class);
        startActivity(intent);
    }
}
