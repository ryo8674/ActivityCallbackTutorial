package com.example.uu119632.activitycallbacktutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * 受け取った値を表示
 * 受け取った値をResultActivityに返す
 *
 * @author :ryo.yamada
 * @since :1.0 :2017/08/29
 */
public class SubActivity extends AppCompatActivity {

    public static final String SUB_KEY = "sub_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        int receivedNumber = 0;

        // Intentの取得
        final Intent receivedIntent = getIntent();

        if (receivedIntent != null) {
            receivedNumber = receivedIntent.getIntExtra(ResultActivity.MAIN_KEY, 0);
        }

        // TextViewに受け取った値をセット
        TextView textView = (TextView) findViewById(R.id.sub_text);
        textView.setText(String.valueOf(receivedNumber));

        findViewById(R.id.return_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra(SUB_KEY, receivedIntent.getIntExtra(ResultActivity.MAIN_KEY, 0));
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
