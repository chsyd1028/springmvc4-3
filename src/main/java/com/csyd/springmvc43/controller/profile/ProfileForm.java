package com.csyd.springmvc43.controller.profile;

import com.csyd.springmvc43.date.PastLocalDate;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author chengshanyunduo
 * @version v1.0
 * @ClassName: ProfileForm
 * @date 2019年02月20日 15:13
 */
public class ProfileForm {

    @Size(min = 2)
    private String twitterHandle;

    @Email
    @NotEmpty
    private String email;

    @NotNull
    @PastLocalDate
    private LocalDate birthDate;

    @NotEmpty
    private List<String> tastes = new ArrayList<>();

    public String getTwitterHandle() {
        return twitterHandle;
    }

    public void setTwitterHandle(String twitterHandle) {
        this.twitterHandle = twitterHandle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getTastes() {
        return tastes;
    }

    public void setTastes(List<String> tastes) {
        this.tastes = tastes;
    }
}
