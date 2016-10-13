package by.rfe.novik.onliner.screens;

import static com.codeborne.selenide.Selenide.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.SelenideElement;

import by.rfe.novik.onliner.screens.catalog.CatalogPage;

public class MainPage {

    private static final Logger LOGGER = Logger.getLogger(MainPage.class);

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Каталог')]")
    private SelenideElement catalogTab;

    public CatalogPage openCatalogPage() {
        LOGGER.info("Opening Catalog page...");
        catalogTab.click();
        return page(CatalogPage.class);
    }

}
