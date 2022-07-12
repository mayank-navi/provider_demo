package com.spring_demo_9hr.demo.controller;

import com.spring_demo_9hr.demo.entitiy.Provider;
import com.spring_demo_9hr.demo.service.DownTime;
import com.spring_demo_9hr.demo.service.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Provider addProvider(@RequestParam String providerName, @RequestParam String flowName, @RequestBody DownTime downTime) {
        DownTime downTimeInfo = new DownTime(downTime.down_time_start, downTime.down_time_end);
        Provider newProvider = new Provider(providerName, flowName, downTimeInfo.down_time_start, downTimeInfo.down_time_end);
        return providerServiceImpl.addProvider(newProvider);
    };

    @GetMapping("getProviders")
    public List<Provider> getProviders() {
        return providerServiceImpl.getAllProviders();
    };

    @GetMapping("getProvider")
    public Provider getProvider(@RequestParam String providerName) {
        return providerServiceImpl.getProvider(providerName);
    }

    @PutMapping("updateProvider")
    public Provider updateProvider(@RequestParam String providerName, @RequestParam String flowName, @RequestBody DownTime downTime){
        Provider updatedProvider = new Provider(providerName, flowName, downTime.getDown_time_start(), downTime.getDown_time_end());
        return providerServiceImpl.updateProvider(updatedProvider);
    }

    @DeleteMapping("deleteProvider")
    public String deleteProvider(@RequestParam String providerName) {
        return providerServiceImpl.deleteProvider(providerName);
    };
}
