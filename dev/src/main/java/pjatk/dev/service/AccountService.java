package pjatk.dev.service;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pjatk.dev.entity.Account;
import pjatk.dev.repository.AccountRepository;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAccounts(){
        return Lists.newArrayList(accountRepository.findAll());
    }

    public Account createAccount(Account account){
        // remember to take care about security
         accountRepository.save(account);
         return account;
    }

    public boolean isUsernameDuplicated(Account account){
        Long accountId = 1l; // to do as fast as possible
        return accountRepository.existsById(accountId);
    }

}
