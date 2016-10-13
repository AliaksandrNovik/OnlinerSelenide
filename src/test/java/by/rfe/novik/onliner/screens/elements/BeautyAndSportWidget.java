package by.rfe.novik.onliner.screens.elements;

import static com.codeborne.selenide.Selenide.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import by.rfe.novik.onliner.screens.pages.BikePage;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;

public class BeautyAndSportWidget extends ElementsContainer   {

    private static final Logger LOGGER = Logger.getLogger(BeautyAndSportWidget.class);

    @FindBy(how = How.CSS, using = "a[title='Велосипеды']")
    private SelenideElement bikesLink;

    public BikePage openBikePage() {
        LOGGER.info("Opening Bike page ...");
        bikesLink.click();
        return page(BikePage.class);
    }

}
