package src;

public class Bug {
    String bugDesciption;
    String reporterEmail;
    int bugPriority;
    boolean bugStatus;


    Bug(String bugDesciption, String reporterEmail, int bugPriority, boolean bugStatus) {
        this.bugDesciption = bugDesciption;
        this.reporterEmail = reporterEmail;
        this.bugPriority = bugPriority;
        this.bugStatus = bugStatus;

    }


    void showAllinfo() {
        System.out.println(bugDesciption + " " + reporterEmail + " " + bugPriority + " " + bugStatus);
    }

    void showReporter() {
        System.out.println(reporterEmail);
    }

    void showBugStatus() {
        System.out.println(bugStatus);
    }

    int getBugPriority() {
        return bugPriority;
    }

}
