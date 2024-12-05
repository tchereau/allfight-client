import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class ie extends i5 {
   private final aek kW;
   private final abp kV;
   private final boolean kU;
   private boolean kT;
   private boolean kS;
   private int kR;
   private int kQ = 192;
   private int kO = 192;
   private int kN = 1;
   private int kM;
   private aqm kL;
   private String kK = "";
   private id kJ;
   private id kI;
   private j6 kH;
   private j6 kG;
   private j6 kF;
   private j6 kP;

   public ie(aek var1, abp var2, boolean var3) {
      this.kW = var1;
      this.kV = var2;
      this.kU = var3;
      if (var2.a()) {
         aqv var4 = var2.b();
         this.kL = var4.void("pages");
         if (this.kL != null) {
            this.kL = (aqm)this.kL.do();
            this.kN = this.kL.for();
            if (this.kN < 1) {
               this.kN = 1;
            }
         }
      }

      if (this.kL == null && var3) {
         this.kL = new aqm("pages");
         this.kL.a((aqd)(new aqf("1", "")));
         this.kN = 1;
      }

   }

   public void dG() {
      super.dG();
      ++this.kR;
   }

   public void dA() {
      this.hT.clear();
      Keyboard.enableRepeatEvents(true);
      if (this.kU) {
         this.hT.add(this.kG = new j6(3, this.hV / 2 - 100, 4 + this.kO, 98, 20, aqz.if("book.signButton")));
         this.hT.add(this.kH = new j6(0, this.hV / 2 + 2, 4 + this.kO, 98, 20, aqz.if("gui.done")));
         this.hT.add(this.kF = new j6(5, this.hV / 2 - 100, 4 + this.kO, 98, 20, aqz.if("book.finalizeButton")));
         this.hT.add(this.kP = new j6(4, this.hV / 2 + 2, 4 + this.kO, 98, 20, aqz.if("gui.cancel")));
      } else {
         this.hT.add(this.kH = new j6(0, this.hV / 2 - 100, 4 + this.kO, 200, 20, aqz.if("gui.done")));
      }

      int var1 = (this.hV - this.kQ) / 2;
      byte var2 = 2;
      this.hT.add(this.kJ = new id(1, var1 + 120, var2 + 154, true));
      this.hT.add(this.kI = new id(2, var1 + 38, var2 + 154, false));
      this.d0();
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   private void d0() {
      this.kJ.ht = !this.kS && (this.kM < this.kN - 1 || this.kU);
      this.kI.ht = !this.kS && this.kM > 0;
      this.kH.ht = !this.kU || !this.kS;
      if (this.kU) {
         this.kG.ht = !this.kS;
         this.kP.ht = this.kS;
         this.kF.ht = this.kS;
         this.kF.hu = this.kK.trim().length() > 0;
      }

   }

   private void o(boolean var1) {
      if (this.kU && this.kT) {
         if (this.kL != null) {
            while(this.kL.for() > 1) {
               aqf var2 = (aqf)this.kL.a(this.kL.for() - 1);
               if (var2.do != null && var2.do.length() != 0) {
                  break;
               }

               this.kL.if(this.kL.for() - 1);
            }

            if (this.kV.a()) {
               aqv var7 = this.kV.b();
               var7.a("pages", (aqd)this.kL);
            } else {
               this.kV.a((String)"pages", (aqd)this.kL);
            }

            String var8 = "MC|BEdit";
            if (var1) {
               var8 = "MC|BSign";
               this.kV.a((String)"author", (aqd)(new aqf("author", this.kW.fJ)));
               this.kV.a((String)"title", (aqd)(new aqf("title", this.kK.trim())));
               this.kV.new = abr.bR.A;
            }

            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4 = new DataOutputStream(var3);

            try {
               an7.a(this.kV, var4);
               this.hW.hU().for((an7)(new aov(var8, var3.toByteArray())));
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }

      }
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 0) {
            this.hW.a((i5)null);
            this.o(false);
         } else if (var1.hv == 3 && this.kU) {
            this.kS = true;
         } else if (var1.hv == 1) {
            if (this.kM < this.kN - 1) {
               ++this.kM;
            } else if (this.kU) {
               this.dZ();
               if (this.kM < this.kN - 1) {
                  ++this.kM;
               }
            }
         } else if (var1.hv == 2) {
            if (this.kM > 0) {
               --this.kM;
            }
         } else if (var1.hv == 5 && this.kS) {
            this.o(true);
            this.hW.a((i5)null);
         } else if (var1.hv == 4 && this.kS) {
            this.kS = false;
         }

         this.d0();
      }
   }

   private void dZ() {
      if (this.kL != null && this.kL.for() < 50) {
         this.kL.a((aqd)(new aqf("" + (this.kN + 1), "")));
         ++this.kN;
         this.kT = true;
      }
   }

   protected void if(char var1, int var2) {
      super.if(var1, var2);
      if (this.kU) {
         if (this.kS) {
            this.do(var1, var2);
         } else {
            this.for(var1, var2);
         }

      }
   }

   private void for(char var1, int var2) {
      switch(var1) {
      case '\u0016':
         this.h(i5.dD());
         return;
      default:
         switch(var2) {
         case 14:
            String var3 = this.dY();
            if (var3.length() > 0) {
               this.i(var3.substring(0, var3.length() - 1));
            }

            return;
         case 28:
            this.h("\n");
            return;
         default:
            if (apc.a(var1)) {
               this.h(Character.toString(var1));
            }
         }
      }
   }

   private void do(char var1, int var2) {
      switch(var2) {
      case 14:
         if (this.kK.length() > 0) {
            this.kK = this.kK.substring(0, this.kK.length() - 1);
            this.d0();
         }

         return;
      case 28:
         if (this.kK.length() > 0) {
            this.o(true);
            this.hW.a((i5)null);
         }

         return;
      default:
         if (this.kK.length() < 16 && apc.a(var1)) {
            this.kK = this.kK + Character.toString(var1);
            this.d0();
            this.kT = true;
         }
      }
   }

   private String dY() {
      if (this.kL != null && this.kM >= 0 && this.kM < this.kL.for()) {
         aqf var1 = (aqf)this.kL.a(this.kM);
         return var1.toString();
      } else {
         return "";
      }
   }

   private void i(String var1) {
      if (this.kL != null && this.kM >= 0 && this.kM < this.kL.for()) {
         aqf var2 = (aqf)this.kL.a(this.kM);
         var2.do = var1;
         this.kT = true;
      }

   }

   private void h(String var1) {
      String var2 = this.dY();
      String var3 = var2 + var1;
      int var4 = this.hR.for(var3 + "" + aqj.p + "_", 118);
      if (var4 <= 118 && var3.length() < 256) {
         this.i(var3);
      }

   }

   public void if(int var1, int var2, float var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/book.png");
      int var4 = (this.hV - this.kQ) / 2;
      byte var5 = 2;
      this.if(var4, var5, 0, 0, this.kQ, this.kO);
      String var6;
      String var7;
      int var8;
      if (this.kS) {
         var6 = this.kK;
         if (this.kU) {
            if (this.kR / 6 % 2 == 0) {
               var6 = var6 + "" + aqj.p + "_";
            } else {
               var6 = var6 + "" + aqj.i + "_";
            }
         }

         var7 = aqz.if("book.editTitle");
         var8 = this.hR.for(var7);
         this.hR.if(var7, var4 + 36 + (116 - var8) / 2, var5 + 16 + 16, 0);
         int var9 = this.hR.for(var6);
         this.hR.if(var6, var4 + 36 + (116 - var9) / 2, var5 + 48, 0);
         String var10 = String.format(aqz.if("book.byAuthor"), this.kW.fJ);
         int var11 = this.hR.for(var10);
         this.hR.if(aqj.h + var10, var4 + 36 + (116 - var11) / 2, var5 + 48 + 10, 0);
         String var12 = aqz.if("book.finalizeWarning");
         this.hR.a(var12, var4 + 36, var5 + 80, 116, 0);
      } else {
         var6 = String.format(aqz.if("book.pageIndicator"), this.kM + 1, this.kN);
         var7 = "";
         if (this.kL != null && this.kM >= 0 && this.kM < this.kL.for()) {
            aqf var13 = (aqf)this.kL.a(this.kM);
            var7 = var13.toString();
         }

         if (this.kU) {
            if (this.hR.new()) {
               var7 = var7 + "_";
            } else if (this.kR / 6 % 2 == 0) {
               var7 = var7 + "" + aqj.p + "_";
            } else {
               var7 = var7 + "" + aqj.i + "_";
            }
         }

         var8 = this.hR.for(var6);
         this.hR.if(var6, var4 - var8 + this.kQ - 44, var5 + 16, 0);
         this.hR.a(var7, var4 + 36, var5 + 16 + 16, 116, 0);
      }

      super.if(var1, var2, var3);
   }
}
