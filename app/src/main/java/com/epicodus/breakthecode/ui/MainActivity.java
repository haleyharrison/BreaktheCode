package com.epicodus.breakthecode.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.epicodus.breakthecode.R;

public class MainActivity extends AppCompatActivity {

    private Button mEnrollButton;
    private Button mSponsorsButton;
    private Button mNonProfitPartnersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnrollButton = (Button) findViewById(R.id.enrollButton);
        mSponsorsButton = (Button) findViewById(R.id.sponsorsButton);
        mNonProfitPartnersButton = (Button) findViewById(R.id.nonProfitButton);
    }

}
