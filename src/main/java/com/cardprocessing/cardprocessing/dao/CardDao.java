package com.cardprocessing.cardprocessing.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cardprocessing.cardprocessing.entities.Card;

public interface CardDao extends JpaRepository<Card,Long>{

	
}
