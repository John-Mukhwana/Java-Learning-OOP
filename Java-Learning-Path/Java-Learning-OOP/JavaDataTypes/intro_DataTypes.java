

// Data Types in Java
// Data types are the classification or categorization of data items. It represents the kind of value that tells what operations can be performed on a particular data. Since everything in Java is an object, data types are actually classes and variables are the instances of these classes.
// There are two types of data types in Java:
// 1. Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
// 2. Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

public class intro_DataTypes{
    public static void main(String args[]){
        int weight=10;
        String name="John";
        double salary=1200.50;
        float height=5;
        boolean maritalStatus=false;

        if (maritalStatus)
            {
                System.out.println("Name: "+name);
                System.out.println("Salary: "+salary);
                System.out.println("Height: "+height);
                System.out.println("MaritalStatus: Married");
                System.out.println("Weight: "+weight);
            }
            else
            {
                System.out.println("Name: "+name);
                System.out.println("Salary: "+salary);
                System.out.println("Height: "+height);
                System.out.println("MaritalStatus: Single");
                System.out.println("Weight: "+weight);
            }

    }
}