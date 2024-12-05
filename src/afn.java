import java.util.List;

public class afn extends afo {
   private int dZ;
   public long d0 = 0L;
   private int d1;

   public afn(y6 var1, double var2, double var4, double var6) {
      super(var1);
      this.if(var2, var4, var6, 0.0F, 0.0F);
      this.dZ = 2;
      this.d0 = this.bm.nextLong();
      this.d1 = this.bm.nextInt(3) + 1;
      if (!var1.goto && var1.p >= 2 && var1.goto(ajs.a(var2), ajs.a(var4), ajs.a(var6), 10)) {
         int var8 = ajs.a(var2);
         int var9 = ajs.a(var4);
         int var10 = ajs.a(var6);
         if (var1.new(var8, var9, var10) == 0 && pa.bo.case(var1, var8, var9, var10)) {
            var1.int(var8, var9, var10, pa.bo.void);
         }

         for(var8 = 0; var8 < 4; ++var8) {
            var9 = ajs.a(var2) + this.bm.nextInt(3) - 1;
            var10 = ajs.a(var4) + this.bm.nextInt(3) - 1;
            int var11 = ajs.a(var6) + this.bm.nextInt(3) - 1;
            if (var1.new(var9, var10, var11) == 0 && pa.bo.case(var1, var9, var10, var11)) {
               var1.int(var9, var10, var11, pa.bo.void);
            }
         }
      }

   }

   public void aC() {
      super.aC();
      if (this.dZ == 2) {
         this.ap.a(this.al, this.ak, this.aj, "ambient.weather.thunder", 10000.0F, 0.8F + this.bm.nextFloat() * 0.2F);
         this.ap.a(this.al, this.ak, this.aj, "random.explode", 2.0F, 0.5F + this.bm.nextFloat() * 0.2F);
      }

      --this.dZ;
      if (this.dZ < 0) {
         if (this.d1 == 0) {
            this.az();
         } else if (this.dZ < -this.bm.nextInt(10)) {
            --this.d1;
            this.dZ = 1;
            this.d0 = this.bm.nextLong();
            if (!this.ap.goto && this.ap.goto(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj), 10)) {
               int var1 = ajs.a(this.al);
               int var2 = ajs.a(this.ak);
               int var3 = ajs.a(this.aj);
               if (this.ap.new(var1, var2, var3) == 0 && pa.bo.case(this.ap, var1, var2, var3)) {
                  this.ap.int(var1, var2, var3, pa.bo.void);
               }
            }
         }
      }

      if (this.dZ >= 0) {
         if (this.ap.goto) {
            this.ap.q = 2;
         } else {
            double var6 = 3.0D;
            List var7 = this.ap.a((aiw)this, (nw)nw.if().a(this.al - var6, this.ak - var6, this.aj - var6, this.al + var6, this.ak + 6.0D + var6, this.aj + var6));

            for(int var4 = 0; var4 < var7.size(); ++var4) {
               aiw var5 = (aiw)var7.get(var4);
               var5.a(this);
            }
         }
      }

   }

   protected void X() {
   }

   protected void try(aqv var1) {
   }

   protected void for(aqv var1) {
   }

   public boolean a(nr var1) {
      return this.dZ >= 0;
   }
}
