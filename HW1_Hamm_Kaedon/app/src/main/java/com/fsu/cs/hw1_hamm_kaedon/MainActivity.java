package com.fsu.cs.hw1_hamm_kaedon;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button mButton;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
        mTextView = (TextView) findViewById(R.id.textView);
    }


    public void replaceText(View view){
        mTextView.setText("Kaedon Hamm");
    }
}
