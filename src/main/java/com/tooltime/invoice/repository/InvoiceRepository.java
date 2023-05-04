package com.tooltime.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Integer, InvoiceColumn> {
}
