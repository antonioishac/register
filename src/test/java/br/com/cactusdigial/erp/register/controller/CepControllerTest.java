package br.com.cactusdigial.erp.register.controller;

import br.com.cactusdigial.erp.register.config.WireMockConfig;
import br.com.cactusdigial.erp.register.controller.mocks.CepMocks;
import br.com.cactusdigital.erp.register.SpringApp;
import br.com.cactusdigital.erp.register.service.CepService;
import br.com.cactusdigital.erp.register.service.dto.PublicArea;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Before
    public void setup() throws IOException {
        CepMocks.setupMockBooksResponse(mockBooksService);
    }

    @Test
    public void test_success() throws Exception {
        PublicArea publicArea = cepService.getCep("12213324");

        MvcResult result = this.mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/v1/ceps/12213324")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers
                        .status()
                        .isOk())
                .andReturn();

        assertEquals( HttpStatus.OK.value(), result.getResponse().getStatus() );
        Assert.assertNotNull(publicArea);
        Assert.assertEquals("Vila Mock", publicArea.getNeighborhood());
    }
}
