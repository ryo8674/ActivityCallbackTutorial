package com.example.uu119632.activitycallbacktutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * メイン画面
 * 各コールバックメソッドを行う画面に遷移する
 *
 * @author :ryo.yamada
 * @since :1.0 :2017/08/29
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListener();
    }

    /**
     * リスナーをセット
     */
    private void setListener() {
        findViewById(R.id.activity_result_btn).setOnClickListener(this);
        findViewById(R.id.key_down_btn).setOnClickListener(this);
        findViewById(R.id.on_touch_event_btn).setOnClickListener(this);
        findViewById(R.id.window_focus_changed_btn).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.activity_result_btn:
                intent = new Intent(MainActivity.this, ResultActivity.class);
                break;
            case R.id.key_down_btn:
                intent = new Intent(MainActivity.this, KeyDownActivity.class);
                break;
            case R.id.on_touch_event_btn:
                intent = new Intent(MainActivity.this, TouchEventActivity.class);
                break;
            case R.id.window_focus_changed_btn:
                intent = new Intent(MainActivity.this, WindowFocusActivity.class);
                break;
        }
        startActivity(intent);
    }
}
