package com.bursu.springinaction.tacos.data;

import com.bursu.springinaction.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}