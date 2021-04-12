import java.util.*;


public class VarEx6_Scanner {
    public static void main(String[] args) {
        //3.화면에서 입력받기 -scanner
        //스캐너란 -화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
        //스캐너를 사용하려면 ..
        //1)import 문 추가
        //2)Scanner 객체의 생성
        Scanner scanner =new Scanner(System.in);
        //System.in : 화면입력..
        //3)Scanner객체를 사용
//        int num =scanner.nextInt(); //화면에서 입력받은 정수를 num에 저장
//        int num2 =scanner.nextInt(); //화면에서 입력받 은 정수를 num에 저장
//        System.out.println(num);
//        System.out.println(num2);
        //위의 경우는 더 자주사용해야할듯 더 간단함.scanner.netxtInt() **
        String input =scanner.nextLine();
        int num =Integer.parseInt(input);

        System.out.println(num);
    }
}
