package sportstats;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;


public class RatingCalculatorTest {
	
	@Test public void match_nullRating() {
		
		BigDecimal club01UEFARating = BigDecimal.valueOf( 0d );
		BigDecimal club02UEFARating = BigDecimal.valueOf( 0d );
		BigDecimal club01LeagueRating = BigDecimal.valueOf( 0d );
		BigDecimal club02LeagueRating = BigDecimal.valueOf( 0d );
		
		Club club01 = new Club( club01UEFARating, club01LeagueRating );
		Club club02 = new Club( club02UEFARating, club02LeagueRating );
		
		Match match = new Match( club01, club02 );
		
		RatingCalculator matchRatingCalculator = new RatingCalculator();
		BigDecimal rating = matchRatingCalculator.calculateMatchRating( match );
		
		Assert.assertEquals( BigDecimal.valueOf( 0L ).setScale( RatingCalculator.MATCH_RATING_SCALE ), rating );
		
	}
	
	@Test public void club_nullRating() {
		
		BigDecimal clubUEFARating = BigDecimal.valueOf( 0d );
		BigDecimal clubLeagueRating = BigDecimal.valueOf( 0d );
		
		Club club = new Club( clubUEFARating, clubLeagueRating );
		
		RatingCalculator matchRatingCalculator = new RatingCalculator();
		BigDecimal rating = matchRatingCalculator.calculateClubRating( club );
		
		Assert.assertEquals( BigDecimal.valueOf( 0L ).setScale( RatingCalculator.MATCH_RATING_SCALE ), rating );
		
	}
	
	

}
