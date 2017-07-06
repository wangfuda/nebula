package com.osan.nebula;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 *
 * Created by osan on 9/21.
 */

public class FlashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

        Intent intent = new Intent();
        intent.setClass(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }
}
