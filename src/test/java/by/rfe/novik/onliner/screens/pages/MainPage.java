package by.rfe.novik.onliner.screens.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import by.rfe.novik.onliner.screens.elements.NavigationWidget;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
	
    @FindBy(how = How.CSS, using = "nav.b-top-navigation")
    private NavigationWidget navigationWidget;
    
    public CatalogPage openCatalogPage(){
    	navigationWidget.openCatalogPage();
    	return page(CatalogPage.class);
    }

}
