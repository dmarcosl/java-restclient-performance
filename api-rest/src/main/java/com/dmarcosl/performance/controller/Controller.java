package com.dmarcosl.performance.controller;

import com.dmarcosl.performance.dto.Dto;
import com.dmarcosl.performance.mapper.DtoMapper;
import com.dmarcosl.performance.service.UseCaseInterface;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class Controller {

  private final UseCaseInterface useCase;
  private final DtoMapper dtoMapper;

  @GetMapping("/health")
  public ResponseEntity<String> health() {
    return ResponseEntity.ok("OK");
  }

  @PostMapping("/post-item")
  public ResponseEntity<Dto> postItem(@RequestBody Dto dto) {
    return ResponseEntity.ok(dtoMapper.toDto(useCase.postItem(dtoMapper.fromDto(dto))));
  }

  @GetMapping("/get-item/{itemId}")
  public ResponseEntity<Dto> getItem(@PathVariable("itemId") Long itemId) {
    return ResponseEntity.ok(dtoMapper.toDto(useCase.getItem(itemId)));
  }

  @GetMapping("/get-item-list")
  public ResponseEntity<List<Dto>> getItemList() {
    return ResponseEntity.ok(useCase.getItems().stream().map(dtoMapper::toDto).toList());
  }

  @GetMapping("/get-item-cache/{itemId}")
  @Cacheable("modelById")
  public ResponseEntity<Dto> getItemCache(@PathVariable("itemId") Long itemId) {
    return getItem(itemId);
  }

  @GetMapping("/get-item-cache-list")
  @Cacheable("modelsList")
  public ResponseEntity<List<Dto>> getItemCacheList() {
    return getItemList();
  }
}
