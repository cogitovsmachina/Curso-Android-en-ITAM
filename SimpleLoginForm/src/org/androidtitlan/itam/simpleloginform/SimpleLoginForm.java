package org.androidtitlan.itam.simpleloginform;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class SimpleLoginForm extends Activity {
	
	private EditText etUser;
	private EditText etPwd;
	private Button Loginbtn;
	private Button Cancelbtn;
	private TextView result;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
         
        etUser = (EditText)findViewById(R.id.username);
        etPwd= (EditText)findViewById(R.id.password);
        Loginbtn= (Button)findViewById(R.id.loginbutton);
        Cancelbtn=(Button)findViewById(R.id.cancelbutton);
        result=(TextView)findViewById(R.id.result);
    	
       Loginbtn.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			String username = etUser.getText().toString();
			String password = etPwd.getText().toString();
			
			if(username.equalsIgnoreCase("iTam") && password.equalsIgnoreCase("ItAm")){
				result.setText("Yay, we entered!");
			}
			else{
				result.setText("Login Failed. :(");
			}
			
			
			
			
		}
	});
       
       Cancelbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});

        
    }
}