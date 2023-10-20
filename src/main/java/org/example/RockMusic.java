package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    private RockMusic() {
    }


    @Override
    public String getSong() {
        return "Points of authority";
    }
}
