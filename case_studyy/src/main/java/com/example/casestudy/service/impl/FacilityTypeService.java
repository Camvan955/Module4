package com.example.casestudy.service.impl;

import com.example.casestudy.model.FacitilyType;
import com.example.casestudy.repository.facility.IFacilityTypeRepository;
import com.example.casestudy.service.IFacilityService;
import com.example.casestudy.service.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService {

    @Autowired
    private IFacilityTypeRepository facilityTypeRepository;
    @Override
    public List<FacitilyType> findAll() {
        return facilityTypeRepository.findAll();
    }
}
