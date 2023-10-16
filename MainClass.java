class Demo3{
    int x=100;
   
    
    void test()
    {
        System.out.println("efre");
    }

    }




class MainClass{
    public static void main(String[] args){
        System.out.println("main method started");
        
        Demo3 d1 = new Demo3();
        Demo3 d2 = new Demo3();
        Demo3 d3 = new Demo3();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println("main method ended");

    }
}