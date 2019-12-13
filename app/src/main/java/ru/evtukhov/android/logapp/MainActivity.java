package ru.evtukhov.android.logapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private static final String TEXTVIEW_STATE_KEY = "TEXTVIEW_STATE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        if (savedInstanceState == null) {
            Log.d(getString(R.string.app_tag), getString(R.string.app_savedInstanceStateNull));
            textView.append("\n" + getString(R.string.app_savedInstanceStateNull));
        }

        else {
            Log.d(getString(R.string.app_tag), getString(R.string.app_savedInstanceStateNotNull));
            textView.append("\n" + getString(R.string.app_savedInstanceStateNotNull));
        }

        Log.d(getString(R.string.app_tag), getString(R.string.app_onCreate));
        textView.append("\n" + getString(R.string.app_onCreate));
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(getString(R.string.app_tag), getString(R.string.app_onStart));
        textView.append("\n" + getString(R.string.app_onStart));
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(getString(R.string.app_tag), getString(R.string.app_onResume));
        textView.append("\n" + getString(R.string.app_onResume));
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(getString(R.string.app_tag), getString(R.string.app_onPause));
        textView.append("\n" + getString(R.string.app_onPause));
}

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(getString(R.string.app_tag), getString(R.string.app_onStop));
        textView.append("\n" + getString(R.string.app_onStop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(getString(R.string.app_tag), getString(R.string.app_onDestroy));
        textView.append("\n" + getString(R.string.app_onDestroy));
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(getString(R.string.app_tag), getString(R.string.app_onRestart));
        textView.append("\n" + getString(R.string.app_onRestart));
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.d(getString(R.string.app_tag), getString(R.string.app_onKeyDown));
            textView.append("\n" + getString(R.string.app_onKeyDown));

            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            Log.d(getString(R.string.app_tag), getString(R.string.app_onKeyLongPress));
            textView.append("\n" + getString(R.string.app_onKeyLongPress));

            return true;
        }

        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Log.d(getString(R.string.app_tag), getString(R.string.app_onBackPressed));
        textView.append("\n" + getString(R.string.app_onBackPressed));
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        Log.d(getString(R.string.app_tag), getString(R.string.app_onSaveInstanceState));
        textView.append("\n" + getString(R.string.app_onSaveInstanceState));
        saveInstanceState.putString(TEXTVIEW_STATE_KEY, textView.getText().toString());
        super.onSaveInstanceState(saveInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getString(TEXTVIEW_STATE_KEY);
        Log.d(getString(R.string.app_tag), getString(R.string.app_onRestoreInstanceState));
        textView.append("\n" + getString(R.string.app_onRestoreInstanceState));
    }
}
