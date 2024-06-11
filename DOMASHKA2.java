import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
// Тест-кейс - Анна
// Ревью - Вероника
// Автотесты - Иван
public class DOMASHKA2 {
    @Test
    void Positiv() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[name=firstname]").setValue("Соискатель_1");
        $("[id=office]").click();
        $("[id=mt]").click();
        $("[type=submit]").click();
        $(byText("Ручной тестировщик")).shouldBe(exist);
        sleep(10000);


    }

    @Test
    void Negativ1() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[name=firstname]").setValue("Соискатель_1");
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);
    }

    @Test
    void Negativ2() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[id=mt]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);

    }

    @Test
    void Negativ3() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[id=testlead]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);
    }

    @Test
    void Negativ4() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[name=firstname]").setValue("Соискатель_1");
        $("[name=hostel]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);
    }
}