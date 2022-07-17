package com.spring_demo_9hr.demo.repository;

import com.spring_demo_9hr.demo.entitiy.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, String> {
    public Provider findByProviderName(String providerName);
    public Optional<Provider> findByProviderNameIgnoreCase(String providerName);
}
