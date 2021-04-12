import javax.xml.crypto.Data;
import java.util.Date;

public class VarEx4 {
    public static void main(String[] args) {
//        //5.두 변수의 값 교환하기
//        int x =10,y=20;
//        int tmp; //빈컵
//
//        tmp =x;
//        x=y;
//        y=tmp;
//        System.out.println("x="+x);
//        System.out.println("y="+y);
        //2.값의 타입
        //값 -문자
        //기본형 - 논리형 문자형 정수형 실수형
        //          -실제의 값을 저장합니다
        //참조형 - 기본형을 제외한 나머지(String,System등)
        //          -메모리 주소를 저장(4바이트(표현가능값 40억 바이트 or 8바이트)
        //          -32bit JVM -4바이트 사용 -64bit JVM -8바이트 사용
        Date today; //  참조형 변수 today를 선언
        //Date -참조형
        today = new Date(); //today에 객체의 주소를 저장합니다.

        //기본형 (Primitive type) - 종류와 크기
        //논리형 -true 와 false중 하나의 값으로 갖으며, 조건식과 논리적 계산에 사용된다
        //문자형 - 문자를 저장하는 데 사용되며 ,변수 당 하나의 문자만을 저장할 수 있다. (char String)
        //char 하나의 문자 String 여러 문자
        //정수형 - byte int long
        //실수형 - 실수 값을 저장하는 데 사용된다. float , double

        //boolean 1바이트 char 2바이트
        //정수형 - 바이트 (1) / short(2) / int (4) / long (8)
        //실수형 - float (4) / double (8) --정밀도가 2배임

        //기본형 -표현범위(1/3)
        byte b;
        b=3; //숫자 3이 2진수로 저장됩니다.  0 0 0 0 0 0 1 1 이런식으로 저장됨 ㅇㅇ 타입마다 형식에 맞게 변환된다고 합니다.
        //n비트로 표현할 수 있는 값의 개수 : 2^n개
        //n비트로 표현할 수 있는 부호없는 정수의 범위 : 0 ~ 2^n-1
        //n비트로 표현 할 수 있는 부호있는 정수의 범위 : -2^(n-1) ~ 2^(n-1)

        //기본형 -표현범위 (2/3)
        //byte -2^7 ~ 2^7-1
        //부호비트 S + 7bit로 구성되빈다
        // 양수 0 7bit 음수 1 7bit
        // short -2^15 2^15-1   //S (부호비트 ) +15비트
        // char 0~ 2^16-1 ///16비트
        //ch 'A' >> ch 65로 저장됩니다.
        //int -2^31 ~ 2^31-1 (20억)
        //long -2^63 ~ 2^63 -1 (-800경 ~~ 800경..)
        //800경을 넘는 경우.. <Big Integer> 사용합니다.
        //
        //기본형
        //자료형       저장 가능한 값의 범위        정밀도     크기
        //float         1.4E-45 ~ 3.4E38             7자리    32비트 4바이트
        //double        4.9E-324 ~ 1.8E308            15자리  64비트 8바이트
        //S(부호) + E(8) (지수) + M(23) (가수)
        //실수형에서는 더블이 디폴트타입 입니다.











    }

}
