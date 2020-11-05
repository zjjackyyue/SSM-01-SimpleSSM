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

    //查询人员账户，返回查询页
    @RequestMapping("/findAllAccount")
    public String findAccount(Model model) {
        List<Account> allAccount = accountService.findAllAccount();
        model.addAttribute("allAccount",allAccount);
        return "allAccount";
    }

    //添加人员账户，然后重定向到查询页
    @RequestMapping("/addAccount")
    public String addAccount(Model model, Account account) {
        accountService.addAccount(account);
        return "redirect:/account/findAllAccount";
    }

    //修改人员账户
    @RequestMapping("/updateAccount")
    public String updateAccount(Account account) {
        accountService.updateAccount(account);
        return "redirect:/account/findAllAccount";
    }

    //删除人员账户
    @RequestMapping("/deleteAccountById")
    public String deleteAccountById(int id) {
        accountService.deleteAccountById(id);
        return "redirect:/account/findAllAccount";
    }

    //跳转到增加人员账户的页面
    @RequestMapping("/toAddPaper")
    public String toAddPaper() {
        return "addAccount";
    }

    //跳转到修改页面
    @RequestMapping("/toUpdatePaper")
    public String toUpdatePaper(Model model, int id, String name, Double money) {
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        model.addAttribute("money",money);
        return "updateAccount";
    }
}
