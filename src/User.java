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

    // 3. Konstruktor - tworzy nowe obiekty - domyślny tworzy pusty obiekt
    // to nazwa klady wielką literą i okrągłe nawiasy

    User() {

    }

    User (String firstNameParam, String lastNameParam, String emailParam, int ageParam, boolean isAdultParam ){
        System.out.println(firstNameParam + " " + lastNameParam + " " + emailParam + " " + ageParam + " " + isAdultParam);

    firstName = firstNameParam;
    lastName = lastNameParam;
    email = emailParam;
    age = ageParam;
    isAdult = isAdultParam;
    }

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

    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }
    void greetings(String firstName, String lastName) {
        System.out.println("Hi " +  firstName + " " + lastName + ". Nice to see you");
    }

    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }



}

