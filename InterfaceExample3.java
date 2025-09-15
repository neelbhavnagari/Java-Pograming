interface Playable {
    void play();

    void pause();
}

interface AdvancePlay extends Playable {
    void stop();

    default void skip() {
        System.out.println("skip vidio");
    }
}

class Musicplayer implements AdvancePlay {
    public void play() {
        System.out.println("play music");
    }

    public void pause() {
        System.out.println("pause vidio");
    }

    public void stop() {
        System.out.println("stop vidio");
    }

}

class VideoPlayer implements AdvancePlay {
    public void play() {
        System.out.println("play vidio");
    }

    public void pause() {
        System.out.println("pause Vidio");
    }

    public void stop() {
        System.out.println("stop Vidio");
    }

}

public class InterfaceExample3 {
    public static void main(String[] args) {
        AdvancePlay p1 = new Musicplayer();
        AdvancePlay p2 = new VideoPlayer();

        p1.play();
        p1.pause();
        p1.stop();
        p2.play();
        p2.pause();
        p2.stop();

    }

}
