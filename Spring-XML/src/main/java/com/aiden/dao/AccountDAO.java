package com.aiden.dao;

import com.aiden.pojo.Account;
import java.util.List;

public interface AccountDAO {
    int addAccount(Account account);
    int updateAccount(Account account);
    int deleteAccount(int aid);
    Account findByName(String aname);
    List<Account> getAll();
}
