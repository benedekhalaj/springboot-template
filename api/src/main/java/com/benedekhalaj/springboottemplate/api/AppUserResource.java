package com.benedekhalaj.springboottemplate.api;

import com.benedekhalaj.springboottemplate.api.model.AppUser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(
        name = "AppUserResource",
        path = "/api/v1",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public interface AppUserResource {
    @GetMapping("/app-user")
    List<AppUser> getAll(); // might add Page<> to getAll

    @PostMapping("/app-user")
    AppUser create(@RequestBody AppUser appUser);
}
