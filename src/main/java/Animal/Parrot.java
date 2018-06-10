package Animal;

/**
 * This class models Parrot. Base on the requirements, different parrot may sound differently
 * based on the environment. It is not a good design to different subclasses for different parrot
 * because there are too many and not easy to maintain. Here use delegation to address this.
 */
public class Parrot extends Bird {

    private Singable singer = null;

    public Parrot(Singable singer) {
        if(singer == null)
            throw new IllegalArgumentException("singer cannot be null");

        this.singer = singer;
    }

    /**
     * The getter for singer
     * @return The object used to delegate sing function
     */
    public Singable getSinger() {
        return this.singer;
    }

    /**
     * The setter for singer
     * @param singer The object used to delegate sing function
     */
    public void setSinger(Singable singer) {
        if(singer == null)
            throw new IllegalArgumentException("singer cannot be null");

        this.singer = singer;
    }

    /**
     * this method override sing of Bird to implement different sing using delegation
     */
    @Override
    public void sing() {
        if(singer == null)
            throw new NullPointerException("singer cannot be null");

        singer.sing();
    }
}
