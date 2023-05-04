package com.tooltime.invoice.service;

import com.tooltime.invoice.exception.InvoiceNotFoundException;
import com.tooltime.invoice.repository.InvoicePersistence;
import com.tooltime.invoice.repository.InvoiceRepository;
import com.tooltime.invoice.service.domain.Invoice;
import com.tooltime.invoice.service.domain.mapper.InvoicePersistenceToInvoiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Optional<Invoice> getInvoice(UUID id) {
        //logs
        Optional<InvoicePersistence> repository = this.invoiceRepository.findById(id);
        if(repository.isPresent()){
            InvoicePersistence invoicePersistence = repository.get();
            return Optional.of(InvoicePersistenceToInvoiceMapper.mapToInvoice(invoicePersistence));//fetch items;
        }
        return Optional.empty();
    }
}
