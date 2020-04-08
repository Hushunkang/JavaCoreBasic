package javacore.basic.knowledge;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年02月20日 23时06分22秒
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("day06_Eclipse的使用与数组");
    }

}

class A{

    public int age = 10;

    public int getAge(){
        return age;
    }

}

class B extends A{

    public int age = 5;

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        A o1 = new A();
        A o2 = new B();
        B o3 = new B();
        System.out.println(o1.age);//10
        System.out.println(o2.age);//属性没有重写这么一说，编译运行都看左边，因此结果10
        System.out.println(o3.age);//5
    }

}
