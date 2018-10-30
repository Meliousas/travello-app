package pjatk.dev.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.dev.entity.Account;

@RestController
@RequestMapping("/account")
public class AccountController {

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getAllAccounts(){
        return "All users will be displayed soon";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> createAccount(@PathVariable Account account){
        return ResponseEntity.accepted().body(account);
    }
}
