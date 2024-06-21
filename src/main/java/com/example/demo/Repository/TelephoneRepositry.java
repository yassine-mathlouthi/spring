package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Telephone;

@Repository
public interface TelephoneRepositry extends JpaRepository<Telephone, Long> {

}
