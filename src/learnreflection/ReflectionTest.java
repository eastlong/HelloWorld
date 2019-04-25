package learnreflection;

import java.lang.reflect.Field;

public class ReflectionTest {
    public static void main(String[] args){
        //1、通过对象调用 getClass() 方法来获取,通常应用在：比如你传过来一个 Object
        //  类型的对象，而我不知道你具体是什么类，用这种方法
        Person p1 = new Person();
        Class c1 = p1.getClass();
        //2、直接通过 类名.class 的方式得到,该方法最为安全可靠，程序性能更高
        //  这说明任何一个类都有一个隐含的静态成员变量 class
        Class c2 = Person.class;
        //3、通过 Class 对象的 forName() 静态方法来获取，用的最多，
        //   但可能抛出 ClassNotFoundException 异常
        try {
            Class c3 = Class.forName("learnreflection.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String className = c2.getName();
        System.out.println(className);

        //获得类的public类型的属性。
        Field[] myfields = c2.getFields();
//        for(Field field : fields){
//        System.out.println(field.getName());//age
//         }

    }

}
