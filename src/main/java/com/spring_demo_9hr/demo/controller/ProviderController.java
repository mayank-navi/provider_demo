package com.spring_demo_9hr.demo.controller;

import com.spring_demo_9hr.demo.entitiy.Provider;
import com.spring_demo_9hr.demo.errors.ProviderDataNotEnoughExceptions;
import com.spring_demo_9hr.demo.errors.ProviderNotFoundExceptions;
import com.spring_demo_9hr.demo.service.DownTime;
import com.spring_demo_9hr.demo.service.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class ProviderController {
    private ProviderServiceImpl providerServiceImpl;

    @Autowired
    public ProviderController(ProviderServiceImpl providerServiceImpl) {
        this.providerServiceImpl = providerServiceImpl;
    }

    @PostMapping("addProvider")
    public Provider addProvider(@RequestParam String providerName, @RequestParam String flowName, @RequestBody DownTime downTime) throws ProviderDataNotEnoughExceptions {
        DownTime downTimeInfo = new DownTime(downTime.downTimeStart, downTime.downTimeEnd);
        Provider newProvider = new Provider(providerName, flowName, downTimeInfo.downTimeStart, downTimeInfo.downTimeEnd);
        return providerServiceImpl.addProvider(newProvider);
    };

    @GetMapping("getProviders")
    public List<Provider> getProviders() {
        return providerServiceImpl.getAllProviders();
    };

    @GetMapping("getProvider")
    public Provider getProvider(@RequestParam String providerName) throws ProviderNotFoundExceptions {
        return providerServiceImpl.getProvider(providerName);
    }

    @PutMapping("updateProvider")
    public Provider updateProvider(@RequestParam String providerName, @RequestParam String flowName, @RequestBody DownTime downTime) throws ProviderNotFoundExceptions, ProviderDataNotEnoughExceptions {
        Provider updatedProvider = new Provider(providerName, flowName, downTime.getDownTimeStart(), downTime.getDownTimeEnd());
        return providerServiceImpl.updateProvider(updatedProvider);
    }

    @DeleteMapping("deleteProvider")
    public String deleteProvider(@RequestParam String providerName) throws ProviderNotFoundExceptions {
        return providerServiceImpl.deleteProvider(providerName);
    };
}
