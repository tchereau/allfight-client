public class of extends n4 {
   public float s1;
   public float s0;
   public int s3;
   private int s2;

   public void long() {
      super.long();
      if (++this.s2 % 20 * 4 == 0) {
         this.try.do(this.new, this.int, this.for, pa.bn.void, 1, this.s3);
      }

      this.s0 = this.s1;
      float var1 = 0.1F;
      double var4;
      if (this.s3 > 0 && this.s1 == 0.0F) {
         double var2 = (double)this.new + 0.5D;
         var4 = (double)this.for + 0.5D;
         this.try.a(var2, (double)this.int + 0.5D, var4, "random.chestopen", 0.5F, this.try.o.nextFloat() * 0.1F + 0.9F);
      }

      if (this.s3 == 0 && this.s1 > 0.0F || this.s3 > 0 && this.s1 < 1.0F) {
         float var8 = this.s1;
         if (this.s3 > 0) {
            this.s1 += var1;
         } else {
            this.s1 -= var1;
         }

         if (this.s1 > 1.0F) {
            this.s1 = 1.0F;
         }

         float var3 = 0.5F;
         if (this.s1 < var3 && var8 >= var3) {
            var4 = (double)this.new + 0.5D;
            double var6 = (double)this.for + 0.5D;
            this.try.a(var4, (double)this.int + 0.5D, var6, "random.chestclosed", 0.5F, this.try.o.nextFloat() * 0.1F + 0.9F);
         }

         if (this.s1 < 0.0F) {
            this.s1 = 0.0F;
         }
      }

   }

   public boolean a(int var1, int var2) {
      if (var1 == 1) {
         this.s3 = var2;
         return true;
      } else {
         return super.a(var1, var2);
      }
   }

   public void c() {
      this.d();
      super.c();
   }

   public void gz() {
      ++this.s3;
      this.try.do(this.new, this.int, this.for, pa.bn.void, 1, this.s3);
   }

   public void gy() {
      --this.s3;
      this.try.do(this.new, this.int, this.for, pa.bn.void, 1, this.s3);
   }

   public boolean else(aek var1) {
      if (this.try.if(this.new, this.int, this.for) != this) {
         return false;
      } else {
         return !(var1.if((double)this.new + 0.5D, (double)this.int + 0.5D, (double)this.for + 0.5D) > 64.0D);
      }
   }
}
