package com.example.uu119632.activitycallbacktutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * onWindowFocusChangedを行う
 * 画面の幅、高さを取得し、画面に表示する
 *
 * @author :ryo.yamada
 * @since :1.0 :2017/08/29
 */
public class WindowFocusActivity extends AppCompatActivity {

    private TextView width;
    private TextView height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_focus);

        width = (TextView) findViewById(R.id.text_width);
        height = (TextView) findViewById(R.id.text_height);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        //画面の幅、高さを取得し、TextViewにセット
        width.setText("width: " + String.valueOf(findViewById(R.id.window_focus_changed_layout).getWidth()));
        height.setText("height:" + String.valueOf(findViewById(R.id.window_focus_changed_layout).getHeight()));
        super.onWindowFocusChanged(hasFocus);
    }
}
