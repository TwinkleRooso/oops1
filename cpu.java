public class cpu{
  int price;
  class processor
  {
    int cores;
    String producer;
    processor(int noC,String manu)
    {
      cores=noC;
      producer=manu;
    }
     void display()
     {
      System.out.println("\nprocessor info");
      System.out.println("NO.of cores = "+cores);
      System.out.println("manufacturer = "+producer+"\n");
     }
     }
     static class ram{
        int mem;
        String manuf;
        ram(int memory,String producer )
        {
           mem=memory;
           manuf=producer;
        }
         void display() 
         {
          System.out.println("\nRAM info");
          System.out.println("Memory = "+mem+" GB");
          System.out.println("manufacturer = "+manuf+"\n");
         }
         }
         public static void main(String[] args)
         {
             cpu.ram obj1=new cpu.ram(8,"Intel");
             cpu obj2 = new cpu();
             cpu.processor obj3 = obj2.new processor(8,"samsung");
             obj1.display();
             obj3.display();
         }
 }
