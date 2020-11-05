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

    //新增一个账户
    @Override
    public int addAccount(Account account) {
        int i = accountMapper.addAccount(account);
        return i;
    }

    //修改一个账户
    @Override
    public int updateAccount(Account account) {
        int i = accountMapper.updateAccount(account);
        return i;
    }

    //删除一个账户
    @Override
    public int deleteAccountById(int id) {
        int i = accountMapper.deleteAccountById(id);
        return i;
    }

    //查询所有账户
    @Override
    public List<Account> findAllAccount() {
        List<Account> allAccount = accountMapper.findAllAccount();
        return allAccount;
    }
}
