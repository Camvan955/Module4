package com.codegym.service;

import com.codegym.model.Email;
import com.codegym.repository.IMailReponsitory;
import com.codegym.repository.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmailService implements IEmailService{
    @Autowired
private IMailReponsitory mailReponsitory;

    @Override
    public List<Email> findAllEmail() {
        return mailReponsitory.findAllEmail();
    }

    @Override
    public List<String> languageList() {
        return mailReponsitory.languageList();
    }

    @Override
    public List<Integer> pageSizeList() {
        return mailReponsitory.pageSizeList();
    }
}
