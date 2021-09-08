import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class JEn {

    @Test
    public void test() {

        open("https://preprod.snov.io/login");
        Selenide.sleep(1000);
        closeWebDriver();
    }

}
