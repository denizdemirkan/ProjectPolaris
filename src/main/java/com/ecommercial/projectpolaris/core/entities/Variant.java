package com.ecommercial.projectpolaris.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Variant extends AbstractEntity{
    private String barcode;
    private Image mainImage;
    private Set<Image> images = new HashSet<>();
    private int stockAmount;
    private int unitsSold;
    private BigDecimal SalePrice;
    private BigDecimal ListPrice;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
    private Size size;
    private Color color;

}
