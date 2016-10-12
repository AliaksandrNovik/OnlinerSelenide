package by.rfe.novik.onliner.tests;

import org.testng.annotations.Test;

public class BikesBrandsTest extends BikesBaseTest {

    @Test
    public void test01GetListOfBrandsFromSideBarProducer() {
        bikePage.getListBikeBrands().getTexts();
    }

}
