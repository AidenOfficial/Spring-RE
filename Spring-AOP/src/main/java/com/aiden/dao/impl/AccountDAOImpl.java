package com.aiden.dao.impl;

import com.aiden.dao.AccountDAO;
import com.aiden.pojo.Account;

import java.util.ArrayList;
import java.util.List;
public class AccountDAOImpl implements AccountDAO {
    @Override
    public int addAccount(Account account) {
        System.out.println("DB: Adding account.");
        return 1;
    }

    @Override
    public int updateAccount(Account account) {
        System.out.println("DB: Updating account with ID: " + account.getAid());
        return 1;
    }

    @Override
    public int deleteAccount(int aid) {
        System.out.println("DB: Deleting account with ID: " + aid);
        return 1;
    }

    @Override
    public Account findByName(String aname) {
        System.out.println("DB: Searching for account with name: " + aname);
        return new Account(1, aname, 1000.0);
    }

    @Override
    public List<Account> getAll() {
        System.out.println("DB: Getting all accounts.");
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, "张三", 2000.0));
        accounts.add(new Account(2, "李四", 3000.0));
        return accounts;
    }
}
