class Demo4{
    int x=10;
    int y=20;
    

    void test()
    {
        System.out.println("efre");
    }
}
class mainclass4{
    public static void main(String[] args){
        System.out.println("main method started");
        Demo4 d1 = new Demo4();
        Demo4 d2 = new Demo4();
        d1.x = 100;
        d2.y = 200;
        
        System.out.println(d1.x);
        System.out.println(d2.y);
        
        }

}
