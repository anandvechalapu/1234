package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ctepl.anand.entity.JiraSoftwareConfiguration;

public interface JiraSoftwareRepository extends JpaRepository<JiraSoftwareConfiguration, Long> {

	@Query("SELECT j FROM JiraSoftwareConfiguration j WHERE j.userName = :userName")
	JiraSoftwareConfiguration findByUserName(@Param("userName") String userName);
	
	@Query("SELECT j FROM JiraSoftwareConfiguration j WHERE j.title = :title")
	JiraSoftwareConfiguration findByTitle(@Param("title") String title);
	
	@Query("SELECT j FROM JiraSoftwareConfiguration j WHERE j.url = :url")
	JiraSoftwareConfiguration findByUrl(@Param("url") String url);
	
	@Query("SELECT j FROM JiraSoftwareConfiguration j WHERE j.repositoryName = :repositoryName")
	JiraSoftwareConfiguration findByRepositoryName(@Param("repositoryName") String repositoryName);
	
	@Query("SELECT j FROM JiraSoftwareConfiguration j WHERE j.password = :password")
	JiraSoftwareConfiguration findByPassword(@Param("password") String password);
	
	Long deleteByUserName(String userName);
	
	Long deleteByTitle(String title);
	
	Long deleteByUrl(String url);
	
	Long deleteByRepositoryName(String repositoryName);
	
	Long deleteByPassword(String password);
	
}