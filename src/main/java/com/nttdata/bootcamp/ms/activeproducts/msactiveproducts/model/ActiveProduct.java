package com.nttdata.bootcamp.ms.activeproducts.msactiveproducts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActiveProduct {

    @Id
    private Integer productID;
    private String productType;
    private String accountNumber;
    private String cantidadRetiros;

}
