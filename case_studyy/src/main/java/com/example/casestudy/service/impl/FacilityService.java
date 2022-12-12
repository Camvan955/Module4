package com.example.casestudy.service.impl;

import com.example.casestudy.model.Facility;
import com.example.casestudy.repository.facility.IFacilityRepository;
import com.example.casestudy.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacilityService implements IFacilityService {

    @Autowired
    private IFacilityRepository facilityRepository;

    @Override
    public Facility save(Facility facility) {
        return facilityRepository.save(facility);
    }

    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return facilityRepository.findAll(pageable);
    }

    @Override
    public Optional<Facility> findById(int id) {
        return facilityRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        facilityRepository.deleteById(id);
    }

    @Override
    public Page<Facility> searchByName(String name, String email, String customerType, Pageable pageable) {
        return null;
    }
}
