package TelephoneNumber;

import java.util.HashSet;

public class Result {
    public static void main(String[] args) {
        Number number = new Number("981","0234567");
        Number number1 = new Number("7890", "654321");
        Number number2 = new Number("7890", "654321");

        HashSet<Number> telephoneNumber = new HashSet<>();
        telephoneNumber.add(number);
        telephoneNumber.add(number1);
        telephoneNumber.add(number2);

        for (Number a: telephoneNumber) {
            System.out.println(a);
        }
    }
}
