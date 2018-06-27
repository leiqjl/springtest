package com.leiqjl.spittr.data;

import com.leiqjl.spittr.Spittle;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * for test
 */
@Repository
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }

    @Override
    public Spittle findOne(long spittleId) {
        String message = "this is " + spittleId;
        return new Spittle(spittleId, message, new Date(), null, null);
    }
}
