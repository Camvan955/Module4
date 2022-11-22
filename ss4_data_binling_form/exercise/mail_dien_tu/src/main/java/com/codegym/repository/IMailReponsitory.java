package com.codegym.repository;

import com.codegym.model.Email;

import java.util.List;

public interface IMailReponsitory {

   List<Email> findAllEmail();

   List<String> languageList();

   List<Integer> pageSizeList();

}
