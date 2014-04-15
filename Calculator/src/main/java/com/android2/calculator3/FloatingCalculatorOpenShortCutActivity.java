package com.android2.calculator3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Will on 4/9/2014.
 */
public class FloatingCalculatorOpenShortCutActivity extends Activity {
    public void onCreate(Bundle state) {
        super.onCreate(state);

        Intent intent = new Intent(this, FloatingCalculator.class);
        startService(intent);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.blank, R.anim.blank);
    }
}
