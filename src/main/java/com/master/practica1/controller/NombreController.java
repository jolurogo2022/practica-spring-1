package com.master.practica1.controller;

import com.master.practica1.service.StringNombreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class NombreController {

    private final StringNombreService stringNombreService;

    public NombreController(StringNombreService stringNombreService){
        this.stringNombreService = stringNombreService;
    }

    @GetMapping("/nombre")
    public ResponseEntity<?> parametroString(String parametro){
        String nombre = stringNombreService.obtenerNombre(parametro);
        Map<String, Object> responseData = new HashMap<>();
        responseData.put("data","Hola "+nombre+", bienvenido a Spring Boot");
        return ResponseEntity.status((HttpStatusCode) HttpStatus.OK)
                .body(responseData);
    }
}
