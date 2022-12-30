import java.util.Scanner;

public class soort {
    public static void main(String[] args)
    {
        // storing input in variable
        int n = 4;
       
        // create string array called names
        Scanner scan= new Scanner(System.in);
        String name[]=new String[n];
        System.out.println("Enter the names");

        for (int i=0;i<n;i++){
           System.out.println("Name:");
           name[i]=scan.nextLine();
      
        }
      
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
                // to compare one string with other strings
                if (name[i].compareTo(name[j]) > 0) {
                    // swapping
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
       
        // print output array
        System.out.println(
            "The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i]);
        }
    }
}
