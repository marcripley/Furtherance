package com.marcripley.furtherance;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    static final String EXTRA_MESSAGE = "com.marcripley.furtherance.MESSAGE";

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /** Called when the user clicks the Add button */
    public void addPursuit (View view) {
    	Intent intent = new Intent(this, AddPursuitActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_pursuitMessage);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
    
}
