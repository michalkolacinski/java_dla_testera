package src;

public class MainApp {
    public static void main(String[] args) {
        //Start aplikacji
        System.out.println("hello from java 11");
        System.out.println(10);
        //liczba całkowita
        System.out.println(10.5);
        //liczba zmiennoprzecinkowa
        System.out.println("text");
        //text
        System.out.println('s');
        //znak
        System.out.println(true);
        //true
        System.out.println(false);
        //false

        User michal = new User();
        michal.firstName = "Michal";
        michal.lastName = "Kolacinski";
        michal.age = 41;
        michal.email = "michal@gmail.com";
        michal.isAdult = false;
        michal.getFullName();
        System.out.println(michal.firstName + " " + michal.lastName);
        michal.getAllInfo();

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Tomaszewski";
        tomek.age = 17;
        tomek.email = "tomek@gmail.com";
        tomek.isAdult = true;
        System.out.println(tomek.email);
        System.out.println(tomek.isAdult);
        System.out.println(tomek.firstName + " " + tomek.lastName);
        tomek.getFullName();
        tomek.getAllInfo();

        int userAge = tomek.getUserAge();
        System.out.println(userAge);

        boolean userAdult = tomek.isUserAdult();
        System.out.println("czy tomek jest dorosły : " + userAdult);




    }

}
