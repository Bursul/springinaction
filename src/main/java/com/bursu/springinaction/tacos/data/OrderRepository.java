package com.bursu.springinaction.tacos.data;

import com.bursu.springinaction.tacos.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);

}