package com.oireilly.android.flashlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GreenFlashlightActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.green);
		Button redButton = (Button)findViewById(R.id.red_button);
        redButton.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View v){
        		finish();
        	}
        });
	}
	

}
