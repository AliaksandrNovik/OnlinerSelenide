package by.rfe.novik.onliner.screens.catalog;

import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.SelenideElement;

public class CatalogPage {

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Красота ')]")
    private SelenideElement beautyAndSportLink;

    public BeautyAndSportPage openBeautyAndSportLink() {
        beautyAndSportLink.click();
        return page(BeautyAndSportPage.class);
    }

}
