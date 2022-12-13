package com.example.casestudy.service;

import com.example.casestudy.dto.FacilityView;
import com.example.casestudy.model.Facility;
import com.example.casestudy.service.impl.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface IFacilityService extends IGeneralService<Facility> {
    Page<Facility> searchView(String name, String facilityType, Pageable pageable);
}
