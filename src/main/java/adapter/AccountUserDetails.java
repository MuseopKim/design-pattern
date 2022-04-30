package adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetails implements UserDetails {

    // Adaptee
    private final Account account;

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
