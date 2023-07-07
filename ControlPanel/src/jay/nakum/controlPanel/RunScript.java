package jay.nakum.controlPanel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunScript {
    ProcessBuilder processBuilder;

    private void execute() {
        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success");
                System.out.println(output);
                // System.exit(0);
            } else {
                System.out.println("Failed");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public RunScript(StateEnum stt) {
        processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", "echo 'Jay Nakum'");
        if (stt == StateEnum.Mute) {
            // -- Linux --

            // Run a shell command
            processBuilder.command("bash", "-c", "qdbus org.kde.kglobalaccel /component/kmix invokeShortcut 'mute'");

            // Run a shell script
            // processBuilder.command("path/to/hello.sh");

            // -- Windows --

            // Run a command
            // processBuilder.command("cmd.exe", "/c", "dir C:\\Users\\mkyong");

            // Run a bat file
            // processBuilder.command("C:\\Users\\mkyong\\hello.bat");
        }
        if(stt == StateEnum.IncreaseVolume) {
            processBuilder.command("bash", "-c", "qdbus org.kde.kglobalaccel /component/kmix invokeShortcut 'increase_volume'");
        }
        if(stt == StateEnum.DecreaseVolume) {
            processBuilder.command("bash", "-c", "qdbus org.kde.kglobalaccel /component/kmix invokeShortcut 'decrease_volume'");
        }

        this.execute();
    }
}
