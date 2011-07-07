package org.androidtitlan.itam.simpledownload;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SimpleDownload extends Activity {


		private Button b=null;
		private Handler handler=new Handler() {
			@Override
			public void handleMessage(Message msg) {
				b.setEnabled(true);
				
				Toast
					.makeText(SimpleDownload.this, "Download complete!",
										 Toast.LENGTH_LONG)
					.show();
			}
		};
		
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);
			
			b=(Button)findViewById(R.id.button);
		}
		
		public void doTheDownload(View v) {
			b.setEnabled(false);
			
			Intent i=new Intent(this, Downloader.class);
			
//			i.setData(Uri.parse("http://www.tequilavalley.com/wp-content/uploads/2011/04/SHDHMC20_down.png"));
			i.setData(Uri.parse("http://androidtitlan.org/nyan_cat.mp3"));
			i.putExtra(Downloader.EXTRA_MESSENGER, new Messenger(handler));
			
			startService(i);
		}
}

		
	
	
		
