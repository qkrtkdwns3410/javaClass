import java.util.Date;

import static sun.misc.Version.println;

public class VarEx5_printf {
    public static void main(String[] args) {
    //1.형식화된 출력 -printf()
        //println()의 단점 -출력형식 지정불가
        //1.실수의 자리수 조절불가능 - 소수점 n자리만 출력하려면?
        //  sop(10.0/3); //3.3333...
        //2.10진수로만 출력된다 -8진수 , 16진수로 출력하려면??
        //sop(0x1A); // 26 (10진수)로 출력됩니다
        //printf()로 출력형식 지정가능
        System.out.printf("%.2f",10.0/3); //3.33
        System.out.printf("%d",0x1A); //26
        System.out.printf("%X",0x1A); //1A (16진수)
        System.out.println();
        //%b 불리언 형식으로 출력
        //%d 10진 %o 8진 %x,%X 16진 정수
        //%f 부동 소수점 %e,%E 지수 표현식의 형식으로 출력
        //%c 문자 %s 문자열로 출력
        //2.printf()의 지시자(2/3)
        //1)정수를 10진수 , 8진수 , 16진수로 출력
        System.out.printf("%d",15); //15 10진수 decimal
        System.out.printf("%o",15); //17 8진수 octal
        System.out.printf("%x",15); //f 16진수 hexa
        System.out.println();
        System.out.printf("%s\n",Integer.toBinaryString(15)); //1111 2진수
        //2)8진수와 16진수에 접두사 붙이기
        System.out.printf("%#o\n",15); //017
        System.out.printf("%#x\n",15); //0xf
        System.out.printf("%#X\n",15); //0XF 대문자출력
        //3)실수 출력을 위한 지시자 %f - 지수형식(%e), 간략한 형식(%g)
        float f= 123.4567890f;
        System.out.printf("%f\n",f); //123.456787 소수점 아래 6자리
        //왜 7이 출력되나?? 정밀도 때문입니다.
        //float의 경우 정밀도 7자리이기에 6자리까지만 정확하고 마지막 자리에는 의미없는 숫자가 들어가는 경우가 있음.
        //float보다 double을 사용하는게 좋습니다.
        //double의 정밀도는 15자리입니다
        System.out.printf("%e\n",f); //1.2345678e+02 지수형식
        System.out.printf("%g\n",f); //123.457 간략한 형식
        System.out.printf("%g\n",0.00000001); //1.00000e-08
    //2.printf()의 지시자(3/3)
        System.out.printf("[%5d]%n",10);
        System.out.printf("[%-5d]%n",10);
        System.out.printf("[%05d]%n",10);
        System.out.printf("d=%14.10f%n",1.23456789); //전체 14자리 중 소수점 아래 10자리
        String url ="www.naver.com";
        System.out.printf("[%s]%n",url);
        System.out.printf("[%20s]%n",url);
        System.out.printf("[%-20s]%n",url);
        System.out.printf("[%.8s]%n",url); //부분출력 전체 문자중 8글자만..













    }

}
