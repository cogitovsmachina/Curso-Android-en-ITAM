package org.androidtitlan.itam.simpleintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class First extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
	}
	
	
	public void go(View v) {
		Intent i = new Intent(First.this, Second.class);
		startActivity(i);
	}


}
