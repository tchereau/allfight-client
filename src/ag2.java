import java.util.Iterator;
import java.util.List;

public class ag2 extends ahk {
   private aep H;
   private aig G;
   private float J;
   private int I;

   public ag2(aep var1, float var2) {
      this.H = var1;
      this.J = var2;
      this.a(1);
   }

   public boolean do() {
      if (this.H.fr() >= 0) {
         return false;
      } else if (this.H.bq().nextInt(400) != 0) {
         return false;
      } else {
         List var1 = this.H.ap.a(aep.class, this.H.aZ.do(6.0D, 3.0D, 6.0D));
         double var2 = Double.MAX_VALUE;
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            aep var5 = (aep)var4.next();
            if (var5 != this.H && !var5.fN() && var5.fr() < 0) {
               double var6 = var5.for((aiw)this.H);
               if (!(var6 > var2)) {
                  var2 = var6;
                  this.G = var5;
               }
            }
         }

         if (this.G == null) {
            nr var8 = agh.a(this.H, 16, 3);
            if (var8 == null) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean try() {
      return this.I > 0;
   }

   public void a() {
      if (this.G != null) {
         this.H.G(true);
      }

      this.I = 1000;
   }

   public void new() {
      this.H.G(false);
      this.G = null;
   }

   public void int() {
      --this.I;
      if (this.G != null) {
         if (this.H.for((aiw)this.G) > 4.0D) {
            this.H.bl().a(this.G, this.J);
         }
      } else if (this.H.bl().new()) {
         nr var1 = agh.a(this.H, 16, 3);
         if (var1 == null) {
            return;
         }

         this.H.bl().a(var1.int, var1.for, var1.do, this.J);
      }

   }
}
