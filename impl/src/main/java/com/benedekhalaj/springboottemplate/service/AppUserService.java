package com.benedekhalaj.springboottemplate.service;

import com.benedekhalaj.springboottemplate.database.entity.AppUser;

import java.util.List;

public interface AppUserService {
    List<AppUser> getAll();

    AppUser create(AppUser appUser);
}
