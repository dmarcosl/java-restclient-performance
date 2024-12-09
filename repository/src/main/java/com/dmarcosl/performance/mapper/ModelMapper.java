package com.dmarcosl.performance.mapper;

import com.dmarcosl.performance.domain.Domain;
import com.dmarcosl.performance.model.Model;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ModelMapper {

  public abstract Domain fromModel(Model model);

  public abstract Model toModel(Domain domain);
}
