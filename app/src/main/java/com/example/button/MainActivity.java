package com.example.button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView =(Button)findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到TextView演示界面
                Intent intent=new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton=(Button)findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button演示界面
                Intent intent=new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnEditText=(Button)findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到EditText演示界面
                Intent intent=new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
        mBtnRadioButton=(Button)findViewById(R.id.btn_radiobutton);
        mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到RadioButton演示界面
                Intent intent=new Intent(MainActivity.this,RadioButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnCheckBox=(Button)findViewById(R.id.btn_checkbox);
        mBtnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到CheckBox演示界面
                Intent intent=new Intent(MainActivity.this,CheckBoxActivity.class);
                startActivity(intent);
            }
        });
    }

}
