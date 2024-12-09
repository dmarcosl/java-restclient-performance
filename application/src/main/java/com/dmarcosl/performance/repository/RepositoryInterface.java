package com.dmarcosl.performance.repository;

import com.dmarcosl.performance.domain.Domain;
import java.util.List;

public interface RepositoryInterface {

  Domain save(Domain domain);

  Domain findById(Long itemId);

  List<Domain> findAll();
}
