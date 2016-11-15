package com.aqy.matingting.multiwindowapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= (TextView) findViewById(R.id.textView3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MTT", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MTT", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MTT", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MTT", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MTT", "onDestroy: ");
    }

    public void click(View view){
        Intent intent=new Intent(MainActivity.this,SingleInstanceActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        textView.setText("result:"+resultCode);
        Log.d("MTT", "onActivityResult: "+resultCode);
    }
}
