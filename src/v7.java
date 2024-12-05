import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class v7 extends uk {
   private List L = new LinkedList();

   public v7(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.do = new wc(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
   }

   public void a(uk var1, List var2, Random var3) {
      int var4 = this.a();
      int var6 = this.do.do() - 3 - 1;
      if (var6 <= 0) {
         var6 = 1;
      }

      int var5;
      uk var7;
      wc var8;
      for(var5 = 0; var5 < this.do.int(); var5 += 4) {
         var5 += var3.nextInt(this.do.int());
         if (var5 + 3 > this.do.int()) {
            break;
         }

         var7 = wa.a(var1, var2, var3, this.do.if + var5, this.do.a + var3.nextInt(var6) + 1, this.do.new - 1, 2, var4);
         if (var7 != null) {
            var8 = var7.do();
            this.L.add(new wc(var8.if, var8.a, this.do.new, var8.int, var8.for, this.do.new + 1));
         }
      }

      for(var5 = 0; var5 < this.do.int(); var5 += 4) {
         var5 += var3.nextInt(this.do.int());
         if (var5 + 3 > this.do.int()) {
            break;
         }

         var7 = wa.a(var1, var2, var3, this.do.if + var5, this.do.a + var3.nextInt(var6) + 1, this.do.do + 1, 0, var4);
         if (var7 != null) {
            var8 = var7.do();
            this.L.add(new wc(var8.if, var8.a, this.do.do - 1, var8.int, var8.for, this.do.do));
         }
      }

      for(var5 = 0; var5 < this.do.a(); var5 += 4) {
         var5 += var3.nextInt(this.do.a());
         if (var5 + 3 > this.do.a()) {
            break;
         }

         var7 = wa.a(var1, var2, var3, this.do.if - 1, this.do.a + var3.nextInt(var6) + 1, this.do.new + var5, 1, var4);
         if (var7 != null) {
            var8 = var7.do();
            this.L.add(new wc(this.do.if, var8.a, var8.new, this.do.if + 1, var8.for, var8.do));
         }
      }

      for(var5 = 0; var5 < this.do.a(); var5 += 4) {
         var5 += var3.nextInt(this.do.a());
         if (var5 + 3 > this.do.a()) {
            break;
         }

         var7 = wa.a(var1, var2, var3, this.do.int + 1, this.do.a + var3.nextInt(var6) + 1, this.do.new + var5, 3, var4);
         if (var7 != null) {
            var8 = var7.do();
            this.L.add(new wc(this.do.int - 1, var8.a, var8.new, this.do.int, var8.for, var8.do));
         }
      }

   }

   public boolean a(y6 var1, Random var2, wc var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, this.do.if, this.do.a, this.do.new, this.do.int, this.do.a, this.do.do, pa.g.void, 0, true);
         this.a(var1, var3, this.do.if, this.do.a + 1, this.do.new, this.do.int, Math.min(this.do.a + 3, this.do.for), this.do.do, 0, 0, false);
         Iterator var4 = this.L.iterator();

         while(var4.hasNext()) {
            wc var5 = (wc)var4.next();
            this.a(var1, var3, var5.if, var5.for - 2, var5.new, var5.int, var5.for, var5.do, 0, 0, false);
         }

         this.a(var1, var3, this.do.if, this.do.a + 4, this.do.new, this.do.int, this.do.for, this.do.do, 0, false);
         return true;
      }
   }
}
