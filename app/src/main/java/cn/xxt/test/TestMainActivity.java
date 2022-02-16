package cn.xxt.test;

import android.app.Activity;
import android.os.Bundle;


public class TestMainActivity extends Activity {
    private static final String TAG = TestMainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);
    }

}
