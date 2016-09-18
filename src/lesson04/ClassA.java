package lesson04;

/**
 * Created by Admin on 18.09.2016.
 */
public class ClassA {
    private String str;
    private Integer num;

   /* public ClassA() {
        str = "Test";
        num = 1_000;
    }*/

    public ClassA(String str, Integer num) {
        this.str = str;
        this.num = num;
    }

    public String getStr() {
        return str;
    }
    public Integer getNum() {
        return num;
    }
}

class ClassB extends ClassA {

    public ClassB(String str, Integer num) {
        super(str, num);
    }

    public void print() {
        System.out.println(
                "Строка : " + getStr() + "\n" +
                        "Число  : " + getNum()
        );
    }
}

