package com.example.androiduiactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AndroidUIActivity extends Activity {
	
	Button startTestButton;
	TextView score_txt;
	
	int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_ui);
        
        score_txt = (TextView)findViewById(R.id.score_txt);
        startTestButton = (Button)findViewById(R.id.startTestButton);
        
        score_txt.append(Integer.toString(score));
        
        startTestButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(AndroidUIActivity.this, ExamActivity.class);
				//AndroidUIActivity.this.startActivity(myIntent);
				AndroidUIActivity.this.startActivityForResult(myIntent, 1);
			}
		});
        
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	//super.onActivityResult(requestCode, resultCode, data);
    	if(requestCode == 1){
    		if(resultCode == RESULT_OK){
    			score_txt.setText("Your Score: "+data.getStringExtra("score"));
    		}
    	}
    }
}
