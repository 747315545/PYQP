package com.fly.pyqp;

import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.fly.pyqp.fragment.LoginFragment;
import com.fly.pyqp.fragment.RegistFragment;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends FragmentActivity implements View.OnClickListener{
    private ViewPager viewPager;
    private ImageView imageView_login;
    private ImageView imageView_regist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {
        imageView_login = findViewById(R.id.img_login_jt);
        imageView_regist = findViewById(R.id.img_regist_jt);
        findViewById(R.id.btn_login_title).setOnClickListener(this);
        findViewById(R.id.btn_regist_title).setOnClickListener(this);
        viewPager = findViewById(R.id.vp_login);
        final List<Fragment> fragments = new ArrayList<>();
        fragments.add(new LoginFragment());
        fragments.add(new RegistFragment());
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        imageView_login.setVisibility(View.VISIBLE);
                        imageView_regist.setVisibility(View.INVISIBLE);
                        imageView_login.setAnimation(AnimationUtils.makeInAnimation(LoginActivity.this, true));
                        imageView_regist.setAnimation(AnimationUtils.makeOutAnimation(LoginActivity.this, true));
                        break;
                    case 1:
                        imageView_login.setVisibility(View.INVISIBLE);
                        imageView_regist.setVisibility(View.VISIBLE);
                        imageView_login.setAnimation(AnimationUtils.makeOutAnimation(LoginActivity.this, false));
                        imageView_regist.setAnimation(AnimationUtils.makeInAnimation(LoginActivity.this, false));
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login_title:
                viewPager.setCurrentItem(0,true);
                break;
            case R.id.btn_regist_title:
                viewPager.setCurrentItem(1,true);
                break;

        }
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
    }
}
