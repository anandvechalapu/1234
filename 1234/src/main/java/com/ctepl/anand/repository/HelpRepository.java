·       User should be able to access the information when he clicks the functionalities.

package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelpRepository extends JpaRepository<Help, Long> {

    Help findByDataEntry(String dataEntry);
    Help findByDrillDown(String drillDown);
    Help findByPerformance(String performance);
    Help findByRegionalData(String regionalData);
    Help findByTrendPage(String trendPage);
    Help findByViewingData(String viewingData);
}