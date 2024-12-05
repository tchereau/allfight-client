import java.util.Iterator;

public class ak9 implements y1 {
   private net.minecraft.a.a if;
   private ak5 a;

   public ak9(net.minecraft.a.a var1, ak5 var2) {
      this.if = var1;
      this.a = var2;
   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   public void if(aiw var1) {
      this.a.D().if(var1);
   }

   public void a(aiw var1) {
      this.a.D().a(var1);
   }

   public void a(String var1, double var2, double var4, double var6, float var8, float var9) {
      this.if.g6().a(var2, var4, var6, var8 > 1.0F ? (double)(16.0F * var8) : 16.0D, this.a.n.if, new aoh(var1, var2, var4, var6, var8, var9));
   }

   public void a(aek var1, String var2, double var3, double var5, double var7, float var9, float var10) {
      this.if.g6().a(var1, var3, var5, var7, var9 > 1.0F ? (double)(16.0F * var9) : 16.0D, this.a.n.if, new aoh(var2, var3, var5, var7, var9, var10));
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public void a(int var1, int var2, int var3) {
      this.a.E().a(var1, var2, var3);
   }

   public void if(int var1, int var2, int var3) {
   }

   public void if(String var1, int var2, int var3, int var4) {
   }

   public void a(String var1, int var2, int var3, int var4) {
   }

   public void a(aek var1, int var2, int var3, int var4, int var5, int var6) {
      this.if.g6().a(var1, (double)var3, (double)var4, (double)var5, 64.0D, this.a.n.if, new aoj(var2, var3, var4, var5, var6, false));
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      this.if.g6().a((an7)(new aoj(var1, var2, var3, var4, var5, true)));
   }

   public void if(int var1, int var2, int var3, int var4, int var5) {
      Iterator var6 = this.if.g6().void.iterator();

      while(var6.hasNext()) {
         ak2 var7 = (ak2)var6.next();
         if (var7 != null && var7.ap == this.a && var7.av != var1) {
            double var8 = (double)var2 - var7.al;
            double var10 = (double)var3 - var7.ak;
            double var12 = (double)var4 - var7.aj;
            if (var8 * var8 + var10 * var10 + var12 * var12 < 1024.0D) {
               var7.pV.if((an7)(new and(var1, var2, var3, var4, var5)));
            }
         }
      }

   }
}
