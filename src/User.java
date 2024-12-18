package src;

public class User {

    // 1. Pola obiektu opisują z czego będzie składał się dany obiekt
    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    // 2. Metody opisują co dany obiekt będzie mógł zrobić
    // metoda void nic nie zwraca tylko wyświetla infrormacje

    // zwracany typ + nazwa metody
    void getFullName() {
        // ciało metody
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    // metoda int - zwraca integer

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
