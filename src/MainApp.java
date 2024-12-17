package src;

public class MainApp {
    public static void main(String[] args)  {
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
        System.out.println(michal.firstName);

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Tomaszewski";
        tomek.age = 23;
        tomek.email = "tomek@gmail.com";
        tomek.isAdult = true;
        System.out.println(tomek.email);
        System.out.println(tomek.isAdult);
        System.out.println(tomek.age);

    }

}
