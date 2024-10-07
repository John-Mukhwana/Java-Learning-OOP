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
public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }    
  }
}
