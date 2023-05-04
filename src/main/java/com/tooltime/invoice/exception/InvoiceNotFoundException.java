package com.tooltime.invoice.exception;

import java.util.UUID;

public class InvoiceNotFoundException extends RuntimeException {
    public InvoiceNotFoundException(UUID id) {

        //properly log the id
        super("Invoice not found");
    }
}
