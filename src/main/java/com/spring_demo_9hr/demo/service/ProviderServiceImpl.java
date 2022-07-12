package com.spring_demo_9hr.demo.service;

import com.spring_demo_9hr.demo.entitiy.Provider;
import com.spring_demo_9hr.demo.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService{

    private ProviderRepository providerRepository;

    public ProviderServiceImpl(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Override
    public Provider addProvider(Provider newProvider) {
        return providerRepository.save(newProvider);
    };

    @Override
    public Provider getProvider(String providerName) {
        return providerRepository.findById(providerName).get();
    }

    @Override
    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    @Override
    public String deleteProvider(String providerName) {
        providerRepository.deleteById(providerName);
        return "Provider removed successfully!";
    }

    @Override
    public Provider updateProvider(Provider newProvider) {
        return null;
    }
}
