import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
// Тест-кейс - Иван
// Ревью - Татьяна
// Автотесты - Анна
public class BigHomework {
    @Test
    void Positiv() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[name=firstname]").setValue("Соискатель_1");
        $("[id=office]").click();
        $("[id=at]").click();
        $("[type=submit]").click();
        $(byText("Разработчик авто-тестов")).shouldBe(exist);
        sleep(10000);


    }

    @Test
    void Adverse1() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[id=remote]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);
    }

    @Test
    void Adverse2() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[id=at]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);

    }

    @Test
    void Adverse3() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[name=firstname]").setValue("ААААА");
        $("[id=office]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);
    }

    @Test
    void Adverse4() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[id=remote]").click();
        $("[id=pt]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);
    }
}