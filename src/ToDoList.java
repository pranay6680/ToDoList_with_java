import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ToDoList {

    public void disp(ArrayList<String> arr) {
        int i = 1;
        for (String values : arr) {
            System.out.println("List-" + i++ + ": " + values);

        }
    }
    public ArrayList<String> dele(ArrayList<String> arr, int delInput){
            arr.remove(delInput);
            return arr;
    }
    public ArrayList<String> update(ArrayList<String> arr, int updateInput){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to update");
        String latest = sc.nextLine();
        arr.set(updateInput, latest);
        return arr;
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        ToDoList todo = new ToDoList();
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println("Enter Size of an array");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter list to store");
        for(int i = 0; i<size; i++){
            arr.add(sc.nextLine());

        }
        System.out.println("Enter 1 to display list");
        if(sc.nextInt() != 0) {
            todo.disp(arr);
        }
        System.out.println("Enter 'del' to remove");
        String d = sc.next();
        if(d.equalsIgnoreCase("del")){
            System.out.println("Enter index to delete");
        int var = sc.nextInt();
            todo.dele(arr, var );
            System.out.println(arr);
        }
        System.out.println("Enter 'update' to modify");
        String up = sc.next();
        if(!up.equals("")){
            System.out.println("Enter sequence num to update");
            int inp = sc.nextInt();
            todo.update(arr, inp);
            System.out.println(arr);
        }
        sc.close();
    }
}
