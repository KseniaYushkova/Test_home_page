import java.security.PrivateKey;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class SignUpPage {

    private String signUpClick = "//a[starts-with(@href, '/signup')]";
    private String windowSignUp = "//div[@class='container has-text-centered']";
    private String registerEmail = "//input[@placeholder='Email']";
    private String registerName = "//input[@placeholder='Name']";
    private String registerPassword = "//input[@placeholder='Password']";
    private String btnSignUp = "//button[text()='Sign Up']";
    private String windowLogin = "//div[@class='box']";
    private String userEmail = "//input[@placeholder='Your Email']";
    private String userPassword = "//input[@placeholder='Your Password']";
    private String btnLogin = "//button[text()='Login']";
    private String containerUser = "div.container.has-text-centered";
    private String errContainer = "div.notification.is-danger";
    private String loginClick = "//a[starts-with(@href, '/login')]";



    public SignUpPage clickSignUpClick() {
        $x(signUpClick).click();
        return this;
    }

    public void checkWindowSignUpIsVisible() {
        $x(windowSignUp).shouldBe(visible);
    }

    public SignUpPage inputRegEmail(String regEmail) {
        $x(registerEmail).setValue(regEmail);
        return this;
    }

    public SignUpPage inputName(String name) {
        $x(registerName).setValue(name);
        return this;
    }

    public SignUpPage inputRegPassword(String regPassword) {
        $x(registerPassword).setValue(regPassword);
        return this;
    }

    public SignUpPage submit() {
        $x(btnSignUp).click();
        return page(SignUpPage.class);
    }

    public SignUpPage checkWindowLoginIsVisible() {
        $x(windowLogin).shouldBe(visible);
        return this;
    }

    public SignUpPage inputEmail(String regEmail) {
        $x(userEmail).setValue(regEmail);
        return this;
    }

    public SignUpPage inputPassword(String regPassword) {
        $x(userPassword).setValue(regPassword);
        return this;
    }

    public SignUpPage clickLogin() {
        $x(btnLogin).click();
        return this;
    }

    public SignUpPage checkContainerUserIsVisible() {
        $(containerUser).shouldBe(visible);
        return this;
    }

    public SignUpPage checkContainerUserText(String text) {
        $(containerUser).shouldHave(text(text));
        return this;
    }

    public SignUpPage checkErrorContainerIsVisible() {
        $(errContainer).shouldBe(visible);
        return this;
    }

    public SignUpPage clickLoginClick() {
        $x(loginClick).click();
        return this;
    }




}

