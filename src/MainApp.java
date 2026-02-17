package src;

public class MainApp {
    public static void main(String[] args) {

        Bug bug1 = new Bug("login issue", "testowy@test.te", 1);

        Bug bug2 = new Bug("button issue", "mail@mail.mail", 3);
        bug2.showAllinfo();

        bug1.showAllinfo();
        bug1.showReporter();
        bug1.showBugStatus();
        bug1.getBugPriority();

        bug1.bugStatus = true;
        bug1.showBugStatus();
    }

}
