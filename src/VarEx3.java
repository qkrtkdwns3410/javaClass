public class VarEx3 {
    public static void main(String[] args) {
//        final int score = 100;
//        boolean power = true;
//        byte b =127;
//        int oct =010; //8진수 10진수로 8
//        int hex =0x10; //16진수 , 10진수로 16
//        long l =30_0000_0000L; //10억 가능.. int타입의 최대 20억
//        float f =3.14f;
//        double d =3.14f; //f붙여도 문제 x 더블이 f보다 넓은 타입이기에 에러가 발생하지 않는다
//
//        //8.문자와 문자열
//        char ch ='A';
////        char ch ='AB'; //에러
//        String s = "ABC"; // 문자열 >> 연속된 여러문자
////        String s =""; //빈 문자열 가능
////        char ch = ""; //에러
//        String s1 = "A" + "B" ; // "AB"
//        String s2 =""+ 7; //숫자를 문자열로 변경 문자열결합은 왼쪽에서 오른쪽으로 이루어짐.. "" +7 >>문자열 7
//        //"7" + "7" >> "77"
//        //7+ 7+"" >> 14+"">>"14"+"" >> "14"

        char ch='A'; //문자 하나만 들어가야합니다
        int i ='A'; //65출력 ..문자코드가 출력됨
        String str =""; //빈 문자열(empty string)
        String str2 ="ABCD";
        String str3 = "123";
        String str4 = str2+ str3;
        System.out.println(""+7+7);
        System.out.println(7+7+"");


    }
}
