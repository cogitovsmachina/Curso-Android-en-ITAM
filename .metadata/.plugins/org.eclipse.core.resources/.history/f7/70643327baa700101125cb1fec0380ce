package org.androidtitlan.simpleservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SimpleService extends Activity implements OnClickListener {
	  Button Start, Stop;

	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);

	    Start = (Button) findViewById(R.id.startbutton);
	    Stop = (Button) findViewById(R.id.stopbutton);

	    Start.setOnClickListener(this);
	    Stop.setOnClickListener(this);
	  }

	  public void onClick(View src) {
	    switch (src.getId()) {
	    case R.id.startbutton:
	    	Toast.makeText(getApplicationContext(), "Clicked: Starting service", Toast.LENGTH_SHORT).show();
	    	startService(new Intent(this, MyService.class));
	      break;
	    case R.id.stopbutton:
	    	Toast.makeText(getApplicationContext(), "Clicked: Stopping service", Toast.LENGTH_SHORT).show();
	      stopService(new Intent(this, MyService.class));
	      break;
	    }
	  }
	}