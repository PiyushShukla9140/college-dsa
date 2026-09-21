public class MultipleInherit{
    public static void main(String[]args){
        Perry p = new Perry();
        p.plays();
    }
}


interface Cricket{
    void plays();
}
interface Football{
    void plays();
}

class Perry implements Cricket,Football{
    public void plays(){
        System.out.println("Australian Cricketer Ellyse Perry plays both football and cricket at the international level for australia.");
    }
}