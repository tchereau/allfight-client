public class ac4 extends abr {
   private static final int[] dS = new int[]{11, 16, 15, 13};
   private static final String[] dR = new String[]{"helmetCloth_overlay", "chestplateCloth_overlay", "leggingsCloth_overlay", "bootsCloth_overlay"};
   public static final String[] dW = new String[]{"slot_empty_helmet", "slot_empty_chestplate", "slot_empty_leggings", "slot_empty_boots"};
   private static final aq8 dQ = new ac3();
   public final int dV;
   public final int dU;
   public final int dT;
   private final ac1 dP;
   private ajd dO;
   private ajd dN;

   public ac4(int var1, ac1 var2, int var3, int var4) {
      super(var1);
      this.dP = var2;
      this.dV = var4;
      this.dT = var3;
      this.dU = var2.if(var4);
      this.for(var2.a(var4));
      this.y = 1;
      this.a(acn.case);
      rh.er.a(this, dQ);
   }

   public int a(abp var1, int var2) {
      if (var2 > 0) {
         return 16777215;
      } else {
         int var3 = this.void(var1);
         if (var3 < 0) {
            var3 = 16777215;
         }

         return var3;
      }
   }

   public boolean do() {
      return this.dP == ac1.long;
   }

   public int d() {
      return this.dP.if();
   }

   public ac1 y() {
      return this.dP;
   }

   public boolean c(abp var1) {
      if (this.dP != ac1.long) {
         return false;
      } else if (!var1.a()) {
         return false;
      } else if (!var1.b().try("display")) {
         return false;
      } else {
         return var1.b().char("display").try("color");
      }
   }

   public int void(abp var1) {
      if (this.dP != ac1.long) {
         return -1;
      } else {
         aqv var2 = var1.b();
         if (var2 == null) {
            return 10511680;
         } else {
            aqv var3 = var2.char("display");
            if (var3 == null) {
               return 10511680;
            } else {
               return var3.try("color") ? var3.goto("color") : 10511680;
            }
         }
      }
   }

   public ajd a(int var1, int var2) {
      return var2 == 1 ? this.dO : super.a(var1, var2);
   }

   public void b(abp var1) {
      if (this.dP == ac1.long) {
         aqv var2 = var1.b();
         if (var2 != null) {
            aqv var3 = var2.char("display");
            if (var3.try("color")) {
               var3.do("color");
            }

         }
      }
   }

   public void if(abp var1, int var2) {
      if (this.dP != ac1.long) {
         throw new UnsupportedOperationException("Can't dye non-leather!");
      } else {
         aqv var3 = var1.b();
         if (var3 == null) {
            var3 = new aqv();
            var1.do(var3);
         }

         aqv var4 = var3.char("display");
         if (!var3.try("display")) {
            var3.a("display", var4);
         }

         var4.a("color", var2);
      }
   }

   public boolean a(abp var1, abp var2) {
      return this.dP.a() == var2.new ? true : super.a(var1, var2);
   }

   public void a(ajc var1) {
      super.a(var1);
      if (this.dP == ac1.long) {
         this.dO = var1.a(dR[this.dV]);
      }

      this.dN = var1.a(dW[this.dV]);
   }

   public abp a(abp var1, y6 var2, aek var3) {
      int var4 = aig.case(var1) - 1;
      abp var5 = var3.s(var4);
      if (var5 == null) {
         var3.do(var4, var1.n());
         var1.if = 0;
      }

      return var1;
   }

   public static ajd else(int var0) {
      switch(var0) {
      case 0:
         return abr.bM.dN;
      case 1:
         return abr.bK.dN;
      case 2:
         return abr.bI.dN;
      case 3:
         return abr.bF.dN;
      default:
         return null;
      }
   }

   // $FF: synthetic method
   static int[] z() {
      return dS;
   }
}
