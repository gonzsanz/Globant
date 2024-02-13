package TDD;

import java.util.ArrayList;
import java.util.List;

public class Eje2 {

    public List<String> fizzbuzz() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i< 100; i++){
            if ((i+1) % 3 == 0 && (i+1) % 5 == 0) result.add("FizzBuzz");
            else if ((i+1) % 3 == 0) result.add("Fizz");
            else if ((i+1) % 5 == 0) result.add("Buzz");
            else result.add(String.valueOf(i+1));
        }

        return result;
    }
}
