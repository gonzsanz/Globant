package TDD;

public class Eje3 {

    public String reverseString() {
        String word = "Hola mundo";
        StringBuilder result = new StringBuilder();

        for (int i = word.length()-1; i>=0; i--) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}
