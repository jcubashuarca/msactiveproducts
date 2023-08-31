package com.nttdata.bootcamp.ms.activeproducts.msactiveproducts.aplication;

import com.nttdata.bootcamp.ms.activeproducts.msactiveproducts.model.ActiveProduct;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ActivePoductsService {

    Mono<ActiveProduct> createProduct(Mono<ActiveProduct> activeProduct);
    Flux<ActiveProduct> listAllProducts();

}
