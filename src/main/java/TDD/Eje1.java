package TDD;

public class Eje1 {

    public String[] fizzbuzz() {
        String[] result = new String[100];
        for (int i = 0; i < result.length; i++) {
            if ((i+1) % 3 == 0 && (i+1) % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if ((i+1) % 3 == 0) {
                result[i] = "Fizz";
            } else if ((i+1) % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i+1);
            }
        }
        return result;
    }
}
