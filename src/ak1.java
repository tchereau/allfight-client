public class ak1 {
   public y6 b;
   public ak2 void;
   private yz long;
   private boolean goto;
   private int else;
   private int char;
   private int case;
   private int byte;
   private int try;
   private boolean new;
   private int int;
   private int for;
   private int do;
   private int if;
   private int a;

   public ak1(y6 var1) {
      this.long = yz.if;
      this.a = -1;
      this.b = var1;
   }

   public void a(yz var1) {
      this.long = var1;
      var1.a(this.void.fY);
      this.void.cF();
   }

   public yz a() {
      return this.long;
   }

   public boolean do() {
      return this.long.do();
   }

   public void if(yz var1) {
      if (this.long == yz.if) {
         this.long = var1;
      }

      this.a(this.long);
   }

   public void if() {
      ++this.try;
      int var1;
      float var4;
      int var5;
      if (this.new) {
         var1 = this.try - this.if;
         int var2 = this.b.new(this.int, this.for, this.do);
         if (var2 == 0) {
            this.new = false;
         } else {
            pa var3 = pa.x[var2];
            var4 = var3.a(this.void, this.void.ap, this.int, this.for, this.do) * (float)(var1 + 1);
            var5 = (int)(var4 * 10.0F);
            if (var5 != this.a) {
               this.b.new(this.void.av, this.int, this.for, this.do, var5);
               this.a = var5;
            }

            if (var4 >= 1.0F) {
               this.new = false;
               this.for(this.int, this.for, this.do);
            }
         }
      } else if (this.goto) {
         var1 = this.b.new(this.char, this.case, this.byte);
         pa var6 = pa.x[var1];
         if (var6 == null) {
            this.b.new(this.void.av, this.char, this.case, this.byte, -1);
            this.a = -1;
            this.goto = false;
         } else {
            int var7 = this.try - this.else;
            var4 = var6.a(this.void, this.void.ap, this.char, this.case, this.byte) * (float)(var7 + 1);
            var5 = (int)(var4 * 10.0F);
            if (var5 != this.a) {
               this.b.new(this.void.av, this.char, this.case, this.byte, var5);
               this.a = var5;
            }
         }
      }

   }

   public void a(int var1, int var2, int var3, int var4) {
      if (!this.long.for() || this.void.try(var1, var2, var3)) {
         if (this.do()) {
            if (!this.b.a((aek)null, var1, var2, var3, var4)) {
               this.for(var1, var2, var3);
            }

         } else {
            this.b.a((aek)null, var1, var2, var3, var4);
            this.else = this.try;
            float var5 = 1.0F;
            int var6 = this.b.new(var1, var2, var3);
            if (var6 > 0) {
               pa.x[var6].a(this.b, var1, var2, var3, (aek)this.void);
               var5 = pa.x[var6].a(this.void, this.void.ap, var1, var2, var3);
            }

            if (var6 > 0 && var5 >= 1.0F) {
               this.for(var1, var2, var3);
            } else {
               this.goto = true;
               this.char = var1;
               this.case = var2;
               this.byte = var3;
               int var7 = (int)(var5 * 10.0F);
               this.b.new(this.void.av, var1, var2, var3, var7);
               this.a = var7;
            }

         }
      }
   }

   public void a(int var1, int var2, int var3) {
      if (var1 == this.char && var2 == this.case && var3 == this.byte) {
         int var4 = this.try - this.else;
         int var5 = this.b.new(var1, var2, var3);
         if (var5 != 0) {
            pa var6 = pa.x[var5];
            float var7 = var6.a(this.void, this.void.ap, var1, var2, var3) * (float)(var4 + 1);
            if (var7 >= 0.7F) {
               this.goto = false;
               this.b.new(this.void.av, var1, var2, var3, -1);
               this.for(var1, var2, var3);
            } else if (!this.new) {
               this.goto = false;
               this.new = true;
               this.int = var1;
               this.for = var2;
               this.do = var3;
               this.if = this.else;
            }
         }
      }

   }

   public void if(int var1, int var2, int var3) {
      this.goto = false;
      this.b.new(this.void.av, this.char, this.case, this.byte, -1);
   }

   private boolean do(int var1, int var2, int var3) {
      pa var4 = pa.x[this.b.new(var1, var2, var3)];
      int var5 = this.b.for(var1, var2, var3);
      if (var4 != null) {
         var4.a(this.b, var1, var2, var3, var5, (aek)this.void);
      }

      boolean var6 = this.b.o(var1, var2, var3);
      if (var4 != null && var6) {
         var4.a(this.b, var1, var2, var3, var5);
      }

      return var6;
   }

   public boolean for(int var1, int var2, int var3) {
      if (this.long.for() && !this.void.try(var1, var2, var3)) {
         return false;
      } else {
         int var4 = this.b.new(var1, var2, var3);
         int var5 = this.b.for(var1, var2, var3);
         this.b.a(this.void, 2001, var1, var2, var3, var4 + (this.b.for(var1, var2, var3) << 12));
         boolean var6 = this.do(var1, var2, var3);
         if (this.do()) {
            this.void.pV.if((an7)(new ana(var1, var2, var3, this.b)));
         } else {
            abp var7 = this.void.cD();
            boolean var8 = this.void.do(pa.x[var4]);
            if (var7 != null) {
               var7.a(this.b, var4, var1, var2, var3, this.void);
               if (var7.if == 0) {
                  this.void.cH();
               }
            }

            if (var6 && var8) {
               pa.x[var4].a(this.b, this.void, var1, var2, var3, var5);
            }
         }

         return var6;
      }
   }

   public boolean a(aek var1, y6 var2, abp var3) {
      int var4 = var3.if;
      int var5 = var3.new();
      abp var6 = var3.if(var2, var1);
      if (var6 == var3 && (var6 == null || var6.if == var4 && var6.long() <= 0 && var6.new() == var5)) {
         return false;
      } else {
         var1.fR.V[var1.fR.aa] = var6;
         if (this.do()) {
            var6.if = var4;
            if (var6.else()) {
               var6.do(var5);
            }
         }

         if (var6.if == 0) {
            var1.fR.V[var1.fR.aa] = null;
         }

         if (!var1.cx()) {
            ((ak2)var1).a(var1.fQ);
         }

         return true;
      }
   }

   public boolean a(aek var1, y6 var2, abp var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var11;
      if (!var1.Q() || var1.bW() == null) {
         var11 = var2.new(var4, var5, var6);
         if (var11 > 0 && pa.x[var11].a(var2, var4, var5, var6, var1, var7, var8, var9, var10)) {
            return true;
         }
      }

      if (var3 == null) {
         return false;
      } else if (this.do()) {
         var11 = var3.new();
         int var12 = var3.if;
         boolean var13 = var3.a(var1, var2, var4, var5, var6, var7, var8, var9, var10);
         var3.do(var11);
         var3.if = var12;
         return var13;
      } else {
         return var3.a(var1, var2, var4, var5, var6, var7, var8, var9, var10);
      }
   }

   public void a(ak5 var1) {
      this.b = var1;
   }
}
