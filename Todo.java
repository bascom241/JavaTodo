
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Todo {
    public static void main(String[] args) {
        System.out.println("Welcome to my todo Application");
        List<String> todolist = Arrays.asList("Add to todos: 1 ", "Get Todos: 2 ", "Delete Todos: 3",
                "Update Todos: 4");
        Stream<String> todoStream = todolist.stream();

        List<String> todos = new ArrayList<>();

       todoStream.forEach(n -> System.out.println(n));
        Scanner scan = new Scanner(System.in);

        while (true) {

           
            int selectedTaskIndex;

            System.out.println("Please enter the task number to select task / type DONE to exit the app \nExisting the app would lead to lost of resourses as there are no real time database ");
            String input = scan.nextLine();
            

            if (input.equalsIgnoreCase("DONE")) {
                System.out.println("Exiting the app was a success");
                break;
            }

            try {
                selectedTaskIndex = Integer.parseInt(input);
                System.out.println("You selected " + todolist.get(selectedTaskIndex - 1));
                // scan.nextLine();

                String todo;
                // Execute a function based On task selected //
                switch (selectedTaskIndex) {
                    case 1 -> {
                        System.out.println("Enter your todo (or type 'done' to stop adding todos):");
                        todo = scan.nextLine();
                        if (todo.equalsIgnoreCase("done")) {
                            System.out.println("You have existed the application successfully");
                            break;
                        }
                        todos.add(todo);
                        System.out.println("Todo Added successfully" + todo);
                    }
                    case 2 -> {

                        if (todos.isEmpty())
                            System.out.println("Your todo List is Empty");
                        else {
                            System.out.println("Your current todos");
                            todos.forEach(td -> System.out.println("- " + td));
                        }

                    }
                    case 3 -> {

                        System.out.println("Enter todo to delete");
                        String todoToDelete = scan.nextLine();
                        if (todos.remove(todoToDelete)) {
                            System.out.println("Todo Removed " + todoToDelete);
                        } else {
                            System.out.println("Couldn't delete " + todoToDelete);
                        }
                    }

                    case 4 ->{
                        System.out.println("Enter to do to delete");
                        String oldTodo = scan.nextLine();
                        if(todos.contains(oldTodo)){
                            System.out.println("Enter a new todo");
                            String newTodo = scan.nextLine();
                            todos.set(todos.indexOf(oldTodo), newTodo);
                            System.out.println("todo Updated successfully");
                        } else{
                            System.out.println("Todo Not Found");
                        }
                    }

                    default -> System.out.println("Invalid Task number Please try again");

                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                scan.nextLine();
            }
           
        }
            scan.close();
        //

        // Get What User Want to do By Prompting list of opertaions //
    }
}
