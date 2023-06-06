package com.joaopedroigeskimorais.course.repositories;

import com.joaopedroigeskimorais.course.entities.Category;
import com.joaopedroigeskimorais.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
