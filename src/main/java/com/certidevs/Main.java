package com.certidevs;


import com.certidevs.entities.Producto;
import com.certidevs.repositories.LibroRepository;
import com.certidevs.repositories.ProductoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.certidevs.entities.*;

    @SpringBootApplication
    public class Main {

        public static void main(String[] args) {

    // inicializar spring
            ApplicationContext spring = SpringApplication.run(com.certidevs.Main.class, args);

    // obtener repositorio (lo crea spring)
            //ProductoRepository productoRepository = spring.getBean(ProductoRepository.class);
            LibroRepository libroRepository = spring.getBean(LibroRepository.class);

            //creamos un libro
            Libro libro1 = new Libro("El Quijote", "Cervantes", 1000, true);
            Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 200, true);
            Libro libro3 = new Libro("El Hobbit", "J.R.R. Tolkien", 300, true);

            //guardamos el libro en la base de datos
            libroRepository.save(libro1);
            libroRepository.save(libro2);
            libroRepository.save(libro3);


    /*
    //creamos un producto
            Producto manzana = new Producto("Manzana", 1.50, 10, true);
            Producto yogurt = new Producto("Yogurt", 0.50, 20, true);
            Producto avena = new Producto("Avena", 2.50, 30, true);
            Producto macarrones = new Producto("Macarrones", 0.54, 0, false);

    //guardamos el producto en la base de datos
            productoRepository.save(manzana);
            productoRepository.save(yogurt);
            productoRepository.save(avena);
            productoRepository.save(macarrones);

    //También podemos hacerlo con un saveAll y guardar varios productos a la vez
    productoRepository.saveAll(List.of(manzana, yogurt, avena, macarrones));*/

        }

    }

