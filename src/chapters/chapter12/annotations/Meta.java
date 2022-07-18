package chapters.chapter12.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;
//обьявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int val();
}

class Meta {
    //аннотировать метод
    @MyAnno(str = "Пример анотации ", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();
        //получить аннотацию из метода и вывести значения ее членов
        try {
            //сначала получить обьект типа Class, представляющий данный класс
            Class<?> c = ob.getClass();
            // затем получить обьект типа Method, представляющий данный метод
            Method m = c.getMethod("myMeth");
            //далее получить аннотацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);
            //и наконец вывести значения членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
