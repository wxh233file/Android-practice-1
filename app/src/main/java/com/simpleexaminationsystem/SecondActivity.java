package com.simpleexaminationsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button btn1,btn2;
    private TextView text1;
    private EditText edit1,edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn1 = (Button)findViewById(R.id.button21);
        btn2 = (Button)findViewById(R.id.button22);
        btn1.setOnClickListener(new btnclock1());
        btn2.setOnClickListener(new btnclock2());
        text1 = (TextView)findViewById(R.id.textView11);
        edit1 = (EditText)findViewById(R.id.editText21);
        edit2 = (EditText)findViewById(R.id.editText22);
    }
    class btnclock1 implements OnClickListener
    {
        public void onClick(View v)
        {
            Intent intent = new Intent(SecondActivity.this,MainActivity.class);
            startActivity(intent);

        }
    }
    class btnclock2 implements OnClickListener
    {
        public void onClick(View v)
        {
            String password,number;
            number=edit1.getText().toString();
            password=edit2.getText().toString();
            if(number.length()<4|password.length()<4)
            {
                text1.setText("用户名和密码应长度大于4");
            }else
            {
                text1.setText("注册成功");
                Intent intent =new Intent();
                intent.setClass(SecondActivity.this,MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("number",number);
                bundle.putString("password",password);
                intent.putExtras(bundle);
                startActivity(intent);
            }

        }
    }
}
