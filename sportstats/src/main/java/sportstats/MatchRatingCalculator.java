package sportstats;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MatchRatingCalculator {

	public BigDecimal calculate( Match match ) {
		BigDecimal homeClubRating = match.getHomeClub().getRating();
		BigDecimal guestClubRating = match.getGuestClub().getRating();
		return BigDecimal.valueOf( Math.sqrt(( homeClubRating.pow( 2 ).add( guestClubRating.pow( 2 )) ).doubleValue()/2 )).setScale( 3, RoundingMode.DOWN );
	}

}
