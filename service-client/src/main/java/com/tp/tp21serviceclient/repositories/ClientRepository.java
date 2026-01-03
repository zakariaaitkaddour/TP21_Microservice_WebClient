package com.tp.tp21serviceclient.repositories;

import com.tp.tp21serviceclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
