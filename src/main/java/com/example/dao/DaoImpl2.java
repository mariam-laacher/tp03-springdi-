package com.example.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Profile;
@Primary
@Component("dao2")  // Déclare cette classe comme un bean Spring avec l'identifiant "dao2"
@Profile("dev")
public class DaoImpl2 implements IDao {
    @Override public double getValue(){ return 150.0; }
}


/*
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao2")
@Profile("dev")  // Ce bean sera actif uniquement avec le profil "dev"
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        System.out.println("Version de développement");
        return 150.0;
    }
}

 */