package by.rfe.novik.onliner.screens.elements;

import static com.codeborne.selenide.Selenide.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import by.rfe.novik.onliner.screens.pages.CatalogPage;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;

public class NavigationWidget extends ElementsContainer {

	private static final Logger LOGGER = Logger.getLogger(NavigationWidget.class);

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Каталог')]")
	private SelenideElement catalogTab;

	public CatalogPage openCatalogPage() {
		LOGGER.info("Opening Catalog page...");
		catalogTab.click();
		return page(CatalogPage.class);
	}

}
