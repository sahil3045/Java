import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Engineering;
public class jarray{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter no of players:");
int n=sc.nextInt();
int i,j;
int[][] players= new int[n][];
for(i=0;i<n;i++){
System.out.print("\nEnter number of matches played by player "+(i+1)+":");
int k=sc.nextInt();
players[i]=new int[k];
for(j=0;j<k;j++){
System.out.print("\nEnter runs scored in match no "+(j+1)+":");
players[i][j]=sc.nextInt();
}
}
for(i=0;i<n;i++){
int sum=0;
System.out.print("\nRuns scored by player no "+(i+1)+":");
for(j=0;j<players[i].length;j++){
sum+=players[i][j];
System.out.print(players[i][j]+"\t");
}
float avg=(float)sum/(players[i].length);
System.out.print("\nAverage runs of player "+(i+1)+":"+avg);
}
sc.close();
}
}
