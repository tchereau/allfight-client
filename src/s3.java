import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class s3 extends s0 {
   public int for;
   public int do;
   public byte char;
   public byte case;
   public byte[] byte = new byte[16384];
   public List try = new ArrayList();
   private Map int = new HashMap();
   public Map new = new LinkedHashMap();

   public s3(String var1) {
      super(var1);
   }

   public void if(aqv var1) {
      this.char = var1.else("dimension");
      this.for = var1.goto("xCenter");
      this.do = var1.goto("zCenter");
      this.case = var1.else("scale");
      if (this.case < 0) {
         this.case = 0;
      }

      if (this.case > 4) {
         this.case = 4;
      }

      short var2 = var1.case("width");
      short var3 = var1.case("height");
      if (var2 == 128 && var3 == 128) {
         this.byte = var1.int("colors");
      } else {
         byte[] var4 = var1.int("colors");
         this.byte = new byte[16384];
         int var5 = (128 - var2) / 2;
         int var6 = (128 - var3) / 2;

         for(int var7 = 0; var7 < var3; ++var7) {
            int var8 = var7 + var6;
            if (var8 >= 0 || var8 < 128) {
               for(int var9 = 0; var9 < var2; ++var9) {
                  int var10 = var9 + var5;
                  if (var10 >= 0 || var10 < 128) {
                     this.byte[var10 + var8 * 128] = var4[var9 + var7 * var2];
                  }
               }
            }
         }
      }

   }

   public void a(aqv var1) {
      var1.a("dimension", this.char);
      var1.a("xCenter", this.for);
      var1.a("zCenter", this.do);
      var1.a("scale", this.case);
      var1.a("width", (short)128);
      var1.a("height", (short)128);
      var1.a("colors", this.byte);
   }

   public void a(aek var1, abp var2) {
      if (!this.int.containsKey(var1)) {
         s2 var3 = new s2(this, var1);
         this.int.put(var1, var3);
         this.try.add(var3);
      }

      if (!var1.fR.do(var2)) {
         this.new.remove(var1.do());
      }

      for(int var5 = 0; var5 < this.try.size(); ++var5) {
         s2 var4 = (s2)this.try.get(var5);
         if (var4.case.aR || !var4.case.fR.do(var2) && !var2.do()) {
            this.int.remove(var4.case);
            this.try.remove(var4);
         } else if (!var2.do() && var4.case.a6 == this.char) {
            this.a(0, var4.case.ap, var4.case.do(), var4.case.al, var4.case.aj, (double)var4.case.a5);
         }
      }

      if (var2.do()) {
         this.a(1, var1.ap, "frame-" + var2.for().av, (double)var2.for().rX, (double)var2.for().r0, (double)(var2.for().rY * 90));
      }

   }

   private void a(int var1, y6 var2, String var3, double var4, double var6, double var8) {
      int var10 = 1 << this.case;
      float var11 = (float)(var4 - (double)this.for) / (float)var10;
      float var12 = (float)(var6 - (double)this.do) / (float)var10;
      byte var13 = (byte)((int)((double)(var11 * 2.0F) + 0.5D));
      byte var14 = (byte)((int)((double)(var12 * 2.0F) + 0.5D));
      byte var16 = 63;
      byte var15;
      if (var11 >= (float)(-var16) && var12 >= (float)(-var16) && var11 <= (float)var16 && var12 <= (float)var16) {
         var8 += var8 < 0.0D ? -8.0D : 8.0D;
         var15 = (byte)((int)(var8 * 16.0D / 360.0D));
         if (this.char < 0) {
            int var17 = (int)(var2.l().else() / 10L);
            var15 = (byte)(var17 * var17 * 34187121 + var17 * 121 >> 15 & 15);
         }
      } else {
         if (!(Math.abs(var11) < 320.0F) || !(Math.abs(var12) < 320.0F)) {
            this.new.remove(var3);
            return;
         }

         var1 = 6;
         var15 = 0;
         if (var11 <= (float)(-var16)) {
            var13 = (byte)((int)((double)(var16 * 2) + 2.5D));
         }

         if (var12 <= (float)(-var16)) {
            var14 = (byte)((int)((double)(var16 * 2) + 2.5D));
         }

         if (var11 >= (float)var16) {
            var13 = (byte)(var16 * 2 + 1);
         }

         if (var12 >= (float)var16) {
            var14 = (byte)(var16 * 2 + 1);
         }
      }

      this.new.put(var3, new s1(this, (byte)var1, var13, var14, var15));
   }

   public byte[] a(abp var1, y6 var2, aek var3) {
      s2 var4 = (s2)this.int.get(var3);
      return var4 == null ? null : var4.a(var1);
   }

   public void a(int var1, int var2, int var3) {
      super.a();

      for(int var4 = 0; var4 < this.try.size(); ++var4) {
         s2 var5 = (s2)this.try.get(var4);
         if (var5.byte[var1] < 0 || var5.byte[var1] > var2) {
            var5.byte[var1] = var2;
         }

         if (var5.try[var1] < 0 || var5.try[var1] < var3) {
            var5.try[var1] = var3;
         }
      }

   }

   public void a(byte[] var1) {
      int var2;
      if (var1[0] == 0) {
         var2 = var1[1] & 255;
         int var3 = var1[2] & 255;

         for(int var4 = 0; var4 < var1.length - 3; ++var4) {
            this.byte[(var4 + var3) * 128 + var2] = var1[var4 + 3];
         }

         this.a();
      } else if (var1[0] == 1) {
         this.new.clear();

         for(var2 = 0; var2 < (var1.length - 1) / 3; ++var2) {
            byte var7 = (byte)(var1[var2 * 3 + 1] >> 4);
            byte var8 = var1[var2 * 3 + 2];
            byte var5 = var1[var2 * 3 + 3];
            byte var6 = (byte)(var1[var2 * 3 + 1] & 15);
            this.new.put("icon-" + var2, new s1(this, var7, var8, var5, var6));
         }
      } else if (var1[0] == 2) {
         this.case = var1[1];
      }

   }

   public s2 a(aek var1) {
      s2 var2 = (s2)this.int.get(var1);
      if (var2 == null) {
         var2 = new s2(this, var1);
         this.int.put(var1, var2);
         this.try.add(var2);
      }

      return var2;
   }
}
