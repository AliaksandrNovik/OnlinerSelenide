package by.rfe.novik.onliner.screens.catalog;

import static com.codeborne.selenide.Selenide.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.SelenideElement;

import by.rfe.novik.onliner.screens.MainPage;

public class CatalogPage {

    private static final Logger LOGGER = Logger.getLogger(MainPage.class);

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Красота ')]")
    private SelenideElement beautyAndSportLink;

    public BeautyAndSportPage openBeautyAndSportLink() {
        LOGGER.info("Opening BeautyAndSport Page ...");
        beautyAndSportLink.click();
        return page(BeautyAndSportPage.class);
    }

}
