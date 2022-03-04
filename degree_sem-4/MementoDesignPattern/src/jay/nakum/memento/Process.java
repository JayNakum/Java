package jay.nakum.memento;

public class Process {
    private AppState state;

    public Process(AppState state) {
        this.state = state;
    }

    public AppState getState() {
        return this.state;
    }
}
