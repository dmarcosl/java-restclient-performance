package com.dmarcosl.performance.repository;

import com.dmarcosl.performance.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {}
