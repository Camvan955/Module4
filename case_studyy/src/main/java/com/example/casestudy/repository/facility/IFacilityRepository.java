package com.example.casestudy.repository.facility;

import com.example.casestudy.dto.FacilityView;
import com.example.casestudy.model.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFacilityRepository extends JpaRepository<Facility, Integer> {


    @Query(value = "select * from facility as f where  (f.name like concat('%',:name,'%') and f.facitily_type_id like concat('%',:facilityType,'%'))",
            countQuery = "select * from facility as f where  (f.name like concat('%',:name,'%') and f.facitily_type_id like concat('%',:facilityType,'%'))"
            , nativeQuery = true)
    Page<Facility> searchView(@Param("name") String name, @Param("facilityType") String facilityType, Pageable pageable);
}
