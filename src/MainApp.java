package src;
public class MainApp {
    public static void main(String[] args) {

        Bug bug = new Bug("login issue", "testowy@test.te", 1, "otwarty");

        Bug bug1 = new Bug("button issue", "mail@mail.mail", 3, "zamkniety");
        bug1.getAllinfo();

        bug.getAllinfo();
        bug.showReporter();
        bug.showBugStatus();
        bug.showBugPriority();
    }

}
