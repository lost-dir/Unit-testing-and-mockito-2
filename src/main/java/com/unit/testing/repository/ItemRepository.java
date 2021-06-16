package com.unit.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unit.testing.entity.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
