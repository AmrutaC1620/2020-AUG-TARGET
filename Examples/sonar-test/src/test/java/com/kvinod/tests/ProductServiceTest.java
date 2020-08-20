package com.kvinod.tests;

import com.kvinod.repository.ProductRepository;
import com.kvinod.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ProductServiceTest {

    @Test
    public void test1() {
        ProductRepository repo = mock(ProductRepository.class);
        ProductService service = new ProductService(repo);

        when(repo.count()).thenReturn(22);

        Assertions.assertEquals(22, service.getProductCount());
    }
}
