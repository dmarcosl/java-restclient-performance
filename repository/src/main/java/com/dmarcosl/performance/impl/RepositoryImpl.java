package com.dmarcosl.performance.impl;

import com.dmarcosl.performance.domain.Domain;
import com.dmarcosl.performance.mapper.ModelMapper;
import com.dmarcosl.performance.repository.ModelRepository;
import com.dmarcosl.performance.repository.RepositoryInterface;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RepositoryImpl implements RepositoryInterface {

  private final ModelRepository modelRepository;
  private final ModelMapper modelMapper;

  @Override
  public Domain save(Domain domain) {
    return modelMapper.fromModel(modelRepository.save(modelMapper.toModel(domain)));
  }

  @Override
  public Domain findById(Long itemId) {
    return modelRepository.findById(itemId).map(modelMapper::fromModel).orElse(null);
  }

  @Override
  public List<Domain> findAll() {
    return modelRepository.findAll().stream().map(modelMapper::fromModel).toList();
  }
}
