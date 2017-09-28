/**
 * 
 */
package it.unibo.oop.lab06.exercise1;

import java.util.Collection;

/**
 * Test for {@link it.unibo.oop.lab06.exercise1.SocialNetworkUserImpl}.
 * 
 * 1) Complete the test as per comments below
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSocialNetworkUser {

    private TestSocialNetworkUser() {
    }

    /**
     * This is going to act as a test for
     * {@link it.unibo.oop.lab06.exercise1.SocialNetworkUserImpl}.
     * 
     * @param args
     *            ignored
     */
    public static void main(final String... args) {

        // TODO create 5 social network users (SocialNetworkUser)
        /*
         * 
         * Kevin Bacon,kbacon, 56
         * 
         * Denzel Washington, dwashington, 59
         * 
         * Malcom Gladwell, mgladwell, 51
         * 
         * Nicholas Taleb, ntaleb, 54
         */
        final SocialNetworkUser<User> kbacon = null;
        final SocialNetworkUser<User> dwashington = null;
        final SocialNetworkUser<User> mgladwell = null;
        final SocialNetworkUser<User> ntaleb = null;

        final User asmith = new UserImpl("Adam", "Smith", "asmith");

        mgladwell.addFollowedUser("acquaintances", ntaleb);
        dwashington.addFollowedUser("myths", asmith);
        dwashington.addFollowedUser("writers", ntaleb);
        dwashington.addFollowedUser("colleagues", kbacon);
        dwashington.addFollowedUser("writers", mgladwell);

        // THE FOLLOWING TESTS MUST ALL RETURN TRUE
        System.out.println("Smith has not set any age at all: " + (!asmith.isAgeDefined()));
        final Collection<User> kbaconFriends = kbacon.getFollowedUsersInGroup("Malcom");
        System.out.println("K Bacon must have no followed people called Malcom: " + kbaconFriends.isEmpty());

        final Collection<User> mgladFriends = mgladwell.getFollowedUsersInGroup("Close friends");
        System.out.println("M Gladwell has not set yet any group called \"Close friends\": " + mgladFriends.isEmpty());

        final Collection<User> dwashFriends = dwashington.getFollowedUsersInGroup("writers");
        System.out.println("Denzel has 2 followed people in group \"writers\": " + (dwashFriends.size() == 2));

        // Trying to add another friend to Denzel's "writers" group...
        dwashFriends.add(asmith);

        // The above operation *MUST* have no effect on Denzel's profile itself:
        // STILL TWO PEOPLE in denzel's group called writers
        System.out.println("Denzel has STILL 2 followed people in group \"writers\": "
                + (dwashington.getFollowedUsersInGroup("writers").size() == 2));
    }
}