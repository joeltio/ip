public class Event extends Task {
    private final String from;
    private final String to;
    public Event(String name, String from, String to) {
        super(name);
        this.from = from;
        this.to = to;
    }

    @Override
    char getTaskType() {
        return 'E';
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" (from: %s to: %s)", this.from, this.to);
    }
}
