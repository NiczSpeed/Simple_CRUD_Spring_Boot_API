package pl.niczspeed.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.niczspeed.webapp.enity.Product;

public interface ProductRepository extends JpaRepository <Product,Integer>{ // Integer bo id jest id!
    Product findByName(String name);



}
