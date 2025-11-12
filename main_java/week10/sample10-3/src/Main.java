import java.util.Scanner;

import static java.time.LocalTime.MIN;
import static sun.nio.cs.Surrogate.MAX;


//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동","이재명","윤석열","경복대","오세훈"} ;
        float[] weight = new float[name.length] ;

        int i = 0;
        while (i < weight.length) {
            System.out.printf("%s님의 몸무게 입력 : ", name[i]);
            weight[i] = keyboard.nextFloat();

            if (weight[i]) >= MIN && weight[i] <= MAX)
                    i++;
             else {
                 System.err.printf("ERROR : %.1f ~ %.1f\n" , MIN,MAX) ;


            }
        }
    }
}