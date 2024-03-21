public class ArrayReverse {
 public static void getreverse(int number[]){
    int Start=0;
    int End=number.length-1;
    while(Start<End){
        //swap
        int temp= number[End];
        number[End]=number[Start];
        number[Start]=temp;
        Start++;
        End--;
    }
    
 }
    public static void main(String[] args) {
    int number[]={2,4,5,6,10};
    getreverse(number);
    //print reverse array
    for(int i=0;i<number.length;i++){
        System.out.print(number[i]+ " ");
    }
    System.out.println();
 }   
}
