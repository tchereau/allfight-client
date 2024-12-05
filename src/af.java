import java.util.List;
import org.lwjgl.opengl.GL11;

class af extends i3 {
   // $FF: synthetic field
   final ag C;

   public af(ag var1) {
      super(ag.c(var1), var1.hV, var1.hU, 32, var1.hU - 55 + 4, 36);
      this.C = var1;
   }

   protected int new() {
      return ag.goto(this.C).uT.if().size();
   }

   protected void a(int var1, boolean var2) {
      List var3 = ag.new(this.C).uT.if();

      try {
         ag.char(this.C).uT.a((aj)var3.get(var1));
         ag.do(this.C).vb.new();
         ag.void(this.C).vl.case();
      } catch (Exception var5) {
         ag.case(this.C).uT.a((aj)var3.get(0));
         ag.long(this.C).vb.new();
         ag.try(this.C).vl.case();
      }

   }

   protected boolean a(int var1) {
      List var2 = ag.a(this.C).uT.if();
      return ag.for(this.C).uT.int() == var2.get(var1);
   }

   protected int if() {
      return this.new() * 36;
   }

   protected void int() {
      this.C.dx();
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      aj var6 = (aj)ag.b(this.C).uT.if().get(var1);
      var6.if(ag.else(this.C).vb);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var5.if();
      var5.a(16777215);
      var5.a((double)var2, (double)(var3 + var4), 0.0D, 0.0D, 1.0D);
      var5.a((double)(var2 + 32), (double)(var3 + var4), 0.0D, 1.0D, 1.0D);
      var5.a((double)(var2 + 32), (double)var3, 0.0D, 1.0D, 0.0D);
      var5.a((double)var2, (double)var3, 0.0D, 0.0D, 0.0D);
      var5.for();
      String var7 = var6.do();
      if (!var6.int()) {
         var7 = aqj.l + aqz.if("texturePack.incompatible") + " - " + var7;
      }

      if (var7.length() > 32) {
         var7 = var7.substring(0, 32).trim() + "...";
      }

      this.C.if(ag.if(this.C), var7, var2 + 32 + 2, var3 + 1, 16777215);
      this.C.if(ag.int(this.C), var6.if(), var2 + 32 + 2, var3 + 12, 8421504);
      this.C.if(ag.byte(this.C), var6.a(), var2 + 32 + 2, var3 + 12 + 10, 8421504);
   }
}
