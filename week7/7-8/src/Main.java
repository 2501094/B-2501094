public class Main {
    public static void main(String[] args) {
        final double PI = 3.141592;
        final int RADIUS= 6378137;  //m
        final int KOREA = 99720; //㎢
        float temp;
        int surface;
        double result;

        temp = 4 * PI * RADIUS * RADIUS;
        surface =(long) (temp /1000);

        result = (KOREA / surface) * 100;

        System.out.printf("지구의 반지름 %,d m 입니다.\n", RADIUS);
        System.out.printf("지구의 표면적인 %,d \u33A1 입니다\n", surface);
        System.out.printf("대한민국의 넓이는 %,d \u33a2 입니다\n", KOREA);
        System.out.printf("대한민국은 지구의 %.8f %%입니다.\n", result);
    }
}