package com.lokumlabs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lokumlabs.entities.Board;

public interface BoardRepository extends JpaRepository<Board,Long>{
	Board findByName(String name);
}
