package com.immmy6.springboot.web;

import com.immmy6.springboot.config.auth.LoginUser;
import com.immmy6.springboot.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class RankingController {

    @GetMapping("/ranking")
    public String ranking(Model model, @LoginUser SessionUser user) {
        if (user != null) {
            model.addAttribute("myName", user.getName());
        }
        return "ranking";
    }
}
