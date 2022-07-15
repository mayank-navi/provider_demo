package com.spring_demo_9hr.demo.service;

import com.spring_demo_9hr.demo.entitiy.Provider;
import com.spring_demo_9hr.demo.errors.ProviderDataNotEnoughExceptions;
import com.spring_demo_9hr.demo.errors.ProviderNotFoundExceptions;
import com.spring_demo_9hr.demo.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProviderServiceImpl implements ProviderService{

    private ProviderRepository providerRepository;

    public ProviderServiceImpl(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Override
    public Provider addProvider(Provider newProvider) throws ProviderDataNotEnoughExceptions {
        if(newProvider.getProviderName().isBlank()){
            throw new ProviderDataNotEnoughExceptions("Please provide providerName");
        }
        if(newProvider.getFlowName().isBlank()){
            throw new ProviderDataNotEnoughExceptions("Please provide flowName");
        }
        if(newProvider.getDownTimeStart().isBlank()){
            throw new ProviderDataNotEnoughExceptions("Please provide downTimeStart");
        }
        if(newProvider.getDownTimeEnd().isBlank()){
            throw new ProviderDataNotEnoughExceptions("Please provide downTimeEnd");
        }
        return providerRepository.save(newProvider);
    };

    @Override
    public Provider getProvider(String providerName) throws ProviderNotFoundExceptions {
        Optional<Provider> provider = providerRepository.findByProviderNameIgnoreCase(providerName);
        if(provider.isPresent()){
            return provider.get();
        }
        throw new ProviderNotFoundExceptions("Provider not found");
    }

    @Override
    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    @Override
    public String deleteProvider(String providerName) throws ProviderNotFoundExceptions {
        if(providerRepository.existsById(providerName)){
            providerRepository.deleteById(providerName);
            return "Provider removed successfully!";
        }
        throw new ProviderNotFoundExceptions("Provider doesn't exists!");
    }

    @Override
    public Provider updateProvider(Provider newProvider) throws ProviderNotFoundExceptions, ProviderDataNotEnoughExceptions {
        if(newProvider.getProviderName().isBlank()){
            throw new ProviderDataNotEnoughExceptions("Please provide providerName");
        }
        if(newProvider.getFlowName().isBlank()){
            throw new ProviderDataNotEnoughExceptions("Please provide flowName");
        }
        if(newProvider.getDownTimeStart().isBlank()){
            throw new ProviderDataNotEnoughExceptions("Please provide downTimeStart");
        }
        if(newProvider.getDownTimeEnd().isBlank()){
            throw new ProviderDataNotEnoughExceptions("Please provide downTimeEnd");
        }
        if(providerRepository.existsById(newProvider.getProviderName())){
            return providerRepository.save(newProvider);
        }
        throw new ProviderNotFoundExceptions("Provider doesn't exist");
    }
}
