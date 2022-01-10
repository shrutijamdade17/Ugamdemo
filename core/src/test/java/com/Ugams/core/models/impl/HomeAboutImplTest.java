package com.Ugams.core.models.impl;

import com.Ugams.core.models.BannerArea;
import com.Ugams.core.models.HomeAbout;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class HomeAboutImplTest {

    private final AemContext aemContext = new AemContext();

    @BeforeEach
    void setUp() {
        aemContext.load().json("/homeabout.json","/content");
    }

    @Test
    void getHomeAboutTitle() {
        Resource resource = aemContext.currentResource("/content/homeabout");
        HomeAbout homeAbout = resource.adaptTo(HomeAbout.class);
        assertEquals("ABOUT ME", homeAbout.getHomeAboutTitle());
    }

    @Test
    void getHomeAboutHeading() {
        Resource resource = aemContext.currentResource("/content/homeabout");
        HomeAbout homeAbout = resource.adaptTo(HomeAbout.class);
        assertEquals("PERSONAL DETAILS", homeAbout.getHomeAboutHeading());
    }

    @Test
    void getHomeAboutDescription() {
        Resource resource = aemContext.currentResource("/content/homeabout");
        HomeAbout homeAbout = resource.adaptTo(HomeAbout.class);
        assertEquals("Here, I focus on a range of items and features", homeAbout.getHomeAboutDescription());
    }

    @Test
    void getHomeAboutButtonTitle() {
        Resource resource = aemContext.currentResource("/content/homeabout");
        HomeAbout homeAbout = resource.adaptTo(HomeAbout.class);
        assertEquals("VIEW FULL DETAILS", homeAbout.getHomeAboutButtonTitle());
    }

    @Test
    void getImg() {
        Resource resource = aemContext.currentResource("/content/homeabout");
        HomeAbout homeAbout = resource.adaptTo(HomeAbout.class);
        assertEquals("/content/dam/ugams/about-img.png", homeAbout.getImg());
    }

    @Test
    void getPathValue() {
        Resource resource = aemContext.currentResource("/content/homeabout");
        HomeAbout homeAbout = resource.adaptTo(HomeAbout.class);
        assertEquals("/content/ugams/us/en/about", homeAbout.getPathValue());
    }
}