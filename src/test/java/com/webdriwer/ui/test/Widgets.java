package com.webdriwer.ui.test;

import com.webdriwer.ui.Slider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Widgets extends BaseUITest {

    @Test
    public void testSliderMove() {
        String text = Slider.open().clickAndMoveSlider(10).getResult();
        Assert.assertEquals(text, "25");
    }
}
