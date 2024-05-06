import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
//import ru.alfaCampus.pages.swagLabsPages.LoginPage;
//import ru.alfaCampus.pages.swagLabsPages.YourInformationPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browserCapabilities;
import static com.codeborne.selenide.Selenide.open;


public class LoginTest {

    @BeforeAll
    public static void setUp() {
        baseUrl = "http://localhost:5000/signup";

    }

    @Test
    public void checkSuccessFullRegistration(){
        open(baseUrl, SignUpPage.class)
                .inputRegEmail("maria19@mail.ru")
                .inputName("Мария")
                .inputRegPassword("12345")
                .submit()
                .checkWindowLoginIsVisible()
                .inputEmail("maria19@mail.ru")
                .inputPassword("12345")
                .clickLogin()
                .checkContainerUserIsVisible()
                .checkContainerUserText("Welcome, Мария!");

    }

    @Test
    public void checkSuccessRegistrationWithoutName(){
        open(baseUrl, SignUpPage.class)
                .inputRegEmail("tanya1@mail.ru")
                .inputRegPassword("12345")
                .submit()
                .checkWindowLoginIsVisible()
                .inputEmail("tanya1@mail.ru")
                .inputPassword("12345")
                .clickLogin()
                .checkContainerUserIsVisible()
                .checkContainerUserText("Welcome, !");

    }

    @Test
    public void checkRegistrationOnlyEmail(){
        open(baseUrl, SignUpPage.class)
                .inputRegEmail("valya2@mail.ru")
                .submit()
                .checkWindowLoginIsVisible()
                .inputEmail("valya2@mail.ru")
                .clickLogin()
                .checkContainerUserIsVisible()
                .checkContainerUserText("Welcome, !");

    }

    @Test
    public void checkRegistrationOnlyPassword(){
        open(baseUrl, SignUpPage.class)
                .inputRegPassword("1234567")
                .submit()
                .checkWindowLoginIsVisible()
                .inputPassword("1234567")
                .clickLogin()
                .checkContainerUserIsVisible()
                .checkContainerUserText("Welcome, !");

    }

    @Test
    public void checkEmptyRegistration(){
        open(baseUrl, SignUpPage.class)
                .submit()
                .checkErrorContainerIsVisible()
                .clickLoginClick()
                .checkWindowLoginIsVisible()
                .clickLogin()
                .checkContainerUserIsVisible()
                .checkContainerUserText("Welcome, !");

    }

    @Test
    public void checkRegistrationOnlyName(){
        open(baseUrl, SignUpPage.class)
                .inputName("Тамара")
                .submit()
                .checkErrorContainerIsVisible()
                .clickLoginClick()
                .checkWindowLoginIsVisible()
                .clickLogin()
                .checkContainerUserIsVisible()
                .checkContainerUserText("Welcome, !");

    }

    @Test
    public void checkRegistrationSymbols(){
        open(baseUrl, SignUpPage.class)
                .inputRegEmail("!#$%)")
                .inputRegPassword("$#%$")
                .submit()
                .checkWindowLoginIsVisible()
                .inputEmail("!#$%)")
                .inputPassword("$#%$")
                .clickLogin()
                .checkContainerUserIsVisible()
                .checkContainerUserText("Welcome, !");

    }

    @Test
    public void checkRegistrationDifferentLetters(){
        open(baseUrl, SignUpPage.class)
                .inputRegEmail("апро")
                .inputRegPassword("апао")
                .submit()
                .checkWindowLoginIsVisible()
                .inputEmail("апро")
                .inputPassword("апао")
                .clickLogin()
                .checkContainerUserIsVisible()
                .checkContainerUserText("Welcome, !");

    }





}
