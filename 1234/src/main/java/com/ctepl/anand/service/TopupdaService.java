package com.ctepl.anand.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.entity.TopupdaEntity;
import com.ctepl.anand.entity.TopupdaTempEntity;
import com.ctepl.anand.repository.TopupdaRepository;

@Service
public class TopupdaService {
	
	@Autowired
	private TopupdaRepository topupdaRepository;
	
	public void sendToApprove(Long topupId) {
		topupdaRepository.sendToApprove(topupId);
	}
	
	public Optional<TopupdaEntity> getTopupdaEntity(Long topupId) {
		return topupdaRepository.findById(topupId);
	}
	
	public TopupdaEntity saveTopupdaEntity(TopupdaEntity topupdaEntity) {
		return topupdaRepository.save(topupdaEntity);
	}
	
}