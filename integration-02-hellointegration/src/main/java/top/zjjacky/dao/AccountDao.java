package top.zjjacky.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.zjjacky.domain.Account;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    List<Account> findAllAccount();
}
