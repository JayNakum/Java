package jay.nakum.memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    private Map<AppState, Process> mementoMap = new HashMap<AppState, Process>();

    public void add(Process process) {
        mementoMap.put(process.getState(), process);
    }

    public Process get(AppState state) {
        return mementoMap.get(state);
    }
}
