package kr.hs.emirim.s2019w04.mirimlayouttest2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LinearLayout linear1 = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        linear1.setBackgroundColor(Color.rgb(181,178,255));
        linear1.setOrientation(LinearLayout.VERTICAL);
/*
        Button btn = new Button(this);
        btn.setText("클릭해주세요.");
        btn.setTextColor(Color.WHITE);
        btn.setBackgroundColor(Color.MAGENTA);
        linear1.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Java 코드로 작성한 버튼입니다.", Toast.LENGTH_SHORT).show();
            }
        });
*/

        setContentView(linear1, params);
    }
}