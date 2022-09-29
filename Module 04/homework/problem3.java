import java.util.Scanner;  
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive Integer: ");
    int num = sc.nextInt();
    int inside_root = num;
    int outside_root = 1;
    int d = 2;
    while(d*d<=inside_root){
      if(inside_root%(d*d)==0){
        inside_root = inside_root/(d*d);
        outside_root = outside_root * d;
      }
      else
        d+=1;
    }

    //print the result, different printing statemetns as per inside and outside root value
    if(outside_root!=1 && inside_root!=1)
      System.out.println("sqrt("+num+") is "+outside_root+"*sqrt("+inside_root+")");
    if(inside_root==1&&outside_root!=1)
      System.out.println("sqrt("+num+") is "+outside_root);
    if(inside_root!=1 && outside_root==1)
      System.out.println("sqrt("+num+") is " +"sqrt("+inside_root+")");
    if(inside_root==1 && outside_root==1)
      System.out.println("sqrt("+num+") is " +1);
  }
}