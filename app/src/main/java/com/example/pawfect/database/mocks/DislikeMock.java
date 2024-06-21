package com.example.pawfect.database.mocks;

import com.example.pawfect.entities.Dislike;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class DislikeMock {

    private DislikeMock() {}

    public static List<Dislike> getDislikes() {
        List<Dislike> dislikeList= new ArrayList<>();

        Dislike dislike1 = new Dislike(4001, 2002, 2001, new Date());
        Dislike dislike2 = new Dislike(4002, 2004, 2003, new Date());
        Dislike dislike3 = new Dislike(4003, 2006, 2005, new Date());
        Dislike dislike4 = new Dislike(4004, 2008, 2007, new Date());
        Dislike dislike5 = new Dislike(4005, 2001, 2009, new Date());

        dislikeList.add(dislike1);
        dislikeList.add(dislike2);
        dislikeList.add(dislike3);
        dislikeList.add(dislike4);
        dislikeList.add(dislike5);

        return dislikeList;
    }
}
