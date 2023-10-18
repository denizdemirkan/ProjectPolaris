package com.ecommercial.projectpolaris.core.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order extends AbstractEntity{
    private int installmentMonths;
    private BigDecimal cost;
    private BigDecimal discount;
    private BigDecimal taxFee;
    private OrderStatus orderStatus;
    private boolean isCanceledByUser;
    private String cancelReason;

    private UserApp orderedBy;
    private Set<OrderItem> products = new HashSet<>();


}

