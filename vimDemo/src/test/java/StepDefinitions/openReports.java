package StepDefinitions;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class openReports {

    @Test
    public void runReport() {
        String homeDirectory = System.getProperty("user.dir");
        String directoryAllure = homeDirectory + "\\src\\test\\java\\StepDefinitions";
        String script = "allure.bat";
        runABat(directoryAllure, script);
        script = "extentReport.bat";
        runABat(directoryAllure, script);
    }

    public static void runABat(String directory, String script) {
        try {
            File dir = new File(directory);
            if (!dir.exists() || !dir.isDirectory()) {
                System.err.println("Error: Directory does not exist or is not a directory.");
                return;
            }
            String[] command = {"cmd", "/c", script};
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.directory(dir);
            Process process = processBuilder.start();
//            int exitCode = process.waitFor();
//            if (exitCode == 0) {
//                System.out.println("Allure command executed successfully.");
//            } else {
//                System.err.println("Error executing Allure command. Exit code: " + exitCode);
//            }
        } catch (IOException e) {
            System.err.println("Error executing Allure command: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
