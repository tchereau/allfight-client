import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class jk extends i3 {
   // $FF: synthetic field
   final jl z;

   public jk(jl var1) {
      super(var1.hW, var1.hV, var1.hU, 32, var1.hU - 64, 36);
      this.z = var1;
   }

   protected int new() {
      return jl.for(this.z).do() + jl.int(this.z).size() + 1;
   }

   protected void a(int var1, boolean var2) {
      if (var1 < jl.for(this.z).do() + jl.int(this.z).size()) {
         int var3 = jl.new(this.z);
         jl.a(this.z, var1);
         eq var4 = jl.for(this.z).do() > var1 ? jl.for(this.z).a(var1) : null;
         boolean var5 = jl.new(this.z) >= 0 && jl.new(this.z) < this.new() && (var4 == null || var4.new == 60);
         boolean var6 = jl.new(this.z) < jl.for(this.z).do();
         jl.a(this.z).hu = var5;
         jl.if(this.z).hu = var6;
         jl.do(this.z).hu = var6;
         if (var2 && var5) {
            jl.if(this.z, var1);
         } else if (var6 && i5.dE() && var3 >= 0 && var3 < jl.for(this.z).do()) {
            jl.for(this.z).a(var3, jl.new(this.z));
         }

      }
   }

   protected boolean a(int var1) {
      return var1 == jl.new(this.z);
   }

   protected int if() {
      return this.new() * 36;
   }

   protected void int() {
      this.z.dx();
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      if (var1 < jl.for(this.z).do()) {
         this.for(var1, var2, var3, var4, var5);
      } else if (var1 < jl.for(this.z).do() + jl.int(this.z).size()) {
         this.int(var1, var2, var3, var4, var5);
      } else {
         this.do(var1, var2, var3, var4, var5);
      }

   }

   private void int(int var1, int var2, int var3, int var4, c4 var5) {
      ar var6 = (ar)jl.int(this.z).get(var1 - jl.for(this.z).do());
      this.z.if(this.z.hR, aqz.if("lanServer.title"), var2 + 2, var3 + 1, 16777215);
      this.z.if(this.z.hR, var6.do(), var2 + 2, var3 + 12, 8421504);
      if (this.z.hW.u1.P) {
         this.z.if(this.z.hR, aqz.if("selectServer.hiddenAddress"), var2 + 2, var3 + 12 + 11, 3158064);
      } else {
         this.z.if(this.z.hR, var6.if(), var2 + 2, var3 + 12 + 11, 3158064);
      }

   }

   private void do(int var1, int var2, int var3, int var4, c4 var5) {
      this.z.a(this.z.hR, aqz.if("lanServer.scanning"), this.z.hV / 2, var3 + 1, 16777215);
      String var6;
      switch(jl.try(this.z) / 3 % 4) {
      case 0:
      default:
         var6 = "O o o";
         break;
      case 1:
      case 3:
         var6 = "o O o";
         break;
      case 2:
         var6 = "o o O";
      }

      this.z.a(this.z.hR, var6, this.z.hV / 2, var3 + 12, 8421504);
   }

   private void for(int var1, int var2, int var3, int var4, c4 var5) {
      eq var6 = jl.for(this.z).a(var1);
      synchronized(jl.ec()) {
         if (jl.eb() < 5 && !var6.for) {
            var6.for = true;
            var6.try = -2L;
            var6.byte = "";
            var6.case = "";
            jl.ed();
            (new jj(this, var6)).start();
         }
      }

      boolean var7 = var6.new > 60;
      boolean var8 = var6.new < 60;
      boolean var9 = var7 || var8;
      this.z.if(this.z.hR, var6.else, var2 + 2, var3 + 1, 16777215);
      this.z.if(this.z.hR, var6.byte, var2 + 2, var3 + 12, 8421504);
      this.z.if(this.z.hR, var6.case, var2 + 215 - this.z.hR.for(var6.case), var3 + 12, 8421504);
      if (var9) {
         String var10 = aqj.l + var6.int;
         this.z.if(this.z.hR, var10, var2 + 200 - this.z.hR.for(var10), var3 + 1, 8421504);
      }

      if (!this.z.hW.u1.P && !var6.a()) {
         this.z.if(this.z.hR, var6.char, var2 + 2, var3 + 12 + 11, 3158064);
      } else {
         this.z.if(this.z.hR, aqz.if("selectServer.hiddenAddress"), var2 + 2, var3 + 12 + 11, 3158064);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.z.hW.vb.for("/gui/icons.png");
      byte var15 = 0;
      boolean var11 = false;
      String var12 = "";
      int var16;
      if (var9) {
         var12 = var7 ? "Client out of date!" : "Server out of date!";
         var16 = 5;
      } else if (var6.for && var6.try != -2L) {
         if (var6.try < 0L) {
            var16 = 5;
         } else if (var6.try < 150L) {
            var16 = 0;
         } else if (var6.try < 300L) {
            var16 = 1;
         } else if (var6.try < 600L) {
            var16 = 2;
         } else if (var6.try < 1000L) {
            var16 = 3;
         } else {
            var16 = 4;
         }

         if (var6.try < 0L) {
            var12 = "(no connection)";
         } else {
            var12 = var6.try + "ms";
         }
      } else {
         var15 = 1;
         var16 = (int)(Minecraft.h1() / 100L + (long)(var1 * 2) & 7L);
         if (var16 > 4) {
            var16 = 8 - var16;
         }

         var12 = "Polling..";
      }

      this.z.if(var2 + 205, var3, 0 + var15 * 10, 176 + var16 * 8, 10, 8);
      byte var13 = 4;
      if (this.b >= var2 + 205 - var13 && this.void >= var3 - var13 && this.b <= var2 + 205 + 10 + var13 && this.void <= var3 + 8 + var13) {
         jl.a(this.z, var12);
      }

   }
}
