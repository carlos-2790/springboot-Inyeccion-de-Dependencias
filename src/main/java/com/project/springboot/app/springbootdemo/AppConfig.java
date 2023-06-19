package com.project.springboot.app.springbootdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.project.springboot.app.springbootdemo.domain.ItemFactura;
import com.project.springboot.app.springbootdemo.domain.Producto;

@Configuration
public class AppConfig {

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems() {

        Producto prod1 = new Producto("Camara Sony", 100);
        Producto prod2 = new Producto("Bicicleta Baccio", 200);

        ItemFactura linea1 = new ItemFactura(prod1, 2);
        ItemFactura linea2 = new ItemFactura(prod2, 4);

        return Arrays.asList(linea1, linea2);

    }

     @Bean("itemsFacturaOficina")
     @Primary
    public List<ItemFactura> registrarItemsOficina() {

        Producto prod1 = new Producto("Monitor Samsung 24", 350);
        Producto prod2 = new Producto("Notebook Gateway", 550);
        Producto prod3 = new Producto("Impresora HP", 150);
        Producto prod4 = new Producto("Escritorio de oficina", 280);

        ItemFactura linea1 = new ItemFactura(prod1, 10);
        ItemFactura linea2 = new ItemFactura(prod2, 41);
        ItemFactura linea3 = new ItemFactura(prod3, 4);
        ItemFactura linea4 = new ItemFactura(prod4, 8);


        return Arrays.asList(linea1, linea2,linea3,linea4);

    }

}
