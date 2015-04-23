package com.applusform.hybridappb02;

import org.mospi.moml.framework.pub.core.MOMLActivity;
import org.mospi.moml.webkit.pub.core.MOMLWebKit;

import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends MOMLActivity {
    
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MOMLWebKit.init(getMomlView());
        
        this.loadApplication("moml/applicationInfo.xml");
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_MENU) {
//        	getMomlView().getRoot().runCommand("function.root.onMenuKey", null);
//            return true;
//        }

        return super.onKeyDown(keyCode, event);
    }
    
    protected void onDestroy() {
    	super.onDestroy();
    	System.exit(0);
    }    
}
