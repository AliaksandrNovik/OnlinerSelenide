package by.rfe.novik.onliner.tests;

import org.testng.annotations.Test;

public class BikesTitlesTest extends BikesBaseTest {

    @Test
    public void test02GetListOfBikesTitles() {
        bikePage.getListOfBikeTitles();
    }
}
