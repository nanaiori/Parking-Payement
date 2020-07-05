package Tests;

import org.junit.jupiter.api.Test;

import utils.ArroundPrice;

class TestRound {

	@Test
	
	public void round_less_than_2() throws Exception {
        Double round = ArroundPrice.round(1.01);
        assert round == 1.5;
    }

    @Test
    
    public void round_less_more_than_2() throws Exception {
        Double round = ArroundPrice.round(1.51);
        assert round == 2;
    }
    
}


