package com.hyleong.activitydemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {

    private static final String TAG = "ActivityDemo";
    private EditText mEditText;
    private String mString;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mEditText = (EditText)findViewById(R.id.editText);
        Log.e(TAG, "start onCreate~~~");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e(TAG,"start onStart~~~");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        mEditText.setText(mString);
        Log.e(TAG,"start onRestart~~~");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e(TAG,"start onResume~~");
    }

    @Override
    protected void onPause(){
        super.onPause();
        mString = mEditText.getText().toString();
        Log.e(TAG,"start onPause~~");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e(TAG,"start onStop~~~");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG,"start onDestroy~~~");
    }
}
