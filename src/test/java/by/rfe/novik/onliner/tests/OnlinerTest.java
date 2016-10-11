package by.rfe.novik.onliner.tests;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.rfe.novik.onliner.screens.MainPage;
import by.rfe.novik.onliner.screens.catalog.BeautyAndSportPage;
import by.rfe.novik.onliner.screens.catalog.BikePage;
import by.rfe.novik.onliner.screens.catalog.CatalogPage;

@Test
public class OnlinerTest {

    BikePage bikePage;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\target\\classes\\resources\\chromedriver.exe");
        browser = "chrome";
        baseUrl = "https://onliner.by";
        bikePage = navigateToBikePage();
    }

    @Test
    public void test01GetListOfBrandsFromSideBarProducer() {
        bikePage.getListBikeBrands().getTexts();
    }

    @Test
    public void test02GetListOfBikesTitles() {
        bikePage.getListOfBikeTitles();
    }

    @Test
    public void test03SetPriceAndCheckThatBikesAreNotExistedOnPage() {

    }

    private BikePage navigateToBikePage() {
        final MainPage mainPage = open("/", MainPage.class);
        final CatalogPage catalogPage = mainPage.openCatalogPage();
        final BeautyAndSportPage beautyAndSportPage = catalogPage.openBeautyAndSportLink();
        return beautyAndSportPage.openBikePage();
    }

}
