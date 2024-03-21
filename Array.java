import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int marks[]=new int[100];
        try (Scanner sc = new Scanner(System.in)) {
            marks[0]=sc.nextInt();
            marks[1]=sc.nextInt();
            marks[2]=sc.nextInt();
        }
        System.out.println("phys"+ marks[0]);
        System.out.println("chem"+marks[1]);
        System.out.println("maths"+marks[2]);

       // marks[2]=marks[2]+10;
       // System.out.println("maths:"+marks[2]);
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage of the student is" +percentage+"%");
        System.out.println("length of an arrya is"+ " "+ marks.length);
    }
}
