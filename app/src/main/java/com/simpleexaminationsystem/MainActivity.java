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

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2;
    private EditText edit1,edit2;
     private String number,password;
     private TextView text;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.button11);
        btn1.setOnClickListener(new btnclock2());
        btn2 = (Button)findViewById(R.id.button12);
        btn2.setOnClickListener(new btnclock1());
        edit1 = (EditText)findViewById(R.id.editText11);
        edit2 = (EditText)findViewById(R.id.editText12);
        text = (TextView)findViewById(R.id.textView12);
        bundle = this.getIntent().getExtras();
    }
    class btnclock1 implements OnClickListener
    {
        public void onClick(View v)
        {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
    }
    class btnclock2 implements OnClickListener
    {
        public void onClick(View v)
        {
            String nub,pas;
            nub = edit1.getText().toString();
            pas = edit2.getText().toString();
            number =bundle.getString("number");
            password = bundle.getString("password");
            if (nub.equals(number) |pas.equals(password))
            {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
            }else
            {
                text.setText("账号密码错误");
            }
        }
    }

}
