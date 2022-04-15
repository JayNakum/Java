package jay.nakum.controlPanel.designPattern;

public class Context {
    private State volumeState;

    public Context() {
        volumeState = null;
    }

    public void setState(State newState) {
        volumeState = newState;
        volumeState.performTask();
    }
}
