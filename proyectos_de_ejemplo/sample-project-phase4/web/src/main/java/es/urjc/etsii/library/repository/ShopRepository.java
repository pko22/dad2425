package es.urjc.etsii.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.urjc.etsii.library.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Long> {

}