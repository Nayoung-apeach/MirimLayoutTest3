package kr.hs.emirim.s2019w04.mirimlayouttest2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView text1;
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
        edit1 = new EditText(this);
        text1 = new TextView(this);
        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        edit1.setTextSize(20);
        text1.setTextSize(20);
        text1.setTextColor(Color.rgb(128, 65, 217));
        text1.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
        linear1.addView(edit1);
        linear1.addView(btn);
        linear1.addView(text1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(edit1.getText().toString() + "이/가 입력되었습니다.");
            }
        });
        setContentView(linear1, params);
    }
}
