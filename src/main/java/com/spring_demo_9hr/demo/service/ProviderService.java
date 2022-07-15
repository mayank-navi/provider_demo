package com.spring_demo_9hr.demo.service;

import com.spring_demo_9hr.demo.entitiy.Provider;
import com.spring_demo_9hr.demo.errors.ProviderDataNotEnoughExceptions;
import com.spring_demo_9hr.demo.errors.ProviderNotFoundExceptions;

import java.util.List;

public interface ProviderService {
    public Provider addProvider(Provider newProvider) throws ProviderDataNotEnoughExceptions;
    public Provider getProvider(String providerName) throws ProviderNotFoundExceptions;
    public List<Provider> getAllProviders();
    public String deleteProvider(String providerName) throws ProviderNotFoundExceptions;
    public Provider updateProvider(Provider newProvider) throws ProviderNotFoundExceptions, ProviderDataNotEnoughExceptions;
}
