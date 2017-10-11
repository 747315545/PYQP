package com.fly.pyqp.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.fly.pyqp.MainActivity;
import com.fly.pyqp.R;

/**
 * Created by huangfei on 2017/9/24.
 */

public class LoginFragment extends Fragment implements View.OnClickListener {

    private EditText login_name;
    private EditText login_password;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false);
        init(view);
        return view;
    }
    private void init(View view){
        login_name = view.findViewById(R.id.edit_login_name);
        login_password = view.findViewById(R.id.edit_login_password);
        view.findViewById(R.id.tv_forgetpassword).setOnClickListener(this);
        view.findViewById(R.id.btn_login).setOnClickListener(this);
        view.findViewById(R.id.img_login_weibo).setOnClickListener(this);
        view.findViewById(R.id.img_login_qq).setOnClickListener(this);
        view.findViewById(R.id.img_login_weixin).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_forgetpassword:
                break;
            case R.id.btn_login:
                getActivity().startActivity(new Intent(getActivity(), MainActivity.class));
                getActivity().finish();
                break;
            case R.id.img_login_weibo:
                break;
            case R.id.img_login_qq:
                break;
            case R.id.img_login_weixin:
                break;
        }
    }
}
