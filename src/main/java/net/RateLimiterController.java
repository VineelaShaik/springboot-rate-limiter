package net;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import net.ratelimit.ratelimit.RateLimiterService;

@RestController
@RequestMapping("/api")
public class RateLimiterController {
    private final RateLimiterService rateLimiterService;
     public RateLimiterController(RateLimiterService rateLimiterService){
        this.rateLimiterService=rateLimiterService;
     }
     
     @GetMapping("/check")
     public String checkRequest(@RequestParam String userId){
        boolean allowed=rateLimiterService.isAllowed(userId);
        return allowed? "Allowed":"Too many requests";
     }
}
