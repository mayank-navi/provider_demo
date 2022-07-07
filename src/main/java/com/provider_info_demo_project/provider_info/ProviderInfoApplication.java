package com.provider_info_demo_project.provider_info;

import com.provider_info_demo_project.provider_info.provider.DownTime;
import com.provider_info_demo_project.provider_info.provider.Provider;
import com.provider_info_demo_project.provider_info.provider.ProviderPKid;
import com.provider_info_demo_project.provider_info.provider.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class ProviderInfoApplication {

	@Autowired
	private ProviderRepository providerRepository;

	@PostMapping("getProviders")
	public List<Provider> getProviders() {
		return providerRepository.findAll();
	};

	@PostMapping("getProvider")
	public Provider getProvider(@RequestParam String provider, @RequestParam String flowName) {
		ProviderPKid id = new ProviderPKid(provider, flowName);
		return providerRepository.findById(id).orElse(null);
	};

	@PostMapping("addProvider")
	public Provider addProvider(@RequestParam String provider, @RequestParam String flowName, @RequestBody DownTime downTimeInfo) {
		DownTime downTime = new DownTime(downTimeInfo.downTimeStart, downTimeInfo.downTimeEnd);
		Provider newProvider = new Provider(provider, flowName, downTime.downTimeStart, downTime.downTimeEnd);
		return providerRepository.save(newProvider);
	};

	@PostMapping("updateProvider")
	public Provider updateProvider(@RequestParam String provider, @RequestParam String flowName, @RequestBody DownTime downTimeInfo) {
		DownTime downTime = new DownTime(downTimeInfo.downTimeStart, downTimeInfo.downTimeEnd);
		Provider newProvider = new Provider(provider, flowName, downTime.downTimeStart, downTime.downTimeEnd);
		return providerRepository.save(newProvider);
	};

	@PostMapping("deleteProvider")
	public void deleteProvider(@RequestParam String provider, @RequestParam String flowName) {
		ProviderPKid id = new ProviderPKid(provider, flowName);
		providerRepository.deleteById(id);
		return;
	};


	public static void main(String[] args) {
		SpringApplication.run(ProviderInfoApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello World!";
	}

}
