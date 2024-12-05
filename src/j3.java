import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class j3 extends i5 {
   private String nT = "";
   private int nS = -1;
   private boolean nR = false;
   private boolean nQ = false;
   private int nP = 0;
   private List nO = new ArrayList();
   private URI nN = null;
   protected ju nU;
   private String nM = "";

   public j3() {
   }

   public j3(String var1) {
      this.nM = var1;
   }

   public void dA() {
      Keyboard.enableRepeatEvents(true);
      this.nS = this.hW.u4.c5().dq().size();
      this.nU = new ju(this.hR, 4, this.hU - 12, this.hV - 4, 12);
      this.nU.M(100);
      this.nU.j(false);
      this.nU.h(true);
      this.nU.case(this.nM);
      this.nU.i(false);
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
      this.hW.u4.c5().dk();
   }

   public void dG() {
      this.nU.de();
   }

   protected void if(char var1, int var2) {
      this.nQ = false;
      if (var2 == 15) {
         this.eq();
      } else {
         this.nR = false;
      }

      if (var2 == 1) {
         this.hW.a((i5)null);
      } else if (var2 == 28) {
         String var3 = this.nU.dc().trim();
         if (var3.length() > 0) {
            this.hW.u4.c5().goto(var3);
            if (!this.hW.T(var3)) {
               this.hW.vk.try(var3);
            }
         }

         this.hW.a((i5)null);
      } else if (var2 == 200) {
         this.ae(-1);
      } else if (var2 == 208) {
         this.ae(1);
      } else if (var2 == 201) {
         this.hW.u4.c5().T(this.hW.u4.c5().dl() - 1);
      } else if (var2 == 209) {
         this.hW.u4.c5().T(-this.hW.u4.c5().dl() + 1);
      } else {
         this.nU.a(var1, var2);
      }

   }

   public void dw() {
      super.dw();
      int var1 = Mouse.getEventDWheel();
      if (var1 != 0) {
         if (var1 > 1) {
            var1 = 1;
         }

         if (var1 < -1) {
            var1 = -1;
         }

         if (!dE()) {
            var1 *= 7;
         }

         this.hW.u4.c5().T(var1);
      }

   }

   protected void char(int var1, int var2, int var3) {
      if (var3 == 0 && this.hW.u1.Y) {
         jn var4 = this.hW.u4.c5().char(Mouse.getX(), Mouse.getY());
         if (var4 != null) {
            URI var5 = var4.a();
            if (var5 != null) {
               if (this.hW.u1.W) {
                  this.nN = var5;
                  this.hW.a((i5)(new e3(this, var4.do(), 0)));
               } else {
                  this.a(var5);
               }

               return;
            }
         }
      }

      this.nU.case(var1, var2, var3);
      super.char(var1, var2, var3);
   }

   public void do(boolean var1, int var2) {
      if (var2 == 0) {
         if (var1) {
            this.a(this.nN);
         }

         this.nN = null;
         this.hW.a((i5)this);
      }

   }

   private void a(URI var1) {
      try {
         Class var2 = Class.forName("java.awt.Desktop");
         Object var3 = var2.getMethod("getDesktop").invoke((Object)null);
         var2.getMethod("browse", URI.class).invoke(var3, var1);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public void eq() {
      String var3;
      if (this.nR) {
         this.nU.Q(this.nU.a(-1, this.nU.c6(), false) - this.nU.c6());
         if (this.nP >= this.nO.size()) {
            this.nP = 0;
         }
      } else {
         int var1 = this.nU.a(-1, this.nU.c6(), false);
         this.nO.clear();
         this.nP = 0;
         String var2 = this.nU.dc().substring(var1).toLowerCase();
         var3 = this.nU.dc().substring(0, this.nU.c6());
         this.if(var3, var2);
         if (this.nO.isEmpty()) {
            return;
         }

         this.nR = true;
         this.nU.Q(var1 - this.nU.c6());
      }

      if (this.nO.size() > 1) {
         StringBuilder var4 = new StringBuilder();

         for(Iterator var5 = this.nO.iterator(); var5.hasNext(); var4.append(var3)) {
            var3 = (String)var5.next();
            if (var4.length() > 0) {
               var4.append(", ");
            }
         }

         this.hW.u4.c5().a(var4.toString(), 1);
      }

      this.nU.char((String)this.nO.get(this.nP++));
   }

   private void if(String var1, String var2) {
      if (var1.length() >= 1) {
         this.hW.vk.gF.for((an7)(new aph(var1)));
         this.nQ = true;
      }
   }

   public void ae(int var1) {
      int var2 = this.nS + var1;
      int var3 = this.hW.u4.c5().dq().size();
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 > var3) {
         var2 = var3;
      }

      if (var2 != this.nS) {
         if (var2 == var3) {
            this.nS = var3;
            this.nU.case(this.nT);
         } else {
            if (this.nS == var3) {
               this.nT = this.nU.dc();
            }

            this.nU.case((String)this.hW.u4.c5().dq().get(var2));
            this.nS = var2;
         }
      }
   }

   public void if(int var1, int var2, float var3) {
      a(2, this.hU - 14, this.hV - 2, this.hU - 2, Integer.MIN_VALUE);
      this.nU.db();
      super.if(var1, var2, var3);
   }

   public void a(String[] var1) {
      if (this.nQ) {
         this.nO.clear();
         String[] var2 = var1;
         int var3 = var1.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var2[var4];
            if (var5.length() > 0) {
               this.nO.add(var5);
            }
         }

         if (this.nO.size() > 0) {
            this.nR = true;
            this.eq();
         }
      }

   }

   public boolean dy() {
      return false;
   }
}
