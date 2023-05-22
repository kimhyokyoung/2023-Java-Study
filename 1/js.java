import java.util.Scanner;

public class study_2023_0516_P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 10) + 1;
        for(int i=1; i<=5; i++) {
            System.out.print("1~10 사이의 숫자를 입력해주세요 ! ");
            String a = scanner.nextLine();
            int a1 = Integer.parseInt(a);

            if ( a1 == number) {
                System.out.println("정답입니다~ "+ i+"번 시도 했습니다 !!");
                break;
            } else if (a1 <= number){
                System.out.println("UP");
            } else if (a1 >= number) {
                System.out.println("DOWN");
            } else {
                System.out.println("다시 해보세요 ~");
            }
        }
        System.out.println("답은 "+number+"입니다요~");
    }
}
