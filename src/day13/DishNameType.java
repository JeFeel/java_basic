package day13;

import java.lang.reflect.Type;

//요리의 이름과 타입을 저장하는 객체
public class DishNameType {

    private final String name;
    private final Dish.Type type;

    public DishNameType(Dish dish){
        this.name = dish.getName();
        this.type = dish.getType();
    }

    @Override
    public String toString() {
        return "DishNameType{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

}
