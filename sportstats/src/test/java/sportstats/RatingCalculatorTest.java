package sportstats;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;


public class RatingCalculatorTest {
	
	private static final BigDecimal VALUE_1 = BigDecimal.valueOf( 1d );
	private static final BigDecimal VALUE_0 = BigDecimal.valueOf( 0d );

	@Test public void match_0_0() {
		
		BigDecimal club01UEFARating = VALUE_0;
		BigDecimal club02UEFARating = VALUE_0;
		BigDecimal club01LeagueRating = VALUE_0;
		BigDecimal club02LeagueRating = VALUE_0;
		
		Club club01 = new Club( club01UEFARating, club01LeagueRating );
		Club club02 = new Club( club02UEFARating, club02LeagueRating );
		
		Match match = new Match( club01, club02 );
		
		RatingCalculator matchRatingCalculator = new RatingCalculator();
		BigDecimal rating = matchRatingCalculator.calculateMatchRating( match );
		
		Assert.assertEquals( BigDecimal.valueOf( 0L ).setScale( RatingCalculator.MATCH_RATING_SCALE ), rating );
		
	}
	
	@Test public void club_0_0() {
		
		BigDecimal clubUEFARating = VALUE_0;
		BigDecimal clubLeagueRating = VALUE_0;
		double expected = 0.000d;
		
		doClubTest( clubUEFARating, clubLeagueRating, expected );
	}

	@Test public void club_0_1() {
		
		BigDecimal clubUEFARating = VALUE_1;
		BigDecimal clubLeagueRating = VALUE_0;
		double expected = 0.707d;
		
		doClubTest( clubUEFARating, clubLeagueRating, expected );
	}
	
	@Test public void club_1_1() {
		
		BigDecimal clubUEFARating = VALUE_1;
		BigDecimal clubLeagueRating = VALUE_1;
		double expected = 1.000d;
		
		doClubTest( clubUEFARating, clubLeagueRating, expected );
	}
	
	private void doClubTest( BigDecimal clubUEFARating, BigDecimal clubLeagueRating, double expected ) {
		Club club = new Club( clubUEFARating, clubLeagueRating );
		RatingCalculator matchRatingCalculator = new RatingCalculator();
		BigDecimal rating = matchRatingCalculator.calculateClubRating( club );
		
		Assert.assertEquals( BigDecimal.valueOf( expected ).setScale( RatingCalculator.MATCH_RATING_SCALE ), rating );
	}	

}
