import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sb implements Runnable {
   public static final sb if = new sb();
   private List a = Collections.synchronizedList(new ArrayList());
   private volatile long int = 0L;
   private volatile long for = 0L;
   private volatile boolean do = false;

   private sb() {
      Thread var1 = new Thread(this, "File IO Thread");
      var1.setPriority(1);
      var1.start();
   }

   public void run() {
      while(true) {
         this.a();
      }
   }

   private void a() {
      for(int var1 = 0; var1 < this.a.size(); ++var1) {
         sa var2 = (sa)this.a.get(var1);
         boolean var3 = var2.a();
         if (!var3) {
            this.a.remove(var1--);
            ++this.for;
         }

         try {
            Thread.sleep(this.do ? 0L : 10L);
         } catch (InterruptedException var6) {
            var6.printStackTrace();
         }
      }

      if (this.a.isEmpty()) {
         try {
            Thread.sleep(25L);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }
      }

   }

   public void a(sa var1) {
      if (!this.a.contains(var1)) {
         ++this.int;
         this.a.add(var1);
      }
   }

   public void if() {
      this.do = true;

      while(this.int != this.for) {
         Thread.sleep(10L);
      }

      this.do = false;
   }
}
