package com.benedekhalaj.springboottemplate.service;

import com.benedekhalaj.springboottemplate.database.entity.AppUser;
import com.benedekhalaj.springboottemplate.database.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AppUserServiceImpl implements AppUserService {
    private final AppUserRepository appUserRepository;

    @Override
    public List<AppUser> getAll() {
        return appUserRepository.findAll();
    }

    @Override
    public AppUser create(AppUser appUser) {
        return appUserRepository.save(appUser);
    }
}
