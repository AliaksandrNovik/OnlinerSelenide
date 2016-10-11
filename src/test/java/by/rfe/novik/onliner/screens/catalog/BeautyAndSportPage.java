package by.rfe.novik.onliner.screens.catalog;

import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.SelenideElement;

public class BeautyAndSportPage {

    @FindBy(how = How.CSS, using = "a[title='Велосипеды']")
    private SelenideElement bikesLink;

    public BikePage openBikePage() {
        bikesLink.click();
        return page(BikePage.class);
    }

}
