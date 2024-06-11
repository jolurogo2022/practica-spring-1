package com.master.practica1.service;

import com.master.practica1.dominio.StringNombre;
import org.springframework.stereotype.Service;

@Service
public class StringNombreService implements IStringNombreService{

    @Override
    public String obtenerNombre(String stringNombre) {
        StringNombre stringNombre1 = new StringNombre(stringNombre);
        return stringNombre1.getParametroNombre();
    }
}
