package com.example.pawfect.database.mocks;

import com.example.pawfect.entities.Match;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class MatchMock {

    private MatchMock() {}

    public static List<Match> getLikes() {
        List<Match> matchList= new ArrayList<>();

        Match match1 = new Match(5001, 2001, 2003, new Date());
        Match match2 = new Match(5001, 2005, 2007, new Date());
        Match match3 = new Match(5001, 2009, 2002, new Date());
        Match match4 = new Match(5001, 2004, 2006, new Date());
        Match match5 = new Match(5001, 2008, 20010, new Date());

        matchList.add(match1);
        matchList.add(match2);
        matchList.add(match3);
        matchList.add(match4);
        matchList.add(match5);

        return matchList;
    }
}
