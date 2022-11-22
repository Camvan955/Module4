package com.codegym.service;

import com.codegym.model.Email;

import java.util.List;

public interface IEmailService {
    List<Email> findAllEmail();

    List<String> languageList();

    List<Integer> pageSizeList();
}
