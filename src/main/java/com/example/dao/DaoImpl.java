package com.example.dao;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Profile;

@Component("dao")
@Profile("prod")
public class DaoImpl implements IDao {
    @Override public double getValue(){ return 100.0; }
}

// da
/*
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao")
@Profile("prod")  // Ce bean sera actif uniquement avec le profil "prod"
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        System.out.println("Version de production");
        return 100.0;
    }
}

 */