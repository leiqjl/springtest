package com.leiqjl.spittr.data;

import com.leiqjl.spittr.Spitter;

public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}
