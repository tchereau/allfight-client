import java.util.List;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.Drawable;
import org.lwjgl.opengl.Pbuffer;
import org.lwjgl.opengl.PixelFormat;

public class yc implements p {
   private ael else = null;
   private float case = 10.0F;
   private long char = 0L;
   private boolean byte = true;
   private int try = 0;

   public void a() {
      if (this.else != null) {
         this.else.else();
         this.else.byte();
      }
   }

   public void for() {
   }

   private void try() {
      if (this.else == null) {
         this.a(Display.getDrawable());
      }
   }

   public dm a(y6 var1, List var2, int var3, int var4, int var5, int var6) {
      return new b(var1, var2, var3, var4, var5, var6);
   }

   public ael a(Drawable var1) {
      if (this.else != null) {
         throw new IllegalStateException("UpdateThread is already existing");
      } else {
         try {
            Pbuffer var2 = new Pbuffer(1, 1, new PixelFormat(), var1);
            this.else = new ael(var2);
            this.else.setPriority(1);
            this.else.start();
            this.else.case();
            return this.else;
         } catch (Exception var3) {
            throw new RuntimeException(var3);
         }
      }
   }

   public boolean byte() {
      return Thread.currentThread() == this.else;
   }

   public static boolean case() {
      return true;
   }

   public void a(c9 var1, aig var2) {
      this.try = 0;
      if (this.else != null) {
         if (this.char == 0L) {
            this.char = System.nanoTime();
         }

         if (this.else.if()) {
            this.try = qs.ae();
            if (qs.G() && !var1.a(var2)) {
               this.try *= 3;
            }

            this.try = Math.min(this.try, this.else.for());
            if (this.try > 0) {
               this.else.do();
            }
         }
      }

   }

   public void do() {
      if (this.else != null) {
         float var1 = 0.0F;
         if (this.try > 0) {
            long var2 = System.nanoTime() - this.char;
            float var4 = this.case * (1.0F + (float)(this.try - 1) / 2.0F);
            if (var4 > 0.0F) {
               int var5 = (int)var4;
               qs.if((long)var5);
            }

            this.else.case();
         }

         float var6 = 0.2F;
         if (this.try > 0) {
            int var3 = this.else.char();
            if (var3 < this.try) {
               this.case += var6;
            }

            if (var3 > this.try) {
               this.case -= var6;
            }

            if (var3 == this.try) {
               this.case -= var6;
            }
         } else {
            this.case -= var6 / 5.0F;
         }

         if (this.case < 0.0F) {
            this.case = 0.0F;
         }

         this.char = System.nanoTime();
      }

   }

   public boolean a(c9 var1, aig var2, boolean var3) {
      this.try();
      if (var1.E.do() <= 0) {
         return true;
      } else {
         int var4 = 0;
         byte var5 = 4;
         int var6 = 0;
         dm var7 = null;
         float var8 = Float.MAX_VALUE;
         int var9 = -1;

         int var10;
         float var12;
         for(var10 = 0; var10 < var1.E.do(); ++var10) {
            dm var11 = (dm)var1.E.if(var10);
            if (var11 != null) {
               ++var6;
               if (!var11.do) {
                  if (!var11.f) {
                     var1.E.if(var10, (Object)null);
                  } else {
                     var12 = var11.a((aiw)var2);
                     if (var12 < 512.0F) {
                        if (var12 < 256.0F && var1.byte() && var11.k || this.byte) {
                           if (this.else != null) {
                              this.else.byte();
                           }

                           var11.for();
                           var11.f = false;
                           var1.E.if(var10, (Object)null);
                           ++var4;
                           continue;
                        }

                        if (this.else != null) {
                           this.else.a(var11, true);
                           var11.f = false;
                           var1.E.if(var10, (Object)null);
                           ++var4;
                           continue;
                        }
                     }

                     if (!var11.k) {
                        var12 *= (float)var5;
                     }

                     if (var7 == null) {
                        var7 = var11;
                        var8 = var12;
                        var9 = var10;
                     } else if (var12 < var8) {
                        var7 = var11;
                        var8 = var12;
                        var9 = var10;
                     }
                  }
               }
            }
         }

         var10 = qs.ae();
         boolean var17 = false;
         if (qs.G() && !var1.a(var2)) {
            var10 *= 3;
            var17 = true;
         }

         if (this.else != null) {
            var10 = this.else.new();
            if (var10 <= 0) {
               return true;
            }
         }

         int var13;
         if (var7 != null) {
            this.a(var7);
            var1.E.if(var9, (Object)null);
            ++var4;
            var12 = var8 / 5.0F;

            for(var13 = 0; var13 < var1.E.do() && var4 < var10; ++var13) {
               dm var14 = (dm)var1.E.if(var13);
               if (var14 != null && !var14.do) {
                  float var15 = var14.a((aiw)var2);
                  if (!var14.k) {
                     var15 *= (float)var5;
                  }

                  float var16 = Math.abs(var15 - var8);
                  if (var16 < var12) {
                     this.a(var14);
                     var1.E.if(var13, (Object)null);
                     ++var4;
                  }
               }
            }
         }

         if (var6 == 0) {
            var1.E.a();
         }

         if (var1.E.do() > 100 && var6 < var1.E.do() * 4 / 5) {
            int var18 = 0;

            for(var13 = 0; var13 < var1.E.do(); ++var13) {
               Object var19 = var1.E.if(var13);
               if (var19 != null) {
                  if (var13 != var18) {
                     var1.E.if(var18, var19);
                  }

                  ++var18;
               }
            }

            for(var13 = var1.E.do() - 1; var13 >= var18; --var13) {
               var1.E.a(var13);
            }
         }

         this.byte = false;
         return true;
      }
   }

   private void a(dm var1) {
      ael var2 = this.else;
      if (var2 != null) {
         var2.a(var1, false);
         var1.f = false;
      } else {
         var1.for();
         var1.f = false;
         var1.do = false;
      }
   }

   public void new() {
      if (this.else != null) {
         this.else.byte();
      }

   }

   public void int() {
      if (this.else != null) {
         this.else.do();
      }

   }

   public void if() {
      if (this.else != null) {
         this.else.case();
      }

   }
}
