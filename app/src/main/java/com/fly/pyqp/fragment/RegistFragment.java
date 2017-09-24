package com.fly.pyqp.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.fly.pyqp.R;

/**
 * Created by huangfei on 2017/9/24.
 */

public class RegistFragment extends Fragment implements View.OnClickListener{

    private EditText regist_name;
    private EditText regist_password;
    private EditText regist_code;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_regist,container,false);
        init(view);
        return  view;
    }

    private void init(View view){
        regist_name = view.findViewById(R.id.edit_regist_name);
        regist_password = view.findViewById(R.id.edit_regist_password);
        regist_code = view.findViewById(R.id.edit_regist_code);
        view.findViewById(R.id.btn_getcode).setOnClickListener(this);
        view.findViewById(R.id.btn_regist).setOnClickListener(this);
        ((CheckBox)view.findViewById(R.id.cb_agree)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_getcode:
                break;
            case R.id.btn_regist:
                break;
        }
    }
}
