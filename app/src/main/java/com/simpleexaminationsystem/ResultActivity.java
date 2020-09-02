package com.simpleexaminationsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {
    private TextView txt1,txt2;
    private Button btn;
    Bundle bundle;
    private int a;
    String b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        bundle = this.getIntent().getExtras();
        txt1 = (TextView)findViewById(R.id.textView9);
        txt2 = (TextView)findViewById(R.id.textView10);
        btn = (Button)findViewById(R.id.button41);
        btn.setOnClickListener(new btnclock());
        a = bundle.getInt("grade");
        b=String.valueOf(a);
        if (a>=20&&a<40)
        {
            txt1.setText(b);
            txt2.setText("很遗憾！你没有通过考试！");
        }
        if ((a>=40&&a<60))
        {
            txt1.setText(b);
            txt2.setText("祝贺，你通过了考试！");
        }
        if (a==60)
        {
            txt1.setText(b);
            txt2.setText("太棒了，你已经完全掌握了！");
        }
    }
    class btnclock implements View.OnClickListener
    {
        public void onClick(View v)
        {
           Intent intent =new Intent();
           intent.setClass(ResultActivity.this, ThirdActivity.class);
            startActivity(intent);
        }
    }
}
