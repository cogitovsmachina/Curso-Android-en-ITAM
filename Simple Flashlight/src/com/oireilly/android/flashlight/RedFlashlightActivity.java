package com.oireilly.android.flashlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RedFlashlightActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button greenButton = (Button)findViewById(R.id.green_button);
        greenButton.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(RedFlashlightActivity.this, GreenFlashlightActivity.class);
        		startActivity(intent);
        	}
        });
    
    }
} 