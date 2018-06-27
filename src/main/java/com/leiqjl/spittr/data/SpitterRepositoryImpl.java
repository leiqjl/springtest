package com.leiqjl.spittr.data;

import com.leiqjl.spittr.Spitter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SpitterRepositoryImpl implements SpitterRepository {

    private static List<Spitter> spitterList = new ArrayList<>();

    @Override
    public Spitter save(Spitter spitter) {
        spitterList.add(spitter);
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        for (Spitter spitter : spitterList) {
            if (username.equals(spitter.getUsername())) {
                return spitter;
            }
        }
        return null;
    }
}
