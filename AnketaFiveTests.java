import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AnketaFiveTests {
    @Test
    void FirstTest() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/"); // ТК-4
        $("[name=firstname]").setValue("Соискатель_1");
        $("[id=remote]").click();
        $("[name=hostel]").click();
        $("[id=pt]").click();
        $("[type=submit]").click();
        $("body").shouldHave(text("Вас зовут: Соискатель_1\n" +
                "Форма работы: удалённо\n" +
                "Готовность к командировкам: да\n" +
                "Ваши специальности:\n" +
                "Специалист по нагрузочному тестированию"));
        sleep(3000);
    }
    @Test
    void SecondTest() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/"); // ТК-8
        $("[name=hostel]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);
        sleep(3000);
    }

    @Test
    void ThirdTest() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/"); // ТК-12
        $("[id=td]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);
        sleep(3000);
    }
    @Test
    void FourthTest() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/"); // ТК-16
        $("[id=remote]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);
        sleep(3000);
    }
    @Test
    void FiveTest() {
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/"); // ТК-16
        $("[id=office]").click();
        $("[id=at]").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).shouldBe(exist);
        sleep(3000);
    }

}



