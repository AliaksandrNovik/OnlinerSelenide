package by.rfe.novik.onliner.tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.rfe.novik.onliner.screens.MainPage;
import by.rfe.novik.onliner.screens.catalog.BeautyAndSportPage;
import by.rfe.novik.onliner.screens.catalog.BikePage;
import by.rfe.novik.onliner.screens.catalog.CatalogPage;

@Configuration
@ComponentScan(basePackages = { "by.rfe.*" })
@PropertySource(value = "classpath:api.properties")
public class OnlinerTest {

    private static final String priceForBikes = "100 000";

    BikePage bikePage;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
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
        bikePage.setPrice(priceForBikes);
        bikePage.getBikesAreNotExistMessage().shouldHave(text("Упс! У нас нет таких товаров, попробуйте изменить условия поиска."));
    }

    private BikePage navigateToBikePage() {
        final MainPage mainPage = open("/", MainPage.class);
        final CatalogPage catalogPage = mainPage.openCatalogPage();
        final BeautyAndSportPage beautyAndSportPage = catalogPage.openBeautyAndSportLink();
        return beautyAndSportPage.openBikePage();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
