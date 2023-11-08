package com.aiden.service;

import com.aiden.pojo.Account;

import java.util.List;

public interface AccountService {
    int addAccount(Account account);
    int updateAccount(Account account);
    int deleteAccount(int aid);
    Account findByName(String aname);
    List<Account> getAll();

    void triggerException() throws Exception;
}
