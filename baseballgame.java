import java.util.Scanner;

public class baseballgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rn[] = new int[3]; //randomNumber 개
        int un[] = new int[3];

        for(int i=0; i<rn.length;i++) {
            rn[i]=(int)(Math.random()*10); //번호 생성

            for(int j=0;j<i;j++) {
                if(rn[j] == rn[i]) {
                    i--; //중복번호 제거
                    break;
                }
            }
        }
        for(int a=0;a<un.length;a++) {
            un[a] = scanner.nextInt();
        }

        if(rn[0] == un[0] && rn[1] == un[1] && rn[2] == un[2]) {
            System.out.println("값과 숫자 순서가 같음 => 스트라이크");
        } else if((rn[0] == un[1] || rn[0] == un[2]) && rn[1] == un[2]) {
            System.out.println("값은 같으나 순서는 다름 => 볼");
        } else {
            System.out.println("다시 해보세요.");
            System.out.println("첫 번째 숫자 : "+rn[0]);
            System.out.println("두 번째 숫자 : "+rn[1]);
            System.out.println("세 번째 숫자 : "+rn[2]);
        }

    }
}
