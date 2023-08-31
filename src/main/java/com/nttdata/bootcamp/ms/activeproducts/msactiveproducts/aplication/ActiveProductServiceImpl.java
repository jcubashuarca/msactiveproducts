package com.nttdata.bootcamp.ms.activeproducts.msactiveproducts.aplication;

import com.nttdata.bootcamp.ms.activeproducts.msactiveproducts.infraestructure.ActiveProductsRepository;
import com.nttdata.bootcamp.ms.activeproducts.msactiveproducts.model.ActiveProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ActiveProductServiceImpl implements ActivePoductsService {

    @Autowired
    ActiveProductsRepository activeProductsRepository;

    @Override
    public Mono<ActiveProduct> createProduct(Mono<ActiveProduct> activeProductMono) {
        return activeProductMono.flatMap(activeProductsRepository::insert);
    }

    @Override
    public Flux<ActiveProduct> listAllProducts() {
        return activeProductsRepository.findAll();
    }

}
