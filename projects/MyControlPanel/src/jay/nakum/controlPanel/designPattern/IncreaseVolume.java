package jay.nakum.controlPanel.designPattern;

import jay.nakum.controlPanel.RunScript;
import jay.nakum.controlPanel.StateEnum;

public class IncreaseVolume implements State {

    @Override
    public void performTask() {
        System.out.println("Volume++");
        new RunScript(StateEnum.IncreaseVolume);
    }
    
}
