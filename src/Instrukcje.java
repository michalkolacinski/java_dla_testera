package src;

public class Instrukcje {
    String homePage = "Home";
    String loginPage = "Login";
    String contactPage = "Contact";

    String page = homePage;
     switch (page){
        case "Home":
            System.out.println("przełączam się do strony Home" );
            break;
        case "Login":
            System.out.println("przełączam się do strony Login" );
            break;
        case "Contact":
            System.out.println("przełączam się do strony Contact" );
            break;
        default:
            System.out.println("nie znam takiej strony");
    }
}