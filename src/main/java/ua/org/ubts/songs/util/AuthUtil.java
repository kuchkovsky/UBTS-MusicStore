package ua.org.ubts.songs.util;

import org.springframework.security.core.Authentication;
import ua.org.ubts.songs.entity.UserEntity;

public class AuthUtil {

    public static boolean isAdmin(Authentication authentication) {
        return authentication.getAuthorities().stream().anyMatch(ga -> ga.getAuthority().equals("ROLE_ADMIN"));
    }

    public static boolean isAdmin(UserEntity userEntity) {
        return userEntity.getRoles().stream().anyMatch(r -> r.getName().equals("ROLE_ADMIN"));
    }

}
