//Singleton
public class Heart {
    private static Heart heart;
   private Heart(){

   }

   public static Heart getInstance(){
       if(heart == null){
           heart = new Heart();
       }
       return heart;
   }

   public void beat(){
       System.out.println("Heart beating...");
   }
}
