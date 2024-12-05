import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

public class i2 extends i5 {
   private final DateFormat lM = new SimpleDateFormat();
   protected i5 lP;
   protected String lN = "Select world";
   private boolean lL = false;
   private int lK;
   private List lJ;
   private i1 lI;
   private String lH;
   private String lG;
   private String[] lU = new String[3];
   private boolean lT;
   private j6 lS;
   private j6 lR;
   private j6 lQ;
   private j6 lO;

   public i2(i5 var1) {
      this.lP = var1;
   }

   public void dA() {
      aqy var1 = aqy.if();
      this.lN = var1.a("selectWorld.title");

      try {
         this.d5();
      } catch (sh var3) {
         var3.printStackTrace();
         this.hW.a((i5)(new jr("Unable to load words", var3.getMessage())));
         return;
      }

      this.lH = var1.a("selectWorld.world");
      this.lG = var1.a("selectWorld.conversion");
      this.lU[yz.a.new()] = var1.a("gameMode.survival");
      this.lU[yz.try.new()] = var1.a("gameMode.creative");
      this.lU[yz.new.new()] = var1.a("gameMode.adventure");
      this.lI = new i1(this);
      this.lI.a(this.hT, 4, 5);
      this.d4();
   }

   private void d5() {
      sg var1 = this.hW.im();
      this.lJ = var1.if();
      Collections.sort(this.lJ);
      this.lK = -1;
   }

   protected String Z(int var1) {
      return ((sf)this.lJ.get(var1)).try();
   }

   protected String ab(int var1) {
      String var2 = ((sf)this.lJ.get(var1)).int();
      if (var2 == null || ajs.a(var2)) {
         aqy var3 = aqy.if();
         var2 = var3.a("selectWorld.world") + " " + (var1 + 1);
      }

      return var2;
   }

   public void d4() {
      aqy var1 = aqy.if();
      this.hT.add(this.lR = new j6(1, this.hV / 2 - 154, this.hU - 52, 150, 20, var1.a("selectWorld.select")));
      this.hT.add(new j6(3, this.hV / 2 + 4, this.hU - 52, 150, 20, var1.a("selectWorld.create")));
      this.hT.add(this.lQ = new j6(6, this.hV / 2 - 154, this.hU - 28, 72, 20, var1.a("selectWorld.rename")));
      this.hT.add(this.lS = new j6(2, this.hV / 2 - 76, this.hU - 28, 72, 20, var1.a("selectWorld.delete")));
      this.hT.add(this.lO = new j6(7, this.hV / 2 + 4, this.hU - 28, 72, 20, var1.a("selectWorld.recreate")));
      this.hT.add(new j6(0, this.hV / 2 + 82, this.hU - 28, 72, 20, var1.a("gui.cancel")));
      this.lR.hu = false;
      this.lS.hu = false;
      this.lQ.hu = false;
      this.lO.hu = false;
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 2) {
            String var2 = this.ab(this.lK);
            if (var2 != null) {
               this.lT = true;
               j2 var3 = a(this, var2, this.lK);
               this.hW.a((i5)var3);
            }
         } else if (var1.hv == 1) {
            this.aa(this.lK);
         } else if (var1.hv == 3) {
            this.hW.a((i5)(new jy(this)));
         } else if (var1.hv == 6) {
            this.hW.a((i5)(new i6(this, this.Z(this.lK))));
         } else if (var1.hv == 0) {
            this.hW.a(this.lP);
         } else if (var1.hv == 7) {
            jy var5 = new jy(this);
            si var6 = this.hW.im().a(this.Z(this.lK), false);
            ss var4 = var6.int();
            var6.do();
            var5.a(var4);
            this.hW.a((i5)var5);
         } else {
            this.lI.a(var1);
         }

      }
   }

   public void aa(int var1) {
      this.hW.a((i5)null);
      if (!this.lL) {
         this.lL = true;
         String var2 = this.Z(var1);
         if (var2 == null) {
            var2 = "World" + var1;
         }

         String var3 = this.ab(var1);
         if (var3 == null) {
            var3 = "World" + var1;
         }

         if (this.hW.im().if(var2)) {
            this.hW.a(var2, var3, (y0)null);
         }

      }
   }

   public void do(boolean var1, int var2) {
      if (this.lT) {
         this.lT = false;
         if (var1) {
            sg var3 = this.hW.im();
            var3.a();
            var3.for(this.Z(var2));

            try {
               this.d5();
            } catch (sh var5) {
               var5.printStackTrace();
            }
         }

         this.hW.a((i5)this);
      }

   }

   public void if(int var1, int var2, float var3) {
      this.lI.a(var1, var2, var3);
      this.a(this.hR, this.lN, this.hV / 2, 20, 16777215);
      super.if(var1, var2, var3);
   }

   public static j2 a(i5 var0, String var1, int var2) {
      aqy var3 = aqy.if();
      String var4 = var3.a("selectWorld.deleteQuestion");
      String var5 = "'" + var1 + "' " + var3.a("selectWorld.deleteWarning");
      String var6 = var3.a("selectWorld.deleteButton");
      String var7 = var3.a("gui.cancel");
      j2 var8 = new j2(var0, var4, var5, var6, var7, var2);
      return var8;
   }

   // $FF: synthetic method
   static List case(i2 var0) {
      return var0.lJ;
   }

   // $FF: synthetic method
   static int a(i2 var0, int var1) {
      return var0.lK = var1;
   }

   // $FF: synthetic method
   static int if(i2 var0) {
      return var0.lK;
   }

   // $FF: synthetic method
   static j6 for(i2 var0) {
      return var0.lR;
   }

   // $FF: synthetic method
   static j6 try(i2 var0) {
      return var0.lS;
   }

   // $FF: synthetic method
   static j6 byte(i2 var0) {
      return var0.lQ;
   }

   // $FF: synthetic method
   static j6 new(i2 var0) {
      return var0.lO;
   }

   // $FF: synthetic method
   static String a(i2 var0) {
      return var0.lH;
   }

   // $FF: synthetic method
   static DateFormat char(i2 var0) {
      return var0.lM;
   }

   // $FF: synthetic method
   static String do(i2 var0) {
      return var0.lG;
   }

   // $FF: synthetic method
   static String[] int(i2 var0) {
      return var0.lU;
   }
}
