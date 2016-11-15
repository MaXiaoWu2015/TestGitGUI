package com.aqy.matingting.multiwindowapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SingleInstanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
    }
    public void click(View view){

    }

    @Override
    public void onBackPressed() {
//        Intent intent=new Intent(SingleInstanceActivity.this,MainActivity.class);
//        startActivity(intent);
        super.onBackPressed();
    }
}
