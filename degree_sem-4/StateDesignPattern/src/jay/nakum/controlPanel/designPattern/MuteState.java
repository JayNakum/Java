package jay.nakum.controlPanel.designPattern;

import jay.nakum.controlPanel.RunScript;
import jay.nakum.controlPanel.StateEnum;

public class MuteState implements State {

    @Override
    public void performTask() {
        System.out.println("Mute");
        new RunScript(StateEnum.Mute);
    }
    
}
