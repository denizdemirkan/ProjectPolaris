package com.ecommercial.projectpolaris.repository;

import com.ecommercial.projectpolaris.core.entities.Variant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariantRepository extends JpaRepository<Variant, Long> {
}
