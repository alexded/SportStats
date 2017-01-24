package sportstats;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RatingCalculator {

	public static final int MATCH_RATING_SCALE = 3;

	public BigDecimal calculateMatchRating( Match match ) {
		BigDecimal homeClubRating = match.getHomeClub().getRating();
		BigDecimal guestClubRating = match.getGuestClub().getRating();
		return BigDecimal.valueOf( Math.sqrt(( homeClubRating.pow( 2 ).add( guestClubRating.pow( 2 )) ).doubleValue()/2 )).setScale( 3, RoundingMode.DOWN );
	}

	public BigDecimal calculateClubRating( Club club ) {
		return BigDecimal.valueOf( 
			Math.sqrt(
				( club.getUEFARating().pow( 2 ).add( club.getLeagueRating().pow( 2 )) ).doubleValue()
				/2 
			)
		).setScale( 3, RoundingMode.DOWN );
	}

}
