package com.benedekhalaj.springboottemplate.resource;

import com.benedekhalaj.springboottemplate.api.AppUserResource;
import com.benedekhalaj.springboottemplate.api.model.AppUser;
import com.benedekhalaj.springboottemplate.resource.mapper.AppUserMapper;
import com.benedekhalaj.springboottemplate.service.AppUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@Slf4j
public class AppUserResourceImpl implements AppUserResource {
    private final AppUserService appUserService;
    private final AppUserMapper appUserMapper;

    @Override
    public List<AppUser> getAll() {
        log.trace("Retrieving app users...");
        try {
            List<AppUser> res = appUserMapper.entityToDto(appUserService.getAll());
            log.debug("App users retrieved successfully! (number of returned items:{})", res.size());
            return res;
        } catch (RuntimeException re) {
            log.error("Error occurred while retrieving app users!", re);
            throw re;
        }
    }

    @Override
    public AppUser create(AppUser appUser) {
        log.trace("Create app user... (data: {})", appUser);
        try {
            AppUser res = appUserMapper.entityToDto(appUserService.create(appUserMapper.dtoToEntity(appUser)));
            log.info("App user has been successfully created! (data:{})", res);
            return res;
        } catch (RuntimeException re) {
            log.error("Error occurred while creating app user! (data: " + appUser + ")", re);
            throw re;
        }
    }
}
