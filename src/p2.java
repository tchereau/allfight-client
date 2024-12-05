public class p2 extends rj {
   private boolean d6;
   private ajd d5;
   private ajd d7;

   protected p2(int var1, boolean var2) {
      super(var1, ts.long);
      this.a(true);
      this.d6 = var2;
      this.a(acn.d);
   }

   public ajd if(int var1, int var2) {
      if (var1 == 1) {
         return this.d5;
      } else if (var1 == 0) {
         return this.d5;
      } else if (var2 == 2 && var1 == 2) {
         return this.d7;
      } else if (var2 == 3 && var1 == 5) {
         return this.d7;
      } else if (var2 == 0 && var1 == 3) {
         return this.d7;
      } else {
         return var2 == 1 && var1 == 4 ? this.d7 : this.an;
      }
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
      if (var1.new(var2, var3 - 1, var4) == pa.b8.void && var1.new(var2, var3 - 2, var4) == pa.b8.void) {
         if (!var1.goto) {
            var1.int(var2, var3, var4, 0, 0, 2);
            var1.int(var2, var3 - 1, var4, 0, 0, 2);
            var1.int(var2, var3 - 2, var4, 0, 0, 2);
            af0 var9 = new af0(var1);
            var9.if((double)var2 + 0.5D, (double)var3 - 1.95D, (double)var4 + 0.5D, 0.0F, 0.0F);
            var1.new(var9);
            var1.byte(var2, var3, var4, 0);
            var1.byte(var2, var3 - 1, var4, 0);
            var1.byte(var2, var3 - 2, var4, 0);
         }

         for(int var10 = 0; var10 < 120; ++var10) {
            var1.a("snowshovel", (double)var2 + var1.o.nextDouble(), (double)(var3 - 2) + var1.o.nextDouble() * 2.5D, (double)var4 + var1.o.nextDouble(), 0.0D, 0.0D, 0.0D);
         }
      } else if (var1.new(var2, var3 - 1, var4) == pa.bH.void && var1.new(var2, var3 - 2, var4) == pa.bH.void) {
         boolean var5 = var1.new(var2 - 1, var3 - 1, var4) == pa.bH.void && var1.new(var2 + 1, var3 - 1, var4) == pa.bH.void;
         boolean var6 = var1.new(var2, var3 - 1, var4 - 1) == pa.bH.void && var1.new(var2, var3 - 1, var4 + 1) == pa.bH.void;
         if (var5 || var6) {
            var1.int(var2, var3, var4, 0, 0, 2);
            var1.int(var2, var3 - 1, var4, 0, 0, 2);
            var1.int(var2, var3 - 2, var4, 0, 0, 2);
            if (var5) {
               var1.int(var2 - 1, var3 - 1, var4, 0, 0, 2);
               var1.int(var2 + 1, var3 - 1, var4, 0, 0, 2);
            } else {
               var1.int(var2, var3 - 1, var4 - 1, 0, 0, 2);
               var1.int(var2, var3 - 1, var4 + 1, 0, 0, 2);
            }

            afy var7 = new afy(var1);
            var7.s(true);
            var7.if((double)var2 + 0.5D, (double)var3 - 1.95D, (double)var4 + 0.5D, 0.0F, 0.0F);
            var1.new(var7);

            for(int var8 = 0; var8 < 120; ++var8) {
               var1.a("snowballpoof", (double)var2 + var1.o.nextDouble(), (double)(var3 - 2) + var1.o.nextDouble() * 3.9D, (double)var4 + var1.o.nextDouble(), 0.0D, 0.0D, 0.0D);
            }

            var1.byte(var2, var3, var4, 0);
            var1.byte(var2, var3 - 1, var4, 0);
            var1.byte(var2, var3 - 2, var4, 0);
            if (var5) {
               var1.byte(var2 - 1, var3 - 1, var4, 0);
               var1.byte(var2 + 1, var3 - 1, var4, 0);
            } else {
               var1.byte(var2, var3 - 1, var4 - 1, 0);
               var1.byte(var2, var3 - 1, var4 + 1, 0);
            }
         }
      }

   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.new(var2, var3, var4);
      return (var5 == 0 || pa.x[var5].at.c()) && var1.case(var2, var3 - 1, var4);
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 2.5D) & 3;
      var1.do(var2, var3, var4, var7, 2);
   }

   public void a(ajc var1) {
      this.d7 = var1.a(this.d6 ? "pumpkin_jack" : "pumpkin_face");
      this.d5 = var1.a("pumpkin_top");
      this.an = var1.a("pumpkin_side");
   }
}
