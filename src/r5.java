import java.util.ArrayList;
import java.util.List;

public class r5 {
   private y6 a;
   private int try;
   private int new;
   private int int;
   private final boolean for;
   private List do;
   // $FF: synthetic field
   final r6 if;

   public r5(r6 var1, y6 var2, int var3, int var4, int var5) {
      this.if = var1;
      this.do = new ArrayList();
      this.a = var2;
      this.try = var3;
      this.new = var4;
      this.int = var5;
      int var6 = var2.new(var3, var4, var5);
      int var7 = var2.for(var3, var4, var5);
      if (((r6)pa.x[var6]).e6) {
         this.for = true;
         var7 &= -9;
      } else {
         this.for = false;
      }

      this.a(var7);
   }

   private void a(int var1) {
      this.do.clear();
      if (var1 == 0) {
         this.do.add(new yp(this.try, this.new, this.int - 1));
         this.do.add(new yp(this.try, this.new, this.int + 1));
      } else if (var1 == 1) {
         this.do.add(new yp(this.try - 1, this.new, this.int));
         this.do.add(new yp(this.try + 1, this.new, this.int));
      } else if (var1 == 2) {
         this.do.add(new yp(this.try - 1, this.new, this.int));
         this.do.add(new yp(this.try + 1, this.new + 1, this.int));
      } else if (var1 == 3) {
         this.do.add(new yp(this.try - 1, this.new + 1, this.int));
         this.do.add(new yp(this.try + 1, this.new, this.int));
      } else if (var1 == 4) {
         this.do.add(new yp(this.try, this.new + 1, this.int - 1));
         this.do.add(new yp(this.try, this.new, this.int + 1));
      } else if (var1 == 5) {
         this.do.add(new yp(this.try, this.new, this.int - 1));
         this.do.add(new yp(this.try, this.new + 1, this.int + 1));
      } else if (var1 == 6) {
         this.do.add(new yp(this.try + 1, this.new, this.int));
         this.do.add(new yp(this.try, this.new, this.int + 1));
      } else if (var1 == 7) {
         this.do.add(new yp(this.try - 1, this.new, this.int));
         this.do.add(new yp(this.try, this.new, this.int + 1));
      } else if (var1 == 8) {
         this.do.add(new yp(this.try - 1, this.new, this.int));
         this.do.add(new yp(this.try, this.new, this.int - 1));
      } else if (var1 == 9) {
         this.do.add(new yp(this.try + 1, this.new, this.int));
         this.do.add(new yp(this.try, this.new, this.int - 1));
      }

   }

   private void a() {
      for(int var1 = 0; var1 < this.do.size(); ++var1) {
         r5 var2 = this.a((yp)this.do.get(var1));
         if (var2 != null && var2.if(this)) {
            this.do.set(var1, new yp(var2.try, var2.new, var2.int));
         } else {
            this.do.remove(var1--);
         }
      }

   }

   private boolean a(int var1, int var2, int var3) {
      if (r6.X(this.a, var1, var2, var3)) {
         return true;
      } else if (r6.X(this.a, var1, var2 + 1, var3)) {
         return true;
      } else {
         return r6.X(this.a, var1, var2 - 1, var3);
      }
   }

   private r5 a(yp var1) {
      if (r6.X(this.a, var1.if, var1.a, var1.do)) {
         return new r5(this.if, this.a, var1.if, var1.a, var1.do);
      } else if (r6.X(this.a, var1.if, var1.a + 1, var1.do)) {
         return new r5(this.if, this.a, var1.if, var1.a + 1, var1.do);
      } else {
         return r6.X(this.a, var1.if, var1.a - 1, var1.do) ? new r5(this.if, this.a, var1.if, var1.a - 1, var1.do) : null;
      }
   }

   private boolean if(r5 var1) {
      for(int var2 = 0; var2 < this.do.size(); ++var2) {
         yp var3 = (yp)this.do.get(var2);
         if (var3.if == var1.try && var3.do == var1.int) {
            return true;
         }
      }

      return false;
   }

   private boolean do(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.do.size(); ++var4) {
         yp var5 = (yp)this.do.get(var4);
         if (var5.if == var1 && var5.do == var3) {
            return true;
         }
      }

      return false;
   }

   protected int if() {
      int var1 = 0;
      if (this.a(this.try, this.new, this.int - 1)) {
         ++var1;
      }

      if (this.a(this.try, this.new, this.int + 1)) {
         ++var1;
      }

      if (this.a(this.try - 1, this.new, this.int)) {
         ++var1;
      }

      if (this.a(this.try + 1, this.new, this.int)) {
         ++var1;
      }

      return var1;
   }

   private boolean do(r5 var1) {
      if (this.if(var1)) {
         return true;
      } else if (this.do.size() == 2) {
         return false;
      } else {
         return this.do.isEmpty() ? true : true;
      }
   }

   private void a(r5 var1) {
      this.do.add(new yp(var1.try, var1.new, var1.int));
      boolean var2 = this.do(this.try, this.new, this.int - 1);
      boolean var3 = this.do(this.try, this.new, this.int + 1);
      boolean var4 = this.do(this.try - 1, this.new, this.int);
      boolean var5 = this.do(this.try + 1, this.new, this.int);
      byte var6 = -1;
      if (var2 || var3) {
         var6 = 0;
      }

      if (var4 || var5) {
         var6 = 1;
      }

      if (!this.for) {
         if (var3 && var5 && !var2 && !var4) {
            var6 = 6;
         }

         if (var3 && var4 && !var2 && !var5) {
            var6 = 7;
         }

         if (var2 && var4 && !var3 && !var5) {
            var6 = 8;
         }

         if (var2 && var5 && !var3 && !var4) {
            var6 = 9;
         }
      }

      if (var6 == 0) {
         if (r6.X(this.a, this.try, this.new + 1, this.int - 1)) {
            var6 = 4;
         }

         if (r6.X(this.a, this.try, this.new + 1, this.int + 1)) {
            var6 = 5;
         }
      }

      if (var6 == 1) {
         if (r6.X(this.a, this.try + 1, this.new + 1, this.int)) {
            var6 = 2;
         }

         if (r6.X(this.a, this.try - 1, this.new + 1, this.int)) {
            var6 = 3;
         }
      }

      if (var6 < 0) {
         var6 = 0;
      }

      int var7 = var6;
      if (this.for) {
         var7 = this.a.for(this.try, this.new, this.int) & 8 | var6;
      }

      this.a.do(this.try, this.new, this.int, var7, 3);
   }

   private boolean if(int var1, int var2, int var3) {
      r5 var4 = this.a(new yp(var1, var2, var3));
      if (var4 == null) {
         return false;
      } else {
         var4.a();
         return var4.do(this);
      }
   }

   public void a(boolean var1, boolean var2) {
      boolean var3 = this.if(this.try, this.new, this.int - 1);
      boolean var4 = this.if(this.try, this.new, this.int + 1);
      boolean var5 = this.if(this.try - 1, this.new, this.int);
      boolean var6 = this.if(this.try + 1, this.new, this.int);
      byte var7 = -1;
      if ((var3 || var4) && !var5 && !var6) {
         var7 = 0;
      }

      if ((var5 || var6) && !var3 && !var4) {
         var7 = 1;
      }

      if (!this.for) {
         if (var4 && var6 && !var3 && !var5) {
            var7 = 6;
         }

         if (var4 && var5 && !var3 && !var6) {
            var7 = 7;
         }

         if (var3 && var5 && !var4 && !var6) {
            var7 = 8;
         }

         if (var3 && var6 && !var4 && !var5) {
            var7 = 9;
         }
      }

      if (var7 == -1) {
         if (var3 || var4) {
            var7 = 0;
         }

         if (var5 || var6) {
            var7 = 1;
         }

         if (!this.for) {
            if (var1) {
               if (var4 && var6) {
                  var7 = 6;
               }

               if (var5 && var4) {
                  var7 = 7;
               }

               if (var6 && var3) {
                  var7 = 9;
               }

               if (var3 && var5) {
                  var7 = 8;
               }
            } else {
               if (var3 && var5) {
                  var7 = 8;
               }

               if (var6 && var3) {
                  var7 = 9;
               }

               if (var5 && var4) {
                  var7 = 7;
               }

               if (var4 && var6) {
                  var7 = 6;
               }
            }
         }
      }

      if (var7 == 0) {
         if (r6.X(this.a, this.try, this.new + 1, this.int - 1)) {
            var7 = 4;
         }

         if (r6.X(this.a, this.try, this.new + 1, this.int + 1)) {
            var7 = 5;
         }
      }

      if (var7 == 1) {
         if (r6.X(this.a, this.try + 1, this.new + 1, this.int)) {
            var7 = 2;
         }

         if (r6.X(this.a, this.try - 1, this.new + 1, this.int)) {
            var7 = 3;
         }
      }

      if (var7 < 0) {
         var7 = 0;
      }

      this.a(var7);
      int var8 = var7;
      if (this.for) {
         var8 = this.a.for(this.try, this.new, this.int) & 8 | var7;
      }

      if (var2 || this.a.for(this.try, this.new, this.int) != var8) {
         this.a.do(this.try, this.new, this.int, var8, 3);

         for(int var9 = 0; var9 < this.do.size(); ++var9) {
            r5 var10 = this.a((yp)this.do.get(var9));
            if (var10 != null) {
               var10.a();
               if (var10.do(this)) {
                  var10.a(this);
               }
            }
         }
      }

   }
}
