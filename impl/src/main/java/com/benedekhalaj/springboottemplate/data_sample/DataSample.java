package com.benedekhalaj.springboottemplate.data_sample;

import com.benedekhalaj.springboottemplate.api.model.Gender;
import com.benedekhalaj.springboottemplate.config.DataSampleProperties;
import com.benedekhalaj.springboottemplate.database.entity.AppUser;
import com.benedekhalaj.springboottemplate.database.repository.AppUserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class DataSample {

    private final DataSampleProperties props;
    private final AppUserRepository appUserRepository;

    @PostConstruct
    public void init() {
        initAppUsers();
    }

    private void initAppUsers() {
        for (int i = 1; i <= props.getUserCount(); i++) {
            AppUser appUser = new AppUser();
            appUser.setFirstName("Sample User");
            appUser.setLastName(String.valueOf(i));
            appUser.setEmail("sample%d@email.com".formatted(i));
            appUser.setDateOfBirth(LocalDate.of(2000, 1, 1));
            appUser.setGender(isEven(i) ? Gender.MALE : Gender.FEMALE);
            appUserRepository.save(appUser);
        }
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
