package onliner.by;

import org.junit.jupiter.api.Test;

public class OnlinerTest {
    @Test
    public void testSiteOpen(){
        OnlinerPage onlinerPage = new OnlinerPage();
        onlinerPage.openSite();
        onlinerPage.checkSiteOpened();
    }
}
