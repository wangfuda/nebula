package com.osan.nebula;

import android.app.Activity;
import android.os.Bundle;

import com.osan.nebula.anim.StarryView;

/**
 *
 * Created by osan on 9/21.
 */

public class MainActivity extends Activity {

    private StarryView starryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        starryView = (StarryView) findViewById(R.id.starry_view);

    }

    @Override
    protected void onPause() {
        super.onPause();
        starryView.pauseAnimation();
    }

    @Override
    protected void onResume() {
        super.onResume();
        starryView.resumeAnimation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        starryView.stopAnimation();
    }
}
