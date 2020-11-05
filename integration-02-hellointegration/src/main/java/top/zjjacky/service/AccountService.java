package top.zjjacky.service;

import org.springframework.stereotype.Service;
import top.zjjacky.domain.Account;

import java.util.List;

@Service
public interface AccountService {

    int addAccount(Account account);

    int updateAccount(Account account);

    int deleteAccountById(int id);

    List<Account> findAllAccount();
}
