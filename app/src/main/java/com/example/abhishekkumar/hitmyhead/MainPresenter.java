package com.example.abhishekkumar.hitmyhead;

import android.app.Activity;
import android.util.Log;

/**
 * Created by abhishekkumar on 01/07/17.
 */

public class MainPresenter extends Activity {


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("HitMyHead","OnPause will be called");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
