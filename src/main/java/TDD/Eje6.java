package TDD;

import java.io.BufferedReader;
import java.io.FileReader;

public class Eje6 {

    public static void readFile(String path) {
        int totalWords = 0;
        double averageLengthWords = 0;
        String longestWord = "";

        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    totalWords++;
                    averageLengthWords += word.length();
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        averageLengthWords = averageLengthWords / totalWords;

    }
}
