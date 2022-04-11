package com.kevcode.demo.infrastructure.repositories;

import com.kevcode.demo.domain.repositories.IMathRepo;
import org.springframework.stereotype.Repository;

@Repository
public class MathRepository implements IMathRepo {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
