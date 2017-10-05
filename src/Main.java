class Iccard {
 long id;
 int money;

 void showInfo() {
     System.out.print("卡片卡號"+ id);
     System.out.println(", 餘額 " + money + "  元  ");
 }

 void add(int money) {
     money += money;
     System.out.println("加值成功, 本次加值 " + money + "  元 ");
    }
 }

 public class Mycard {
    public static void main(String[] argv){
        Iccard myCard = new Iccard();

        myCard.id = 0x336789AB;
        myCard.money = 300;

        myCard.add(1000);
        myCard.showInfo();
    }
 }