package src;

public class MainApp {
    public static void main(String[] args) {

        Bug bug1 = new Bug("login issue", "testowy@test.te", 1, false);

        Bug bug2 = new Bug("button issue", "mail@mail.mail", 3,
                true);
        bug2.showAllinfo();

        bug1.showAllinfo();
        bug1.showReporter();
        bug1.showBugStatus();
        bug1.getBugPriority();
    }

}
