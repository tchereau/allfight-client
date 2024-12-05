import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class e {
   private static w0[][] do = (w0[][])null;
   private static w0[][] char = (w0[][])null;
   private static boolean new = false;
   private static final int case = 0;
   private static final int int = 1;
   private static final int byte = 2;
   private static final int else = 3;
   private static final int if = 4;
   private static final int for = 5;
   private static final String[] a = new String[]{"", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
   private static final int[] try = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 0, 0, 0, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 0, 0, 0, 0, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 0, 0, 0, 0, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0, 0, 0, 0, 0};

   public static void if(c3 var0) {
   }

   private static w0[][] a(String var0, int var1, c3 var2, int var3) {
      return (w0[][])null;
   }

   public static ajd if(yy var0, pa var1, int var2, int var3, int var4, int var5, ajd var6) {
      if (var0 == null) {
         return var6;
      } else if (!(var6 instanceof bh)) {
         return var6;
      } else {
         bh var7 = (bh)var6;
         int var8 = var7.goto();
         int var9 = -1;
         if (char != null && c4.G.g && var8 >= 0 && var8 < char.length) {
            w0[] var10 = char[var8];
            if (var10 != null) {
               if (var9 < 0) {
                  var9 = var0.for(var2, var3, var4);
               }

               ajd var11 = a((w0[])var10, var0, var1, var2, var3, var4, var5, var7, var9);
               if (var11 != null) {
                  return var11;
               }
            }
         }

         if (do != null) {
            int var13 = var1.void;
            if (var13 >= 0 && var13 < do.length) {
               w0[] var14 = do[var13];
               if (var14 != null) {
                  if (var9 < 0) {
                     var9 = var0.for(var2, var3, var4);
                  }

                  ajd var12 = a((w0[])var14, var0, var1, var2, var3, var4, var5, var7, var9);
                  if (var12 != null) {
                     return var12;
                  }
               }
            }
         }

         return var6;
      }
   }

   public static w0 a(yy var0, pa var1, int var2, int var3, int var4, int var5, ajd var6) {
      if (var0 == null) {
         return null;
      } else if (!(var6 instanceof bh)) {
         return null;
      } else {
         bh var7 = (bh)var6;
         int var8 = var7.goto();
         int var9 = -1;
         if (char != null && c4.G.g && var8 >= 0 && var8 < char.length) {
            w0[] var10 = char[var8];
            if (var10 != null) {
               if (var9 < 0) {
                  var9 = var0.for(var2, var3, var4);
               }

               w0 var11 = if((w0[])var10, var0, var1, var2, var3, var4, var5, var7, var9);
               if (var11 != null) {
                  return var11;
               }
            }
         }

         if (do != null) {
            int var13 = var1.void;
            if (var13 >= 0 && var13 < do.length) {
               w0[] var14 = do[var13];
               if (var14 != null) {
                  if (var9 < 0) {
                     var9 = var0.for(var2, var3, var4);
                  }

                  w0 var12 = if((w0[])var14, var0, var1, var2, var3, var4, var5, var7, var9);
                  if (var12 != null) {
                     return var12;
                  }
               }
            }
         }

         return null;
      }
   }

   private static ajd a(w0[] var0, yy var1, pa var2, int var3, int var4, int var5, int var6, ajd var7, int var8) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         w0 var10 = var0[var9];
         if (var10 != null) {
            ajd var11 = for(var10, var1, var2, var3, var4, var5, var6, var7, var8);
            if (var11 != null) {
               return var11;
            }
         }
      }

      return null;
   }

   private static w0 if(w0[] var0, yy var1, pa var2, int var3, int var4, int var5, int var6, ajd var7, int var8) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         w0 var10 = var0[var9];
         if (var10 != null) {
            ajd var11 = for(var10, var1, var2, var3, var4, var5, var6, var7, var8);
            if (var11 != null) {
               return var10;
            }
         }
      }

      return null;
   }

   private static ajd for(w0 var0, yy var1, pa var2, int var3, int var4, int var5, int var6, ajd var7, int var8) {
      boolean var9 = var2 instanceof o0;
      int var10;
      if (var6 >= 0 && var0.long != 63) {
         var10 = var6;
         if (var9) {
            var10 = a(var1, var3, var4, var5, var6, var8);
         }

         if ((1 << var10 & var0.long) == 0) {
            return null;
         }
      }

      var10 = var8;
      if (var9) {
         var10 = var8 & 3;
      }

      if (var0.z != null) {
         int[] var11 = var0.z;
         boolean var12 = false;

         for(int var13 = 0; var13 < var11.length; ++var13) {
            if (var11[var13] == var10) {
               var12 = true;
               break;
            }
         }

         if (!var12) {
            return null;
         }
      }

      switch(var0.D) {
      case 1:
         return new(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      case 2:
         return int(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      case 3:
         return do(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      case 4:
         return a(var0, var3, var4, var5, var6);
      case 5:
         return if(var0, var3, var4, var5, var6);
      case 6:
         return if(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      case 7:
         return a(var0);
      default:
         return null;
      }
   }

   private static int a(yy var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = (var5 & 12) >> 2;
      switch(var6) {
      case 0:
         return var4;
      case 1:
         switch(var4) {
         case 0:
            return 4;
         case 1:
            return 5;
         case 2:
         case 3:
         default:
            return var4;
         case 4:
            return 1;
         case 5:
            return 0;
         }
      case 2:
         switch(var4) {
         case 0:
            return 2;
         case 1:
            return 3;
         case 2:
            return 1;
         case 3:
            return 0;
         default:
            return var4;
         }
      case 3:
         return 2;
      default:
         return var4;
      }
   }

   private static ajd a(w0 var0, int var1, int var2, int var3, int var4) {
      if (var0.x.length == 1) {
         return var0.x[0];
      } else {
         int var5 = var4 / var0.goto * var0.goto;
         int var6 = qs.a(var1, var2, var3, var5) & Integer.MAX_VALUE;
         int var7 = 0;
         if (var0.B == null) {
            var7 = var6 % var0.x.length;
         } else {
            int var8 = var6 % var0.H;
            int[] var9 = var0.if;

            for(int var10 = 0; var10 < var9.length; ++var10) {
               if (var8 < var9[var10]) {
                  var7 = var10;
                  break;
               }
            }
         }

         return var0.x[var7];
      }
   }

   private static ajd a(w0 var0) {
      return var0.x[0];
   }

   private static ajd if(w0 var0, int var1, int var2, int var3, int var4) {
      if (var0.x.length == 1) {
         return var0.x[0];
      } else {
         int var5 = 0;
         int var6 = 0;
         switch(var4) {
         case 0:
            var5 = var1;
            var6 = var3;
            break;
         case 1:
            var5 = var1;
            var6 = var3;
            break;
         case 2:
            var5 = -var1 - 1;
            var6 = -var2;
            break;
         case 3:
            var5 = var1;
            var6 = -var2;
            break;
         case 4:
            var5 = var3;
            var6 = -var2;
            break;
         case 5:
            var5 = -var3 - 1;
            var6 = -var2;
         }

         var5 %= var0.a;
         var6 %= var0.do;
         if (var5 < 0) {
            var5 += var0.a;
         }

         if (var6 < 0) {
            var6 += var0.do;
         }

         int var7 = var6 * var0.a + var5;
         return var0.x[var7];
      }
   }

   private static ajd new(w0 var0, yy var1, pa var2, int var3, int var4, int var5, int var6, ajd var7, int var8) {
      boolean[] var9 = new boolean[6];
      switch(var6) {
      case 0:
      case 1:
         var9[0] = a(var0, var1, var2, var3 - 1, var4, var5, var6, var7, var8);
         var9[1] = a(var0, var1, var2, var3 + 1, var4, var5, var6, var7, var8);
         var9[2] = a(var0, var1, var2, var3, var4, var5 + 1, var6, var7, var8);
         var9[3] = a(var0, var1, var2, var3, var4, var5 - 1, var6, var7, var8);
         break;
      case 2:
         var9[0] = a(var0, var1, var2, var3 + 1, var4, var5, var6, var7, var8);
         var9[1] = a(var0, var1, var2, var3 - 1, var4, var5, var6, var7, var8);
         var9[2] = a(var0, var1, var2, var3, var4 - 1, var5, var6, var7, var8);
         var9[3] = a(var0, var1, var2, var3, var4 + 1, var5, var6, var7, var8);
         break;
      case 3:
         var9[0] = a(var0, var1, var2, var3 - 1, var4, var5, var6, var7, var8);
         var9[1] = a(var0, var1, var2, var3 + 1, var4, var5, var6, var7, var8);
         var9[2] = a(var0, var1, var2, var3, var4 - 1, var5, var6, var7, var8);
         var9[3] = a(var0, var1, var2, var3, var4 + 1, var5, var6, var7, var8);
         break;
      case 4:
         var9[0] = a(var0, var1, var2, var3, var4, var5 - 1, var6, var7, var8);
         var9[1] = a(var0, var1, var2, var3, var4, var5 + 1, var6, var7, var8);
         var9[2] = a(var0, var1, var2, var3, var4 - 1, var5, var6, var7, var8);
         var9[3] = a(var0, var1, var2, var3, var4 + 1, var5, var6, var7, var8);
         break;
      case 5:
         var9[0] = a(var0, var1, var2, var3, var4, var5 + 1, var6, var7, var8);
         var9[1] = a(var0, var1, var2, var3, var4, var5 - 1, var6, var7, var8);
         var9[2] = a(var0, var1, var2, var3, var4 - 1, var5, var6, var7, var8);
         var9[3] = a(var0, var1, var2, var3, var4 + 1, var5, var6, var7, var8);
      }

      byte var10 = 0;
      if (var9[0] & !var9[1] & !var9[2] & !var9[3]) {
         var10 = 3;
      } else if (!var9[0] & var9[1] & !var9[2] & !var9[3]) {
         var10 = 1;
      } else if (!var9[0] & !var9[1] & var9[2] & !var9[3]) {
         var10 = 12;
      } else if (!var9[0] & !var9[1] & !var9[2] & var9[3]) {
         var10 = 36;
      } else if (var9[0] & var9[1] & !var9[2] & !var9[3]) {
         var10 = 2;
      } else if (!var9[0] & !var9[1] & var9[2] & var9[3]) {
         var10 = 24;
      } else if (var9[0] & !var9[1] & var9[2] & !var9[3]) {
         var10 = 15;
      } else if (var9[0] & !var9[1] & !var9[2] & var9[3]) {
         var10 = 39;
      } else if (!var9[0] & var9[1] & var9[2] & !var9[3]) {
         var10 = 13;
      } else if (!var9[0] & var9[1] & !var9[2] & var9[3]) {
         var10 = 37;
      } else if (!var9[0] & var9[1] & var9[2] & var9[3]) {
         var10 = 25;
      } else if (var9[0] & !var9[1] & var9[2] & var9[3]) {
         var10 = 27;
      } else if (var9[0] & var9[1] & !var9[2] & var9[3]) {
         var10 = 38;
      } else if (var9[0] & var9[1] & var9[2] & !var9[3]) {
         var10 = 14;
      } else if (var9[0] & var9[1] & var9[2] & var9[3]) {
         var10 = 26;
      }

      if (!qs.Q()) {
         return var0.x[var10];
      } else {
         boolean[] var11 = new boolean[6];
         switch(var6) {
         case 0:
         case 1:
            var11[0] = !a(var0, var1, var2, var3 + 1, var4, var5 + 1, var6, var7, var8);
            var11[1] = !a(var0, var1, var2, var3 - 1, var4, var5 + 1, var6, var7, var8);
            var11[2] = !a(var0, var1, var2, var3 + 1, var4, var5 - 1, var6, var7, var8);
            var11[3] = !a(var0, var1, var2, var3 - 1, var4, var5 - 1, var6, var7, var8);
            break;
         case 2:
            var11[0] = !a(var0, var1, var2, var3 - 1, var4 - 1, var5, var6, var7, var8);
            var11[1] = !a(var0, var1, var2, var3 + 1, var4 - 1, var5, var6, var7, var8);
            var11[2] = !a(var0, var1, var2, var3 - 1, var4 + 1, var5, var6, var7, var8);
            var11[3] = !a(var0, var1, var2, var3 + 1, var4 + 1, var5, var6, var7, var8);
            break;
         case 3:
            var11[0] = !a(var0, var1, var2, var3 + 1, var4 - 1, var5, var6, var7, var8);
            var11[1] = !a(var0, var1, var2, var3 - 1, var4 - 1, var5, var6, var7, var8);
            var11[2] = !a(var0, var1, var2, var3 + 1, var4 + 1, var5, var6, var7, var8);
            var11[3] = !a(var0, var1, var2, var3 - 1, var4 + 1, var5, var6, var7, var8);
            break;
         case 4:
            var11[0] = !a(var0, var1, var2, var3, var4 - 1, var5 + 1, var6, var7, var8);
            var11[1] = !a(var0, var1, var2, var3, var4 - 1, var5 - 1, var6, var7, var8);
            var11[2] = !a(var0, var1, var2, var3, var4 + 1, var5 + 1, var6, var7, var8);
            var11[3] = !a(var0, var1, var2, var3, var4 + 1, var5 - 1, var6, var7, var8);
            break;
         case 5:
            var11[0] = !a(var0, var1, var2, var3, var4 - 1, var5 - 1, var6, var7, var8);
            var11[1] = !a(var0, var1, var2, var3, var4 - 1, var5 + 1, var6, var7, var8);
            var11[2] = !a(var0, var1, var2, var3, var4 + 1, var5 - 1, var6, var7, var8);
            var11[3] = !a(var0, var1, var2, var3, var4 + 1, var5 + 1, var6, var7, var8);
         }

         if (var10 == 13 && var11[0]) {
            var10 = 4;
         }

         if (var10 == 15 && var11[1]) {
            var10 = 5;
         }

         if (var10 == 37 && var11[2]) {
            var10 = 16;
         }

         if (var10 == 39 && var11[3]) {
            var10 = 17;
         }

         if (var10 == 14 && var11[0] && var11[1]) {
            var10 = 7;
         }

         if (var10 == 25 && var11[0] && var11[2]) {
            var10 = 6;
         }

         if (var10 == 27 && var11[3] && var11[1]) {
            var10 = 19;
         }

         if (var10 == 38 && var11[3] && var11[2]) {
            var10 = 18;
         }

         if (var10 == 14 && !var11[0] && var11[1]) {
            var10 = 31;
         }

         if (var10 == 25 && var11[0] && !var11[2]) {
            var10 = 30;
         }

         if (var10 == 27 && !var11[3] && var11[1]) {
            var10 = 41;
         }

         if (var10 == 38 && var11[3] && !var11[2]) {
            var10 = 40;
         }

         if (var10 == 14 && var11[0] && !var11[1]) {
            var10 = 29;
         }

         if (var10 == 25 && !var11[0] && var11[2]) {
            var10 = 28;
         }

         if (var10 == 27 && var11[3] && !var11[1]) {
            var10 = 43;
         }

         if (var10 == 38 && !var11[3] && var11[2]) {
            var10 = 42;
         }

         if (var10 == 26 && var11[0] && var11[1] && var11[2] && var11[3]) {
            var10 = 46;
         }

         if (var10 == 26 && !var11[0] && var11[1] && var11[2] && var11[3]) {
            var10 = 9;
         }

         if (var10 == 26 && var11[0] && !var11[1] && var11[2] && var11[3]) {
            var10 = 21;
         }

         if (var10 == 26 && var11[0] && var11[1] && !var11[2] && var11[3]) {
            var10 = 8;
         }

         if (var10 == 26 && var11[0] && var11[1] && var11[2] && !var11[3]) {
            var10 = 20;
         }

         if (var10 == 26 && var11[0] && var11[1] && !var11[2] && !var11[3]) {
            var10 = 11;
         }

         if (var10 == 26 && !var11[0] && !var11[1] && var11[2] && var11[3]) {
            var10 = 22;
         }

         if (var10 == 26 && !var11[0] && var11[1] && !var11[2] && var11[3]) {
            var10 = 23;
         }

         if (var10 == 26 && var11[0] && !var11[1] && var11[2] && !var11[3]) {
            var10 = 10;
         }

         if (var10 == 26 && var11[0] && !var11[1] && !var11[2] && var11[3]) {
            var10 = 34;
         }

         if (var10 == 26 && !var11[0] && var11[1] && var11[2] && !var11[3]) {
            var10 = 35;
         }

         if (var10 == 26 && var11[0] && !var11[1] && !var11[2] && !var11[3]) {
            var10 = 32;
         }

         if (var10 == 26 && !var11[0] && var11[1] && !var11[2] && !var11[3]) {
            var10 = 33;
         }

         if (var10 == 26 && !var11[0] && !var11[1] && var11[2] && !var11[3]) {
            var10 = 44;
         }

         if (var10 == 26 && !var11[0] && !var11[1] && !var11[2] && var11[3]) {
            var10 = 45;
         }

         return var0.x[var10];
      }
   }

   private static boolean a(w0 var0, yy var1, pa var2, int var3, int var4, int var5, int var6, ajd var7, int var8) {
      int var9 = var1.new(var3, var4, var5);
      pa var10;
      if (var0.f == 2) {
         var10 = pa.x[var9];
         if (var10 == null) {
            return false;
         } else {
            ajd var11 = var10.if(var1, var3, var4, var5, var6);
            return var11 == var7;
         }
      } else if (var0.f == 3) {
         var10 = pa.x[var9];
         if (var10 == null) {
            return false;
         } else {
            return var10.at == var2.at;
         }
      } else {
         return var9 == var2.void && var1.for(var3, var4, var5) == var8;
      }
   }

   private static ajd int(w0 var0, yy var1, pa var2, int var3, int var4, int var5, int var6, ajd var7, int var8) {
      if (var6 != 0 && var6 != 1) {
         boolean var9 = false;
         boolean var10 = false;
         switch(var6) {
         case 2:
            var9 = a(var0, var1, var2, var3 + 1, var4, var5, var6, var7, var8);
            var10 = a(var0, var1, var2, var3 - 1, var4, var5, var6, var7, var8);
            break;
         case 3:
            var9 = a(var0, var1, var2, var3 - 1, var4, var5, var6, var7, var8);
            var10 = a(var0, var1, var2, var3 + 1, var4, var5, var6, var7, var8);
            break;
         case 4:
            var9 = a(var0, var1, var2, var3, var4, var5 - 1, var6, var7, var8);
            var10 = a(var0, var1, var2, var3, var4, var5 + 1, var6, var7, var8);
            break;
         case 5:
            var9 = a(var0, var1, var2, var3, var4, var5 + 1, var6, var7, var8);
            var10 = a(var0, var1, var2, var3, var4, var5 - 1, var6, var7, var8);
         }

         boolean var11 = true;
         byte var12;
         if (var9) {
            if (var10) {
               var12 = 1;
            } else {
               var12 = 2;
            }
         } else if (var10) {
            var12 = 0;
         } else {
            var12 = 3;
         }

         return var0.x[var12];
      } else {
         return null;
      }
   }

   private static ajd if(w0 var0, yy var1, pa var2, int var3, int var4, int var5, int var6, ajd var7, int var8) {
      if (var6 != 0 && var6 != 1) {
         boolean var9 = a(var0, var1, var2, var3, var4 - 1, var5, var6, var7, var8);
         boolean var10 = a(var0, var1, var2, var3, var4 + 1, var5, var6, var7, var8);
         boolean var11 = true;
         byte var12;
         if (var9) {
            if (var10) {
               var12 = 1;
            } else {
               var12 = 2;
            }
         } else if (var10) {
            var12 = 0;
         } else {
            var12 = 3;
         }

         return var0.x[var12];
      } else {
         return null;
      }
   }

   private static ajd do(w0 var0, yy var1, pa var2, int var3, int var4, int var5, int var6, ajd var7, int var8) {
      if (var6 != 0 && var6 != 1) {
         return a(var0, var1, var2, var3, var4 + 1, var5, var6, var7, var8) ? var0.x[0] : null;
      } else {
         return null;
      }
   }

   public static boolean a() {
      return qs.aj() && new;
   }

   private static boolean a(c3 var0) {
      return false;
   }

   private static w0 a(String var0, c3 var1) {
      return null;
   }

   public static void a(bb var0) {
      do = (w0[][])null;
      char = (w0[][])null;
      new = false;
      c3 var1 = qs.q();
      if (var1 != null) {
         aj var2 = var1.for().int();
         if (var2 != null) {
            boolean var3 = var2.if("/textures/blocks/glass.png", false);
            new = !var3;
            String[] var4 = a(var2, "ctm/", ".properties");
            Arrays.sort(var4);
            ArrayList var5 = new ArrayList();
            ArrayList var6 = new ArrayList();

            for(int var7 = 0; var7 < var4.length; ++var7) {
               String var8 = var4[var7];
               qs.for("ConnectedTextures: " + var8);

               try {
                  String var9 = "/" + var8;
                  InputStream var10 = var2.a(var9);
                  if (var10 == null) {
                     qs.for("ConnectedTextures file not found: " + var8);
                  } else {
                     Properties var11 = new Properties();
                     var11.load(var10);
                     w0 var12 = new w0(var11, var8);
                     if (var12.a(var9)) {
                        var12.a(var0);
                        if(var12, var5);
                        a((w0)var12, (List)var6);
                     }
                  }
               } catch (FileNotFoundException var13) {
                  qs.for("ConnectedTextures file not found: " + var8);
               } catch (IOException var14) {
                  var14.printStackTrace();
               }
            }

            do = a((List)var6);
            char = a((List)var5);
         }
      }
   }

   private static w0[][] a(List var0) {
      w0[][] var1 = new w0[var0.size()][];

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            w0[] var4 = (w0[])((w0[])var3.toArray(new w0[var3.size()]));
            var1[var2] = var4;
         }
      }

      return var1;
   }

   private static void if(w0 var0, List var1) {
      if (var0.E != null) {
         for(int var2 = 0; var2 < var0.E.length; ++var2) {
            ajd var3 = var0.E[var2];
            if (!(var3 instanceof bh)) {
               qs.for("Icon is not TextureStitched: " + var3 + ", name: " + var3.if());
            } else {
               bh var4 = (bh)var3;
               int var5 = var4.goto();
               if (var5 < 0) {
                  qs.for("Invalid tile ID: " + var5 + ", icon: " + var4.if());
               } else {
                  a(var0, var1, var5);
               }
            }
         }

      }
   }

   private static void a(w0 var0, List var1) {
      if (var0.t != null) {
         for(int var2 = 0; var2 < var0.t.length; ++var2) {
            int var3 = var0.t[var2];
            if (var3 < 0) {
               qs.for("Invalid block ID: " + var3);
            } else {
               a(var0, var1, var3);
            }
         }

      }
   }

   private static void a(w0 var0, List var1, int var2) {
      while(var2 >= var1.size()) {
         var1.add((Object)null);
      }

      Object var3 = (List)var1.get(var2);
      if (var3 == null) {
         var3 = new ArrayList();
         var1.set(var2, var3);
      }

      ((List)var3).add(var0);
   }

   private static String[] a(aj var0, String var1, String var2) {
      if (!(var0 instanceof an)) {
         return new String[0];
      } else {
         an var3 = (an)var0;
         if (var3 instanceof am) {
            return a(var3);
         } else {
            File var4 = var3.if;
            if (var4 == null) {
               return new String[0];
            } else if (var4.isDirectory()) {
               return a(var4, "", var1, var2);
            } else {
               return var4.isFile() ? a(var4, var1, var2) : new String[0];
            }
         }
      }
   }

   private static String[] a(an var0) {
      ArrayList var1 = new ArrayList();
      String[] var2 = new String[]{"ctm/default/bookshelf.properties", "ctm/default/glass.properties", "ctm/default/glasspane.properties", "ctm/default/sandstone.properties"};

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         if (var0.do("/" + var4)) {
            var1.add(var4);
         }
      }

      String[] var5 = (String[])((String[])var1.toArray(new String[var1.size()]));
      return var5;
   }

   private static String[] a(File var0, String var1, String var2, String var3) {
      ArrayList var4 = new ArrayList();
      File[] var5 = var0.listFiles();
      if (var5 == null) {
         return new String[0];
      } else {
         for(int var6 = 0; var6 < var5.length; ++var6) {
            File var7 = var5[var6];
            String var8;
            if (var7.isFile()) {
               var8 = var1 + var7.getName();
               if (var8.startsWith(var2) && var8.endsWith(var3)) {
                  var4.add(var8);
               }
            } else if (var7.isDirectory()) {
               var8 = var1 + var7.getName() + "/";
               String[] var9 = a(var7, var8, var2, var3);

               for(int var10 = 0; var10 < var9.length; ++var10) {
                  String var11 = var9[var10];
                  var4.add(var11);
               }
            }
         }

         String[] var12 = (String[])((String[])var4.toArray(new String[var4.size()]));
         return var12;
      }
   }

   private static String[] a(File var0, String var1, String var2) {
      ArrayList var3 = new ArrayList();

      try {
         ZipFile var4 = new ZipFile(var0);
         Enumeration var5 = var4.entries();

         while(var5.hasMoreElements()) {
            ZipEntry var6 = (ZipEntry)var5.nextElement();
            String var7 = var6.getName();
            if (var7.startsWith(var1) && var7.endsWith(var2)) {
               var3.add(var7);
            }
         }

         var4.close();
         String[] var9 = (String[])((String[])var3.toArray(new String[var3.size()]));
         return var9;
      } catch (IOException var8) {
         var8.printStackTrace();
         return new String[0];
      }
   }

   public static int a(boolean var0, boolean var1, boolean var2, boolean var3) {
      if (var1 && var0) {
         if (var2) {
            return var3 ? 34 : 50;
         } else {
            return var3 ? 18 : 2;
         }
      } else if (var1 && !var0) {
         if (var2) {
            return var3 ? 35 : 51;
         } else {
            return var3 ? 19 : 3;
         }
      } else if (!var1 && var0) {
         if (var2) {
            return var3 ? 33 : 49;
         } else {
            return var3 ? 17 : 1;
         }
      } else if (var2) {
         return var3 ? 32 : 48;
      } else {
         return var3 ? 16 : 0;
      }
   }

   public static int a(int var0) {
      int var1 = var0 % 16;
      if (var1 == 1) {
         return var0 + 2;
      } else {
         return var1 == 3 ? var0 - 2 : var0;
      }
   }

   public static ajd a(w0 var0, int var1, ajd var2) {
      if (var0.D != 1) {
         return var2;
      } else if (var1 >= 0 && var1 < try.length) {
         int var3 = try[var1];
         ajd[] var4 = var0.x;
         return var3 >= 0 && var3 < var4.length ? var4[var3] : var2;
      } else {
         return var2;
      }
   }
}
