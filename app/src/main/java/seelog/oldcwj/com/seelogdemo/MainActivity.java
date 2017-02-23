package seelog.oldcwj.com.seelogdemo;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!PermissionUtils.checkAndRequestStoragePermission(this, 1)) {
            return;
        }
    }

    @Override
    public void onStart() {
        super.onStart();

    }
}
