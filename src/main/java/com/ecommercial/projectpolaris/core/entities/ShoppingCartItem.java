package com.ecommercial.projectpolaris.core.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ShoppingCartItem extends AbstractEntity{
    private Variant variant;
    private ShoppingCart shoppingCart;
    private int quantity;
}
