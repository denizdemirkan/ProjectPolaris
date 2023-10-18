package com.ecommercial.projectpolaris.core.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.stream.events.Comment;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product extends AbstractEntity{

    private String name;
    private BigDecimal salePrice; // real price
    private BigDecimal listPrice; // actual price
    private Image image;

    // consider to store this as binary/byte code. Use Editor like TinyMCE
    private String description;
    private Set<Comment> comments = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Variant> variants = new HashSet<>();
    private Set<Category> categories = new HashSet<>();

}
