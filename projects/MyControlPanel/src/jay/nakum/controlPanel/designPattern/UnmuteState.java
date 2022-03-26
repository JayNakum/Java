package jay.nakum.controlPanel.designPattern;

import jay.nakum.controlPanel.RunScript;
import jay.nakum.controlPanel.StateEnum;

public class UnmuteState implements State {

    @Override
    public void performTask() {
        System.out.println("Unmute");
        new RunScript(StateEnum.Mute);
    }
    
}
