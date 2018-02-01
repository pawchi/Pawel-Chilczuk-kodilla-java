package com.kodilla.hibernate.invoice;


import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ItemDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @After
    public void tearDown() throws Exception{
        invoiceDao.deleteAll();
    }

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Table");
        Product product2 = new Product("Office chair");
        Product product3 = new Product("Lamp");
        Item item1 = new Item(product1,new BigDecimal(250),1);
        Item item2 = new Item(product2,new BigDecimal(150),2);
        Item item3 = new Item(product3,new BigDecimal(75),3);

        item1.getProducts().add(product1);
        item2.getProducts().add(product2);
        item3.getProducts().add(product3);

        Invoice invoice = new Invoice();
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int idInvoice = invoice.getId();

        //Then
        Assert.assertNotEquals(0,idInvoice);
    }
}
