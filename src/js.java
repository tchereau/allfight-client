import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import org.lwjgl.opengl.GL11;

public class js {
   private static d[][] a = (d[][])null;

   public static void a(c3 var0) {
      a = (d[][])null;
      if (qs.y()) {
         a = if(var0);
      }
   }

   private static d[][] if(c3 var0) {
      d[][] var1 = new d[10][0];
      String var2 = "/environment/sky";
      int var3 = -1;

      int var4;
      for(var4 = 0; var4 < var1.length; ++var4) {
         String var5 = var2 + var4 + "/sky";
         ArrayList var6 = new ArrayList();

         for(int var7 = 1; var7 < 1000; ++var7) {
            String var8 = var5 + var7 + ".properties";

            try {
               InputStream var9 = var0.try.int().a(var8);
               if (var9 == null) {
                  break;
               }

               Properties var10 = new Properties();
               var10.load(var9);
               qs.for("CustomSky properties: " + var8);
               String var11 = var5 + var7 + ".png";
               d var12 = new d(var10, var11);
               if (var12.a(var8)) {
                  var12.e = var0.new(var12.char);
                  var6.add(var12);
                  var9.close();
               }
            } catch (FileNotFoundException var13) {
               break;
            } catch (IOException var14) {
               var14.printStackTrace();
            }
         }

         if (var6.size() > 0) {
            d[] var17 = (d[])((d[])var6.toArray(new d[var6.size()]));
            var1[var4] = var17;
            var3 = var4;
         }
      }

      if (var3 < 0) {
         return (d[][])null;
      } else {
         var4 = var3 + 1;
         d[][] var15 = new d[var4][0];

         for(int var16 = 0; var16 < var15.length; ++var16) {
            var15[var16] = var1[var16];
         }

         return var15;
      }
   }

   public static void a(y6 var0, c3 var1, float var2, float var3) {
      if (a != null) {
         if (qs.S().B >= 128) {
            int var4 = var0.n.if;
            if (var4 >= 0 && var4 < a.length) {
               d[] var5 = a[var4];
               if (var5 != null) {
                  long var6 = var0.t();
                  int var8 = (int)(var6 % 24000L);

                  for(int var9 = 0; var9 < var5.length; ++var9) {
                     d var10 = var5[var9];
                     if (var10.a(var8)) {
                        var10.a(var8, var1, var2, var3);
                     }
                  }

                  a(var3);
               }
            }
         }
      }
   }

   public static boolean a(y6 var0) {
      if (a == null) {
         return false;
      } else if (qs.S().B < 128) {
         return false;
      } else {
         int var1 = var0.n.if;
         if (var1 >= 0 && var1 < a.length) {
            d[] var2 = a[var1];
            if (var2 == null) {
               return false;
            } else {
               return var2.length > 0;
            }
         } else {
            return false;
         }
      }
   }

   private static void a(float var0) {
      GL11.glDisable(3008);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 1);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var0);
   }
}
