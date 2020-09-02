package com.simpleexaminationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private Button btn;
    private RadioButton x1,x2,x3,x4;
    private CheckBox b1,b2,b3,b4;
    private EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        edit = (EditText)findViewById(R.id.editText2);
        x1 = (RadioButton)findViewById(R.id.radioButton2);
        x2 = (RadioButton)findViewById(R.id.radioButton3);
        x3 = (RadioButton)findViewById(R.id.radioButton4);
        x4 = (RadioButton)findViewById(R.id.radioButton5);
        b1 = (CheckBox)findViewById(R.id.checkBox);
        b2 = (CheckBox)findViewById(R.id.checkBox2);
        b3 = (CheckBox)findViewById(R.id.checkBox3);
        b4 = (CheckBox)findViewById(R.id.checkBox4);
        btn = (Button)findViewById(R.id.button31);
        btn.setOnClickListener(new btnclock());
    }
    class btnclock implements View.OnClickListener
    {
        public void onClick(View v)
        {
            int a=0;
            String str1="类",str2;
            str2 = edit.getText().toString();

            if(x4.isChecked())
            {
                a=a+20;
            }
            if (b1.isChecked()&& b2.isChecked())
            {
                a=a+20;
            }
            if(str1.equals(str2))
            {
                a=a+20;
            }
            Intent intent =new Intent();
            intent.setClass(ThirdActivity.this,ResultActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("grade",a);
            intent.putExtras(bundle);
            startActivity(intent);

        }
    }
}
