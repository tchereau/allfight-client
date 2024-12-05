import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class i3 {
   private final Minecraft g;
   private int f;
   private int long;
   protected int e;
   protected int d;
   private int goto;
   private int else;
   protected final int c;
   private int char;
   private int case;
   protected int b;
   protected int void;
   private float byte = -2.0F;
   private float try;
   private float new;
   private int int = -1;
   private long for = 0L;
   private boolean do = true;
   private boolean if;
   private int a;

   public i3(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      this.g = var1;
      this.f = var2;
      this.long = var3;
      this.e = var4;
      this.d = var5;
      this.c = var6;
      this.else = 0;
      this.goto = var2;
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.f = var1;
      this.long = var2;
      this.e = var3;
      this.d = var4;
      this.else = 0;
      this.goto = var1;
   }

   public void a(boolean var1) {
      this.do = var1;
   }

   protected void a(boolean var1, int var2) {
      this.if = var1;
      this.a = var2;
      if (!var1) {
         this.a = 0;
      }

   }

   protected abstract int new();

   protected abstract void a(int var1, boolean var2);

   protected abstract boolean a(int var1);

   protected int if() {
      return this.new() * this.c + this.a;
   }

   protected abstract void int();

   protected abstract void a(int var1, int var2, int var3, int var4, c4 var5);

   protected void a(int var1, int var2, c4 var3) {
   }

   protected void do(int var1, int var2) {
   }

   protected void a(int var1, int var2) {
   }

   public int if(int var1, int var2) {
      int var3 = this.f / 2 - 110;
      int var4 = this.f / 2 + 110;
      int var5 = var2 - this.e - this.a + (int)this.new - 4;
      int var6 = var5 / this.c;
      return var1 >= var3 && var1 <= var4 && var6 >= 0 && var5 >= 0 && var6 < this.new() ? var6 : -1;
   }

   public void a(List var1, int var2, int var3) {
      this.char = var2;
      this.case = var3;
   }

   private void for() {
      int var1 = this.do();
      if (var1 < 0) {
         var1 /= 2;
      }

      if (this.new < 0.0F) {
         this.new = 0.0F;
      }

      if (this.new > (float)var1) {
         this.new = (float)var1;
      }

   }

   public int do() {
      return this.if() - (this.d - this.e - 4);
   }

   public void if(int var1) {
      this.new += (float)var1;
      this.for();
      this.byte = -2.0F;
   }

   public void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == this.char) {
            this.new -= (float)(this.c * 2 / 3);
            this.byte = -2.0F;
            this.for();
         } else if (var1.hv == this.case) {
            this.new += (float)(this.c * 2 / 3);
            this.byte = -2.0F;
            this.for();
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.b = var1;
      this.void = var2;
      this.int();
      int var4 = this.new();
      int var5 = this.a();
      int var6 = var5 + 6;
      int var9;
      int var10;
      int var11;
      int var13;
      int var20;
      if (Mouse.isButtonDown(0)) {
         if (this.byte == -1.0F) {
            boolean var16 = true;
            if (var2 >= this.e && var2 <= this.d) {
               int var8 = this.f / 2 - 110;
               var9 = this.f / 2 + 110;
               var10 = var2 - this.e - this.a + (int)this.new - 4;
               var11 = var10 / this.c;
               if (var1 >= var8 && var1 <= var9 && var11 >= 0 && var10 >= 0 && var11 < var4) {
                  boolean var12 = var11 == this.int && Minecraft.h1() - this.for < 250L;
                  this.a(var11, var12);
                  this.int = var11;
                  this.for = Minecraft.h1();
               } else if (var1 >= var8 && var1 <= var9 && var10 < 0) {
                  this.do(var1 - var8, var2 - this.e + (int)this.new - 4);
                  var16 = false;
               }

               if (var1 >= var5 && var1 <= var6) {
                  this.try = -1.0F;
                  var20 = this.do();
                  if (var20 < 1) {
                     var20 = 1;
                  }

                  var13 = (int)((float)((this.d - this.e) * (this.d - this.e)) / (float)this.if());
                  if (var13 < 32) {
                     var13 = 32;
                  }

                  if (var13 > this.d - this.e - 8) {
                     var13 = this.d - this.e - 8;
                  }

                  this.try /= (float)(this.d - this.e - var13) / (float)var20;
               } else {
                  this.try = 1.0F;
               }

               if (var16) {
                  this.byte = (float)var2;
               } else {
                  this.byte = -2.0F;
               }
            } else {
               this.byte = -2.0F;
            }
         } else if (this.byte >= 0.0F) {
            this.new -= ((float)var2 - this.byte) * this.try;
            this.byte = (float)var2;
         }
      } else {
         while(true) {
            if (this.g.u1.aV || !Mouse.next()) {
               this.byte = -1.0F;
               break;
            }

            int var7 = Mouse.getEventDWheel();
            if (var7 != 0) {
               if (var7 > 0) {
                  var7 = -1;
               } else if (var7 < 0) {
                  var7 = 1;
               }

               this.new += (float)(var7 * this.c / 2);
            }
         }
      }

      this.for();
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      c4 var18 = c4.G;
      this.g.vb.for("/gui/background.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var17 = 32.0F;
      var18.if();
      var18.a(2105376);
      var18.a((double)this.else, (double)this.d, 0.0D, (double)((float)this.else / var17), (double)((float)(this.d + (int)this.new) / var17));
      var18.a((double)this.goto, (double)this.d, 0.0D, (double)((float)this.goto / var17), (double)((float)(this.d + (int)this.new) / var17));
      var18.a((double)this.goto, (double)this.e, 0.0D, (double)((float)this.goto / var17), (double)((float)(this.e + (int)this.new) / var17));
      var18.a((double)this.else, (double)this.e, 0.0D, (double)((float)this.else / var17), (double)((float)(this.e + (int)this.new) / var17));
      var18.for();
      var9 = this.f / 2 - 92 - 16;
      var10 = this.e + 4 - (int)this.new;
      if (this.if) {
         this.a(var9, var10, var18);
      }

      int var14;
      for(var11 = 0; var11 < var4; ++var11) {
         var20 = var10 + var11 * this.c + this.a;
         var13 = this.c - 4;
         if (var20 <= this.d && var20 + var13 >= this.e) {
            if (this.do && this.a(var11)) {
               var14 = this.f / 2 - 110;
               int var15 = this.f / 2 + 110;
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glDisable(3553);
               var18.if();
               var18.a(8421504);
               var18.a((double)var14, (double)(var20 + var13 + 2), 0.0D, 0.0D, 1.0D);
               var18.a((double)var15, (double)(var20 + var13 + 2), 0.0D, 1.0D, 1.0D);
               var18.a((double)var15, (double)(var20 - 2), 0.0D, 1.0D, 0.0D);
               var18.a((double)var14, (double)(var20 - 2), 0.0D, 0.0D, 0.0D);
               var18.a(0);
               var18.a((double)(var14 + 1), (double)(var20 + var13 + 1), 0.0D, 0.0D, 1.0D);
               var18.a((double)(var15 - 1), (double)(var20 + var13 + 1), 0.0D, 1.0D, 1.0D);
               var18.a((double)(var15 - 1), (double)(var20 - 1), 0.0D, 1.0D, 0.0D);
               var18.a((double)(var14 + 1), (double)(var20 - 1), 0.0D, 0.0D, 0.0D);
               var18.for();
               GL11.glEnable(3553);
            }

            this.a(var11, var9, var20, var13, var18);
         }
      }

      GL11.glDisable(2929);
      byte var19 = 4;
      this.if(0, this.e, 255, 255);
      this.if(this.d, this.long, 255, 255);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      var18.if();
      var18.if(0, 0);
      var18.a((double)this.else, (double)(this.e + var19), 0.0D, 0.0D, 1.0D);
      var18.a((double)this.goto, (double)(this.e + var19), 0.0D, 1.0D, 1.0D);
      var18.if(0, 255);
      var18.a((double)this.goto, (double)this.e, 0.0D, 1.0D, 0.0D);
      var18.a((double)this.else, (double)this.e, 0.0D, 0.0D, 0.0D);
      var18.for();
      var18.if();
      var18.if(0, 255);
      var18.a((double)this.else, (double)this.d, 0.0D, 0.0D, 1.0D);
      var18.a((double)this.goto, (double)this.d, 0.0D, 1.0D, 1.0D);
      var18.if(0, 0);
      var18.a((double)this.goto, (double)(this.d - var19), 0.0D, 1.0D, 0.0D);
      var18.a((double)this.else, (double)(this.d - var19), 0.0D, 0.0D, 0.0D);
      var18.for();
      var20 = this.do();
      if (var20 > 0) {
         var13 = (this.d - this.e) * (this.d - this.e) / this.if();
         if (var13 < 32) {
            var13 = 32;
         }

         if (var13 > this.d - this.e - 8) {
            var13 = this.d - this.e - 8;
         }

         var14 = (int)this.new * (this.d - this.e - var13) / var20 + this.e;
         if (var14 < this.e) {
            var14 = this.e;
         }

         var18.if();
         var18.if(0, 255);
         var18.a((double)var5, (double)this.d, 0.0D, 0.0D, 1.0D);
         var18.a((double)var6, (double)this.d, 0.0D, 1.0D, 1.0D);
         var18.a((double)var6, (double)this.e, 0.0D, 1.0D, 0.0D);
         var18.a((double)var5, (double)this.e, 0.0D, 0.0D, 0.0D);
         var18.for();
         var18.if();
         var18.if(8421504, 255);
         var18.a((double)var5, (double)(var14 + var13), 0.0D, 0.0D, 1.0D);
         var18.a((double)var6, (double)(var14 + var13), 0.0D, 1.0D, 1.0D);
         var18.a((double)var6, (double)var14, 0.0D, 1.0D, 0.0D);
         var18.a((double)var5, (double)var14, 0.0D, 0.0D, 0.0D);
         var18.for();
         var18.if();
         var18.if(12632256, 255);
         var18.a((double)var5, (double)(var14 + var13 - 1), 0.0D, 0.0D, 1.0D);
         var18.a((double)(var6 - 1), (double)(var14 + var13 - 1), 0.0D, 1.0D, 1.0D);
         var18.a((double)(var6 - 1), (double)var14, 0.0D, 1.0D, 0.0D);
         var18.a((double)var5, (double)var14, 0.0D, 0.0D, 0.0D);
         var18.for();
      }

      this.a(var1, var2);
      GL11.glEnable(3553);
      GL11.glShadeModel(7424);
      GL11.glEnable(3008);
      GL11.glDisable(3042);
   }

   protected int a() {
      return this.f / 2 + 124;
   }

   private void if(int var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      this.g.vb.for("/gui/background.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var6 = 32.0F;
      var5.if();
      var5.if(4210752, var4);
      var5.a(0.0D, (double)var2, 0.0D, 0.0D, (double)((float)var2 / var6));
      var5.a((double)this.f, (double)var2, 0.0D, (double)((float)this.f / var6), (double)((float)var2 / var6));
      var5.if(4210752, var3);
      var5.a((double)this.f, (double)var1, 0.0D, (double)((float)this.f / var6), (double)((float)var1 / var6));
      var5.a(0.0D, (double)var1, 0.0D, 0.0D, (double)((float)var1 / var6));
      var5.for();
   }
}
