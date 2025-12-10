import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ToDoList {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ToDoMethods todo = new ToDoMethods();
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println("Enter Size of an array");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter list to store");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextLine());

        }
        System.out.println("Enter 1 to display list");
        if (sc.nextInt() != 0) {
            todo.disp(arr);
        }
        System.out.println("Enter 'del' or 'update' to remove or modify");
        String d = sc.next();
        if (d.equalsIgnoreCase("del")) {
            System.out.println("Enter index to delete");
            int var = sc.nextInt();
            sc.nextLine();
            todo.dele(arr, var);
            System.out.println(arr);
        }else if(d.equalsIgnoreCase("update") && !d.equals("")){
            System.out.println("Enter sequence num to update");
            int inp = sc.nextInt();
            todo.update(arr, inp);
            System.out.println(arr);
    }
        sc.close();
    }
}
