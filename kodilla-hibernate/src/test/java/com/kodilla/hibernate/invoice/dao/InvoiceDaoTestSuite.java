package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("Invoice 1");
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Product product3 = new Product("Product 3");
        Item item1 = new Item(new BigDecimal(50), 10, new BigDecimal(500));
        Item item2 = new Item(new BigDecimal(250), 4, new BigDecimal(1000));
        Item item3 = new Item(new BigDecimal(20), 20, new BigDecimal(400));
        Item item4 = new Item(new BigDecimal(11), 50, new BigDecimal(550));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product3);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product3.getItems().add(item4);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int size = invoice.getItems().size();

        //Then
        Assertions.assertEquals(4, size);

        //CleanUp
        invoiceDao.deleteById(id);


    }
}
