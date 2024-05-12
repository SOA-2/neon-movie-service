package com.cinemas.neon.neonmovieservice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private static final GrantedAuthority GOLD_CUSTOMER = new SimpleGrantedAuthority("SCOPE_email");

    @GetMapping(path = "")
    @PreAuthorize("hasAuthority('SCOPE_email')")
    public String getAuthors() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();

        if (authentication.getAuthorities().contains(GOLD_CUSTOMER)) {
            return "Scopes: " + authentication.getAuthorities();
        }
        else {
            return "Login please";
        }
    }
    
}
