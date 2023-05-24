import java.util.Scanner;

public class parkQuiz {
    public static void main(String[] args){
        System.out.print("사과는 어디에 있을까요?");
        Scanner sc = new Scanner(System.in);
        int randomFolder1 = (int)((Math.random()*3));
        int randomFolder2 = (int)((Math.random()*3));
        int[][] array = new int[3][3];
        array[randomFolder1][randomFolder2] = 4;
        boolean start = true;
        int life = 5;

        while(start) {
            System.out.print("첫 번째 상자를 선택하세요. 0~2 : ");
            int firstInput = sc.nextInt();
            System.out.print("두 번째 상자를 선택하세요. 0~2 : ");
            int secondInput = sc.nextInt();
            int [][] answer = new int [3][3];
            answer[firstInput][secondInput] = 4;

            if (array[randomFolder1][randomFolder2] == answer[firstInput][secondInput]) {
                System.out.println("정답입니다! 사과는 여기 있었습니다.");
                System.out.println("첫 번째 상자 : "+randomFolder1+ "  두 번째 상자 : "+randomFolder2);
                start=false;
            } else {
                System.out.println("땡! 사과는 여기 없습니다.");
                life--;

            }
            if(life == 0) {
                System.out.println("기회가 모두 소진되었습니다. 사과는 " + randomFolder1 + ", " + randomFolder2 + "에 있었습니다.");
            }


        }



    }
}
