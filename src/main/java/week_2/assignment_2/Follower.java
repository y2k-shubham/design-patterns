package week_2.assignment_2;

public class Follower implements Observer {

    private String followerName;

    @Override
    public void update(String message) {
        System.out.println("Follower '" + followerName + "' received message '" + message + "'");
    }

    private void play() {
        System.out.println("Follower '" + followerName + "' playing");
    }
}
