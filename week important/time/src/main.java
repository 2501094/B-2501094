import java.util.Scanner;  // 사용자 입력을 받기 위해 Scanner 클래스를 불러옴

public class main {
    public static void main(String[] args) {

        // π 값 정의
        final double PI = 3.141592;

        // Scanner 객체 생성 (키보드로부터 입력 받기)
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 구의 반지름 입력 받기
        System.out.print("구의 반지름을 입력하세요: ");
        int r = scanner.nextInt(); // 정수형으로 입력받음

        // 구의 부피 계산: (4.0 / 3.0) * π * r^3
        double volume = (4.0 / 3.0) * PI * Math.pow(r, 3);

        // 구의 표면적 계산: 4 * π * r^2
        double surfaceArea = 4 * PI * Math.pow(r, 2);

        // 결과 출력
        System.out.printf("구의 부피: %.3f%n", volume);
        System.out.printf("구의 표면적: %.3f%n", surfaceArea);

        // Scanner 닫기
        scanner.close();
    }
}

