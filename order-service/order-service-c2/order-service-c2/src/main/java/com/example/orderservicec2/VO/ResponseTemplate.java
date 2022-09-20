package com.example.orderservicec2.VO;


import com.example.orderservicec2.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

    private Order order;
    private Product product;
    private Customer customer;

}
