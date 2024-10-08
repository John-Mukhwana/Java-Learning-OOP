package JavaArray;

// public class Main {
//     public static void main(String[] args) {
//       String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//       System.out.println(cars[0]);
//     }
//   }

//changing the first element of the array
// public class Main{
//   public static void main(String[] args){
//         String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//         cars[0] = "Opel";
//         System.out.println(cars[0]);
//   }
// }

//Array Length
// public class Main{
//   public static void main(String[] args){
//         String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Opel"};
//         System.out.println(cars.length);
//   }
// }



//Looping Through an Array
// public class Main {
//   public static void main(String[] args) {
//     String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//     for (int i = 0; i < cars.length; i++) {
//       System.out.println(cars[i]);
//     }
//   }
// }


//Looping Through an Array with For-Each
// public class Main {
//   public static void main(String[] args) {
//     String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//     for (String i : cars) {
//       System.out.println(i);
//     }    
//   }
// }

/*Real-Life Example
To demonstrate a practical example of using arrays, let's create a program that calculates the average of different ages:*/

// public class Main {
//   public static void main(String[] args) {
//     // An array storing different ages
//     int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

//     float avg, sum = 0;

//     // Get the length of the array
//     int length = ages.length;

//     // Loop through the elements of the array
//     for (int age : ages) {
//       sum += age;
//     }
    
//     // Calculate the average by dividing the sum by the length
//     avg = sum / length;

//     // Print the average
//     System.out.println("The average age is: " + avg);
//   }
// }


//Finding lowest age in an array
public class Main {
  public static void main(String[] args) {
    // An array storing different ages
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

    float avg, sum = 0;

    // Get the length of the array
    int length = ages.length;
    
    // Create a 'lowest age' variable and assign the first array element of ages to it
    int lowestAge = ages[0];

    // Loop through the elements of the ages array to find the lowest age
    for (int age : ages) {
      // Check if the current age is smaller than the current 'lowest age'
      if (lowestAge > age) {
        // If the smaller age is found, update 'lowest age' with that element
        lowestAge = age;
      }
    }

    // Output the value of the lowest age
    System.out.println("The lowest age in the array is: " + lowestAge);
  }
}
