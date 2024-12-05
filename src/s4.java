public class s4 {
   private yy if;
   private s7 a = new s7();
   private ajy byte = new ajy();
   private s6[] try = new s6[32];
   private boolean new;
   private boolean int;
   private boolean for;
   private boolean do;

   public s4(yy var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.if = var1;
      this.new = var2;
      this.int = var3;
      this.for = var4;
      this.do = var5;
   }

   public s5 a(aiw var1, aiw var2, float var3) {
      return this.a(var1, var2.al, var2.aZ.a, var2.aj, var3);
   }

   public s5 a(aiw var1, int var2, int var3, int var4, float var5) {
      return this.a(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var5);
   }

   private s5 a(aiw var1, double var2, double var4, double var6, float var8) {
      this.a.do();
      this.byte.if();
      boolean var9 = this.for;
      int var10 = ajs.a(var1.aZ.a + 0.5D);
      if (this.do && var1.ap()) {
         var10 = (int)var1.aZ.a;

         for(int var11 = this.if.new(ajs.a(var1.al), var10, ajs.a(var1.aj)); var11 == pa.bb.void || var11 == pa.ba.void; var11 = this.if.new(ajs.a(var1.al), var10, ajs.a(var1.aj))) {
            ++var10;
         }

         var9 = this.for;
         this.for = false;
      } else {
         var10 = ajs.a(var1.aZ.a + 0.5D);
      }

      s6 var15 = this.a(ajs.a(var1.aZ.if), var10, ajs.a(var1.aZ.try));
      s6 var12 = this.a(ajs.a(var2 - (double)(var1.aP / 2.0F)), ajs.a(var4), ajs.a(var6 - (double)(var1.aP / 2.0F)));
      s6 var13 = new s6(ajs.new(var1.aP + 1.0F), ajs.new(var1.aO + 1.0F), ajs.new(var1.aP + 1.0F));
      s5 var14 = this.if(var1, var15, var12, var13, var8);
      this.for = var9;
      return var14;
   }

   private s5 if(aiw var1, s6 var2, s6 var3, s6 var4, float var5) {
      var2.new = 0.0F;
      var2.int = var2.a(var3);
      var2.for = var2.int;
      this.a.do();
      this.a.a(var2);
      s6 var6 = var2;

      while(!this.a.a()) {
         s6 var7 = this.a.if();
         if (var7.equals(var3)) {
            return this.a(var2, var3);
         }

         if (var7.a(var3) < var6.a(var3)) {
            var6 = var7;
         }

         var7.if = true;
         int var8 = this.a(var1, var7, var4, var3, var5);

         for(int var9 = 0; var9 < var8; ++var9) {
            s6 var10 = this.try[var9];
            float var11 = var7.new + var7.a(var10);
            if (!var10.a() || var11 < var10.new) {
               var10.do = var7;
               var10.new = var11;
               var10.int = var10.a(var3);
               if (var10.a()) {
                  this.a.a(var10, var10.new + var10.int);
               } else {
                  var10.for = var10.new + var10.int;
                  this.a.a(var10);
               }
            }
         }
      }

      if (var6 == var2) {
         return null;
      } else {
         return this.a(var2, var6);
      }
   }

   private int a(aiw var1, s6 var2, s6 var3, s6 var4, float var5) {
      int var6 = 0;
      byte var7 = 0;
      if (this.a(var1, var2.char, var2.case + 1, var2.byte, var3) == 1) {
         var7 = 1;
      }

      s6 var8 = this.a(var1, var2.char, var2.case, var2.byte + 1, var3, var7);
      s6 var9 = this.a(var1, var2.char - 1, var2.case, var2.byte, var3, var7);
      s6 var10 = this.a(var1, var2.char + 1, var2.case, var2.byte, var3, var7);
      s6 var11 = this.a(var1, var2.char, var2.case, var2.byte - 1, var3, var7);
      if (var8 != null && !var8.if && var8.if(var4) < var5) {
         this.try[var6++] = var8;
      }

      if (var9 != null && !var9.if && var9.if(var4) < var5) {
         this.try[var6++] = var9;
      }

      if (var10 != null && !var10.if && var10.if(var4) < var5) {
         this.try[var6++] = var10;
      }

      if (var11 != null && !var11.if && var11.if(var4) < var5) {
         this.try[var6++] = var11;
      }

      return var6;
   }

   private s6 a(aiw var1, int var2, int var3, int var4, s6 var5, int var6) {
      s6 var7 = null;
      int var8 = this.a(var1, var2, var3, var4, var5);
      if (var8 == 2) {
         return this.a(var2, var3, var4);
      } else {
         if (var8 == 1) {
            var7 = this.a(var2, var3, var4);
         }

         if (var7 == null && var6 > 0 && var8 != -3 && var8 != -4 && this.a(var1, var2, var3 + var6, var4, var5) == 1) {
            var7 = this.a(var2, var3 + var6, var4);
            var3 += var6;
         }

         if (var7 != null) {
            int var9 = 0;
            int var10 = 0;

            while(var3 > 0) {
               var10 = this.a(var1, var2, var3 - 1, var4, var5);
               if (this.for && var10 == -1) {
                  return null;
               }

               if (var10 != 1) {
                  break;
               }

               if (var9++ >= var1.ak()) {
                  return null;
               }

               --var3;
               if (var3 > 0) {
                  var7 = this.a(var2, var3, var4);
               }
            }

            if (var10 == -2) {
               return null;
            }
         }

         return var7;
      }
   }

   private final s6 a(int var1, int var2, int var3) {
      int var4 = s6.a(var1, var2, var3);
      s6 var5 = (s6)this.byte.for(var4);
      if (var5 == null) {
         var5 = new s6(var1, var2, var3);
         this.byte.a(var4, var5);
      }

      return var5;
   }

   public int a(aiw var1, int var2, int var3, int var4, s6 var5) {
      return a(var1, var2, var3, var4, var5, this.for, this.int, this.new);
   }

   public static int a(aiw var0, int var1, int var2, int var3, s6 var4, boolean var5, boolean var6, boolean var7) {
      boolean var8 = false;

      for(int var9 = var1; var9 < var1 + var4.char; ++var9) {
         for(int var10 = var2; var10 < var2 + var4.case; ++var10) {
            for(int var11 = var3; var11 < var3 + var4.byte; ++var11) {
               int var12 = var0.ap.new(var9, var10, var11);
               if (var12 > 0) {
                  if (var12 == pa.as.void) {
                     var8 = true;
                  } else if (var12 != pa.bb.void && var12 != pa.ba.void) {
                     if (!var7 && var12 == pa.co.void) {
                        return 0;
                     }
                  } else {
                     if (var5) {
                        return -1;
                     }

                     var8 = true;
                  }

                  pa var13 = pa.x[var12];
                  int var14 = var13.new();
                  if (var0.ap.q(var9, var10, var11) == 9) {
                     int var18 = ajs.a(var0.al);
                     int var16 = ajs.a(var0.ak);
                     int var17 = ajs.a(var0.aj);
                     if (var0.ap.q(var18, var16, var17) != 9 && var0.ap.q(var18, var16 - 1, var17) != 9) {
                        return -3;
                     }
                  } else if (!var13.a((yy)var0.ap, var9, var10, var11) && (!var6 || var12 != pa.co.void)) {
                     if (var14 == 11 || var12 == pa.Y.void || var14 == 32) {
                        return -3;
                     }

                     if (var12 == pa.as.void) {
                        return -4;
                     }

                     ts var15 = var13.at;
                     if (var15 != ts.r) {
                        return 0;
                     }

                     if (!var0.ar()) {
                        return -2;
                     }
                  }
               }
            }
         }
      }

      return var8 ? 2 : 1;
   }

   private s5 a(s6 var1, s6 var2) {
      int var3 = 1;

      s6 var4;
      for(var4 = var2; var4.do != null; var4 = var4.do) {
         ++var3;
      }

      s6[] var5 = new s6[var3];
      var4 = var2;
      --var3;

      for(var5[var3] = var2; var4.do != null; var5[var3] = var4) {
         var4 = var4.do;
         --var3;
      }

      return new s5(var5);
   }
}
