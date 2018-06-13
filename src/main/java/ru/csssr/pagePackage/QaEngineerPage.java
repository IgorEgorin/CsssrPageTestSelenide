package ru.csssr.pagePackage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by 1 on 13.06.2018.
 */
public class QaEngineerPage {

    private SelenideElement tabOneQaPage;
    private SelenideElement tabTwoQaPage;
    private SelenideElement tabThreeQaPage;
    private SelenideElement tabFourQaPage;

    private SelenideElement textUnderFourTabs;

    public QaEngineerPage() {
        this.tabOneQaPage = $("a[href='#']",0);
        this.tabTwoQaPage = $("a[href='#']",1);
        this.tabThreeQaPage = $("a[href='#']",2);
        this.tabFourQaPage = $("a[href='#']",3);
        this.textUnderFourTabs = $(By.xpath("//h4"));
    }


    public void doubleClickOnSecondTab() {
        tabTwoQaPage.click();
        textUnderFourTabs.isDisplayed();
        tabTwoQaPage.click();
    }

    public boolean afterTwoClickOnSecondTabTextUnderTabsIsDiplayed() {
        if (textUnderFourTabs.isDisplayed())
            return true;
        else {
            textUnderFourTabs.is(Condition.disabled);
            return false;
        }

    }
}
