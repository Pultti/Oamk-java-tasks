public class Song {
    private String name;
    private int lengthInSeconds;

    public Song(String name, int lengthInSeconds) {
        this.name = name;
        this.lengthInSeconds = lengthInSeconds;

    }
        public String name() {
            return this.name;
        }
        public int length() {
            return this.lengthInSeconds;
        }
}


