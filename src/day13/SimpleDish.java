package day13;

//return은 한꺼번에 2개를 처리하지 못함
//class를 따로 하나 파서 둘을 묶어야함
//요리정보 중에 이름과 칼로리만 관리하는 객체
public class SimpleDish {
    private final String name;
    private final String calories;

    public SimpleDish(Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories()+"kcal";
    }

    public SimpleDish(String name, String calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                '}';
    }
}
