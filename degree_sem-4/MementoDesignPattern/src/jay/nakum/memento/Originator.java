package jay.nakum.memento;

public class Originator {
    private AppState state;
    
    public void setState(AppState state) {
        this.state = state;
    }

    public AppState getState() {
        return this.state;
    }

    public Process saveStateToMemento() {
        return new Process(state);
    }

    public void getStateFromMemento(Process process) {
        this.state = process.getState();
    }
}
