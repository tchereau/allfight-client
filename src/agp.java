import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class agp extends agk {
   aig b8;
   Class b7;
   int cb;
   private final aip ca;
   private ago b9;

   public agp(aig var1, Class var2, float var3, int var4, boolean var5) {
      this(var1, var2, var3, var4, var5, false);
   }

   public agp(aig var1, Class var2, float var3, int var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, (aip)null);
   }

   public agp(aig var1, Class var2, float var3, int var4, boolean var5, boolean var6, aip var7) {
      super(var1, var3, var5, var6);
      this.b7 = var2;
      this.b0 = var3;
      this.cb = var4;
      this.b9 = new ago(this, var1);
      this.ca = var7;
      this.a(1);
   }

   public boolean do() {
      if (this.cb > 0 && this.b1.bq().nextInt(this.cb) != 0) {
         return false;
      } else {
         if (this.b7 == aek.class) {
            aek var1 = this.b1.ap.a(this.b1, (double)this.b0);
            if (this.a(var1, false)) {
               this.b8 = var1;
               return true;
            }
         } else {
            List var5 = this.b1.ap.a(this.b7, this.b1.aZ.do((double)this.b0, 4.0D, (double)this.b0), this.ca);
            Collections.sort(var5, this.b9);
            Iterator var2 = var5.iterator();

            while(var2.hasNext()) {
               aiw var3 = (aiw)var2.next();
               aig var4 = (aig)var3;
               if (this.a(var4, false)) {
                  this.b8 = var4;
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void a() {
      this.b1.do(this.b8);
      super.a();
   }
}
