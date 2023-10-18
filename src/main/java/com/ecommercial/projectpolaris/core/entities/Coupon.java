package com.ecommercial.projectpolaris.core.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Coupon extends AbstractEntity{
    private String name;
    private String code;
    private boolean isUsed;
    private boolean isPercentageCoupon;
    private BigDecimal priceDiscount;
    private int percentageDiscount;
    private BigDecimal minimumRequirePrice;
    private BigDecimal maximumPriceToApply;
    private LocalDateTime expireDate;

    // private UserApp userBy;
}
