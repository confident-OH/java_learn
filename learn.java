public class learn {
    public static void main(String[] args){
        nums c = new nums();
        nums d = new nums("zeng yangqing");
        System.out.println("Hello confidentoh");
        System.out.println(c.a);
        System.out.println(d.a);
    }
}

class nums{
    int i;
    int num;
    String a;
    public nums(){
        i = 1;
        num = 100;
        a = "Hello!";
    }
    public nums(String names){
        i = 2;
        num = 100;
        a = "Hello "+names;
    }
}
