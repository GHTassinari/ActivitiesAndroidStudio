package com.example.constraintlayouts;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.thedeanda.lorem.LoremIpsum;
import java.util.Random;

public class BestTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_text);

        TextView leftTextView = findViewById(R.id.textViewBestTextLeft);
        TextView rightTextView = findViewById(R.id.textViewBestTextRight);

        LoremIpsum lorem = LoremIpsum.getInstance();
        Random random = new Random();

        int leftWordCount = random.nextInt(50) + 20;
        int rightWordCount = random.nextInt(50) + 20;

        String leftTextRaw = lorem.getWords(leftWordCount);
        String rightTextRaw = lorem.getWords(rightWordCount);

        String leftText = CreateNaturalText.generate(leftTextRaw);
        String rightText = CreateNaturalText.generate(rightTextRaw);

        leftTextView.setText(leftText);
        rightTextView.setText(rightText);
    }
}
