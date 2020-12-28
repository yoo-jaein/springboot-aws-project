package com.immmy6.springboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class RankingController {

    @GetMapping("/ranking")
    public String ranking() { return "ranking"; }
}
