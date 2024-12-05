import java.util.Iterator;
import java.util.List;

public class om extends n4 implements ajg {
   private abp[] s = new abp[36];
   public boolean A = false;
   public om z;
   public om y;
   public om x;
   public om w;
   public float v;
   public float u;
   public int t;
   private int r;
   private int q = -1;
   private String B;

   public int r() {
      return 27;
   }

   public abp do(int var1) {
      return this.s[var1];
   }

   public abp if(int var1, int var2) {
      if (this.s[var1] != null) {
         abp var3;
         if (this.s[var1].if <= var2) {
            var3 = this.s[var1];
            this.s[var1] = null;
            this.case();
            return var3;
         } else {
            var3 = this.s[var1].a(var2);
            if (this.s[var1].if == 0) {
               this.s[var1] = null;
            }

            this.case();
            return var3;
         }
      } else {
         return null;
      }
   }

   public abp if(int var1) {
      if (this.s[var1] != null) {
         abp var2 = this.s[var1];
         this.s[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void if(int var1, abp var2) {
      this.s[var1] = var2;
      if (var2 != null && var2.if > this.q()) {
         var2.if = this.q();
      }

      this.case();
   }

   public String t() {
      return this.s() ? this.B : "container.chest";
   }

   public boolean s() {
      return this.B != null && this.B.length() > 0;
   }

   public void do(String var1) {
      this.B = var1;
   }

   public void a(aqv var1) {
      super.a(var1);
      aqm var2 = var1.void("Items");
      this.s = new abp[this.r()];
      if (var1.try("CustomName")) {
         this.B = var1.new("CustomName");
      }

      for(int var3 = 0; var3 < var2.for(); ++var3) {
         aqv var4 = (aqv)var2.a(var3);
         int var5 = var4.else("Slot") & 255;
         if (var5 >= 0 && var5 < this.s.length) {
            this.s[var5] = abp.for(var4);
         }
      }

   }

   public void do(aqv var1) {
      super.do(var1);
      aqm var2 = new aqm();

      for(int var3 = 0; var3 < this.s.length; ++var3) {
         if (this.s[var3] != null) {
            aqv var4 = new aqv();
            var4.a("Slot", (byte)var3);
            this.s[var3].if(var4);
            var2.a((aqd)var4);
         }
      }

      var1.a("Items", (aqd)var2);
      if (this.s()) {
         var1.a("CustomName", this.B);
      }

   }

   public int q() {
      return 64;
   }

   public boolean a(aek var1) {
      if (this.try.if(this.new, this.int, this.for) != this) {
         return false;
      } else {
         return !(var1.if((double)this.new + 0.5D, (double)this.int + 0.5D, (double)this.for + 0.5D) > 64.0D);
      }
   }

   public void d() {
      super.d();
      this.A = false;
   }

   private void a(om var1, int var2) {
      if (var1.new()) {
         this.A = false;
      } else if (this.A) {
         switch(var2) {
         case 0:
            if (this.w != var1) {
               this.A = false;
            }
            break;
         case 1:
            if (this.x != var1) {
               this.A = false;
            }
            break;
         case 2:
            if (this.z != var1) {
               this.A = false;
            }
            break;
         case 3:
            if (this.y != var1) {
               this.A = false;
            }
         }
      }

   }

   public void w() {
      if (!this.A) {
         this.A = true;
         this.z = null;
         this.y = null;
         this.x = null;
         this.w = null;
         if (this.a(this.new - 1, this.int, this.for)) {
            this.x = (om)this.try.if(this.new - 1, this.int, this.for);
         }

         if (this.a(this.new + 1, this.int, this.for)) {
            this.y = (om)this.try.if(this.new + 1, this.int, this.for);
         }

         if (this.a(this.new, this.int, this.for - 1)) {
            this.z = (om)this.try.if(this.new, this.int, this.for - 1);
         }

         if (this.a(this.new, this.int, this.for + 1)) {
            this.w = (om)this.try.if(this.new, this.int, this.for + 1);
         }

         if (this.z != null) {
            this.z.a(this, 0);
         }

         if (this.w != null) {
            this.w.a(this, 2);
         }

         if (this.y != null) {
            this.y.a(this, 1);
         }

         if (this.x != null) {
            this.x.a(this, 3);
         }

      }
   }

   private boolean a(int var1, int var2, int var3) {
      pa var4 = pa.x[this.try.new(var1, var2, var3)];
      if (var4 != null && var4 instanceof ru) {
         return ((ru)var4).ey == this.x();
      } else {
         return false;
      }
   }

   public void long() {
      super.long();
      this.w();
      ++this.r;
      float var1;
      if (!this.try.goto && this.t != 0 && (this.r + this.new + this.int + this.for) % 200 == 0) {
         this.t = 0;
         var1 = 5.0F;
         List var2 = this.try.a(aek.class, nw.if().a((double)((float)this.new - var1), (double)((float)this.int - var1), (double)((float)this.for - var1), (double)((float)(this.new + 1) + var1), (double)((float)(this.int + 1) + var1), (double)((float)(this.for + 1) + var1)));
         Iterator var3 = var2.iterator();

         label93:
         while(true) {
            ajg var5;
            do {
               aek var4;
               do {
                  if (!var3.hasNext()) {
                     break label93;
                  }

                  var4 = (aek)var3.next();
               } while(!(var4.fP instanceof adu));

               var5 = ((adu)var4.fP).new();
            } while(var5 != this && (!(var5 instanceof ajh) || !((ajh)var5).if(this)));

            ++this.t;
         }
      }

      this.u = this.v;
      var1 = 0.1F;
      double var11;
      if (this.t > 0 && this.v == 0.0F && this.z == null && this.x == null) {
         double var8 = (double)this.new + 0.5D;
         var11 = (double)this.for + 0.5D;
         if (this.w != null) {
            var11 += 0.5D;
         }

         if (this.y != null) {
            var8 += 0.5D;
         }

         this.try.a(var8, (double)this.int + 0.5D, var11, "random.chestopen", 0.5F, this.try.o.nextFloat() * 0.1F + 0.9F);
      }

      if (this.t == 0 && this.v > 0.0F || this.t > 0 && this.v < 1.0F) {
         float var9 = this.v;
         if (this.t > 0) {
            this.v += var1;
         } else {
            this.v -= var1;
         }

         if (this.v > 1.0F) {
            this.v = 1.0F;
         }

         float var10 = 0.5F;
         if (this.v < var10 && var9 >= var10 && this.z == null && this.x == null) {
            var11 = (double)this.new + 0.5D;
            double var6 = (double)this.for + 0.5D;
            if (this.w != null) {
               var6 += 0.5D;
            }

            if (this.y != null) {
               var11 += 0.5D;
            }

            this.try.a(var11, (double)this.int + 0.5D, var6, "random.chestclosed", 0.5F, this.try.o.nextFloat() * 0.1F + 0.9F);
         }

         if (this.v < 0.0F) {
            this.v = 0.0F;
         }
      }

   }

   public boolean a(int var1, int var2) {
      if (var1 == 1) {
         this.t = var2;
         return true;
      } else {
         return super.a(var1, var2);
      }
   }

   public void p() {
      if (this.t < 0) {
         this.t = 0;
      }

      ++this.t;
      this.try.do(this.new, this.int, this.for, this.else().void, 1, this.t);
      this.try.for(this.new, this.int, this.for, this.else().void);
      this.try.for(this.new, this.int - 1, this.for, this.else().void);
   }

   public void u() {
      if (this.else() != null && this.else() instanceof ru) {
         --this.t;
         this.try.do(this.new, this.int, this.for, this.else().void, 1, this.t);
         this.try.for(this.new, this.int, this.for, this.else().void);
         this.try.for(this.new, this.int - 1, this.for, this.else().void);
      }
   }

   public boolean a(int var1, abp var2) {
      return true;
   }

   public void c() {
      super.c();
      this.d();
      this.w();
   }

   public int x() {
      if (this.q == -1) {
         if (this.try == null || !(this.else() instanceof ru)) {
            return 0;
         }

         this.q = ((ru)this.else()).ey;
      }

      return this.q;
   }
}
