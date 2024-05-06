import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CheckBtnSignUp {

    @BeforeAll
    public static void setUpp() {
        String testUrl = "http://localhost:5000/";

    }

   @Test
    public void checkSuccessOpenSignInWindow(){
       Selenide.open("http://localhost:5000/", SignUpPage.class)
                .clickSignUpClick()
                .checkWindowSignUpIsVisible();

    }

}
