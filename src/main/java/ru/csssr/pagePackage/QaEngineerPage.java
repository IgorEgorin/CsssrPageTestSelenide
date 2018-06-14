package ru.csssr.pagePackage;

import com.codeborne.selenide.SelenideElement;

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
        this.tabOneQaPage = $("a[href='#']", 0);
        this.tabTwoQaPage = $("a[href='#']", 1);
        this.tabThreeQaPage = $("a[href='#']", 2);
        this.tabFourQaPage = $("a[href='#']", 3);
        this.textUnderFourTabs = $("div[style=\"display: none;\"]");
    }

    public void doubleClickOnSecondTab() {
        tabTwoQaPage.click();
        tabTwoQaPage.click();
    }

    public boolean afterTwoClickOnSecondTabTextUnderTabsIsDisplayed() {
        return textUnderFourTabs.isDisplayed();
    }

}