package com.fsu.cs.hw1_hamm_kaedon;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button mButton;
    private TextView mTextView;
    private EditText mInputView;
    private RadioButton redButton, blueButton, greenButton;
    //private String selectedColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
        mTextView = (TextView) findViewById(R.id.textView);
        mInputView = (EditText) findViewById(R.id.name_input);
        redButton = (RadioButton) findViewById(R.id.red_radio_button);
        blueButton = (RadioButton) findViewById(R.id.blue_radio_button);
        greenButton = (RadioButton) findViewById(R.id.green_radio_button);


        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (redButton.isChecked()){
                    mTextView.setTextColor(Color.parseColor("#FF0000"));
                    mTextView.setText(mInputView.getText());
                }
                else if (blueButton.isChecked()){
                    mTextView.setTextColor(Color.parseColor("#0000FF"));
                    mTextView.setText(mInputView.getText());
                }
                else if (greenButton.isChecked()) {
                    mTextView.setTextColor(Color.parseColor("#00FF00"));
                    mTextView.setText(mInputView.getText());
                }
                else{
                    mTextView.setText(mInputView.getText());
                }
            }
        });
    }


    public void replaceText(View view){
        mButton.callOnClick();
    }
}
