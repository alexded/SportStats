package sportstats;

import java.math.BigDecimal;

import org.junit.Test;


public class MatchRatingCalculatorTest {

	@Test private void test201608221456() {
		
		BigDecimal associationRating = BigDecimal.valueOf( 100d );
		BigDecimal club01Rating = BigDecimal.valueOf( 50d );
		BigDecimal club02Rating = BigDecimal.valueOf( 50d );
		
		Association association = new Association();
		association.setRating( associationRating);
		Club club01 = new Club( association );
		club01.setRating( club01Rating);
		Club club02 = new Club( association );
		club02.setRating( club02Rating );
		MatchRatingCalculator matchRatingCalculator = new MatchRatingCalculator();
		BigDecimal rating = matchRatingCalculator.calculate( club01, club02 );
		
		
	}

}
