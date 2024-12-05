import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class g5 extends i3 {
   // $FF: synthetic field
   final g8 h;

   public g5(g8 var1) {
      super(g8.b(var1), var1.hV, var1.hU, 32, var1.hU - 64, 36);
      this.h = var1;
   }

   protected int new() {
      return g8.if(this.h).size() + 1;
   }

   protected void a(int var1, boolean var2) {
      if (var1 < g8.if(this.h).size()) {
         g8.if(this.h, var1);
         gm var3 = (gm)g8.if(this.h).get(g8.do(this.h));
         g8.goto(this.h).hu = g8.char(this.h).vg.if.equals(var3.c);
         g8.for(this.h).hu = var3.d.equals("OPEN") && !var3.long;
         if (var2 && g8.for(this.h).hu) {
            g8.do(this.h, g8.do(this.h));
         }

      }
   }

   protected boolean a(int var1) {
      return var1 == g8.do(this.h);
   }

   protected int if() {
      return this.new() * 36;
   }

   protected void int() {
      this.h.dx();
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      if (var1 < g8.if(this.h).size()) {
         this.if(var1, var2, var3, var4, var5);
      }

   }

   private void if(int var1, int var2, int var3, int var4, c4 var5) {
      gm var6 = (gm)g8.if(this.h).get(var1);
      this.h.if(g8.void(this.h), var6.a(), var2 + 2, var3 + 1, 16777215);
      short var7 = 207;
      byte var8 = 1;
      if (var6.long) {
         g8.do(this.h, var2 + var7, var3 + var8, this.b, this.void);
      } else if (var6.d.equals("CLOSED")) {
         g8.if(this.h, var2 + var7, var3 + var8, this.b, this.void);
      } else {
         g8.a(this.h, var2 + var7, var3 + var8, this.b, this.void);
         this.a(var1, var2 - 14, var3, var6);
      }

      this.h.if(g8.else(this.h), var6.if(), var2 + 2, var3 + 12, 7105644);
      this.h.if(g8.try(this.h), var6.c, var2 + 2, var3 + 12 + 11, 5000268);
   }

   private void a(int var1, int var2, int var3, gm var4) {
      if (var4.void != null) {
         synchronized(g8.dL()) {
            if (g8.dJ() < 5 && (!var4.case || var4.byte)) {
               (new g2(this, var4)).start();
            }
         }

         boolean var5 = var4.goto > 60;
         boolean var6 = var4.goto < 60;
         boolean var7 = var5 || var6;
         if (var4.char != null) {
            this.h.if(g8.a(this.h), var4.char, var2 + 215 - g8.long(this.h).for(var4.char), var3 + 12, 8421504);
         }

         if (var7) {
            String var8 = aqj.l + var4.else;
            this.h.if(g8.byte(this.h), var8, var2 + 200 - g8.int(this.h).for(var8), var3 + 1, 8421504);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         g8.new(this.h).vb.for("/gui/icons.png");
         byte var13 = 0;
         boolean var9 = false;
         String var10 = "";
         int var14;
         if (var7) {
            var10 = var5 ? "Client out of date!" : "Server out of date!";
            var14 = 5;
         } else if (var4.case && var4.try != -2L) {
            if (var4.try < 0L) {
               var14 = 5;
            } else if (var4.try < 150L) {
               var14 = 0;
            } else if (var4.try < 300L) {
               var14 = 1;
            } else if (var4.try < 600L) {
               var14 = 2;
            } else if (var4.try < 1000L) {
               var14 = 3;
            } else {
               var14 = 4;
            }

            if (var4.try < 0L) {
               var10 = "(no connection)";
               var4.case = false;
            } else {
               var10 = var4.try + "ms";
            }
         } else {
            var13 = 1;
            var14 = (int)(Minecraft.h1() / 100L + (long)(var1 * 2) & 7L);
            if (var14 > 4) {
               var14 = 8 - var14;
            }

            var10 = "Polling..";
         }

         this.h.if(var2 + 205, var3, var13 * 10, 176 + var14 * 8, 10, 8);
         byte var11 = 4;
         if (this.b >= var2 + 205 - var11 && this.void >= var3 - var11 && this.b <= var2 + 205 + 10 + var11 && this.void <= var3 + 8 + var11) {
            g8.a(this.h, var10);
         }

      }
   }
}
