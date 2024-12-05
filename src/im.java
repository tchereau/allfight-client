import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

abstract class im extends i3 {
   protected int j;
   protected List o;
   protected Comparator n;
   protected int m;
   protected int l;
   // $FF: synthetic field
   final is k;

   protected im(is var1) {
      super(is.void(var1), var1.hV, var1.hU, 32, var1.hU - 64, 20);
      this.k = var1;
      this.j = -1;
      this.m = -1;
      this.l = 0;
      this.a(false);
      this.a(true, 20);
   }

   protected void a(int var1, boolean var2) {
   }

   protected boolean a(int var1) {
      return false;
   }

   protected void int() {
      this.k.dx();
   }

   protected void a(int var1, int var2, c4 var3) {
      if (!Mouse.isButtonDown(0)) {
         this.j = -1;
      }

      if (this.j == 0) {
         is.a(this.k, var1 + 115 - 18, var2 + 1, 0, 0);
      } else {
         is.a(this.k, var1 + 115 - 18, var2 + 1, 0, 18);
      }

      if (this.j == 1) {
         is.a(this.k, var1 + 165 - 18, var2 + 1, 0, 0);
      } else {
         is.a(this.k, var1 + 165 - 18, var2 + 1, 0, 18);
      }

      if (this.j == 2) {
         is.a(this.k, var1 + 215 - 18, var2 + 1, 0, 0);
      } else {
         is.a(this.k, var1 + 215 - 18, var2 + 1, 0, 18);
      }

      if (this.m != -1) {
         short var4 = 79;
         byte var5 = 18;
         if (this.m == 1) {
            var4 = 129;
         } else if (this.m == 2) {
            var4 = 179;
         }

         if (this.l == 1) {
            var5 = 36;
         }

         is.a(this.k, var1 + var4, var2 + 1, var5, 0);
      }

   }

   protected void do(int var1, int var2) {
      this.j = -1;
      if (var1 >= 79 && var1 < 115) {
         this.j = 0;
      } else if (var1 >= 129 && var1 < 165) {
         this.j = 1;
      } else if (var1 >= 179 && var1 < 215) {
         this.j = 2;
      }

      if (this.j >= 0) {
         this.for(this.j);
         is.try(this.k).uX.a("random.click", 1.0F, 1.0F);
      }

   }

   protected final int new() {
      return this.o.size();
   }

   protected final akh do(int var1) {
      return (akh)this.o.get(var1);
   }

   protected abstract String int(int var1);

   protected void a(akh var1, int var2, int var3, boolean var4) {
      String var5;
      if (var1 != null) {
         var5 = var1.a(is.case(this.k).a((akf)var1));
         this.k.if(is.b(this.k), var5, var2 - is.a(this.k).for(var5), var3 + 5, var4 ? 16777215 : 9474192);
      } else {
         var5 = "-";
         this.k.if(is.if(this.k), var5, var2 - is.for(this.k).for(var5), var3 + 5, var4 ? 16777215 : 9474192);
      }

   }

   protected void a(int var1, int var2) {
      if (var2 >= this.e && var2 <= this.d) {
         int var3 = this.if(var1, var2);
         int var4 = this.k.hV / 2 - 92 - 16;
         if (var3 >= 0) {
            if (var1 < var4 + 40 || var1 > var4 + 40 + 20) {
               return;
            }

            akh var9 = this.do(var3);
            this.a(var9, var1, var2);
         } else {
            String var5 = "";
            if (var1 >= var4 + 115 - 18 && var1 <= var4 + 115) {
               var5 = this.int(0);
            } else if (var1 >= var4 + 165 - 18 && var1 <= var4 + 165) {
               var5 = this.int(1);
            } else {
               if (var1 < var4 + 215 - 18 || var1 > var4 + 215) {
                  return;
               }

               var5 = this.int(2);
            }

            var5 = ("" + aqy.if().a(var5)).trim();
            if (var5.length() > 0) {
               int var6 = var1 + 12;
               int var7 = var2 - 12;
               int var8 = is.byte(this.k).for(var5);
               is.a(this.k, var6 - 3, var7 - 3, var6 + var8 + 3, var7 + 8 + 3, -1073741824, -1073741824);
               is.goto(this.k).a(var5, var6, var7, -1);
            }
         }

      }
   }

   protected void a(akh var1, int var2, int var3) {
      if (var1 != null) {
         abr var4 = abr.ai[var1.try()];
         String var5 = ("" + aqy.if().for(var4.int())).trim();
         if (var5.length() > 0) {
            int var6 = var2 + 12;
            int var7 = var3 - 12;
            int var8 = is.new(this.k).for(var5);
            is.if(this.k, var6 - 3, var7 - 3, var6 + var8 + 3, var7 + 8 + 3, -1073741824, -1073741824);
            is.char(this.k).a(var5, var6, var7, -1);
         }

      }
   }

   protected void for(int var1) {
      if (var1 != this.m) {
         this.m = var1;
         this.l = -1;
      } else if (this.l == -1) {
         this.l = 1;
      } else {
         this.m = -1;
         this.l = 0;
      }

      Collections.sort(this.o, this.n);
   }
}
