package com.w.clearbackhistory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        setTitle("DActivity");
        MyApplication.setActivities(this);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 方法1
                Intent intent = new Intent(DActivity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

                // 方法2
//                MyApplication.finishActivities();
//                Intent intent = new Intent(DActivity.this,MainActivity.class);
//                startActivity(intent);

            }
        });
    }
}
