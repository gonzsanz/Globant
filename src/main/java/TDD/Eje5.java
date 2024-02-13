package TDD;

import java.util.HashMap;
import java.util.Map;

public class Eje5 {

    private static final Map<Character, String> charToMorse = new HashMap<>();
    private static final Map<String, Character> morseToChar = new HashMap<>();

    static {
        charToMorse.put('A', ".-");
        charToMorse.put('B', "-...");
        charToMorse.put('C', "-.-.");
        charToMorse.put('D', "-..");
        charToMorse.put('E', ".");
        charToMorse.put('F', "..-.");
        charToMorse.put('G', "--.");
        charToMorse.put('H', "....");
        charToMorse.put('I', "..");
        charToMorse.put('J', ".---");
        charToMorse.put('K', "-.-");
        charToMorse.put('L', ".-..");
        charToMorse.put('M', "--");
        charToMorse.put('N', "-.");
        charToMorse.put('O', "---");
        charToMorse.put('P', ".--.");
        charToMorse.put('Q', "--.-");
        charToMorse.put('R', ".-.");
        charToMorse.put('S', "...");
        charToMorse.put('T', "-");
        charToMorse.put('U', "..-");
        charToMorse.put('V', "...-");
        charToMorse.put('W', ".--");
        charToMorse.put('X', "-..-");
        charToMorse.put('Y', "-.--");
        charToMorse.put('Z', "--..");
        charToMorse.put('1', ".----");
        charToMorse.put('2', "..---");
        charToMorse.put('3', "...--");
        charToMorse.put('4', "....-");
        charToMorse.put('5', ".....");
        charToMorse.put('6', "-....");
        charToMorse.put('7', "--...");
        charToMorse.put('8', "---..");
        charToMorse.put('9', "----.");
        charToMorse.put('0', "-----");

        for (Map.Entry<Character, String> entry : charToMorse.entrySet()) {
            morseToChar.put(entry.getValue(), entry.getKey());
        }
    }

    public static String toMorse(String text) {
        StringBuilder morse = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (c == ' ') {
                morse.append(" ");
            } else {
                morse.append(charToMorse.get(c)).append(" ");
            }
        }
        return morse.toString().trim();
    }

    public static String toText(String morse) {
        StringBuilder text = new StringBuilder();
        for (String word : morse.split("  ")) {
            for (String letter : word.split(" ")) {
                text.append(morseToChar.get(letter));
            }
            text.append(" ");
        }
        return text.toString().trim();
    }

    public String toMorseOrText(String text) {
        if (text.matches("[A-Za-z0-9 ]+")) {
            return toMorse(text);
        } else {
            return toText(text);
        }
    }
}
