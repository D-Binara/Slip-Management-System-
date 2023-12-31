package com.slipMangement.controller;

import com.slipMangement.entity.Slip;
import com.slipMangement.entity.User;
import com.slipMangement.repository.UserRepo;
import com.slipMangement.service.SlipServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @ModelAttribute
    public void commonUser(Principal p, Model m) {
        if (p != null) {
            String email = p.getName();
            User user = userRepo.findByEmail(email);
            m.addAttribute("user", user);
        }

    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/deposit")
    public String deposit() {
        return "deposit";
    }

    //slipUpload

    @Autowired
    private SlipServiceImpl slipService;

    @PostMapping("/saveSlip")
    public String saveSlip(@ModelAttribute Slip slip){

        Slip s = slipService.saveSlip(slip);
        return "redirect:/user/profile";
    }

}
