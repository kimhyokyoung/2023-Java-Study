import java.util.Scanner;

public class baseballgame {
    Scanner scanner = new Scanner(System.in);
    static int rn[] = new int[3];
    static int un[] = new int[3];
    static int strike;
    static int ball;


    public void randomNumber() { //랜덤숫자 생성 ->중복될 경우 다시 자동 생성됨
        for (int i = 0; i < rn.length; i++) {
            rn[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (rn[j] == rn[i]) {
                    i--;
                    break;
                }
            }
        }
    }

    public void overlapNumberCheck() { //중복번호 입력 확인 및 스트라이크 또는 볼 계산
        System.out.println("0~9 숫자를 하나씩 입력해 주세요.");
        for (int a = 0; a < un.length; a++) {
            un[a] = scanner.nextInt();
            for (int b = 0; b < a; b++) {
                if (un[a] == un[b]) {
                    System.out.println("중복된 값이 있습니다 ! 다시 입력해 주세요");
                    a--;
                    break;
                }
            }
        }
        calculation();

        }



    public void calculation() { //스트라이크 or 볼 계산
        for (int q = 0; q < 3; q++) {
            if (rn[q] == un[q]) {
                strike++;
            }
            for (int r = 0; r < 3; r++) {
                if (rn[q] == un[r]) {
                    ball++;
                    if (rn[q] == un[q]) {
                        ball--;
                        break;
                    }

                }
            }
        }
    }




    public void life() {
        randomNumber();
        for(int li = 1;li<=10;li++) {
            overlapNumberCheck();
            if(strike == 3) {
                System.out.println("3스트라이크입니다.");
                System.out.println(li+"번만에 맞췄습니다 !");
                System.out.println("첫 번째 숫자 :"+rn[0]);
                System.out.println("두 번째 숫자 :"+rn[1]);
                System.out.println("세 번째 숫자 :"+rn[2]);
                break;
            }else {
                System.out.println("스트라이크 : "+strike+" 개, 볼 : "+ball+" 개");
                System.out.println("0~9 사이의 숫자를 다시 입력해주세요.");
                System.out.println("현재 "+li+" 회 시도했습니다."+(10-li)+"번 남았습니다." );
                strike=0;
                ball=0;
                if(li == 10) {
                    System.out.println("↓ 정답 ↓");
                    System.out.println("첫 번째 숫자 :"+rn[0]);
                    System.out.println("두 번째 숫자 :"+rn[1]);
                    System.out.println("세 번째 숫자 :"+rn[2]);
                    break;
                }
            }
        }

    }




        public static void main(String[] args ){
            baseballgame bg = new baseballgame();
            bg.life();
        }
            }









