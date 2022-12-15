package com.example.casestudy.service;

import com.example.casestudy.dto.ContractDto;
import com.example.casestudy.model.Contract;
import com.example.casestudy.service.impl.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService extends IGeneralService<Contract> {

    Page<ContractDto> findContract(Pageable pageable);
}
