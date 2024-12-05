import java.util.List;

public class dk implements p {
   private long do = 0L;
   private long new = 0L;
   private long a = 10000000L;
   private ko for = null;
   private int int = 0;
   private int if = 0;

   public void for() {
   }

   public void a() {
   }

   public dm a(y6 var1, List var2, int var3, int var4, int var5, int var6) {
      return new ko(var1, var2, var3, var4, var5, var6);
   }

   public boolean a(c9 var1, aig var2, boolean var3) {
      this.do = this.new;
      this.new = System.nanoTime();
      long var4 = this.new + this.a;
      int var6 = qs.ae();
      if (qs.G() && !var1.a(var2)) {
         var6 *= 3;
      }

      this.int = 0;

      do {
         this.if = 0;
         this.if(var1, var2, var3);
      } while(this.if > 0 && System.nanoTime() - var4 < 0L);

      if (this.if > 0) {
         var6 = Math.min(var6, this.if);
         long var7 = 400000L;
         if (this.int > var6) {
            this.a -= 2L * var7;
         }

         if (this.int < var6) {
            this.a += var7;
         }
      } else {
         this.a = 0L;
         this.a -= 200000L;
      }

      if (this.a < 0L) {
         this.a = 0L;
      }

      return this.int > 0;
   }

   private void if(c9 var1, aig var2, boolean var3) {
      this.if = 0;
      boolean var4 = true;
      if (this.for != null) {
         ++this.if;
         var4 = this.a(this.for);
         if (var4) {
            ++this.int;
         }
      }

      if (var1.E.do() > 0) {
         byte var5 = 4;
         ko var6 = null;
         float var7 = Float.MAX_VALUE;
         int var8 = -1;

         int var9;
         for(var9 = 0; var9 < var1.E.do(); ++var9) {
            ko var10 = (ko)var1.E.if(var9);
            if (var10 != null) {
               ++this.if;
               if (!var10.f) {
                  var1.E.if(var9, (Object)null);
               } else {
                  float var11 = var10.a(var2);
                  if (var11 <= 256.0F && var1.byte()) {
                     var10.for();
                     var10.f = false;
                     var1.E.if(var9, (Object)null);
                     ++this.int;
                  } else {
                     if (!var10.k) {
                        var11 *= (float)var5;
                     }

                     if (var6 == null) {
                        var6 = var10;
                        var7 = var11;
                        var8 = var9;
                     } else if (var11 < var7) {
                        var6 = var10;
                        var7 = var11;
                        var8 = var9;
                     }
                  }
               }
            }
         }

         if (this.for == null || var4) {
            int var15;
            if (var6 != null) {
               var1.E.if(var8, (Object)null);
               if (!this.a(var6)) {
                  return;
               }

               ++this.int;
               if (System.nanoTime() > this.new + this.a) {
                  return;
               }

               float var14 = var7 / 5.0F;

               for(var15 = 0; var15 < var1.E.do(); ++var15) {
                  ko var16 = (ko)var1.E.if(var15);
                  if (var16 != null) {
                     float var12 = var16.a(var2);
                     if (!var16.k) {
                        var12 *= (float)var5;
                     }

                     float var13 = Math.abs(var12 - var7);
                     if (var13 < var14) {
                        var1.E.if(var15, (Object)null);
                        if (!this.a(var16)) {
                           return;
                        }

                        ++this.int;
                        if (System.nanoTime() > this.new + this.a) {
                           break;
                        }
                     }
                  }
               }
            }

            if (this.if == 0) {
               var1.E.a();
            }

            if (var1.E.do() > 100 && this.if < var1.E.do() * 4 / 5) {
               var9 = 0;

               for(var15 = 0; var15 < var1.E.do(); ++var15) {
                  Object var17 = var1.E.if(var15);
                  if (var17 != null) {
                     if (var15 != var9) {
                        var1.E.if(var9, var17);
                     }

                     ++var9;
                  }
               }

               for(var15 = var1.E.do() - 1; var15 >= var9; --var15) {
                  var1.E.a(var15);
               }
            }

         }
      }
   }

   private boolean a(ko var1) {
      long var2 = this.new + this.a;
      var1.f = false;
      boolean var4 = var1.a(var2);
      if (!var4) {
         this.for = var1;
         return false;
      } else {
         var1.byte();
         this.for = null;
         return true;
      }
   }

   public void new() {
   }

   public void int() {
   }

   public void if() {
   }

   public void a(c9 var1, aig var2) {
   }

   public void do() {
   }
}
