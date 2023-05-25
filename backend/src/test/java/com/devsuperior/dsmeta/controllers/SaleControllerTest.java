package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import com.devsuperior.dsmeta.services.SmsService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class SaleControllerTest {

    @Mock
    private SaleService saleService;

    @Mock
    private SmsService smsService;

    @InjectMocks
    private SaleController saleController;

    private Pageable pageable;

    @Before
    public void setup() {
        pageable = PageRequest.of(0, 10);
    }

    @Test
    public void testFindSales() {
        // Configuração
        String minDate = "2023-01-01";
        String maxDate = "2023-05-01";
        Page<Sale> expectedSales = new PageImpl<>(Arrays.asList(new Sale(), new Sale()));

        Mockito.when(saleService.findSales(minDate, maxDate, pageable)).thenReturn(expectedSales);

        // Execução
        Page<Sale> result = saleController.findSales(minDate, maxDate, pageable);

        // Verificação
        Assert.assertEquals(expectedSales, result);
        Mockito.verify(saleService).findSales(minDate, maxDate, pageable);
    }

    @Test
    public void testNotifySms() {
        // Configuração
        Long saleId = 123L;

        // Execução
        saleController.notifySms(saleId);

        // Verificação
        Mockito.verify(smsService).sendSms(saleId);
    }

    @Test(expected = Exception.class)
    public void testNotifySmsFailure() {
        // Configuração
        Long saleId = 123L;

        // Simula uma exceção sendo lançada ao enviar o SMS
        Mockito.doThrow(new Exception("Erro no envio do SMS")).when(smsService).sendSms(saleId);

        // Execução
        saleController.notifySms(saleId);
    }

    @Test
    public void testFindSalesPagination() {
        // Configuração
        String minDate = "2023-01-01";
        String maxDate = "2023-05-01";
        Pageable pageable = PageRequest.of(1, 5); // Página 1, tamanho da página 5
        Page<Sale> expectedSales = new PageImpl<>(Arrays.asList(new Sale(), new Sale(), new Sale()));

        Mockito.when(saleService.findSales(minDate, maxDate, pageable)).thenReturn(expectedSales);

        // Execução
        Page<Sale> result = saleController.findSales(minDate, maxDate, pageable);

        // Verificação
        Assert.assertEquals(expectedSales, result);
        Mockito.verify(saleService).findSales(minDate, maxDate, pageable);
    }

}