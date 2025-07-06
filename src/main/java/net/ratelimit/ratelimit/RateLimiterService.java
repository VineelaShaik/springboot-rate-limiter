package net.ratelimit.ratelimit;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class RateLimiterService {
    private final Map<String, List<Long>> userRequestMap=new HashMap<>();
    private final int windowSize =10_000;
    private final int requestLimit=5;

    public boolean isAllowed(String userId){
        long now= System.currentTimeMillis();
        userRequestMap.putIfAbsent(userId, new ArrayList<>());
        List<Long> timestamps= userRequestMap.get(userId);

        timestamps.removeIf(t -> t < now- windowSize);
        if(timestamps.size()<requestLimit){
            timestamps.add(now);
            return true;
        }else{
            return false;
        }
    }
    
}
