package by.rfe.novik.onliner.screens;

import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.SelenideElement;

import by.rfe.novik.onliner.screens.catalog.CatalogPage;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Каталог')]")
    private SelenideElement catalogTab;

    public CatalogPage openCatalogPage() {
        catalogTab.click();
        return page(CatalogPage.class);
    }

}
