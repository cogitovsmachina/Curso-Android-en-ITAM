package org.androidtitlan.itam.simpledownload;

import java.io.File;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Environment;

public class SimpleDownload extends IntentService {
	public static final String EXTRA_MESSENGER="org.androidtitlan.itam.android.downloader.EXTRA_MESSENGER";
		
		private HttpClient mHttpClient = null;
    public SimpleDownload(String name) {
    	
		super(name);
	}
	@Override
	public void onCreate() {
		super.onCreate();
		mHttpClient = new DefaultHttpClient();
	}
	@Override
	public void onDestroy() {
		super.onDestroy();
		mHttpClient.getConnectionManager().shutdown();
	}
	
	@Override
	protected void onHandleIntent(Intent intent) {
		HttpGet getMethod= new HttpGet(i.getData().toString());
		int result =Activity.RESULT_CANCELED;
		
		try{
			ResponseHandler<byte[]> responseHandler = new ByteArrayResponseHandler();
			byte[] responseBody = mHttpClient.execute(getMethod, responseHandler);
			File output=new File(Environment.getExternalStorageDirectory(),i.getData().getLastPathSegment());
		
			if(output.exists()){
				output.delete();
			}
		}
	}
	

}