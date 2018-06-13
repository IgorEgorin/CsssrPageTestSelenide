package ru.csssr.preconditionPackage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
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
//                log.info("IeStartWork");
//                System.setProperty("webdriver.ie.driver", "C:\\Users\\1\\Downloads\\IEDriver.exe");
//                driver = new InternetExplorerDriver();
                break;

            case "chrome":
                ChromeDriverManager.getInstance().setup();
                Configuration.browser ="Chrome";
        }
        Configuration.timeout = 10000;
        Selenide.open("http://blog.csssr.ru/qa-engineer/");

    }

    @AfterMethod()
    public void quit() {
        Selenide.close();
    }
}
