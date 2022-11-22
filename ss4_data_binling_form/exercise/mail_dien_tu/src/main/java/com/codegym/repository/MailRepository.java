package com.codegym.repository;

import com.codegym.model.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepository implements IMailReponsitory {
    public static List<Email> emailList = new ArrayList<>();;

    static{
        emailList.add(new Email("Vietnamese", 10, false, "Thor King, Asgard"));
        emailList.add(new Email("English", 50, true, "Anna King, Asgard"));
        emailList.add(new Email("Vietnamese", 10, false, "Agenea King, Regard"));
    }

    public static List<String> languageList = new ArrayList<>();
    static{

        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
    }

    public static List<Integer> pageSizeList = new ArrayList<>();;
    static{
        pageSizeList.add(5);
        pageSizeList.add(10);
        pageSizeList.add(15);
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);
    }


    @Override
    public List<Email> findAllEmail() {
        return emailList;
    }

    @Override
    public List<String> languageList() {
        return languageList;
    }

    @Override
    public List<Integer> pageSizeList() {
        return pageSizeList;
    }
}
