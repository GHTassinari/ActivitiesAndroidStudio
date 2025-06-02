package com.example.constraintlayouts;

import java.util.Random;

public class CreateNaturalText {

    public static String generate(String rawWords) {
        String[] words = rawWords.split(" ");
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        boolean startSentence = true;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (startSentence) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                startSentence = false;
            } else {
                word = word.toLowerCase();
            }
            sb.append(word);
            if (i < words.length - 1) {
                int r = random.nextInt(10);
                if (r < 2) {
                    sb.append(". ");
                    startSentence = true;
                } else if (r < 5) {
                    sb.append(", ");
                } else {
                    sb.append(" ");
                }
            } else {
                sb.append(".");
            }
        }

        return sb.toString();
    }
}
