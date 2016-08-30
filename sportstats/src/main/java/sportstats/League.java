package sportstats;

import java.util.ArrayList;
import java.util.List;

public class League {

	private Association association;
	private List<Match> matches;

	public League( Association association ) {
		this.association = association;
		this.matches = new ArrayList<Match>();
	}

	public void addMatch( Match match ) {
		this.matches.add( match );
	}

}
