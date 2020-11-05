package top.zjjacky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zjjacky.domain.Account;
import top.zjjacky.service.AccountService;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    @Qualifier("accountServiceImpl")
    private AccountService accountService;

    @RequestMapping("/findAllAccount")
    public String findAccount(Model model) {
        List<Account> allAccount = accountService.findAllAccount();
        model.addAttribute("allAccount",allAccount);
        return "sucess";
    }

    @RequestMapping("/addAccount")
    public String addAccount(Model model) {
        Account account = new Account();
        accountService.addAccount(account);
        model.addAttribute("s","sucess");
        return "sucess";
    }
}
