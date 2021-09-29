package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

    public Stream<Double> findDecimalFractionByNegativeSignFraction(){
        return new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream())
                .filter(Fraction::isNegative)
                .map(Fraction::decimal);
    }

    public Fraction findHighestFraction(){
        return new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream())
                .max(Fraction::compare)
                .orElse(new Fraction());
    }
}
