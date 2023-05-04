package com.tooltime.invoice.service;

import com.tooltime.invoice.repository.InvoiceRepository;
import com.tooltime.invoice.service.domain.Invoice;
import org.springframework.beans.factory.annotation.Autowired;

public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice getInvoice(String id) {
        return this.invoiceRepository.getById(id);
    }
}
