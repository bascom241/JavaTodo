
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class Todo{
    public static void main(String [] args){
        System.out.println("Welcome to my todo Application");
        List<String> todolist = Arrays.asList("Add to todos: 1 ","Get Todos: 2 ","Delete Todos: 3","Update Todos: 4");
        Stream<String> todoStream = todolist.stream();

        todoStream.forEach(n->System.out.println(n));
        Scanner scan = new Scanner(System.in);

        String selectedTask;
        int selectedTaskIndex;
        System.out.println("Please enter the task number to select task");
        try {
            selectedTaskIndex = scan.nextInt() ;
            System.out.println("You selected " + todolist.get(selectedTaskIndex-1));


            // Execute a function based On task selected //
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        

        

        // Get What User Want to do By Prompting list of opertaions //
    }
}
