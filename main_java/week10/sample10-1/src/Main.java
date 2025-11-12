import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동","이재명","윤석열","경복대","오세훈"};;
        int[] java = new int[name.length];
       // int[] java;
      //  java = new int[10];
        int i = 0;
        while (true) {
            System.out.printf("%님의 JAVA 성적 입력");
        }

     //   int[] java = new int[10]; //java [0] ~ java[4]

        int[] java =  {95,70,80,75,100};;

        for (int i = 0; i < java.length; i++)
            System.out.printf("%d 학생 = %3d점\n",name[i],java[i]; , i + 1, java[i]);;

    }
}