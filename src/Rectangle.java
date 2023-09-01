public class Rectangle {
    public static void main(String[] args) {
        int answer = findPerimeterOfRectangle(7,4);
        System.out.println(answer);
    }
    public static int findPerimeterOfRectangle(int length,int width){
          int result = 0;
          result = 2*(length + width);
          return result;
    }
}
