package by.rfe.novik.onliner.screens.catalog;

import static com.codeborne.selenide.Selenide.$$;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class BikePage {

    private static final String CSS_LOCATOR_LIST_BIKE_BRANDS =
            "div.schema-filter-popover.schema-filter-popover_visible span.schema-filter__checkbox-text";

    @FindBy(how = How.CSS, using = "div.schema-filter-control__item")
    private SelenideElement showAllBikesButton;

    @FindBy(how = How.CSS, using = "div.schema-product__title span")
    private List<SelenideElement> listOfBikesTitles;

    public ElementsCollection getListBikeBrands() {
        showAllBikesButton.click();
        return $$(CSS_LOCATOR_LIST_BIKE_BRANDS);
    }

    public List<SelenideElement> getListOfBikeTitles() {
        return listOfBikesTitles;
    }

}
