package com.example.casestudy.service.impl;

import com.example.casestudy.model.Facility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService implements IFacitilyService {
    @Autowired
    private IFacilityRepository facilityRepository;

    @Override
    public List<Facility> findAll() {
        return facilityRepository.findAll();
    }


}
