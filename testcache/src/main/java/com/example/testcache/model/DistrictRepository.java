package com.example.testcache.model;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DistrictRepository extends JpaRepository<DistrictDO, Integer> {
    @Cacheable(cacheNames = "districtByAdCode", key = "#adCode")
    Optional<DistrictDO> findFirstOneByAdCode(String adCode);
}