import org.lwjgl.opengl.GL11;

public class ju extends jo {
   private final jq hl;
   private final int hk;
   private final int hj;
   private final int hi;
   private final int hh;
   private String hg = "";
   private int hf = 32;
   private int he;
   private boolean hd = true;
   private boolean hc = true;
   private boolean hb = false;
   private boolean ha = true;
   private int g9 = 0;
   private int g8 = 0;
   private int g7 = 0;
   private int g6 = 14737632;
   private int g5 = 7368816;
   private boolean g4 = true;

   public ju(jq var1, int var2, int var3, int var4, int var5) {
      this.hl = var1;
      this.hk = var2;
      this.hj = var3;
      this.hi = var4;
      this.hh = var5;
   }

   public void de() {
      ++this.he;
   }

   public void case(String var1) {
      if (var1.length() > this.hf) {
         this.hg = var1.substring(0, this.hf);
      } else {
         this.hg = var1;
      }

      this.da();
   }

   public String dc() {
      return this.hg;
   }

   public String dd() {
      int var1 = this.g8 < this.g7 ? this.g8 : this.g7;
      int var2 = this.g8 < this.g7 ? this.g7 : this.g8;
      return this.hg.substring(var1, var2);
   }

   public void char(String var1) {
      String var2 = "";
      String var3 = apc.a(var1);
      int var4 = this.g8 < this.g7 ? this.g8 : this.g7;
      int var5 = this.g8 < this.g7 ? this.g7 : this.g8;
      int var6 = this.hf - this.hg.length() - (var4 - this.g7);
      boolean var7 = false;
      if (this.hg.length() > 0) {
         var2 = var2 + this.hg.substring(0, var4);
      }

      int var8;
      if (var6 < var3.length()) {
         var2 = var2 + var3.substring(0, var6);
         var8 = var6;
      } else {
         var2 = var2 + var3;
         var8 = var3.length();
      }

      if (this.hg.length() > 0 && var5 < this.hg.length()) {
         var2 = var2 + this.hg.substring(var5);
      }

      this.hg = var2;
      this.J(var4 - this.g7 + var8);
   }

   public void L(int var1) {
      if (this.hg.length() != 0) {
         if (this.g7 != this.g8) {
            this.char("");
         } else {
            this.Q(this.P(var1) - this.g8);
         }
      }
   }

   public void Q(int var1) {
      if (this.hg.length() != 0) {
         if (this.g7 != this.g8) {
            this.char("");
         } else {
            boolean var2 = var1 < 0;
            int var3 = var2 ? this.g8 + var1 : this.g8;
            int var4 = var2 ? this.g8 : this.g8 + var1;
            String var5 = "";
            if (var3 >= 0) {
               var5 = this.hg.substring(0, var3);
            }

            if (var4 < this.hg.length()) {
               var5 = var5 + this.hg.substring(var4);
            }

            this.hg = var5;
            if (var2) {
               this.J(var1);
            }

         }
      }
   }

   public int P(int var1) {
      return this.case(var1, this.c6());
   }

   public int case(int var1, int var2) {
      return this.a(var1, this.c6(), true);
   }

   public int a(int var1, int var2, boolean var3) {
      int var4 = var2;
      boolean var5 = var1 < 0;
      int var6 = Math.abs(var1);

      for(int var7 = 0; var7 < var6; ++var7) {
         if (!var5) {
            int var8 = this.hg.length();
            var4 = this.hg.indexOf(32, var4);
            if (var4 == -1) {
               var4 = var8;
            } else {
               while(var3 && var4 < var8 && this.hg.charAt(var4) == ' ') {
                  ++var4;
               }
            }
         } else {
            while(var3 && var4 > 0 && this.hg.charAt(var4 - 1) == ' ') {
               --var4;
            }

            while(var4 > 0 && this.hg.charAt(var4 - 1) != ' ') {
               --var4;
            }
         }
      }

      return var4;
   }

   public void J(int var1) {
      this.O(this.g7 + var1);
   }

   public void O(int var1) {
      this.g8 = var1;
      int var2 = this.hg.length();
      if (this.g8 < 0) {
         this.g8 = 0;
      }

      if (this.g8 > var2) {
         this.g8 = var2;
      }

      this.K(this.g8);
   }

   public void c8() {
      this.O(0);
   }

   public void da() {
      this.O(this.hg.length());
   }

   public boolean a(char var1, int var2) {
      if (this.ha && this.hb) {
         switch(var1) {
         case '\u0001':
            this.da();
            this.K(0);
            return true;
         case '\u0003':
            i5.void(this.dd());
            return true;
         case '\u0016':
            this.char(i5.dD());
            return true;
         case '\u0018':
            i5.void(this.dd());
            this.char("");
            return true;
         default:
            switch(var2) {
            case 14:
               if (i5.dC()) {
                  this.L(-1);
               } else {
                  this.Q(-1);
               }

               return true;
            case 199:
               if (i5.dE()) {
                  this.K(0);
               } else {
                  this.c8();
               }

               return true;
            case 203:
               if (i5.dE()) {
                  if (i5.dC()) {
                     this.K(this.case(-1, this.dh()));
                  } else {
                     this.K(this.dh() - 1);
                  }
               } else if (i5.dC()) {
                  this.O(this.P(-1));
               } else {
                  this.J(-1);
               }

               return true;
            case 205:
               if (i5.dE()) {
                  if (i5.dC()) {
                     this.K(this.case(1, this.dh()));
                  } else {
                     this.K(this.dh() + 1);
                  }
               } else if (i5.dC()) {
                  this.O(this.P(1));
               } else {
                  this.J(1);
               }

               return true;
            case 207:
               if (i5.dE()) {
                  this.K(this.hg.length());
               } else {
                  this.da();
               }

               return true;
            case 211:
               if (i5.dC()) {
                  this.L(1);
               } else {
                  this.Q(1);
               }

               return true;
            default:
               if (apc.a(var1)) {
                  this.char(Character.toString(var1));
                  return true;
               } else {
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   public void case(int var1, int var2, int var3) {
      boolean var4 = var1 >= this.hk && var1 < this.hk + this.hi && var2 >= this.hj && var2 < this.hj + this.hh;
      if (this.hc) {
         this.h(this.ha && var4);
      }

      if (this.hb && var3 == 0) {
         int var5 = var1 - this.hk;
         if (this.hd) {
            var5 -= 4;
         }

         String var6 = this.hl.a(this.hg.substring(this.g9), this.c7());
         this.O(this.hl.a(var6, var5).length() + this.g9);
      }

   }

   public void db() {
      if (this.di()) {
         if (this.df()) {
            a(this.hk - 1, this.hj - 1, this.hk + this.hi + 1, this.hj + this.hh + 1, -6250336);
            a(this.hk, this.hj, this.hk + this.hi, this.hj + this.hh, -16777216);
         }

         int var1 = this.ha ? this.g6 : this.g5;
         int var2 = this.g8 - this.g9;
         int var3 = this.g7 - this.g9;
         String var4 = this.hl.a(this.hg.substring(this.g9), this.c7());
         boolean var5 = var2 >= 0 && var2 <= var4.length();
         boolean var6 = this.hb && this.he / 6 % 2 == 0 && var5;
         int var7 = this.hd ? this.hk + 4 : this.hk;
         int var8 = this.hd ? this.hj + (this.hh - 8) / 2 : this.hj;
         int var9 = var7;
         if (var3 > var4.length()) {
            var3 = var4.length();
         }

         if (var4.length() > 0) {
            String var10 = var5 ? var4.substring(0, var2) : var4;
            var9 = this.hl.a(var10, var7, var8, var1);
         }

         boolean var13 = this.g8 < this.hg.length() || this.hg.length() >= this.dg();
         int var11 = var9;
         if (!var5) {
            var11 = var2 > 0 ? var7 + this.hi : var7;
         } else if (var13) {
            var11 = var9 - 1;
            --var9;
         }

         if (var4.length() > 0 && var5 && var2 < var4.length()) {
            this.hl.a(var4.substring(var2), var9, var8, var1);
         }

         if (var6) {
            if (var13) {
               jo.a(var11, var8 - 1, var11 + 1, var8 + 1 + this.hl.i, -3092272);
            } else {
               this.hl.a("_", var11, var8, var1);
            }
         }

         if (var3 != var2) {
            int var12 = var7 + this.hl.for(var4.substring(0, var3));
            this.int(var11, var8 - 1, var12 - 1, var8 + 1 + this.hl.i);
         }

      }
   }

   private void int(int var1, int var2, int var3, int var4) {
      int var5;
      if (var1 < var3) {
         var5 = var1;
         var1 = var3;
         var3 = var5;
      }

      if (var2 < var4) {
         var5 = var2;
         var2 = var4;
         var4 = var5;
      }

      c4 var6 = c4.G;
      GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
      GL11.glDisable(3553);
      GL11.glEnable(3058);
      GL11.glLogicOp(5387);
      var6.if();
      var6.if((double)var1, (double)var4, 0.0D);
      var6.if((double)var3, (double)var4, 0.0D);
      var6.if((double)var3, (double)var2, 0.0D);
      var6.if((double)var1, (double)var2, 0.0D);
      var6.for();
      GL11.glDisable(3058);
      GL11.glEnable(3553);
   }

   public void M(int var1) {
      this.hf = var1;
      if (this.hg.length() > var1) {
         this.hg = this.hg.substring(0, var1);
      }

   }

   public int dg() {
      return this.hf;
   }

   public int c6() {
      return this.g8;
   }

   public boolean df() {
      return this.hd;
   }

   public void j(boolean var1) {
      this.hd = var1;
   }

   public void I(int var1) {
      this.g6 = var1;
   }

   public void N(int var1) {
      this.g5 = var1;
   }

   public void h(boolean var1) {
      if (var1 && !this.hb) {
         this.he = 0;
      }

      this.hb = var1;
   }

   public boolean c9() {
      return this.hb;
   }

   public void k(boolean var1) {
      this.ha = var1;
   }

   public int dh() {
      return this.g7;
   }

   public int c7() {
      return this.df() ? this.hi - 8 : this.hi;
   }

   public void K(int var1) {
      int var2 = this.hg.length();
      if (var1 > var2) {
         var1 = var2;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      this.g7 = var1;
      if (this.hl != null) {
         if (this.g9 > var2) {
            this.g9 = var2;
         }

         int var3 = this.c7();
         String var4 = this.hl.a(this.hg.substring(this.g9), var3);
         int var5 = var4.length() + this.g9;
         if (var1 == this.g9) {
            this.g9 -= this.hl.a(this.hg, var3, true).length();
         }

         if (var1 > var5) {
            this.g9 += var1 - var5;
         } else if (var1 <= this.g9) {
            this.g9 -= this.g9 - var1;
         }

         if (this.g9 < 0) {
            this.g9 = 0;
         }

         if (this.g9 > var2) {
            this.g9 = var2;
         }
      }

   }

   public void i(boolean var1) {
      this.hc = var1;
   }

   public boolean di() {
      return this.g4;
   }

   public void g(boolean var1) {
      this.g4 = var1;
   }
}
