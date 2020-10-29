package com.sugercoffee.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibermate")
public class AlphaDaoHibermateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hiberamte";
    }
}
