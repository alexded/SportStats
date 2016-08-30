package sportstats;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Assert;
import org.junit.Test;


public class MatchRatingCalculatorTest {

	@Test public void test201608221456() {
		
		BigDecimal associationUEFARating = BigDecimal.valueOf( 63.819d );
		BigDecimal club01UEFARating = BigDecimal.valueOf( 103.621d );
		BigDecimal club02UEFARating = BigDecimal.valueOf( 87.621d );
		
		Association association = new Association();
		League league = new League( association );
		Club club01 = new Club( association );
		Club club02 = new Club( association );
		Match match = new Match( club01, club02 );
		league.addMatch( match );
		
		association.setUEFARating( associationUEFARating );
		club01.setUEFARating( club01UEFARating);
		club02.setUEFARating( club02UEFARating );
		
		BigDecimal club01LeagueRating = BigDecimal.valueOf( 55d );
		BigDecimal club02LeagueRating = BigDecimal.valueOf( 55d );
		double club01Rating = Math.sqrt( club01UEFARating.pow( 2 ).add( club01LeagueRating.pow( 2 )).doubleValue() / 2 );
		double club02Rating = Math.sqrt( club02UEFARating.pow( 2 ).add( club02LeagueRating.pow( 2 )).doubleValue() / 2 );
		BigDecimal expectedRating = BigDecimal.valueOf( Math.sqrt(( Math.pow( club01Rating, 2d ) + Math.pow( club02Rating, 2d ))/2 )).setScale( 3, RoundingMode.DOWN );
		
		MatchRatingCalculator matchRatingCalculator = new MatchRatingCalculator();
		BigDecimal rating = matchRatingCalculator.calculate( match );
		
		Assert.assertEquals( expectedRating, rating );
		
	}

}
