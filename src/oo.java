import java.util.Iterator;
import java.util.List;

public class oo extends n4 implements ajg {
   public static final ai0[][] K;
   private long J;
   private float I;
   private boolean H;
   private int G = -1;
   private int F;
   private int E;
   private abp D;
   private String C;

   public void long() {
      if (this.try.m() % 80L == 0L) {
         this.D();
         this.C();
      }

   }

   private void C() {
      if (this.H && this.G > 0 && !this.try.goto && this.F > 0) {
         double var1 = (double)(this.G * 10 + 10);
         byte var3 = 0;
         if (this.G >= 4 && this.F == this.E) {
            var3 = 1;
         }

         nw var4 = nw.if().a((double)this.new, (double)this.int, (double)this.for, (double)(this.new + 1), (double)(this.int + 1), (double)(this.for + 1)).do(var1, var1, var1);
         var4.int = (double)this.try.if();
         List var5 = this.try.a(aek.class, var4);
         Iterator var6 = var5.iterator();

         aek var7;
         while(var6.hasNext()) {
            var7 = (aek)var6.next();
            var7.for(new aiz(this.F, 180, var3, true));
         }

         if (this.G >= 4 && this.F != this.E && this.E > 0) {
            var6 = var5.iterator();

            while(var6.hasNext()) {
               var7 = (aek)var6.next();
               var7.for(new aiz(this.E, 180, 0, true));
            }
         }
      }

   }

   private void D() {
      if (!this.try.j(this.new, this.int + 1, this.for)) {
         this.H = false;
         this.G = 0;
      } else {
         this.H = true;
         this.G = 0;

         for(int var1 = 1; var1 <= 4; this.G = var1++) {
            int var2 = this.int - var1;
            if (var2 < 0) {
               break;
            }

            boolean var3 = true;

            for(int var4 = this.new - var1; var4 <= this.new + var1 && var3; ++var4) {
               for(int var5 = this.for - var1; var5 <= this.for + var1; ++var5) {
                  int var6 = this.try.new(var4, var2, var5);
                  if (var6 != pa.bh.void && var6 != pa.bJ.void && var6 != pa.cv.void && var6 != pa.bH.void) {
                     var3 = false;
                     break;
                  }
               }
            }

            if (!var3) {
               break;
            }
         }

         if (this.G == 0) {
            this.H = false;
         }
      }

   }

   public float A() {
      if (!this.H) {
         return 0.0F;
      } else {
         int var1 = (int)(this.try.m() - this.J);
         this.J = this.try.m();
         if (var1 > 1) {
            this.I -= (float)var1 / 40.0F;
            if (this.I < 0.0F) {
               this.I = 0.0F;
            }
         }

         this.I += 0.025F;
         if (this.I > 1.0F) {
            this.I = 1.0F;
         }

         return this.I;
      }
   }

   public int y() {
      return this.F;
   }

   public int z() {
      return this.E;
   }

   public int B() {
      return this.G;
   }

   public void int(int var1) {
      this.G = var1;
   }

   public void for(int var1) {
      this.F = 0;

      for(int var2 = 0; var2 < this.G && var2 < 3; ++var2) {
         ai0[] var3 = K[var2];
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            ai0 var6 = var3[var5];
            if (var6.try == var1) {
               this.F = var1;
               return;
            }
         }
      }

   }

   public void new(int var1) {
      this.E = 0;
      if (this.G >= 4) {
         for(int var2 = 0; var2 < 4; ++var2) {
            ai0[] var3 = K[var2];
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               ai0 var6 = var3[var5];
               if (var6.try == var1) {
                  this.E = var1;
                  return;
               }
            }
         }
      }

   }

   public an7 char() {
      aqv var1 = new aqv();
      this.do(var1);
      return new anc(this.new, this.int, this.for, 3, var1);
   }

   public double int() {
      return 65536.0D;
   }

   public void a(aqv var1) {
      super.a(var1);
      this.F = var1.goto("Primary");
      this.E = var1.goto("Secondary");
      this.G = var1.goto("Levels");
   }

   public void do(aqv var1) {
      super.do(var1);
      var1.a("Primary", this.F);
      var1.a("Secondary", this.E);
      var1.a("Levels", this.G);
   }

   public int r() {
      return 1;
   }

   public abp do(int var1) {
      return var1 == 0 ? this.D : null;
   }

   public abp if(int var1, int var2) {
      if (var1 == 0 && this.D != null) {
         if (var2 >= this.D.if) {
            abp var3 = this.D;
            this.D = null;
            return var3;
         } else {
            abp var10000 = this.D;
            var10000.if -= var2;
            return new abp(this.D.new, var2, this.D.new());
         }
      } else {
         return null;
      }
   }

   public abp if(int var1) {
      if (var1 == 0 && this.D != null) {
         abp var2 = this.D;
         this.D = null;
         return var2;
      } else {
         return null;
      }
   }

   public void if(int var1, abp var2) {
      if (var1 == 0) {
         this.D = var2;
      }

   }

   public String t() {
      return this.s() ? this.C : "container.beacon";
   }

   public boolean s() {
      return this.C != null && this.C.length() > 0;
   }

   public void for(String var1) {
      this.C = var1;
   }

   public int q() {
      return 1;
   }

   public boolean a(aek var1) {
      if (this.try.if(this.new, this.int, this.for) != this) {
         return false;
      } else {
         return !(var1.if((double)this.new + 0.5D, (double)this.int + 0.5D, (double)this.for + 0.5D) > 64.0D);
      }
   }

   public void p() {
   }

   public void u() {
   }

   public boolean a(int var1, abp var2) {
      return var2.new == abr.bP.A || var2.new == abr.P.A || var2.new == abr.L.A || var2.new == abr.N.A;
   }

   static {
      K = new ai0[][]{{ai0.y, ai0.w}, {ai0.o, ai0.r}, {ai0.u}, {ai0.p}};
   }
}
