package anroid.androidtest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.view.Menu;

public class MainActivity extends Activity {

	private OnClickListener clickEvent = new OnClickListener(){
		public void onClick(View v) {
    		Context context = getApplicationContext();
    		CharSequence text;

    		switch(v.getId()) {
	    		case R.id.button1: text = "Button pushed!"; break;
	    		default: text="Something was pushed!";
    		}

    		int duration = Toast.LENGTH_SHORT;
    		Toast toast = Toast.makeText(context, text, duration);
    		toast.show();
    	}
		
	};
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(clickEvent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
