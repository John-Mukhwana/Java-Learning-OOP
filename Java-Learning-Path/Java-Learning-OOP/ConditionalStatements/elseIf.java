package ConditionalStatements;

public class elseIf {
    public static void main(String[] args){
        int age = 19;
        if(age > 18){
            System.out.println("You are an adult");
        }
        else if(age < 18){
            System.out.println("You are not an adult");
        }
        else{
            System.out.println("You are 18 years old");
        }
    }
    
}
