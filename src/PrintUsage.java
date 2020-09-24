import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintUsage {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        System.out.println("Command Line Todo application \n============================= \nCommand line arguments:\n     -l   Lists all the tasks\n     -a   Adds a new task\n     -c   Completes an task");
        if (args.length == 0) {
            System.out.println("-l    Lists all the tasks");
            System.out.println("-a    Adds a new task");
            System.out.println("-r    Removes an task");
            System.out.println("-c    Completes an task");
        }
        Tasks task = new Tasks();

        task.addTask("Walk the dog");
        task.addTask("Buy milk");
        task.addTask("Do homework");

        //    ArrayList<String> tasks = new ArrayList<>();
        //    tasks.add("Walk the dog");
        //    tasks.add("Buy milk");
        //    tasks.add("Do homework");

        //    FileWriter writer = new FileWriter("dataStorage/data.txt");
        //    for(String str: tasks) {
        //        writer.write(str + System.lineSeparator());
        //    }
        //    writer.close();

    }
}
