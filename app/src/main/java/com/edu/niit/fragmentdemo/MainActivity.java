package com.edu.niit.fragmentdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private int flag;//切换标准

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSwitch = findViewById(R.id.btn_switch);
        btnSwitch.setOnClickListener(this);
        replaceFragment(new  RightFragment());
    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.right_fragment,fragment);
        transaction.addToBackStack(null);//返回键回退
        transaction.commit();
        flag = 1;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_switch:
                if(flag==1) {
                    replaceFragment(new AnotherRightFragment());
                    flag = 2;
                } else if (flag==2) {
                    replaceFragment(new  RightFragment());
                    flag = 1;
                }
                break;
            default:
                break;

        }


    }
}
