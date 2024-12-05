import net.minecraft.client.Minecraft;

public class e2 extends i5 {
   private e5 iR;
   private boolean iQ = false;
   private final i5 iS;

   public e2(i5 var1, Minecraft var2, eq var3) {
      this.hW = var2;
      this.iS = var1;
      er var4 = er.if(var3.char);
      var2.a((ex)null);
      var2.for(var3);
      this.do(var4.if(), var4.a());
   }

   public e2(i5 var1, Minecraft var2, String var3, int var4) {
      this.hW = var2;
      this.iS = var1;
      var2.a((ex)null);
      this.do(var3, var4);
   }

   private void do(String var1, int var2) {
      this.hW.a().a("Connexion à " + var1 + ", " + var2);
      (new e1(this, var1, var2)).start();
   }

   public void dG() {
      if (this.iR != null) {
         this.iR.char();
      }

   }

   protected void if(char var1, int var2) {
   }

   public void dA() {
      aqy var1 = aqy.if();
      this.hT.clear();
      this.hT.add(new j6(0, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.cancel")));
   }

   protected void a(j6 var1) {
      if (var1.hv == 0) {
         this.iQ = true;
         if (this.iR != null) {
            this.iR.else();
         }

         this.hW.a(this.iS);
      }

   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      aqy var4 = aqy.if();
      if (this.iR == null) {
         this.a(this.hR, var4.a("connect.connecting"), this.hV / 2, this.hU / 2 - 50, 16777215);
         this.a(this.hR, "", this.hV / 2, this.hU / 2 - 10, 16777215);
      } else {
         this.a(this.hR, var4.a("connect.authorizing"), this.hV / 2, this.hU / 2 - 50, 16777215);
         this.a(this.hR, this.iR.B, this.hV / 2, this.hU / 2 - 10, 16777215);
      }

      super.if(var1, var2, var3);
   }

   static e5 a(e2 var0, e5 var1) {
      return var0.iR = var1;
   }

   static Minecraft byte(e2 var0) {
      return var0.hW;
   }

   static boolean new(e2 var0) {
      return var0.iQ;
   }

   static Minecraft do(e2 var0) {
      return var0.hW;
   }

   static e5 int(e2 var0) {
      return var0.iR;
   }

   static i5 if(e2 var0) {
      return var0.iS;
   }

   static Minecraft for(e2 var0) {
      return var0.hW;
   }

   static Minecraft a(e2 var0) {
      return var0.hW;
   }

   static Minecraft try(e2 var0) {
      return var0.hW;
   }
}
