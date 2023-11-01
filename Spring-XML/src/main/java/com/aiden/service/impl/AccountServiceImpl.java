package com.aiden.service.impl;

import com.aiden.dao.AccountDAO;
import com.aiden.pojo.Account;
import com.aiden.service.AccountService;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDAO accountDAO;

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public int addAccount(Account account) {
        return accountDAO.addAccount(account);
    }

    @Override
    public int updateAccount(Account account) {
        return accountDAO.updateAccount(account);
    }

    @Override
    public int deleteAccount(int aid) {
        return accountDAO.deleteAccount(aid);
    }

    @Override
    public Account findByName(String aname) {
        return accountDAO.findByName(aname);
    }

    @Override
    public List<Account> getAll() {
        return accountDAO.getAll();
    }
}
