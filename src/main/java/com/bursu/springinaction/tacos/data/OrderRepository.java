package com.bursu.springinaction.tacos.data;

import com.bursu.springinaction.tacos.TacoOrder;
import com.bursu.springinaction.tacos.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}