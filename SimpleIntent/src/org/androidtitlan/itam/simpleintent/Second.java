package org.androidtitlan.itam.simpleintent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
	}
	 public void go(View v){
		 finish();
	 }
}
