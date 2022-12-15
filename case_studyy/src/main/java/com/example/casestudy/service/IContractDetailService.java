package com.example.casestudy.service;

import com.example.casestudy.model.Contract;
import com.example.casestudy.model.ContractDetail;

import java.util.List;

public interface IContractDetailService{
    ContractDetail save(ContractDetail contractDetail);
    List<ContractDetail> findAll();
}
