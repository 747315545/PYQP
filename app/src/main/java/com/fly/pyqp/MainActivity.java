package com.fly.pyqp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.fly.pyqp.fragment.HomePageFragment;

/**
 * Created by huangfei on 2017/10/10.
 */

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDefaultFragment();

    }

    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fl_content, new HomePageFragment());
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
    }
}
