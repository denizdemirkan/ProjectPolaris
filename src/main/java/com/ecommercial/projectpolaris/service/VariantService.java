package com.ecommercial.projectpolaris.service;

import com.ecommercial.projectpolaris.core.entities.Product;
import com.ecommercial.projectpolaris.core.entities.Variant;
import com.ecommercial.projectpolaris.repository.ProductRepository;
import com.ecommercial.projectpolaris.repository.VariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VariantService {
    private final VariantRepository variantRepository;

    @Autowired
    public VariantService(VariantRepository variantRepository) {
        this.variantRepository = variantRepository;
    }

    public void saveProduct(Variant variant) {
        variantRepository.save(variant);
    }

    public Variant getProductById(Long id) {
        return variantRepository.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {
        variantRepository.deleteById(id);
    }

    public List<Variant> getAllProducts() {
        return variantRepository.findAll();
    }
}
