package pjatk.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.dev.entity.Account;
import pjatk.dev.service.AccountService;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Account>> getAllAccounts(){
        return new ResponseEntity<>(accountService.getAccounts(), HttpStatus.OK);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<Account> createAccount(@RequestBody Account account){

        if(account.getUsername().isEmpty() || account.getPassword().isEmpty() ){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if(accountService.isUsernameDuplicated(account)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Account createdAccount = accountService.createAccount(account);
        return new ResponseEntity<>(createdAccount, HttpStatus.OK);
    }

}
