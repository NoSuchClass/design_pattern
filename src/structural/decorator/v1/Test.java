package structural.decorator.v1;

/**
 * 如果直接按照类继承的方式进行对内容的拓展，那么将会被迫创建多个类，而且一旦有新的需求，比如要加两个鸡蛋，
 * 这个程序便不能够进行响应了
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " 销售价格:" + battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + " 销售价格:" + battercakeWithEgg.cost());


        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + " 销售价格:" + battercakeWithEggSausage.cost());


    }
}
