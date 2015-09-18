package com.example.kke;

import java.util.Set;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class ys extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.yc);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	menu.addSubMenu(1, 1, 0, "quit");
    	menu.addSubMenu(2,2,0,"help");
        return true;
    }
      
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	int id=item.getItemId();
    	if(id==1){
    		finish();    		
    	}
    	if(id==2){
    		Toast.makeText(getApplicationContext(), "hh", Toast.LENGTH_LONG).show();    		
    	}
    	return super.onOptionsItemSelected(item);
    }

}
