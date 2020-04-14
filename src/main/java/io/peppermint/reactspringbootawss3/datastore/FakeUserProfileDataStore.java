package io.peppermint.reactspringbootawss3.datastore;

import io.peppermint.reactspringbootawss3.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILE = new ArrayList<>();

    static { // initiate class variables
        USER_PROFILE.add(new UserProfile(UUID.fromString("e76f067f-fa2c-4eaa-98ce-72b1b94e3fc1"), "janet", null));
        USER_PROFILE.add(new UserProfile(UUID.fromString("33c836b2-5bc6-4bd7-88b6-a3e2ab96eb40"), "anton", null));
    }

    public List<UserProfile> getUserProfile(){
        return USER_PROFILE;
    }
}
