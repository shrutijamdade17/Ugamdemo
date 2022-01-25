package com.ugams.core.models.impl;

import com.ugams.core.models.BannerArea;
import com.ugams.core.models.TitleText;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.poi.ss.formula.functions.T;
import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class TitleTextImplTest {

    private final AemContext aemContext = new AemContext();

    @BeforeEach
    void setUp() {
        aemContext.load().json("/titletext.json","/content");

    }

    @Test
    void getTitle() {
        Resource resource = aemContext.currentResource("/content/title-text");
        TitleText titleText = resource.adaptTo(TitleText.class);
        assertEquals("My Offered Services", titleText.getTitle());
    }

    @Test
    void getText() {
        Resource resource = aemContext.currentResource("/content/title-text");
        TitleText titleText = resource.adaptTo(TitleText.class);
        assertEquals("At about this time of year",titleText.getText());
    }

    @Test
    void getSectionGap() {
        Resource resource = aemContext.currentResource("/content/title-text");
        TitleText titleText = resource.adaptTo(TitleText.class);
        Boolean SectionGap = titleText.getSectionGap();
        assertEquals("true",SectionGap.toString());
    }

    @Test
    void getBottomPadding() {
        Resource resource = aemContext.currentResource("/content/title-text");
        TitleText titleText = resource.adaptTo(TitleText.class);
        Boolean BottomPadding = titleText.getBottomPadding();
        assertEquals("false",BottomPadding.toString());
    }

    @Test
    void getBackground() {
        Resource resource = aemContext.currentResource("/content/title-text");
        TitleText titleText = resource.adaptTo(TitleText.class);
        Boolean Background = titleText.getBackground();
        assertEquals("true",Background.toString());
    }
}