package jay.nakum.controlPanel.designPattern;

import jay.nakum.controlPanel.RunScript;
import jay.nakum.controlPanel.StateEnum;

public class DecreaseVolume implements State {
    @Override
    public void performTask() {
        System.out.println("Volume--");
        new RunScript(StateEnum.DecreaseVolume);
    }
}
