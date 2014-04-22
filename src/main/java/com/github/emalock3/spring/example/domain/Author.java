package com.github.emalock3.spring.example.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@lombok.Data
@NoArgsConstructor
public class Author implements Serializable {
  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = false)
  private String name;
  
  public Author(String name) {
    this.name = name;
  }
}
