package com.dmarcosl.performance.impl;

import com.dmarcosl.performance.domain.Domain;
import com.dmarcosl.performance.repository.RepositoryInterface;
import com.dmarcosl.performance.service.UseCaseInterface;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UseCaseInterfaceImpl implements UseCaseInterface {

  private final RepositoryInterface repository;

  @Override
  public Domain postItem(Domain domain) {
    return repository.save(domain);
  }

  @Override
  public Domain getItem(Long itemId) {
    return repository.findById(itemId);
  }

  @Override
  public List<Domain> getItems() {
    return repository.findAll();
  }
}
