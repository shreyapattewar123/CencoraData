package com.pack.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {

    @RequestMapping("signup.jsp")
    public ModelAndView signup(@RequestParam("newUsername") String username,
                               @RequestParam("email") String email,
                               @RequestParam("newPassword") String password) {
        ModelAndView mv = new ModelAndView();

        // Placeholder for signup logic (e.g., save user to database)
        if (usernameExists(username)) { // Implement this method to check if the username exists
            mv.setViewName("signup"); // Redirect to signup page on failure
            mv.addObject("signupError", "Username already exists. Please choose another.");
        } else {
            // Save the new user (implement actual logic here)
            mv.setViewName("login"); // Redirect to login page on success
            mv.addObject("signupSuccess", "Signup successful! You can now log in.");
        }

        return mv;
    }

    private boolean usernameExists(String username) {
        // Placeholder: Replace with actual logic to check username in database
        return false; // Change this logic as needed
    }
}
