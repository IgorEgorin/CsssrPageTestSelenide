package ru.csssr.preconditionPackage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import ru.csssr.pagePackage.AllPages;

/**
 * Created by 1 on 13.06.2018.
 */
public class Precondition extends AllPages {

    @Parameters({"browser"})
    @BeforeMethod()
    protected void setUpMethod(String browser) {
        switch (browser) {
            case  "IE":
                InternetExplorerDriverManager.getInstance().setup();
                Configuration.browser ="IE";
                break;
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                Configuration.browser ="Chrome";
                break;
        }
        Configuration.timeout = 10000;
        Selenide.open("http://blog.csssr.ru/qa-engineer/");

    }

    @AfterMethod()
    public void quit() {
        Selenide.close();
    }
}
