package com.tooltime.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface InvoiceRepository extends JpaRepository<InvoicePersistence, UUID> {


    InvoicePersistence fetchInvoicesBYCustomerID(UUID CustomerID);
}
