package com.example.uu119632.activitycallbacktutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * onTouchEventを行う
 * 画面にタッチした座標を表示する
 *
 * @author :ryo.yamada
 * @since :1.0 :2017/08/29
 */
public class TouchEventActivity extends AppCompatActivity {

    private TextView textX;
    private TextView textY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_event);

        textX = (TextView) findViewById(R.id.abscissa);
        textY = (TextView) findViewById(R.id.ordinate);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // 座標を取得し、TextViewにセット
        textX.setText("X: " + String.valueOf(event.getX()));
        textY.setText("Y: "+ String.valueOf(event.getY()));
        return super.onTouchEvent(event);
    }
}
