package sportstats;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Club {

	private BigDecimal leagueRating;
	private BigDecimal uefaRating;

	public void setUEFARating( BigDecimal rating ) { 	this.uefaRating = rating; }
	public void setLeagueRating( BigDecimal leagueRating ) { this.leagueRating = leagueRating; 	}
	public BigDecimal getLeagueRating() { return this.leagueRating; }
	public BigDecimal getUEFARating() { return this.uefaRating; }

	public BigDecimal getRating() {
		return BigDecimal.valueOf( Math.sqrt( uefaRating.pow( 2 ).add( leagueRating.pow( 2 )).doubleValue() / 2 )).setScale( 3, RoundingMode.DOWN );
	}

	

	

}
