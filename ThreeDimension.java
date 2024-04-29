import java.util.*;

public class ThreeDimension {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[][][] = new int[2][3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print("Enter "+"arr["+i+"]["+j+"]["+k+"]");
                    arr[i][j][k]=scan.nextInt();
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


        scan.close();
    }
}
