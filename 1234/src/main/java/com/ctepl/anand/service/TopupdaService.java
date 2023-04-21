package com.ctepl.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.entity.TopupdaEntity;
import com.ctepl.anand.entity.TopupdaTempEntity;
import com.ctepl.anand.repository.TopupdaRepository;

@Service
public class TopupdaService {

	@Autowired
	TopupdaRepository topupdaRepository;

	public TopupdaTempEntity getTopupdaById(Long topupId) {
		return topupdaRepository.findByTopupId(topupId);
	}

	public TopupdaEntity saveTopupda(TopupdaEntity topupdaEntity) {
		return topupdaRepository.save(topupdaEntity);
	}

}