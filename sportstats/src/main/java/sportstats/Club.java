package sportstats;

import java.math.BigDecimal;

public class Club {

	private Association association;
	private BigDecimal rating;

	public Club( Association association ) {
		this.association = association;
	}

	public void setUEFARating( BigDecimal rating ) {
		this.rating = rating;
	}

}