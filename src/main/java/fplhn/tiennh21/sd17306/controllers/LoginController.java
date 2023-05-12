package fplhn.tiennh21.sd17306.controllers;

import fplhn.tiennh21.sd17306.request.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class LoginController {
    @GetMapping("login")
    public String getLoginForm()
    {
        return "login";
    }

    @PostMapping("login")
//    public String login(
//        @RequestParam(name="email", defaultValue = "ngvana@fpt.edu.vn") String email,
//        @RequestParam("password") Optional<String> pwd
//    ) {
    // Khi method return void, tên view == url
    public void login(Account account){
        System.out.println(account.getEmail());
        System.out.println(account.getPassword());

//        return "login";
    }
}
