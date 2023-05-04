package com.tooltime.invoice.controler;

import com.tooltime.invoice.controler.domain.InvoiceDAO;
import com.tooltime.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller(value = "/invoice")
public class InvoiceController {
    InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService){
        this.invoiceService = invoiceService;
    }

    @GetMapping
    public InvoiceDAO getInvoice(@PathVariable String id){
        // shall convert to dao
        return this.invoiceService.getInvoice(id);

    }
}

