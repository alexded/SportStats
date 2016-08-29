package sportstats;

import java.math.BigDecimal;

import org.junit.Test;


public class MatchRatingCalculatorTest {

	@Test private void test201608221456() {
		
		BigDecimal associationUEFARating = BigDecimal.valueOf( 63.819d );
		BigDecimal club01UEFARating = BigDecimal.valueOf( 103.621d );
		BigDecimal club02UEFARating = BigDecimal.valueOf( 87.621d );
		
		Association association = new Association();
		association.setUEFARating( associationUEFARating );
		Club club01 = new Club( association );
		club01.setUEFARating( club01UEFARating);
		Club club02 = new Club( association );
		club02.setUEFARating( club02UEFARating );
		MatchRatingCalculator matchRatingCalculator = new MatchRatingCalculator();
		BigDecimal rating = matchRatingCalculator.calculate( club01, club02 );
		
		
	}

}
