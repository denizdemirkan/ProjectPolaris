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
public class SubCategory extends AbstractEntity{
    private String title;
    private Image icon;

    // consider to map with Category
}
