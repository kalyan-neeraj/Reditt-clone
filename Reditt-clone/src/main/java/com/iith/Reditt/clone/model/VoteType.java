package com.iith.Reditt.clone.model;

import com.iith.Reditt.clone.exception.SpringRedditException;

import java.util.Arrays;

public enum VoteType {

    UPVOTE(1), DOWNVOTE(-1);

    VoteType(int direction) {}

    private int direction;

    public static VoteType lookup(Integer direction) throws SpringRedditException {
        return Arrays.stream(VoteType.values())
                .filter(value -> value.getDirection().equals(direction))
                .findAny()
                .orElseThrow(() -> new SpringRedditException("Vote not found"));
    }

    public Integer getDirection() {
        return direction;
    }

}
