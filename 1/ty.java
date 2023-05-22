public class study_2023_0516_H {
    public static void main(String[] args) {
        int [] ar = {10, 20, 30};
        int sum = 0;

        for (int i=0; i<ar.length; i++) {
            sum += ar[i];
            System.out.println(i + "번째 값 : " +ar[i]);
            System.out.println("현재까지 합 :"+sum);
        }

        int avg = sum / ar.length ;
        System.out.println("총 합 :" + sum);
        System.out.println("평균 : " + avg);

    }
}
