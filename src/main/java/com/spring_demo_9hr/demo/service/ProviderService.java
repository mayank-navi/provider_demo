package com.spring_demo_9hr.demo.service;

import com.spring_demo_9hr.demo.entitiy.Provider;

import java.util.List;

public interface ProviderService {
    public Provider addProvider(Provider newProvider);
    public Provider getProvider(String providerName);
    public List<Provider> getAllProviders();
    public String deleteProvider(String providerName);
    public Provider updateProvider(Provider newProvider);
}
