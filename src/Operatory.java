package src;

import java.util.Arrays;

public class Operatory {
    public static void main(String[] args) {
        //operatory matematyczne
        double a = 10;
        double b = 4;
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        System.out.println(a / b);


        //operatory porównania
        int numOne = 2;
        int numTwo = 1;

        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

        //operatory logiczne
        // || - lub
        System.out.println(numOne > numTwo || numOne == 1); // false || true -> true
        System.out.println(numOne > numTwo || numOne != 1); //false || false -> false
        System.out.println(numOne < numTwo || numOne != 1); //prawda || nie jest sprawdzane bo pierwszy warunek jest true -> prawda


        // && - operator logiczny i - oba warunki muszą byc spelnione zeby dalo true
        System.out.println(numOne < numTwo && numOne == 1); // prawda i prawda -> true
        System.out.println(numOne > numTwo && numOne == 1); // false i  true -> false
        System.out.println(numOne > numTwo && numOne != 1); // false i false -> false

        if (numOne < numTwo) {
            System.out.println("number one is less than number two");
        } else {
            System.out.println("number one is greater than number two");

        // modulo - % operator reszty z dzielenia
        // np System.out.println(10 % 4)   wyświetli na konsolę resztę z dzielenia 10 przez 4

        }

    }
}
