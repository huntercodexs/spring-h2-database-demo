package com.huntercodexs.h2demo.controller;

import com.huntercodexs.h2demo.repository.ProductsRepository;
import com.huntercodexs.h2demo.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@CrossOrigin(origins = "*")
@RequestMapping("${api.prefix}")
public class ProductsController {

    @Autowired
    ProductsRepository productsRepository;

    @Autowired
    SalesRepository salesRepository;

    @GetMapping(path = "/products")
    @ResponseBody
    public ResponseEntity<?> products() {
        return ResponseEntity.ok().body(productsRepository.findAll());
    }

    @GetMapping(path = "/sales")
    @ResponseBody
    public ResponseEntity<?> sales() {
        return ResponseEntity.ok().body(salesRepository.findAll());
    }
}
