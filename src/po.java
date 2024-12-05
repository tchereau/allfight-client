import java.util.Random;

public class po extends r8 {
   protected po(int var1) {
      super(var1, ts.j);
      this.a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
   }

   public int new() {
      return -1;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4) & 7;
      switch(var5) {
      case 1:
      default:
         this.a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
         break;
      case 2:
         this.a(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
         break;
      case 3:
         this.a(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
         break;
      case 4:
         this.a(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
         break;
      case 5:
         this.a(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
      }

   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      this.int((yy)var1, var2, var3, var4);
      return super.int(var1, var2, var3, var4);
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      int var7 = ajs.a((double)(var5.a5 * 4.0F / 360.0F) + 2.5D) & 3;
      var1.do(var2, var3, var4, var7, 2);
   }

   public n4 if(y6 var1) {
      return new n6();
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return abr.bv.A;
   }

   public int a(y6 var1, int var2, int var3, int var4) {
      n4 var5 = var1.if(var2, var3, var4);
      return var5 != null && var5 instanceof n6 ? ((n6)var5).l() : super.a(var1, var2, var3, var4);
   }

   public int for(int var1) {
      return var1;
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, float var6, int var7) {
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, aek var6) {
      if (var6.fY.new) {
         var5 |= 8;
         var1.do(var2, var3, var4, var5, 4);
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.goto) {
         if ((var6 & 8) == 0) {
            abp var7 = new abp(abr.bv.A, 1, this.a(var1, var2, var3, var4));
            n6 var8 = (n6)var1.if(var2, var3, var4);
            if (var8.l() == 3 && var8.j() != null && var8.j().length() > 0) {
               var7.do(new aqv());
               var7.b().a("SkullOwner", var8.j());
            }

            this.a(var1, var2, var3, var4, var7);
         }

         super.do(var1, var2, var3, var4, var5, var6);
      }
   }

   public int a(int var1, Random var2, int var3) {
      return abr.bv.A;
   }

   public void a(y6 var1, int var2, int var3, int var4, n6 var5) {
      if (var5.l() == 1 && var3 >= 2 && var1.p > 0 && !var1.goto) {
         int var6 = pa.aQ.void;

         int var7;
         afq var8;
         int var9;
         for(var7 = -2; var7 <= 0; ++var7) {
            if (var1.new(var2, var3 - 1, var4 + var7) == var6 && var1.new(var2, var3 - 1, var4 + var7 + 1) == var6 && var1.new(var2, var3 - 2, var4 + var7 + 1) == var6 && var1.new(var2, var3 - 1, var4 + var7 + 2) == var6 && this.j(var1, var2, var3, var4 + var7, 1) && this.j(var1, var2, var3, var4 + var7 + 1, 1) && this.j(var1, var2, var3, var4 + var7 + 2, 1)) {
               var1.do(var2, var3, var4 + var7, 8, 2);
               var1.do(var2, var3, var4 + var7 + 1, 8, 2);
               var1.do(var2, var3, var4 + var7 + 2, 8, 2);
               var1.int(var2, var3, var4 + var7, 0, 0, 2);
               var1.int(var2, var3, var4 + var7 + 1, 0, 0, 2);
               var1.int(var2, var3, var4 + var7 + 2, 0, 0, 2);
               var1.int(var2, var3 - 1, var4 + var7, 0, 0, 2);
               var1.int(var2, var3 - 1, var4 + var7 + 1, 0, 0, 2);
               var1.int(var2, var3 - 1, var4 + var7 + 2, 0, 0, 2);
               var1.int(var2, var3 - 2, var4 + var7 + 1, 0, 0, 2);
               if (!var1.goto) {
                  var8 = new afq(var1);
                  var8.if((double)var2 + 0.5D, (double)var3 - 1.45D, (double)(var4 + var7) + 1.5D, 90.0F, 0.0F);
                  var8.eH = 90.0F;
                  var8.fc();
                  var1.new(var8);
               }

               for(var9 = 0; var9 < 120; ++var9) {
                  var1.a("snowballpoof", (double)var2 + var1.o.nextDouble(), (double)(var3 - 2) + var1.o.nextDouble() * 3.9D, (double)(var4 + var7 + 1) + var1.o.nextDouble(), 0.0D, 0.0D, 0.0D);
               }

               var1.byte(var2, var3, var4 + var7, 0);
               var1.byte(var2, var3, var4 + var7 + 1, 0);
               var1.byte(var2, var3, var4 + var7 + 2, 0);
               var1.byte(var2, var3 - 1, var4 + var7, 0);
               var1.byte(var2, var3 - 1, var4 + var7 + 1, 0);
               var1.byte(var2, var3 - 1, var4 + var7 + 2, 0);
               var1.byte(var2, var3 - 2, var4 + var7 + 1, 0);
               return;
            }
         }

         for(var7 = -2; var7 <= 0; ++var7) {
            if (var1.new(var2 + var7, var3 - 1, var4) == var6 && var1.new(var2 + var7 + 1, var3 - 1, var4) == var6 && var1.new(var2 + var7 + 1, var3 - 2, var4) == var6 && var1.new(var2 + var7 + 2, var3 - 1, var4) == var6 && this.j(var1, var2 + var7, var3, var4, 1) && this.j(var1, var2 + var7 + 1, var3, var4, 1) && this.j(var1, var2 + var7 + 2, var3, var4, 1)) {
               var1.do(var2 + var7, var3, var4, 8, 2);
               var1.do(var2 + var7 + 1, var3, var4, 8, 2);
               var1.do(var2 + var7 + 2, var3, var4, 8, 2);
               var1.int(var2 + var7, var3, var4, 0, 0, 2);
               var1.int(var2 + var7 + 1, var3, var4, 0, 0, 2);
               var1.int(var2 + var7 + 2, var3, var4, 0, 0, 2);
               var1.int(var2 + var7, var3 - 1, var4, 0, 0, 2);
               var1.int(var2 + var7 + 1, var3 - 1, var4, 0, 0, 2);
               var1.int(var2 + var7 + 2, var3 - 1, var4, 0, 0, 2);
               var1.int(var2 + var7 + 1, var3 - 2, var4, 0, 0, 2);
               if (!var1.goto) {
                  var8 = new afq(var1);
                  var8.if((double)(var2 + var7) + 1.5D, (double)var3 - 1.45D, (double)var4 + 0.5D, 0.0F, 0.0F);
                  var8.fc();
                  var1.new(var8);
               }

               for(var9 = 0; var9 < 120; ++var9) {
                  var1.a("snowballpoof", (double)(var2 + var7 + 1) + var1.o.nextDouble(), (double)(var3 - 2) + var1.o.nextDouble() * 3.9D, (double)var4 + var1.o.nextDouble(), 0.0D, 0.0D, 0.0D);
               }

               var1.byte(var2 + var7, var3, var4, 0);
               var1.byte(var2 + var7 + 1, var3, var4, 0);
               var1.byte(var2 + var7 + 2, var3, var4, 0);
               var1.byte(var2 + var7, var3 - 1, var4, 0);
               var1.byte(var2 + var7 + 1, var3 - 1, var4, 0);
               var1.byte(var2 + var7 + 2, var3 - 1, var4, 0);
               var1.byte(var2 + var7 + 1, var3 - 2, var4, 0);
               return;
            }
         }
      }

   }

   private boolean j(y6 var1, int var2, int var3, int var4, int var5) {
      if (var1.new(var2, var3, var4) != this.void) {
         return false;
      } else {
         n4 var6 = var1.if(var2, var3, var4);
         if (var6 != null && var6 instanceof n6) {
            return ((n6)var6).l() == var5;
         } else {
            return false;
         }
      }
   }

   public void a(ajc var1) {
   }

   public ajd if(int var1, int var2) {
      return pa.aQ.do(var1);
   }

   public String void() {
      return aa3.c1[0];
   }
}
