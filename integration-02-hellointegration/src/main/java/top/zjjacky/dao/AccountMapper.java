package top.zjjacky.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.zjjacky.domain.Account;
import java.util.List;

@Repository
public interface AccountMapper {

    int addAccount(Account account);

    int deleteAccountById(int id);

    int updateAccount(Account account);

    Account findAccountById(int id);

    @Select("select * from account")
    List<Account> findAllAccount();
}
