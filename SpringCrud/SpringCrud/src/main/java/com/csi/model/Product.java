package com.csi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {

   @Id
   @GeneratedValue

   private int productId;
   private String productName;
   private double productPrice;
}
