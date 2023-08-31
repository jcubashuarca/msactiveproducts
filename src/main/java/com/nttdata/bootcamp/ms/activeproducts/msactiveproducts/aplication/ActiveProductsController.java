package com.nttdata.bootcamp.ms.activeproducts.msactiveproducts.aplication;

import com.nttdata.bootcamp.ms.activeproducts.msactiveproducts.model.ActiveProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ActiveProductsController {

    @Autowired
    ActivePoductsService activePoductsService;

    @PostMapping("activeProducts")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ActiveProduct> createProducts(@RequestBody ActiveProduct activeProduct){

        return activePoductsService.createProduct(Mono.just(activeProduct));
    }

    @GetMapping(value = "activeProducts", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<ActiveProduct> allProducts(){
        return activePoductsService.listAllProducts();

    }
}
