package com.dmarcosl.performance.mapper;

import com.dmarcosl.performance.domain.Domain;
import com.dmarcosl.performance.dto.Dto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class DtoMapper {

  public abstract Domain fromDto(Dto dto);

  public abstract Dto toDto(Domain domain);
}
