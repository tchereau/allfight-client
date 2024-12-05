import net.minecraft.client.Minecraft;

public class j8 {
   float char;
   private double int;
   public int case;
   public float byte;
   public float try = 1.0F;
   public float new = 0.0F;
   private long for;
   private long do;
   private long if;
   private double a = 1.0D;

   public j8(float var1) {
      this.char = var1;
      this.for = Minecraft.h1();
      this.do = System.nanoTime() / 1000000L;
   }

   public void a() {
      long var1 = Minecraft.h1();
      long var3 = var1 - this.for;
      long var5 = System.nanoTime() / 1000000L;
      double var7 = (double)var5 / 1000.0D;
      if (var3 <= 1000L && var3 >= 0L) {
         this.if += var3;
         if (this.if > 1000L) {
            long var9 = var5 - this.do;
            double var11 = (double)this.if / (double)var9;
            this.a += (var11 - this.a) * 0.20000000298023224D;
            this.do = var5;
            this.if = 0L;
         }

         if (this.if < 0L) {
            this.do = var5;
         }
      } else {
         this.int = var7;
      }

      this.for = var1;
      double var13 = (var7 - this.int) * this.a;
      this.int = var7;
      if (var13 < 0.0D) {
         var13 = 0.0D;
      }

      if (var13 > 1.0D) {
         var13 = 1.0D;
      }

      this.new = (float)((double)this.new + var13 * (double)this.try * (double)this.char);
      this.case = (int)this.new;
      this.new -= (float)this.case;
      if (this.case > 10) {
         this.case = 10;
      }

      this.byte = this.new;
   }
}
