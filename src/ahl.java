import java.util.Iterator;
import java.util.List;

public class ahl extends ahk {
   af9 aZ;
   af9 aY;
   float a1;
   private int a0;

   public ahl(af9 var1, float var2) {
      this.aZ = var1;
      this.a1 = var2;
   }

   public boolean do() {
      if (this.aZ.fr() >= 0) {
         return false;
      } else {
         List var1 = this.aZ.ap.a(this.aZ.getClass(), this.aZ.aZ.do(8.0D, 4.0D, 8.0D));
         af9 var2 = null;
         double var3 = Double.MAX_VALUE;
         Iterator var5 = var1.iterator();

         while(var5.hasNext()) {
            af9 var6 = (af9)var5.next();
            if (var6.fr() >= 0) {
               double var7 = this.aZ.for((aiw)var6);
               if (!(var7 > var3)) {
                  var3 = var7;
                  var2 = var6;
               }
            }
         }

         if (var2 == null) {
            return false;
         } else if (var3 < 9.0D) {
            return false;
         } else {
            this.aY = var2;
            return true;
         }
      }
   }

   public boolean try() {
      if (!this.aY.aA()) {
         return false;
      } else {
         double var1 = this.aZ.for((aiw)this.aY);
         return !(var1 < 9.0D) && !(var1 > 256.0D);
      }
   }

   public void a() {
      this.a0 = 0;
   }

   public void new() {
      this.aY = null;
   }

   public void int() {
      if (--this.a0 <= 0) {
         this.a0 = 10;
         this.aZ.bl().a((aig)this.aY, this.a1);
      }
   }
}
