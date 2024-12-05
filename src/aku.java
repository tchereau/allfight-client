import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class aku {
   private final net.minecraft.a.a a;
   private final List do = Collections.synchronizedList(new ArrayList());
   public volatile boolean if = false;

   public aku(net.minecraft.a.a var1) {
      this.a = var1;
      this.if = true;
   }

   public void a(akx var1) {
      this.do.add(var1);
   }

   public void do() {
      this.if = false;
   }

   public void a() {
      for(int var1 = 0; var1 < this.do.size(); ++var1) {
         akx var2 = (akx)this.do.get(var1);

         try {
            var2.do();
         } catch (Exception var5) {
            if (var2.e instanceof ap9) {
               aqh var4 = aqh.a((Throwable)var5, (String)"Ticking memory connection");
               throw new ape(var4);
            }

            this.a.a().if("Failed to handle packet for " + var2.c.aB() + "/" + var2.c.eH() + ": " + var5, var5);
            var2.if("Internal server error");
         }

         if (var2.d) {
            this.do.remove(var1--);
         }

         var2.e.for();
      }

   }

   public net.minecraft.a.a if() {
      return this.a;
   }
}
