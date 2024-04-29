import java.util.*;
public class RectangleArea {
    int len,br;
    void setDim(int l, int b){
        len=l;
        br=b;
    }
    void getArea(){
        int area=len*br;
        System.out.println("Area of the rectangle is " + area);
    }
    public static void main(String args[]){
        RectangleArea obj = new RectangleArea();
        obj.setDim(5,3);
        obj.getArea();
    }
    
}
