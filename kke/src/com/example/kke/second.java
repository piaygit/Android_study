package com.example.kke;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class second extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.twoxml);
    }
    
    public void play(View view) {
		// TODO Auto-generated method stub
       Log.d("second", "git");
       Toast.makeText(getApplicationContext(), R.string.toast, Toast.LENGTH_LONG).show();
	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// TODO Auto-generated method stub
    	//加载menu资源文件
    	getMenuInflater().inflate(R.menu.menu_second, menu);
    	return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	int id=item.getItemId();
    	if(id==R.id.quit){
    		Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_LONG).show();
    		finish();
    	}
    	
    	return super.onOptionsItemSelected(item);

    }
}
