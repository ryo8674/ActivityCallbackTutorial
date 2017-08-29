package com.example.uu119632.activitycallbacktutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.TextView;

/**
 * onKeyDownを行う
 * 押下されたボタンのkeycodeを表示する
 *
 * @author :ryo.yamada
 * @since :1.0 :2017/08/29
 */
public class KeyDownActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_down);

        textView = (TextView) findViewById(R.id.key_down_text);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // keycodeを取得し、TextViewにセット
        textView.setText(String.valueOf(event.getKeyCode()));
        return super.onKeyDown(keyCode, event);
    }
}
