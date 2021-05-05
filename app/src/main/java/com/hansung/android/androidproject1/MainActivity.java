package com.hansung.android.androidproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_views);
    }
    // 버튼 클릭이벤트를 처리하는 메소드 정의
    public void doAction(View v) {
        // Shows a Toast message in response to button
        Toast.makeText(getApplicationContext(), "Submitted Successfully",
                Toast.LENGTH_SHORT).show();
    }
}