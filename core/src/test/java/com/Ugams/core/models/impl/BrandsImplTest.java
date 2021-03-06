package com.ugams.core.models.impl;

import com.ugams.core.models.Blog;
import com.ugams.core.models.Brands;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class BrandsImplTest {

    private final AemContext aemContext = new AemContext();

    @BeforeEach
    void setUp() {
        aemContext.load().json("/brands.json", "/content");
    }

    @Test
    void getImgPath() {
        Resource resource = aemContext.currentResource("/content/brands");
        Brands brands = resource.adaptTo(Brands.class);
        assertEquals("/content/dam/ugams/l1.png", brands.getImgPath().get(0));
    }

    @Test
    void getNoBrands(){
        Resource resource = aemContext.currentResource("/content/nobrands");
        Brands brands = resource.adaptTo(Brands.class);
        brands = resource.adaptTo(Brands.class);
        assertEquals(0, brands.getImgPath().size());
    }
}