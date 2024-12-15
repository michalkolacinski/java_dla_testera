package src;

import javax.annotation.processing.SupportedSourceVersion;

public class ZadanieLekcjaTen {
    public static void main(String[] args) {
        int numberOne = 17;
        int numberTwo = 10;
        int numberThree = 12;
        int numberFour = 34;

        if ((numberOne + numberTwo) % 2 == 0) {
            System.out.println("suma dwoch pierwszych liczb jest parzysta");
        } else {
            System.out.println("suma dwoch pierwszych liczb jest nieparzysta");
        }
        if ((numberThree + numberFour) % 2 == 0) {
            System.out.println("suma liczb trzy i cztery jest parzysta");
        } else {
            System.out.println("suma liczb trzy i cztery jest nieparzysta");
        }
        if (((numberOne + numberTwo) % 2 == 0) && ((numberThree + numberFour) % 2 == 0)) {
            System.out.println("wszystkie liczby sa parzyste");
        } else {
            System.out.println("nie wszystkie liczby sa parzyste");
        }


    }
}
