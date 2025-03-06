import java.util.*; 
public class RandomNumber{ 
public static void main(String args[]) { 
Random rand = new Random(); 
int num = rand.nextInt(10); 
System.out.println("My random number is : "+num); } }