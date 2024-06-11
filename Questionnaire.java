import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Questionnaire {
    @Test
    void tk02(){
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[name=firstname]").setValue("Соискатель_1");
        $("#remote").click();
        $("#td").click();
        $("[type=submit]").click();
        $("body").shouldHave(text("Вас зовут: Соискатель_1\n" +
                "Форма работы: удалённо\n" +
                "Готовность к командировкам: нет\n" +
                "Ваши специальности:\n" +
                "Тест-дизайнер"));
//        $(withText("Вас зовут: Соискатель_1")).should(exist);
//        $(withText("Форма работы: удалённо")).should(exist);
//        $(withText("Готовность к командировкам: нет")).should(exist);
//        $(withText("Ваши специальности:")).should(exist);
//        $(withText("Тест-дизайнер")).should(exist);
        sleep(2000);
    }
    @Test
    void tk06(){
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("#office").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).should(exist);
        sleep(2000);
    }
    @Test
    void tk10(){
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("#td").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).should(exist);
        sleep(2000);
    }
    @Test
    void tk14(){
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).should(exist);
        sleep(2000);
    }
    @Test
    void tk18(){
        open("http://92.51.36.108:7777/top.academy/lesson11_forms/v01/");
        $("[name=hostel]").click();
        $("#testlead").click();
        $("[type=submit]").click();
        $(byText("Введенные данные некорректны")).should(exist);
        sleep(2000);
    }
}
