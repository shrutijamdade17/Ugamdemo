package com.ugams.core.models.impl;

import com.ugams.core.models.Testimonial;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class TestimonialImplTest {

    private final AemContext aemContext = new AemContext();

    @BeforeEach
    void setUp() {
        aemContext.load().json("/testimonial.json","/content");
    }

    @Test
    void getTestimonialName() {
        Resource resource = aemContext.currentResource("/content/testimonial");
        Testimonial testimonial = resource.adaptTo(Testimonial.class);
        assertEquals("Harriet Maxwell",testimonial.getTestimonialName());
    }

    @Test
    void getTestimonialDescription() {
        Resource resource = aemContext.currentResource("/content/testimonial");
        Testimonial testimonial = resource.adaptTo(Testimonial.class);
        assertEquals("The more effort you put into improving your skills.",testimonial.getTestimonialDescription());
    }

    @Test
    void getTestimonialDesignation() {
        Resource resource = aemContext.currentResource("/content/testimonial");
        Testimonial testimonial = resource.adaptTo(Testimonial.class);
        assertEquals("scientist",testimonial.getTestimonialDesignation());
    }
}