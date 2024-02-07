import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double m[]=new Double[5],sum=0.0,avg;
        String sub[]={"Maths","Science","Social","English","Hindi"};
        System.out.println("Enter the marks obtained in each subject out of 100:");
        for(int i=0;i<5;i++){
            System.out.print(sub[i]+": ");
            m[i]=sc.nextDouble();
            sum+=m[i];
        }
        sc.close();
        avg=sum/5;
        char grade;
        if(avg>90) grade='A';
        else if(avg>80) grade='B';
        else if(avg>70) grade='C';
        else if(avg>60) grade='D';
        else if(avg>35) grade='E';
        else grade='F';
        System.out.println("----------------------------\nTotal Marks: "+sum+"\nAverage Percentage: "+avg+"\nGrade: "+grade+"\n----------------------------");
    }
}
