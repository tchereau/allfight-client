import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class hb {
   private final Minecraft long;
   private final int case;
   private final int byte;
   private final int try;
   private final int new;
   protected final int goto;
   protected int else;
   protected int char;
   private float int = -2.0F;
   private float for;
   private float do;
   private int if = -1;
   private long a = 0L;

   public hb(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      this.long = var1;
      this.byte = var3;
      this.new = var3 + var5;
      this.goto = var6;
      this.case = var2;
      this.try = var2 + var4;
   }

   protected abstract int new();

   protected abstract void a(int var1, boolean var2);

   protected abstract boolean a(int var1);

   protected int do() {
      return this.new() * this.goto;
   }

   protected abstract void for();

   protected abstract void a(int var1, int var2, int var3, int var4, c4 var5);

   private void a() {
      int var1 = this.if();
      if (var1 < 0) {
         var1 = 0;
      }

      if (this.do < 0.0F) {
         this.do = 0.0F;
      }

      if (this.do > (float)var1) {
         this.do = (float)var1;
      }

   }

   public int if() {
      return this.do() - (this.new - this.byte - 4);
   }

   public void a(int var1, int var2, float var3) {
      this.else = var1;
      this.char = var2;
      this.for();
      int var4 = this.new();
      int var5 = this.int();
      int var6 = var5 + 6;
      int var9;
      int var10;
      int var11;
      int var13;
      int var20;
      if (Mouse.isButtonDown(0)) {
         if (this.int == -1.0F) {
            boolean var16 = true;
            if (var2 >= this.byte && var2 <= this.new) {
               int var8 = this.case + 2;
               var9 = this.try - 2;
               var10 = var2 - this.byte + (int)this.do - 4;
               var11 = var10 / this.goto;
               if (var1 >= var8 && var1 <= var9 && var11 >= 0 && var10 >= 0 && var11 < var4) {
                  boolean var12 = var11 == this.if && Minecraft.h1() - this.a < 250L;
                  this.a(var11, var12);
                  this.if = var11;
                  this.a = Minecraft.h1();
               } else if (var1 >= var8 && var1 <= var9 && var10 < 0) {
                  var16 = false;
               }

               if (var1 >= var5 && var1 <= var6) {
                  this.for = -1.0F;
                  var20 = this.if();
                  if (var20 < 1) {
                     var20 = 1;
                  }

                  var13 = (int)((float)((this.new - this.byte) * (this.new - this.byte)) / (float)this.do());
                  if (var13 < 32) {
                     var13 = 32;
                  }

                  if (var13 > this.new - this.byte - 8) {
                     var13 = this.new - this.byte - 8;
                  }

                  this.for /= (float)(this.new - this.byte - var13) / (float)var20;
               } else {
                  this.for = 1.0F;
               }

               if (var16) {
                  this.int = (float)var2;
               } else {
                  this.int = -2.0F;
               }
            } else {
               this.int = -2.0F;
            }
         } else if (this.int >= 0.0F) {
            this.do -= ((float)var2 - this.int) * this.for;
            this.int = (float)var2;
         }
      } else {
         while(true) {
            if (this.long.u1.aV || !Mouse.next()) {
               this.int = -1.0F;
               break;
            }

            int var7 = Mouse.getEventDWheel();
            if (var7 != 0) {
               if (var7 > 0) {
                  var7 = -1;
               } else if (var7 < 0) {
                  var7 = 1;
               }

               this.do += (float)(var7 * this.goto / 2);
            }
         }
      }

      this.a();
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      c4 var18 = c4.G;
      this.long.vb.for("/gui/background.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var17 = 32.0F;
      var18.if();
      var18.a(2105376);
      var18.a((double)this.case, (double)this.new, 0.0D, (double)((float)this.case / var17), (double)((float)(this.new + (int)this.do) / var17));
      var18.a((double)this.try, (double)this.new, 0.0D, (double)((float)this.try / var17), (double)((float)(this.new + (int)this.do) / var17));
      var18.a((double)this.try, (double)this.byte, 0.0D, (double)((float)this.try / var17), (double)((float)(this.byte + (int)this.do) / var17));
      var18.a((double)this.case, (double)this.byte, 0.0D, (double)((float)this.case / var17), (double)((float)(this.byte + (int)this.do) / var17));
      var18.for();
      var9 = this.case + 2;
      var10 = this.byte + 4 - (int)this.do;

      int var14;
      for(var11 = 0; var11 < var4; ++var11) {
         var20 = var10 + var11 * this.goto;
         var13 = this.goto - 4;
         if (var20 + this.goto <= this.new && var20 - 4 >= this.byte) {
            if (this.a(var11)) {
               var14 = this.case + 2;
               int var15 = this.try - 2;
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
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      var18.if();
      var18.if(0, 0);
      var18.a((double)this.case, (double)(this.byte + var19), 0.0D, 0.0D, 1.0D);
      var18.a((double)this.try, (double)(this.byte + var19), 0.0D, 1.0D, 1.0D);
      var18.if(0, 255);
      var18.a((double)this.try, (double)this.byte, 0.0D, 1.0D, 0.0D);
      var18.a((double)this.case, (double)this.byte, 0.0D, 0.0D, 0.0D);
      var18.for();
      var18.if();
      var18.if(0, 255);
      var18.a((double)this.case, (double)this.new, 0.0D, 0.0D, 1.0D);
      var18.a((double)this.try, (double)this.new, 0.0D, 1.0D, 1.0D);
      var18.if(0, 0);
      var18.a((double)this.try, (double)(this.new - var19), 0.0D, 1.0D, 0.0D);
      var18.a((double)this.case, (double)(this.new - var19), 0.0D, 0.0D, 0.0D);
      var18.for();
      var20 = this.if();
      if (var20 > 0) {
         var13 = (this.new - this.byte) * (this.new - this.byte) / this.do();
         if (var13 < 32) {
            var13 = 32;
         }

         if (var13 > this.new - this.byte - 8) {
            var13 = this.new - this.byte - 8;
         }

         var14 = (int)this.do * (this.new - this.byte - var13) / var20 + this.byte;
         if (var14 < this.byte) {
            var14 = this.byte;
         }

         var18.if();
         var18.if(0, 255);
         var18.a((double)var5, (double)this.new, 0.0D, 0.0D, 1.0D);
         var18.a((double)var6, (double)this.new, 0.0D, 1.0D, 1.0D);
         var18.a((double)var6, (double)this.byte, 0.0D, 1.0D, 0.0D);
         var18.a((double)var5, (double)this.byte, 0.0D, 0.0D, 0.0D);
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

      GL11.glEnable(3553);
      GL11.glShadeModel(7424);
      GL11.glEnable(3008);
      GL11.glDisable(3042);
   }

   protected int int() {
      return this.try - 8;
   }
}
