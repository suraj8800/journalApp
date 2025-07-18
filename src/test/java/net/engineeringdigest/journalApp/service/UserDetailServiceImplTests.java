package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

public class UserDetailServiceImplTests {

    @InjectMocks
    private UserDetailsServiceImpl userDetailsServiceImpl;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Disabled
    void loadUserByUserNameTest(){
        when(userRepository.findByUserName(anyString()))
                .thenReturn(User.builder()
                        .userName("ram")
                        .password("ehsueh")
                        .roles(List.of())
                        .build());
        UserDetails user = userDetailsServiceImpl.loadUserByUsername("ram");
        Assertions.assertNotNull(user);
    }
 }
