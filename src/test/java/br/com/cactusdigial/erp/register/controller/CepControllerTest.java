package br.com.cactusdigial.erp.register.controller;

import br.com.cactusdigial.erp.register.config.WireMockConfig;
import br.com.cactusdigial.erp.register.controller.mocks.CepMocks;
import br.com.cactusdigital.erp.register.SpringApp;
import br.com.cactusdigital.erp.register.service.CepService;
import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@ActiveProfiles(profiles = { "test" })
@TestPropertySource(locations = "classpath:application-test.properties")
@SpringBootTest(classes = { SpringApp.class })
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration( classes = { WireMockConfig.class })
public class CepControllerTest {

    @Autowired
    private WireMockServer mockBooksService;

    @Autowired
    private CepService cepService;

    @Before
    public void setup() throws IOException {
        CepMocks.setupMockBooksResponse(mockBooksService);
    }

    @Test
    public void test_success() {

        Assert.assertNotNull(cepService.getCep("12213324"));


        String myTest = "test";
        Assert.assertEquals("test", myTest);
    }
}
