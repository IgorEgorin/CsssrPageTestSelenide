package ru.csssr.testRun;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.csssr.preconditionPackage.Precondition;

/**
 * Created by 1 on 13.06.2018.
 */
public class PositiveTest extends Precondition {

    @Test
    public void clickSecondTabTwiceOnQaPage() throws Exception {
        qaEngineerPage.doubleClickOnSecondTab();
        Assert.assertTrue(qaEngineerPage.
                afterTwoClickOnSecondTabTextUnderTabsIsDisplayed());
    }
}
