package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/demo")
public class DemoController {

    @GetMapping  ()
    public String saludarGet (){
        return "saludando con Get";
    }

    @GetMapping  ("/OtroGet")
    public String saludarGet2 (){
        return "saludando con Get2";
    }

    @PutMapping  ()
    public String saludarPut (){
        return "saludando con Put";
    }
    @PostMapping  ()
    public String saludarPost (){
        return "saludando con Post";
    }

    @PostMapping  ("/OtroPost")
    public String saludarPosts (){
        return "saludando con Post";
    }

    @DeleteMapping  ()
    public String saludarDelete (){
        return "saludando con Delete";
    }

    @PostMapping ("/estudiante")
    public String probandoEstiante (){
        Estudiante estudiante = new Estudiante();
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();

        return estudiante.nombre +" "+ estudiante1.ApPaterno + " " + estudiante2.ApMaterno +" "+ " La edad es:" + " "+estudiante3.edad;
    }

    @PutMapping ("/producto")
    public String mostrandoProducto (){
        Producto producto1 = new Producto();
        Producto proveedor = new Producto();
        Producto ano =new Producto();
        return producto1.tipo +" "+ proveedor.proveedor +" "+"Año de elaboracion:" + ano.ano;
    }


}
