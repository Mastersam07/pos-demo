package tech.mastersam.pos_demo.pos_demo;

import io.flutter.embedding.android.FlutterActivity;
import android.app.ActivityManager;
import android.content.Context;

public class MainActivity extends FlutterActivity {

    @Override
    public void onBackPressed() {
    }

    @Override
    public void onPause() {
        super.onPause();
        ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        activityManager.moveTaskToFront(getTaskId(), 0);
    }
}
