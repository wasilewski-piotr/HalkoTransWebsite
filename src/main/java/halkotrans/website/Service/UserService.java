package halkotrans.website.Service;

import halkotrans.website.Models.User;
import halkotrans.website.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
