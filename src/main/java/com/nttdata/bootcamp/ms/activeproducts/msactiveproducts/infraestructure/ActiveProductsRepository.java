package com.nttdata.bootcamp.ms.activeproducts.msactiveproducts.infraestructure;

import com.nttdata.bootcamp.ms.activeproducts.msactiveproducts.model.ActiveProduct;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ActiveProductsRepository extends ReactiveMongoRepository<ActiveProduct, Integer> {



}
