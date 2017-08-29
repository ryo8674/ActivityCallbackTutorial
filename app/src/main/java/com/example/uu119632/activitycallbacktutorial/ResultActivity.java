package com.example.uu119632.activitycallbacktutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * onActivityResultを行う
 * SubActivityに値を渡し、受け取る。
 *
 * @author :ryo.yamada
 * @since :1.0 :2017/08/29
 */
public class ResultActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;
    public static final String MAIN_KEY = "main_key";
    private static final int VALUE = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        findViewById(R.id.sub_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, SubActivity.class);
                intent.putExtra(MAIN_KEY, VALUE);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    TextView resultText = (TextView) findViewById(R.id.result_text);
                    resultText.setText(String.valueOf(data.getIntExtra(SubActivity.SUB_KEY, 0)));
                    break;
                }
                break;
            default:
                break;
        }
    }
}
