package com.domain.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter; 


@Entity
@Table(name = "tbl_categories")
// lombok
// @Setter
// @Getter
// @NoArgsConstructor
public @Data class Category extends BaseEntity<String> implements Serializable{
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;

  @Column(length = 100,nullable = false, unique = true)
  private String name;

  // @Builder
  // public Category(Long id, String name){
  //   this.id = id;
  //   this.name = name;
  // }
}


// @Entity
// @Table(name = "tbl_categories")
// public class Category extends BaseEntity<String> implements Serializable{
  
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   public Long id;

//   @Column(length = 100,nullable = false, unique = true)
//   private String name;

//   public Long getId() {
//     return id;
//   }

//   public void setId(Long id) {
//     this.id = id;
//   }

//   public String getName() {
//     return name;
//   }

//   public void setName(String name) {
//     this.name = name;
//   }
// }
