package com.example.orderservicec2.VO;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    private Long prodId;

    @Column(name = "prodName")
    private String prodName;

    @Column(name = "prodQty")
    private String prodQty;

    @Column(name = "prodCost")
    private Long prodCost;
}
