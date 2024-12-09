package com.dmarcosl.performance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "model")
public class Model {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "item_id")
  private Long itemId;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "price")
  private Double price;

  @Column(name = "quantity")
  private Integer quantity;

  @Column(name = "stock")
  private Integer stock;

  @Column(name = "category")
  private String category;

  @Column(name = "url")
  private String url;

  @Column(name = "image_url")
  private String imageUrl;

  @Column(name = "is_active")
  private Boolean isActive;
}
