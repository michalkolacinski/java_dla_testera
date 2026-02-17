package src;
public class MainApp {
    public static void main(String[] args) {

        Bug bug1 = new Bug("login issue", "testowy@test.te", 1, "otwarty");

        Bug bug2 = new Bug("button issue", "mail@mail.mail", 3, "zamkniety");
        bug2.getAllinfo();

        bug1.getAllinfo();
        bug1.showReporter();
        bug1.showBugStatus();
        bug1.showBugPriority();
    }

}
