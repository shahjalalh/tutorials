package com.example.androiduiactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class ExamActivity extends Activity{

	int score = 0;
	
	RadioButton que1_ans1, que2_ans2, que3_ans2;
	RadioButton wrongRadio1, wrongRadio2, wrongRadio3;
	
	Button submitButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exam_ui);
		
		score = 0;
		
		OnClickListener rightRadioListener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				score++;
			}
		};
		
		OnClickListener wrongRadioListener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				score--;
				
				if(score < 0){
					score = 0;
				}
			}
		};
		
		//If you choose right answer
		que1_ans1 = (RadioButton)findViewById(R.id.que1_ans1);
		que1_ans1.setOnClickListener(rightRadioListener);
		
		que2_ans2 = (RadioButton)findViewById(R.id.que2_ans2);
		que2_ans2.setOnClickListener(rightRadioListener);
		
		que3_ans2 = (RadioButton)findViewById(R.id.que3_ans2);
		que3_ans2.setOnClickListener(rightRadioListener);
		
		
		//If you choose wrong answer
		wrongRadio1 = (RadioButton)findViewById(R.id.wrongRadio1);
		wrongRadio1.setOnClickListener(wrongRadioListener);
		
		wrongRadio2 = (RadioButton)findViewById(R.id.wrongRadio2);
		wrongRadio2.setOnClickListener(wrongRadioListener);
		
		wrongRadio3 = (RadioButton)findViewById(R.id.wrongRadio3);
		wrongRadio3.setOnClickListener(wrongRadioListener);
		
		
		submitButton = (Button)findViewById(R.id.submitButton);
		submitButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent returnIntent = new Intent();
				returnIntent.putExtra("score", Integer.toString(score));
				setResult(RESULT_OK, returnIntent);
				finish();
			}
		});
		
	}
}
