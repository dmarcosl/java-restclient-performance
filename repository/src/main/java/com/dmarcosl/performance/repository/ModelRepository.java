package com.dmarcosl.performance.repository;

import com.dmarcosl.performance.model.Model;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long> {

    @Query("SELECT m FROM Model m")
    List<Model> findAllLimit(Pageable pageable);
}
