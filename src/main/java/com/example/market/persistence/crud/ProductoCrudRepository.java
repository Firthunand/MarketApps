package com.example.market.persistence.crud;

import com.example.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //CON QUERY METHOD
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

   /* //OTRA FORMA
    @Query(value = "select * from productos where id_categoria=?", nativeQuery = true)
    List<Producto> findByidCategoria(int idCategoria);*/

}
