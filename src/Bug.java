package src;
public class Bug {
    String bugDesciption;
    String reporterEmail;
    int bugPriority;
    String bugStatus;


    Bug (String bugDesciption, String reporterEmail, int bugPriority, String bugStatus){
    this.bugDesciption = bugDesciption;
    this.reporterEmail = reporterEmail;
    this.bugPriority = bugPriority;
    this.bugStatus = bugStatus;

    }


    void getAllinfo(){
        System.out.println(bugDesciption + " " + reporterEmail + " " + bugPriority + " " + bugStatus);
    }
    void showReporter(){
        System.out.println(reporterEmail);
    }
    void showBugStatus(){
        System.out.println(bugStatus);
    }
    void showBugPriority(){
        System.out.println(bugPriority);
    }

}
