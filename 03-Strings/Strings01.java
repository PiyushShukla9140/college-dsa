// string is a collection or sequence of characters
// string is immutable in nature which means it cannot be updated after creation
// stringbuilder is used to create string efficiently and it also helps modify it after creation by using .append() method


// how to calculate substring?
// use str.substring(startIndex,endIndex)
// if you want to find the index of particular characetr in string use str.indexOf("c",from index);
// if we want to check whehther the string contains the characters  or not in string use str.contains()

// if we want to check whether the given string matches the target string use str.equals(cannot use === because java uses refrence to compare string)
// can also use str.eqaulsIgnoreCase (this ignores the upper case and lower case issue)


// if we want to access a particular index in the string use str.charAt()

// difference between sc.next() and sc.nextLine()
import java.util.Scanner;
public class Strings01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // System.out.println(str);
        String str2 = sc.nextLine();

        
        System.out.println(str2);


        StringBuilder str = new StringBuilder();
        str.append("Apple");
        System.out.println(str);

        // to string method is used to convert string builder into string

    }

}