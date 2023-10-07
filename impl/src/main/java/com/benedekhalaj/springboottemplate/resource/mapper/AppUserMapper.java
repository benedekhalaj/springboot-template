package com.benedekhalaj.springboottemplate.resource.mapper;

import com.benedekhalaj.springboottemplate.database.entity.AppUser;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AppUserMapper {
    List<com.benedekhalaj.springboottemplate.api.model.AppUser> entityToDto(List<AppUser> appUser);
    com.benedekhalaj.springboottemplate.api.model.AppUser entityToDto(AppUser appUser);
}
