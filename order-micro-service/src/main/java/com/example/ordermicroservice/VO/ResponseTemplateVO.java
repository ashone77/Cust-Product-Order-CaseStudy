package com.example.ordermicroservice.VO;

import com.example.ordermicroservice.entity.OrderOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private OrderOne order;
    private Product product;
    private Customer customer;
}
