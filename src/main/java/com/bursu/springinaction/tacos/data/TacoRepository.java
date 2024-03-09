package com.bursu.springinaction.tacos.data;

import com.bursu.springinaction.tacos.Taco;
import com.bursu.springinaction.tacos.TacoOrder;
import com.bursu.springinaction.tacos.User;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.net.ContentHandler;
import java.util.List;

public interface TacoRepository extends CrudRepository<Taco, Long> {
    List<Taco> findAll(Pageable pageable);
}
