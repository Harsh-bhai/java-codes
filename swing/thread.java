public class thread extends Thread {
    public void run(){
        System.out.println("hellow");
        
    }
    public static void main(String[] args) {
        thread t1= new thread();

        try {
            t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(t1.getId());
            t1.wait(2000, i);
            
        }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
