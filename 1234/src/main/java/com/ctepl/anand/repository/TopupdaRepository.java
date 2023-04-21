package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctepl.anand.entity.TopupdaTempEntity;
import com.ctepl.anand.entity.TopupdaEntity;

@Repository
public interface TopupdaRepository extends JpaRepository<TopupdaEntity, Long> {

	TopupdaTempEntity findByTopupId(Long topupId);

	TopupdaEntity save(TopupdaEntity topupdaEntity);

}