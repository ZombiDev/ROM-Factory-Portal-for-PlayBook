package com.samcripp.bbpb;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RFPActivity extends Activity {
    /** Called when the activity is first created. */
	
	WebView website;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        website = (WebView) findViewById(R.id.wwwFrontEnd);
        website.getSettings().setJavaScriptEnabled(true);
        website.loadUrl("http://fcm.x10.mx/joomla");
        website.setWebViewClient(new RFPWebsite());
    }
    
    public void Portal(View view){
        website = (WebView) findViewById(R.id.wwwFrontEnd);
        website.getSettings().setJavaScriptEnabled(true);
        website.loadUrl("http://fcm.x10.mx/joomla");
        website.setWebViewClient(new RFPWebsite());
    }
    
    public void Forum(View view){
        website = (WebView) findViewById(R.id.wwwFrontEnd);
        website.getSettings().setJavaScriptEnabled(true);
        website.loadUrl("http://fcm.x10.mx/fluxbb");
        website.setWebViewClient(new RFPWebsite());
    }
    
    public void Mantis(View view){
        website = (WebView) findViewById(R.id.wwwFrontEnd);
        website.getSettings().setJavaScriptEnabled(true);
        website.loadUrl("http://fcm.x10.mx/mantis");
        website.setWebViewClient(new RFPWebsite());
    }
    
    public void Repo(View view){
        website = (WebView) findViewById(R.id.wwwFrontEnd);
        website.getSettings().setJavaScriptEnabled(true);
        website.loadUrl("https://github.com/ZombiDev");
        website.setWebViewClient(new RFPWebsite());
    }
    
    private class RFPWebsite extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}