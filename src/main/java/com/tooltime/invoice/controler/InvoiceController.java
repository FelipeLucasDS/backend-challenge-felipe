package com.tooltime.invoice.controler;

import com.tooltime.invoice.controler.domain.InvoiceDTO;
import com.tooltime.invoice.controler.domain.mapper.InvoiceToInvoiceDTOMapper;
import com.tooltime.invoice.service.InvoiceService;
import com.tooltime.invoice.service.domain.Invoice;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/invoices")
public class InvoiceController {
    private final InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService){
        this.invoiceService = invoiceService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvoiceDTO> getInvoice(@PathVariable("id") UUID id){
        // shall convert to dao
        Optional<Invoice> optionalInvoice = this.invoiceService.getInvoice(id);
        if(optionalInvoice.isEmpty()){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(InvoiceToInvoiceDTOMapper.mapToInvoice(optionalInvoice.get()));
    }
}

