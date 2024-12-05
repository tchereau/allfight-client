import java.util.Comparator;

public class dj implements Comparator {
   private double if;
   private double a;
   private double do;

   public dj(aiw var1) {
      this.if = -var1.al;
      this.a = -var1.ak;
      this.do = -var1.aj;
   }

   public int a(dm var1, dm var2) {
      double var3 = (double)var1.i + this.if;
      double var5 = (double)var1.h + this.a;
      double var7 = (double)var1.g + this.do;
      double var9 = (double)var2.i + this.if;
      double var11 = (double)var2.h + this.a;
      double var13 = (double)var2.g + this.do;
      return (int)((var3 * var3 + var5 * var5 + var7 * var7 - (var9 * var9 + var11 * var11 + var13 * var13)) * 1024.0D);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((dm)var1, (dm)var2);
   }
}
