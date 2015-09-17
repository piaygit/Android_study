package com.example.kke;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏，注意上面要挤成activity，而不是ActionBarActivity
		setContentView(R.layout.activity_main);
	}
	
	public void piay_test(View view) {
		// TODO Auto-generated method stub
      Toast.makeText(getApplicationContext(), "1622", Toast.LENGTH_SHORT).show();      
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//创建menu菜单
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		//menu菜单时间监听
		int id = item.getItemId();
		switch(item.getItemId()){
		case R.id.action_settings :
			Toast.makeText(getApplicationContext(), "add", Toast.LENGTH_SHORT).show();
		    break;
		case R.id.action_settings1:
			Toast.makeText(getApplicationContext(), "remove",-1).show();		
		}
		
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
