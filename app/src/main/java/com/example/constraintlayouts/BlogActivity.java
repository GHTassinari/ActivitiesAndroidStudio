package com.example.constraintlayouts;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.thedeanda.lorem.LoremIpsum;
import java.util.Random;

public class BlogActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        TextView blogPostTextView = findViewById(R.id.textViewBlogPostText);

        LoremIpsum lorem = LoremIpsum.getInstance();
        Random random = new Random();

        int wordCount = 200 + random.nextInt(150);
        String rawText = lorem.getWords(wordCount);
        String naturalText = CreateNaturalText.generate(rawText);

        blogPostTextView.setText(naturalText);
    }
}
