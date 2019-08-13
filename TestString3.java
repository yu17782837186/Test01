package cn.com.qq;

public class TestString3 {
    public static void main(String[] args) {
        String s = "";
        String s2 = "How are you?";

        //是否是以其中的字符开头的
        System.out.println(s.startsWith(""));
        System.out.println(s.startsWith("How"));
        System.out.println(s2.startsWith("How"));

        //是否是以其中的字符结尾的
        System.out.println(s.endsWith(""));
        System.out.println(s2.endsWith("you"));
        System.out.println(s2.endsWith("?"));

        //提取子字符串，从下标为3 的开始到字符串结尾为止[]
        s = s2.substring(3);
        System.out.println(s);

        //提取字符串，下标从[2，9），不包括9
        s = s2.substring(2,9);
        System.out.println(s);

        //转小写
        s = s2.toLowerCase();
        System.out.println(s);

        //转大写
        s = s.toUpperCase();
        System.out.println(s);

        //去除字符串首尾的空格，中间的空格不能去
        String s3 = " How old are you? ";
        s = s3.trim();
        System.out.println(s);
        System.out.println(s3);
    }
}
