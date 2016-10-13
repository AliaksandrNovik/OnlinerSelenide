package by.rfe.novik.onliner.screens.pages;

import static com.codeborne.selenide.Selenide.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import by.rfe.novik.onliner.screens.elements.BeautyAndSportWidget;

import com.codeborne.selenide.SelenideElement;

public class CatalogPage {

	private static final Logger LOGGER = Logger.getLogger(CatalogPage.class);

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Красота ')]")
	private SelenideElement beautyAndSportLink;

	@FindBy(how = How.CSS, using = "div.catalog-navigation-list__wrapper")
	private BeautyAndSportWidget beautyAndSportWidget;

	public BikePage openBikePage() {
		LOGGER.info("Opening BeautyAndSport Page ...");
		beautyAndSportLink.click();
		beautyAndSportWidget.openBikePage();
		return page(BikePage.class);
	}

}
