import java.util.ArrayList;
import java.util.Scanner;

public class ToDoMethods {
    public void disp(ArrayList<String> arr) {
        int i = 1;
        for (String values : arr) {
            System.out.println("List-" + i++ + ": " + values);

        }
    }
    public ArrayList<String> dele(ArrayList<String> arr, int delInput) {
        arr.remove(delInput);
        return arr;
    }
    public ArrayList<String> update(ArrayList<String> arr, int updateInput) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to update");
        String latest = sc.nextLine();
        arr.set(updateInput, latest);
        return arr;
    }
}
