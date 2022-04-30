package adapter;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
