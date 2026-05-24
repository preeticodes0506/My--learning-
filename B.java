class A extends Thread {
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1;i<5;i++){
            System.out.println(i);
        }
    }
    
}
class B{
    public static void main(String[]args){
        A t1=new A();
        A t2=new A();
        A t3=new A();
        t1.setName("lilu");
        t2.setName("preeti");
        t3.setName("jaguu");
        
        t1.start();
        t2.start();
        t3.start();

    }
}
