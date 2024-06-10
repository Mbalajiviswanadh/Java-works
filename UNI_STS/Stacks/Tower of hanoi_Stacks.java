package UNI_STS.Stacks;
// import java.util.*;
// class Tower_of_hanoi_Stacks {

//     public static void finding_ways(int n){
//         int total_numof_moves=(int) Math.pow(2, n)-1;

        
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter No od Disks: ");
//         int n =sc.nextInt();


//     }
// }

// class iterativetowerofhanoi{
   
//     class Stack
//     {
//         int capacity;
//         int top;
//         int array[];
//     }
   
//     Stack createStack(int capacity)
//     {
//         Stack stack = new Stack();
//         stack.capacity = capacity;
//         stack.top = -1;
//         stack.array = new int[capacity];
//         return stack;
//     }
   
//     boolean isFull(Stack stack)
//     {
//         return (stack.top == stack.capacity - 1);
//     }
   
//     boolean isEmpty(Stack stack)
//     {
//         return (stack.top == -1);
//     }
   
//     void push(Stack stack, int item)
//     {
//         if (isFull(stack))
//             return;
           
//         stack.array[++stack.top] = item;
//     }
   
//     int pop(Stack stack)
//     {
//         if (isEmpty(stack))
//             return Integer.MIN_VALUE;
           
//         int ret;
//         ret=stack.array[stack.top];
//         stack.array[stack.top--]=0;
//         return ret;
//     }
   
//     void moveDisksBetweenTwoPoles(Stack A, Stack B,char s, char d)
//     {
//         int pole1TopDisk = pop(A);
//         int pole2TopDisk = pop(B);
   
//         if (pole1TopDisk == Integer.MIN_VALUE)
//         {
//             push(A, pole2TopDisk);
//             moveDisk(d, s, pole2TopDisk);
//         }


//         else if (pole2TopDisk == Integer.MIN_VALUE)
//         {
//             push(B, pole1TopDisk);
//             moveDisk(s, d, pole1TopDisk);
//         }
       
//         else if (pole1TopDisk > pole2TopDisk)
//         {
//             push(A, pole1TopDisk);
//             push(A, pole2TopDisk);
//             moveDisk(d, s, pole2TopDisk);
//         }
//         else
//         {
//             push(B, pole2TopDisk);
//             push(B, pole1TopDisk);
//             moveDisk(s, d, pole1TopDisk);
//         }
//     }
   
//     void moveDisk(char fromPeg, char toPeg, int disk)
//     {
//         System.out.println("Move the disk " + disk +" from " + fromPeg +" to " + toPeg);
//     }
   
//     void tohIterative(int num_of_disks, Stack src, Stack aux, Stack dest)
//     {
//         int i, total_num_of_moves;
//         char s = 'S', d = 'D', a = 'A';
   
//         if (num_of_disks % 2 == 0)
//         {
//             char temp = d;
//             d = a;
//             a = temp;
//         }


//         total_num_of_moves = (int)(Math.pow(2, num_of_disks) - 1);
   
//         for(i = num_of_disks; i >= 1; i--)
//             push(src, i);
   
//         for(i = 1; i <= total_num_of_moves; i++)
//         {
//             if (i % 3 == 1)
//             moveDisksBetweenTwoPoles(src, dest, s, d);
   
//             else if (i % 3 == 2)
//             moveDisksBetweenTwoPoles(src, aux, s, a);
   
//             else if (i % 3 == 0)
//             moveDisksBetweenTwoPoles(aux, dest, a, d);
//         }
//     }
   
//     public static void main(String[] args)
//     {
       
//         int num_of_disks = 3;
//         iterativetowerofhanoi ob = new iterativetowerofhanoi();
//         Stack src, dest, aux;
       
//         src = ob.createStack(num_of_disks);
//         dest = ob.createStack(num_of_disks);
//         aux = ob.createStack(num_of_disks);
       
//         ob.tohIterative(num_of_disks, src, aux, dest);
//     }
// }


//iterative towers of hanoi

import java.util.Scanner;
import java.util.Stack;
class Main{
    static Stack<Integer> sr = new Stack<>();
    static Stack<Integer> ax = new Stack<>();
    static Stack<Integer> ds = new Stack<>();
    static void change(Stack<Integer> s1,Stack<Integer> s2,char a,char b){
        int v1,v2;
        if(s1.isEmpty()) v1=Integer.MIN_VALUE;
        else v1=s1.pop();
        if(s2.isEmpty()) v2=Integer.MIN_VALUE;
        else v2=s2.pop();
        if(v1==Integer.MIN_VALUE){
            s1.push(v2);
            System.out.println("The value "+v2+" is moved from "+b+" to "+a);
        }
        else if(v2==Integer.MIN_VALUE){
            s2.push(v1);
            System.out.println("The value "+v1+" is moved from "+a+" to "+b);
        }
        else if(v1<v2){
            s2.push(v2);
            s2.push(v1);
            System.out.println("The value "+v1+" is moved from "+a+" to "+b);
        }
        else{
            s1.push(v1);
            s1.push(v2);
            System.out.println("The value "+v2+" is moved from "+b+" to "+a);
        }
    }
    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();
        for(int i=n;i>0;i--) sr.push(i);
        char s='S',a='A',d='D';
        if(n%2==0){
            char temp=a;
            a=d;
            d=temp;
        }
        int moves = (int)(Math.pow(2,n)-1);
        for(int i=1;i<=moves;i++){
            if(i%3==1) change(sr,ds,s,d);
            if(i%3==2) change(sr,ax,s,a);
            if(i%3==0) change(ax,ds,a,d);
        }
    }
}
