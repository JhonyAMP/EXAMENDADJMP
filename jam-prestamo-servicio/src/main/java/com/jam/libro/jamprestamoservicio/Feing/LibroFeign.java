package com.jam.libro.jamprestamoservicio.Feing;

import com.jam.libro.jamprestamoservicio.Dto.LibroDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "kps-libro-service", path = "/libros")
// Declara que esta interfaz se conecta con el microservicio llamado "kps-libro-service"
// El prefijo común de todas las rutas será "/libros"
public interface LibroFeign {

    @GetMapping("/{id}/stock")
        // Llama al endpoint GET /libros/{id}/stock del microservicio de libros
        // Retorna el stock actual del libro con ID dado
    ResponseEntity<Integer> obtenerStockLibro(@PathVariable Integer id);

    @PutMapping("/{id}/decrementarStock")
        // Llama al endpoint PUT /libros/{id}/decrementarStock
        // Disminuye el stock del libro con ID dado según la cantidad indicada
    ResponseEntity<Void> decrementarStockLibro(@PathVariable Integer id, @RequestParam Integer cantidad);

    @GetMapping("/{id}")
        // Llama al endpoint GET /libros/{id}
        // Retorna la información detallada de un libro en forma de DTO
    ResponseEntity<LibroDto> obtenerLibroPorId(@PathVariable Integer id);
}