package com.example.codigomorse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodigoMorseController {

    @GetMapping("/{code}")
    public String traduzir(@PathVariable String code){
        return CodigoMorseTradutor.normal(code);
    }
}
