import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class ui {
   protected LinkedList if = new LinkedList();
   protected wc a;

   protected ui() {
   }

   public wc do() {
      return this.a;
   }

   public LinkedList for() {
      return this.if;
   }

   public void a(y6 var1, Random var2, wc var3) {
      Iterator var4 = this.if.iterator();

      while(var4.hasNext()) {
         uk var5 = (uk)var4.next();
         if (var5.do().if(var3) && !var5.a(var1, var2, var3)) {
            var4.remove();
         }
      }

   }

   protected void a() {
      this.a = wc.try();
      Iterator var1 = this.if.iterator();

      while(var1.hasNext()) {
         uk var2 = (uk)var1.next();
         this.a.a(var2.do());
      }

   }

   protected void a(y6 var1, Random var2, int var3) {
      int var4 = 63 - var3;
      int var5 = this.a.do() + 1;
      if (var5 < var4) {
         var5 += var2.nextInt(var4 - var5);
      }

      int var6 = var5 - this.a.for;
      this.a.a(0, var6, 0);
      Iterator var7 = this.if.iterator();

      while(var7.hasNext()) {
         uk var8 = (uk)var7.next();
         var8.do().a(0, var6, 0);
      }

   }

   protected void a(y6 var1, Random var2, int var3, int var4) {
      int var5 = var4 - var3 + 1 - this.a.do();
      boolean var6 = true;
      int var10;
      if (var5 > 1) {
         var10 = var3 + var2.nextInt(var5);
      } else {
         var10 = var3;
      }

      int var7 = var10 - this.a.a;
      this.a.a(0, var7, 0);
      Iterator var8 = this.if.iterator();

      while(var8.hasNext()) {
         uk var9 = (uk)var8.next();
         var9.do().a(0, var7, 0);
      }

   }

   public boolean if() {
      return true;
   }
}
