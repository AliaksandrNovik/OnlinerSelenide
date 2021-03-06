package by.rfe.novik.onliner.tests;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;


import org.testng.annotations.BeforeClass;

import by.rfe.novik.onliner.screens.pages.BikePage;
import by.rfe.novik.onliner.screens.pages.CatalogPage;
import by.rfe.novik.onliner.screens.pages.MainPage;

public class BikesBaseTest {

    protected String priceForBikes;

    protected BikePage bikePage;

	@BeforeClass(alwaysRun = true)
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        browser = "chrome";
        baseUrl = "https://onliner.by";
        bikePage = navigateToBikePage();
    }

    private BikePage navigateToBikePage() {
        final MainPage mainPage = open("/", MainPage.class);
        final CatalogPage catalogPage = mainPage.openCatalogPage();
        final BikePage bikePage = catalogPage.openBikePage();
        return bikePage;
    }

}
