/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tc.booking.repo;

import com.tc.booking.model.entity.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author binh
 */
public interface UserRepository extends CrudRepository<User, Long> {  
  Optional<User> findByLogin(String login);
}
