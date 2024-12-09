package com.dmarcosl.performance.service;

import com.dmarcosl.performance.domain.Domain;
import java.util.List;

public interface UseCaseInterface {

  Domain postItem(Domain domain);

  Domain getItem(Long itemId);

  List<Domain> getItems();
}
