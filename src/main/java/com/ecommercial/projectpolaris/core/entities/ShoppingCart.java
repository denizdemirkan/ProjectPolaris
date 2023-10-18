package com.ecommercial.projectpolaris.core.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ShoppingCart extends AbstractEntity{
    private boolean isUserShoppingCart;
    private boolean isCouponApplied;
    private Set<ShoppingCartItem> shoppingCartItems = new HashSet<>();
}
