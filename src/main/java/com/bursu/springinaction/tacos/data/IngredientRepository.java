package com.bursu.springinaction.tacos.data;

import com.bursu.springinaction.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}