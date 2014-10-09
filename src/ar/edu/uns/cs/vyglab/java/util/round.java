package ar.edu.uns.cs.vyglab.java.util;

import java.math.BigDecimal;

public class round {
    
    public static double RoundRound(double _input)
    {
        BigDecimal bd = new BigDecimal(_input);
        BigDecimal bd_round = bd.setScale( 2, BigDecimal.ROUND_HALF_UP );
        return bd_round.doubleValue();
    }
}

