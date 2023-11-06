public class operatory {
    public static void main(String[] args) {
        double a = 10;
        double b = 4;
        //operatory matematyczne =,-,*,/
        System.out.println(10+10);
        System.out.println(10-10);
        System.out.println(10*10);
        System.out.println(10/10);
        System.out.println(a/b);

        //operatory porównania
        int number1 = 1;
        int number2 = 2;
        System.out.println(number1>number2);
        System.out.println(number1<number2);
        System.out.println(number1==number2);
        System.out.println(number1!=number2);

        //operatory logiczne
        // || - lub, && - i

        System.out.println(number1>number2 || number1 == 1);  //fałsz || prawda -> zwraca prawda
        System.out.println(number1>number2 || number1 != 1);  //fałsz || Fałsz -> zwraca fałsz
        System.out.println(number1<number2 || number1 == 1);  //prawda || nie sprawdza bo już znalazł prawdę i zwraca true.

        // && - i
        System.out.println(number1<number2 && number1 == 1);  // prawda i prawda - zwraca true.
        System.out.println(number1>number2 && number1 == 1);  // fałsz i prawda - zwraca false.
        System.out.println(number1>number2 && number1 != 1);  // fałsz i fałsz - zwraca false.

    }
}
