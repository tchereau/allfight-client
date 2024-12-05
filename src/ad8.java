import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

public class ad8 {
   private static int[] p = null;
   private static int[] h = null;
   private static int[] goto = null;
   private static int[] char = null;
   private static int[] e = null;
   private static int[] f = null;
   private static int[] do = null;
   private static int[][] long = (int[][])null;
   private static int[][] case = (int[][])null;
   private static int[] l = null;
   private static int[] i = null;
   private static int[] try = null;
   private static float[][][] if = (float[][][])null;
   private static int[] int = null;
   private static float[][] m = new float[16][3];
   private static float[][] else = new float[16][3];
   private static int[] void = null;
   private static int[] byte = null;
   private static int[] k = null;
   private static int n = -1;
   private static int d = -1;
   private static int c = -1;
   private static nr j = null;
   private static nr for = null;
   private static nr o = null;
   private static final int b = 0;
   private static final int g = 1;
   private static final int new = 2;
   private static Random a = new Random();

   public static void a(c3 var0) {
      p = null;
      h = null;
      goto = null;
      e = null;
      char = null;
      do = null;
      f = null;
      l = null;
      i = null;
      try = null;
      void = null;
      byte = null;
      k = null;
      if = (float[][][])null;
      int = null;
      c = -1;
      n = -1;
      d = -1;
      j = null;
      for = null;
      o = null;
      long = (int[][])null;
      case = (int[][])null;
      p = a("/misc/grasscolor.png", var0, 65536);
      goto = a("/misc/foliagecolor.png", var0, 65536);
      h = a("/misc/watercolorX.png", var0, 65536);
      if (qs.b()) {
         char = a("/misc/pinecolor.png", var0, 65536);
         e = a("/misc/birchcolor.png", var0, 65536);
         do = a("/misc/swampgrasscolor.png", var0, 65536);
         f = a("/misc/swampfoliagecolor.png", var0, 65536);
         l = a("/misc/skycolor0.png", var0, 65536);
         i = a("/misc/fogcolor0.png", var0, 65536);
         try = a("/misc/underwatercolor.png", var0, 65536);
         void = a((String)"/misc/redstonecolor.png", (c3)var0, 16);
         byte = a((String)"/misc/stemcolor.png", (c3)var0, 8);
         k = a((String)"/misc/myceliumparticlecolor.png", (c3)var0, -1);
         int[][] var1 = new int[3][];
         if = new float[3][][];
         int = new int[3];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            String var3 = "/environment/lightmap" + (var2 - 1) + ".png";
            var1[var2] = a((String)var3, (c3)var0, -1);
            if (var1[var2] != null) {
               if[var2] = a(var1[var2]);
            }

            int[var2] = a((c3)var0, (String)var3, 32);
         }

         a("/color.properties", var0);
      }
   }

   private static int a(c3 var0, String var1, int var2) {
      try {
         BufferedImage var3 = var0.do(var1);
         return var3 == null ? var2 : var3.getHeight();
      } catch (IOException var4) {
         return var2;
      }
   }

   private static float[][] a(int[] var0) {
      float[][] var1 = new float[var0.length][3];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         int var3 = var0[var2];
         float var4 = (float)(var3 >> 16 & 255) / 255.0F;
         float var5 = (float)(var3 >> 8 & 255) / 255.0F;
         float var6 = (float)(var3 & 255) / 255.0F;
         float[] var7 = var1[var2];
         var7[0] = var4;
         var7[1] = var5;
         var7[2] = var6;
      }

      return var1;
   }

   private static void a(String var0, c3 var1) {
      try {
         InputStream var2 = var1.for().int().a(var0);
         if (var2 == null) {
            return;
         }

         qs.do("Loading " + var0);
         Properties var3 = new Properties();
         var3.load(var2);
         c = a(var3, "lilypad");
         n = a(var3, new String[]{"particle.water", "drop.water"});
         d = a(var3, "particle.portal");
         j = if(var3, "fog.nether");
         for = if(var3, "fog.end");
         o = if(var3, "sky.end");
         a(var3, var1);
      } catch (FileNotFoundException var4) {
         return;
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   private static void a(Properties var0, c3 var1) {
      long = new int[256][1];

      for(int var2 = 0; var2 < 256; ++var2) {
         long[var2][0] = -1;
      }

      String var17 = "palette.block.";
      HashMap var3 = new HashMap();
      Set var4 = var0.keySet();
      Iterator var5 = var4.iterator();

      String var7;
      while(var5.hasNext()) {
         String var6 = (String)var5.next();
         var7 = var0.getProperty(var6);
         if (var6.startsWith(var17)) {
            var3.put(var6, var7);
         }
      }

      String[] var18 = (String[])((String[])var3.keySet().toArray(new String[var3.size()]));
      case = new int[var18.length][];

      for(int var19 = 0; var19 < var18.length; ++var19) {
         var7 = var18[var19];
         String var8 = var0.getProperty(var7);
         qs.do("Block palette: " + var7 + " = " + var8);
         String var9 = var7.substring(var17.length());
         int[] var10 = a(var9, var1, 65536);
         case[var19] = var10;
         String[] var11 = qs.if(var8, " ,;");

         for(int var12 = 0; var12 < var11.length; ++var12) {
            String var13 = var11[var12];
            int var14 = -1;
            if (var13.contains(":")) {
               String[] var15 = qs.if(var13, ":");
               var13 = var15[0];
               String var16 = var15[1];
               var14 = qs.a(var16, -1);
               if (var14 < 0 || var14 > 15) {
                  qs.do("Invalid block metadata: " + var13 + " in palette: " + var7);
                  continue;
               }
            }

            int var20 = qs.a(var13, -1);
            if (var20 >= 0 && var20 <= 255) {
               if (var20 != pa.i.void && var20 != pa.b3.void && var20 != pa.aJ.void && var20 != pa.Z.void) {
                  if (var14 == -1) {
                     long[var20][0] = var19;
                  } else {
                     if (long[var20].length < 16) {
                        long[var20] = new int[16];
                        Arrays.fill(long[var20], -1);
                     }

                     long[var20][var14] = var19;
                  }
               }
            } else {
               qs.do("Invalid block index: " + var20 + " in palette: " + var7);
            }
         }
      }

   }

   private static int a(Properties var0, String[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         String var3 = var1[var2];
         int var4 = a(var0, var3);
         if (var4 >= 0) {
            return var4;
         }
      }

      return -1;
   }

   private static int a(Properties var0, String var1) {
      String var2 = var0.getProperty(var1);
      if (var2 == null) {
         return -1;
      } else {
         try {
            int var3 = Integer.parseInt(var2, 16) & 16777215;
            qs.do("Custom color: " + var1 + " = " + var2);
            return var3;
         } catch (NumberFormatException var4) {
            qs.do("Invalid custom color: " + var1 + " = " + var2);
            return -1;
         }
      }
   }

   private static nr if(Properties var0, String var1) {
      int var2 = a(var0, var1);
      if (var2 < 0) {
         return null;
      } else {
         int var3 = var2 >> 16 & 255;
         int var4 = var2 >> 8 & 255;
         int var5 = var2 & 255;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         float var8 = (float)var5 / 255.0F;
         return nr.do((double)var6, (double)var7, (double)var8);
      }
   }

   private static int[] a(String var0, c3 var1, int var2) {
      try {
         InputStream var3 = var1.for().int().a(var0);
         if (var3 == null) {
            return null;
         } else {
            int[] var4 = var1.if(var0);
            if (var4 == null) {
               return null;
            } else if (var2 > 0 && var4.length != var2) {
               qs.do("Invalid custom colors length: " + var4.length + ", path: " + var0);
               return null;
            } else {
               qs.do("Loading custom colors: " + var0);
               return var4;
            }
         }
      } catch (FileNotFoundException var5) {
         return null;
      } catch (IOException var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public static int if(pa var0, yy var1, int var2, int var3, int var4) {
      if (e == null && char == null && do == null && f == null && long == null && qs.Z() && qs.N()) {
         return var0.do(var1, var2, var3, var4);
      } else {
         int[] var5 = null;
         int[] var6 = null;
         int var10;
         if (long != null) {
            int var7 = var0.void;
            if (var7 >= 0 && var7 < 256) {
               int[] var8 = long[var7];
               boolean var9 = true;
               int var13;
               if (var8.length > 1) {
                  var10 = var1.for(var2, var3, var4);
                  var13 = var8[var10];
               } else {
                  var13 = var8[0];
               }

               if (var13 >= 0) {
                  var5 = case[var13];
               }
            }

            if (var5 != null) {
               if (qs.N()) {
                  return a(var0, var1, var2, var3, var4, var5, var5, 0, 0);
               }

               return a(var5, var1, var2, var3, var4);
            }
         }

         boolean var11 = qs.Z();
         boolean var12 = false;
         byte var14 = 0;
         var10 = 0;
         if (var0 != pa.i && var0 != pa.b3) {
            if (var0 == pa.aJ) {
               var14 = 2;
               var12 = qs.N();
               var10 = var1.for(var2, var3, var4);
               if ((var10 & 3) == 1) {
                  var5 = char;
               } else if ((var10 & 3) == 2) {
                  var5 = e;
               } else {
                  var5 = goto;
                  if (var11) {
                     var6 = f;
                  } else {
                     var6 = var5;
                  }
               }
            } else if (var0 == pa.Z) {
               var14 = 2;
               var12 = qs.N();
               var5 = goto;
               if (var11) {
                  var6 = f;
               } else {
                  var6 = var5;
               }
            }
         } else {
            var14 = 1;
            var12 = qs.N();
            var5 = p;
            if (var11) {
               var6 = do;
            } else {
               var6 = var5;
            }
         }

         if (var12) {
            return a(var0, var1, var2, var3, var4, var5, var6, var14, var10);
         } else {
            if (var6 != var5 && var1.a(var2, var4) == yn.z) {
               var5 = var6;
            }

            return var5 != null ? a(var5, var1, var2, var3, var4) : var0.do(var1, var2, var3, var4);
         }
      }
   }

   private static int a(pa var0, yy var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;

      int var12;
      int var13;
      for(var12 = var2 - 1; var12 <= var2 + 1; ++var12) {
         for(var13 = var4 - 1; var13 <= var4 + 1; ++var13) {
            int[] var14 = var5;
            if (var6 != var5 && var1.a(var12, var13) == yn.z) {
               var14 = var6;
            }

            boolean var15 = false;
            int var17;
            if (var14 == null) {
               switch(var7) {
               case 1:
                  var17 = var1.a(var12, var13).try();
                  break;
               case 2:
                  if ((var8 & 3) == 1) {
                     var17 = zf.do();
                  } else if ((var8 & 3) == 2) {
                     var17 = zf.if();
                  } else {
                     var17 = var1.a(var12, var13).case();
                  }
                  break;
               default:
                  var17 = var0.do(var1, var12, var3, var13);
               }
            } else {
               var17 = a(var14, var1, var12, var3, var13);
            }

            var9 += var17 >> 16 & 255;
            var10 += var17 >> 8 & 255;
            var11 += var17 & 255;
         }
      }

      var12 = var9 / 9;
      var13 = var10 / 9;
      int var16 = var11 / 9;
      return var12 << 16 | var13 << 8 | var16;
   }

   public static int a(pa var0, yy var1, int var2, int var3, int var4) {
      if (var0.at != ts.s) {
         return var0.do(var1, var2, var3, var4);
      } else if (h != null) {
         return qs.N() ? a(h, var1, (double)var2, (double)var3, (double)var4, 3, 1) : a(h, var1, var2, var3, var4);
      } else {
         return !qs.Z() ? 16777215 : var0.do(var1, var2, var3, var4);
      }
   }

   private static int a(int[] var0, yy var1, int var2, int var3, int var4) {
      yn var5 = var1.a(var2, var4);
      double var6 = (double)ajs.a(var5.int(), 0.0F, 1.0F);
      double var8 = (double)ajs.a(var5.for(), 0.0F, 1.0F);
      var8 *= var6;
      int var10 = (int)((1.0D - var6) * 255.0D);
      int var11 = (int)((1.0D - var8) * 255.0D);
      return var0[var11 << 8 | var10] & 16777215;
   }

   public static void a(d7 var0) {
      if (d >= 0) {
         int var1 = d;
         int var2 = var1 >> 16 & 255;
         int var3 = var1 >> 8 & 255;
         int var4 = var1 & 255;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.bs = var5;
         var0.br = var6;
         var0.bq = var7;
      }
   }

   public static void if(d7 var0) {
      if (k != null) {
         int var1 = k[a.nextInt(k.length)];
         int var2 = var1 >> 16 & 255;
         int var3 = var1 >> 8 & 255;
         int var4 = var1 & 255;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.bs = var5;
         var0.br = var6;
         var0.bq = var7;
      }
   }

   public static void a(d7 var0, yy var1, double var2, double var4, double var6) {
      if (void != null) {
         int var8 = var1.for((int)var2, (int)var4, (int)var6);
         int var9 = a(var8);
         if (var9 != -1) {
            int var10 = var9 >> 16 & 255;
            int var11 = var9 >> 8 & 255;
            int var12 = var9 & 255;
            float var13 = (float)var10 / 255.0F;
            float var14 = (float)var11 / 255.0F;
            float var15 = (float)var12 / 255.0F;
            var0.bs = var13;
            var0.br = var14;
            var0.bq = var15;
         }
      }
   }

   public static int a(int var0) {
      if (void == null) {
         return -1;
      } else {
         return var0 >= 0 && var0 <= 15 ? void[var0] & 16777215 : -1;
      }
   }

   public static void a(d7 var0, yy var1) {
      if (h != null) {
         int var2 = (int)var0.al;
         int var3 = (int)var0.ak;
         int var4 = (int)var0.aj;
         int var5 = a(pa.ba, var1, var2, var3, var4);
         int var6 = var5 >> 16 & 255;
         int var7 = var5 >> 8 & 255;
         int var8 = var5 & 255;
         float var9 = (float)var6 / 255.0F;
         float var10 = (float)var7 / 255.0F;
         float var11 = (float)var8 / 255.0F;
         if (n >= 0) {
            int var12 = n >> 16 & 255;
            int var13 = n >> 8 & 255;
            int var14 = n & 255;
            var9 *= (float)var12 / 255.0F;
            var10 *= (float)var13 / 255.0F;
            var11 *= (float)var14 / 255.0F;
         }

         var0.bs = var9;
         var0.br = var10;
         var0.bq = var11;
      }
   }

   public static int a() {
      return c < 0 ? pa.b0.c() : c;
   }

   public static nr a(nr var0) {
      return j == null ? var0 : j;
   }

   public static nr if(nr var0) {
      return for == null ? var0 : for;
   }

   public static nr do(nr var0) {
      return o == null ? var0 : o;
   }

   public static nr a(nr var0, yy var1, double var2, double var4, double var6) {
      if (l == null) {
         return var0;
      } else {
         int var8 = a(l, var1, var2, var4, var6, 10, 1);
         int var9 = var8 >> 16 & 255;
         int var10 = var8 >> 8 & 255;
         int var11 = var8 & 255;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.int / 0.5F;
         float var16 = (float)var0.for / 0.66275F;
         float var17 = (float)var0.do;
         var12 *= var15;
         var13 *= var16;
         var14 *= var17;
         return nr.do((double)var12, (double)var13, (double)var14);
      }
   }

   public static nr if(nr var0, yy var1, double var2, double var4, double var6) {
      if (i == null) {
         return var0;
      } else {
         int var8 = a(i, var1, var2, var4, var6, 10, 1);
         int var9 = var8 >> 16 & 255;
         int var10 = var8 >> 8 & 255;
         int var11 = var8 & 255;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.int / 0.753F;
         float var16 = (float)var0.for / 0.8471F;
         float var17 = (float)var0.do;
         var12 *= var15;
         var13 *= var16;
         var14 *= var17;
         return nr.do((double)var12, (double)var13, (double)var14);
      }
   }

   public static nr a(yy var0, double var1, double var3, double var5) {
      if (try == null) {
         return null;
      } else {
         int var7 = a(try, var0, var1, var3, var5, 10, 1);
         int var8 = var7 >> 16 & 255;
         int var9 = var7 >> 8 & 255;
         int var10 = var7 & 255;
         float var11 = (float)var8 / 255.0F;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         return nr.do((double)var11, (double)var12, (double)var13);
      }
   }

   public static int a(int[] var0, yy var1, double var2, double var4, double var6, int var8, int var9) {
      if (var0 == null) {
         return -1;
      } else {
         int var10 = (int)Math.floor(var2);
         int var11 = (int)Math.floor(var4);
         int var12 = (int)Math.floor(var6);
         int var13 = var8 * var9 / 2;
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         int var17 = 0;

         int var18;
         int var19;
         int var20;
         for(var18 = var10 - var13; var18 <= var10 + var13; var18 += var9) {
            for(var19 = var12 - var13; var19 <= var12 + var13; var19 += var9) {
               var20 = a(var0, var1, var18, var11, var19);
               var14 += var20 >> 16 & 255;
               var15 += var20 >> 8 & 255;
               var16 += var20 & 255;
               ++var17;
            }
         }

         var18 = var14 / var17;
         var19 = var15 / var17;
         var20 = var16 / var17;
         return var18 << 16 | var19 << 8 | var20;
      }
   }

   public static int a(int var0, int var1, float var2) {
      if (var2 <= 0.0F) {
         return var1;
      } else if (var2 >= 1.0F) {
         return var0;
      } else {
         float var3 = 1.0F - var2;
         int var4 = var0 >> 16 & 255;
         int var5 = var0 >> 8 & 255;
         int var6 = var0 & 255;
         int var7 = var1 >> 16 & 255;
         int var8 = var1 >> 8 & 255;
         int var9 = var1 & 255;
         int var10 = (int)((float)var4 * var2 + (float)var7 * var3);
         int var11 = (int)((float)var5 * var2 + (float)var8 * var3);
         int var12 = (int)((float)var6 * var2 + (float)var9 * var3);
         return var10 << 16 | var11 << 8 | var12;
      }
   }

   private static int a(int var0, int var1) {
      int var2 = var0 >> 16 & 255;
      int var3 = var0 >> 8 & 255;
      int var4 = var0 & 255;
      int var5 = var1 >> 16 & 255;
      int var6 = var1 >> 8 & 255;
      int var7 = var1 & 255;
      int var8 = (var2 + var5) / 2;
      int var9 = (var3 + var6) / 2;
      int var10 = (var4 + var7) / 2;
      return var8 << 16 | var9 << 8 | var10;
   }

   public static int a(pj var0, yy var1, int var2, int var3, int var4) {
      if (byte == null) {
         return var0.do(var1, var2, var3, var4);
      } else {
         int var5 = var1.for(var2, var3, var4);
         if (var5 < 0) {
            var5 = 0;
         }

         if (var5 >= byte.length) {
            var5 = byte.length - 1;
         }

         return byte[var5];
      }
   }

   public static boolean a(y6 var0, dh var1, int[] var2, boolean var3) {
      if (var0 == null) {
         return false;
      } else if (if == null) {
         return false;
      } else if (!qs.b()) {
         return false;
      } else {
         int var4 = var0.n.if;
         if (var4 >= -1 && var4 <= 1) {
            int var5 = var4 + 1;
            float[][] var6 = if[var5];
            if (var6 == null) {
               return false;
            } else {
               int var7 = int[var5];
               if (var3 && var7 < 64) {
                  return false;
               } else {
                  int var8 = var6.length / var7;
                  if (var8 < 16) {
                     qs.for("Invalid lightmap width: " + var8 + " for: /environment/lightmap" + var4 + ".png");
                     if[var5] = (float[][])null;
                     return false;
                  } else {
                     int var9 = 0;
                     if (var3) {
                        var9 = var8 * 16 * 2;
                     }

                     float var10 = 1.1666666F * (var0.case(1.0F) - 0.2F);
                     if (var0.q > 0) {
                        var10 = 1.0F;
                     }

                     var10 = qs.a(var10);
                     float var11 = var10 * (float)(var8 - 1);
                     float var12 = qs.a(var1.n + 0.5F) * (float)(var8 - 1);
                     float var13 = qs.a(qs.S().bb);
                     boolean var14 = var13 > 1.0E-4F;
                     a(var6, var11, var9, var8, m);
                     a(var6, var12, var9 + 16 * var8, var8, else);
                     float[] var15 = new float[3];

                     for(int var16 = 0; var16 < 16; ++var16) {
                        for(int var17 = 0; var17 < 16; ++var17) {
                           int var18;
                           for(var18 = 0; var18 < 3; ++var18) {
                              float var19 = qs.a(m[var16][var18] + else[var17][var18]);
                              if (var14) {
                                 float var20 = 1.0F - var19;
                                 var20 = 1.0F - var20 * var20 * var20 * var20;
                                 var19 = var13 * var20 + (1.0F - var13) * var19;
                              }

                              var15[var18] = var19;
                           }

                           var18 = (int)(var15[0] * 255.0F);
                           int var21 = (int)(var15[1] * 255.0F);
                           int var22 = (int)(var15[2] * 255.0F);
                           var2[var16 * 16 + var17] = -16777216 | var18 << 16 | var21 << 8 | var22;
                        }
                     }

                     return true;
                  }
               }
            }
         } else {
            return false;
         }
      }
   }

   private static void a(float[][] var0, float var1, int var2, int var3, float[][] var4) {
      int var5 = (int)Math.floor((double)var1);
      int var6 = (int)Math.ceil((double)var1);
      if (var5 == var6) {
         for(int var14 = 0; var14 < 16; ++var14) {
            float[] var15 = var0[var2 + var14 * var3 + var5];
            float[] var16 = var4[var14];

            for(int var17 = 0; var17 < 3; ++var17) {
               var16[var17] = var15[var17];
            }
         }

      } else {
         float var7 = 1.0F - (var1 - (float)var5);
         float var8 = 1.0F - ((float)var6 - var1);

         for(int var9 = 0; var9 < 16; ++var9) {
            float[] var10 = var0[var2 + var9 * var3 + var5];
            float[] var11 = var0[var2 + var9 * var3 + var6];
            float[] var12 = var4[var9];

            for(int var13 = 0; var13 < 3; ++var13) {
               var12[var13] = var10[var13] * var7 + var11[var13] * var8;
            }
         }

      }
   }
}
