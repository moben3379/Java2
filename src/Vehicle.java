import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ArrayList 类的基本使用
 */
public class Vehicle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 创建 ArrayList 集合，用于存放车辆
        List vehAL = new ArrayList();
        Vehicle c1 = new Car("战神","长城");
        Vehicle c2 = new Car("跑得快","红旗");
        Vehicle t1 = new Truck("大力士","5吨");
        Vehicle t2 = new Truck("大力士二代","10吨");
        // 将 c1 添加到 vehAL 集合的末尾
        vehAL.add(c1);
        vehAL.add(c2);
        vehAL.add(t1);
        vehAL.add(t2);
        System.out.println("*** 显示全部车辆 ***");
        // 用于显示序号
        int num = 1;
        // 增强for循环遍历
        for(Object obj:vehAL){
            if(obj instanceof Car) {
                Car car = (Car)obj;
                System.out.println(num + " 该车是轿车，其车名为：" + car.getName());
            }else{
                Truck truck = (Truck)obj;
                System.out.println(num + " 该车是卡车，其车名为：" + truck.getName());
            }
            num++;
        }
        System.out.print("请输入要显示车名的车辆编号：");
        String name = ((Vehicle)vehAL.get(input.nextInt()-1)).getName();
        System.out.println("车辆名称为："+name);
    }
}
//轿车类
class Car extends Vehicle{
    //品牌
    private String brand = "红旗";

    //构造方法，指定车名和品牌
    public Car(String name, String brand) {
        super(name, 20);
        this.brand = brand;
    }
    //获取品牌
    public String getBrand() {
        return brand;
    }
}

//卡车类
class Truck extends Vehicle{
    // 吨位
    private String load = "10吨";

    //构造方法，指定车名和品牌
    public Truck(String name, String load) {
        super(name, 20);
        this.load = load;
    }
    //获取吨位
    public String getLoad() {
        return load;
    }
}