package com.example.pawfect.database.mocks;

import com.example.pawfect.entities.Like;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class LikeMock {

    private LikeMock() {}

    public static List<Like> getLikes() {
        List<Like> likeList= new ArrayList<>();

        Like like1 = new Like(3001, 2001, 2002, new Date());
        Like like2 = new Like(3002, 2003, 2004, new Date());
        Like like3 = new Like(3003, 2005, 2006, new Date());
        Like like4 = new Like(3004, 2007, 2008, new Date());
        Like like5 = new Like(3005, 2009, 2001, new Date());

        likeList.add(like1);
        likeList.add(like2);
        likeList.add(like3);
        likeList.add(like4);
        likeList.add(like5);

        return likeList;
    }
}
