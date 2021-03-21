package com.Helpdesk.Maple3.services;

import com.Helpdesk.Maple3.entities.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AccountService extends UserDetailsService {

    public Account save(Account account);

    public Account findByUsername(String username);


}
