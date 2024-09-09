package com.senac.api.useCases.itens.repository;

import com.senac.api.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensRepository extends JpaRepository<Item, Long> {
}
