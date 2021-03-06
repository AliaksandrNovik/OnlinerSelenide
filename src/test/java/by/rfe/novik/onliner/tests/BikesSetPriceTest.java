package by.rfe.novik.onliner.tests;

import static com.codeborne.selenide.Condition.text;
import org.testng.annotations.Test;

public class BikesSetPriceTest extends BikesBaseTest {

	private static final String PRICE_FOR_BIKES = "100 000";
	
    @Test
    public void test03SetPriceAndCheckThatBikesAreNotExistedOnPage() {
        bikePage.setPrice(PRICE_FOR_BIKES);
        bikePage.getBikesAreNotExistMessage().shouldHave(text("Упс! У нас нет таких товаров, попробуйте изменить условия поиска."));
    }

}
