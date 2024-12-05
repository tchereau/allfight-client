import java.util.Random;

public class og extends n4 {
   public int te;
   public float td;
   public float tc;
   public float tb;
   public float ta;
   public float s9;
   public float s8;
   public float s7;
   public float s6;
   public float s5;
   private static Random s4 = new Random();
   private String tf;

   public void do(aqv var1) {
      super.do(var1);
      if (this.gB()) {
         var1.a("CustomName", this.tf);
      }

   }

   public void a(aqv var1) {
      super.a(var1);
      if (var1.try("CustomName")) {
         this.tf = var1.new("CustomName");
      }

   }

   public void long() {
      super.long();
      this.s8 = this.s9;
      this.s6 = this.s7;
      aek var1 = this.try.a((double)((float)this.new + 0.5F), (double)((float)this.int + 0.5F), (double)((float)this.for + 0.5F), 3.0D);
      if (var1 != null) {
         double var2 = var1.al - (double)((float)this.new + 0.5F);
         double var4 = var1.aj - (double)((float)this.for + 0.5F);
         this.s5 = (float)Math.atan2(var4, var2);
         this.s9 += 0.1F;
         if (this.s9 < 0.5F || s4.nextInt(40) == 0) {
            float var6 = this.tb;

            do {
               this.tb += (float)(s4.nextInt(4) - s4.nextInt(4));
            } while(var6 == this.tb);
         }
      } else {
         this.s5 += 0.02F;
         this.s9 -= 0.1F;
      }

      while(this.s7 >= 3.1415927F) {
         this.s7 -= 6.2831855F;
      }

      while(this.s7 < -3.1415927F) {
         this.s7 += 6.2831855F;
      }

      while(this.s5 >= 3.1415927F) {
         this.s5 -= 6.2831855F;
      }

      while(this.s5 < -3.1415927F) {
         this.s5 += 6.2831855F;
      }

      float var7;
      for(var7 = this.s5 - this.s7; var7 >= 3.1415927F; var7 -= 6.2831855F) {
      }

      while(var7 < -3.1415927F) {
         var7 += 6.2831855F;
      }

      this.s7 += var7 * 0.4F;
      if (this.s9 < 0.0F) {
         this.s9 = 0.0F;
      }

      if (this.s9 > 1.0F) {
         this.s9 = 1.0F;
      }

      ++this.te;
      this.tc = this.td;
      float var3 = (this.tb - this.td) * 0.4F;
      float var8 = 0.2F;
      if (var3 < -var8) {
         var3 = -var8;
      }

      if (var3 > var8) {
         var3 = var8;
      }

      this.ta += (var3 - this.ta) * 0.9F;
      this.td += this.ta;
   }

   public String gA() {
      return this.gB() ? this.tf : "container.enchant";
   }

   public boolean gB() {
      return this.tf != null && this.tf.length() > 0;
   }

   public void C(String var1) {
      this.tf = var1;
   }
}
