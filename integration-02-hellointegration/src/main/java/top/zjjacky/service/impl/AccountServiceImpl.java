package top.zjjacky.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zjjacky.dao.AccountMapper;
import top.zjjacky.domain.Account;
import top.zjjacky.service.AccountService;

import java.util.List;

@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int addAccount(Account account) {
        int i = accountMapper.addAccount(account);
        return i;
    }

    @Override
    public List<Account> findAllAccount() {
        List<Account> allAccount = accountMapper.findAllAccount();
        return allAccount;
    }
}
