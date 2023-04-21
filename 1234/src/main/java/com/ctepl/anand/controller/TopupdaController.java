package com.ctepl.anand.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.entity.TopupdaEntity;
import com.ctepl.anand.entity.TopupdaTempEntity;
import com.ctepl.anand.service.TopupdaService;

@RestController
@RequestMapping("/topupda")
public class TopupdaController {

	@Autowired
	private TopupdaService topupdaService;
	
	@GetMapping("/{topupId}")
	public TopupdaTempEntity getTopupdaById(@PathVariable Long topupId) {
		return topupdaService.getTopupdaById(topupId);
	}
	
	@PostMapping
	public TopupdaEntity saveTopupda(@RequestBody TopupdaEntity topupdaEntity) {
		return topupdaService.saveTopupda(topupdaEntity);
	}
	
	@PostMapping("/sendToApprove/{topupId}")
	public void sendToApprove(@PathVariable Long topupId) {
		topupdaService.sendToApprove(topupId);
	}
	
	@GetMapping("/entity/{topupId}")
	public Optional<TopupdaEntity> getTopupdaEntity(@PathVariable Long topupId) {
		return topupdaService.getTopupdaEntity(topupId);
	}
	
	@PostMapping("/entity")
	public TopupdaEntity saveTopupdaEntity(@RequestBody TopupdaEntity topupdaEntity) {
		return topupdaService.saveTopupdaEntity(topupdaEntity);
	}
	
	
}