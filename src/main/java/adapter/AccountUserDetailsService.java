package adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {

    // Adaptee
    private final AccountService accountService;

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
