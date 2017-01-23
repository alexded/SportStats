package sportstats;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;


public class MatchRatingCalculatorTest {
	
	@Test public void test201608221456() {
		
		BigDecimal club01UEFARating = BigDecimal.valueOf( 80d );
		BigDecimal club02UEFARating = BigDecimal.valueOf( 60d );
		BigDecimal club01LeagueRating = BigDecimal.valueOf( 90d );
		BigDecimal club02LeagueRating = BigDecimal.valueOf( 80d );
		
		Club club01 = new Club();
		Club club02 = new Club();
		Match match = new Match( club01, club02 );
		club01.setUEFARating( club01UEFARating);
		club02.setUEFARating( club02UEFARating );
		club01.setLeagueRating( club01LeagueRating );
		club02.setLeagueRating( club02LeagueRating );
		
		MatchRatingCalculator matchRatingCalculator = new MatchRatingCalculator();
		BigDecimal rating = matchRatingCalculator.calculate( match );
		
		Assert.assertEquals( BigDecimal.valueOf( 78.261 ), rating );
		
	}

}
