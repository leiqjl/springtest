package com.leiqjl.spittr.data;

import com.leiqjl.spittr.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
