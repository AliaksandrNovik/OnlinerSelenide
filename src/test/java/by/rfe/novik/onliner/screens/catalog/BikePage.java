package by.rfe.novik.onliner.screens.catalog;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.TestException;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class BikePage {

    private static final Logger LOGGER = Logger.getLogger(BikePage.class);

    private static final String CSS_LOCATOR_LIST_BIKE_BRANDS =
            "div.schema-filter-popover.schema-filter-popover_visible span.schema-filter__checkbox-text";

    private static final String CSS_LOCATOR_BIKES_PRESENT_MESSAGE = "div#schema-products";

    @FindBy(how = How.CSS, using = "div.schema-filter-control__item")
    private SelenideElement showAllBikesButton;

    @FindBy(how = How.CSS, using = "div.schema-product__title span")
    private List<SelenideElement> listOfBikesTitles;

    @FindBy(how = How.CSS, using = "input[class*=number-input_price]")
    private SelenideElement inputPriceFrom;

    public ElementsCollection getListBikeBrands() {
        showAllBikesButton.click();
        return $$(CSS_LOCATOR_LIST_BIKE_BRANDS);
    }

    public List<SelenideElement> getListOfBikeTitles() {
        return listOfBikesTitles;
    }

    public void setPrice(final String priceForBikes) {
        LOGGER.info("Set value: " + priceForBikes + " in price input");
        inputPriceFrom.setValue(priceForBikes);
    }

    public SelenideElement getBikesAreNotExistMessage() throws TestException {
        return $(CSS_LOCATOR_BIKES_PRESENT_MESSAGE);
    }

}
