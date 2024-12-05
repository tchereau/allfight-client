import java.util.ArrayList;
import java.util.Properties;

public class w0 {
   public String void = null;
   public String b = null;
   public int[] t = null;
   public String[] h = null;
   public int D = 0;
   public String[] v = null;
   public int f = 0;
   public int long = 63;
   public int[] z = null;
   public yn[] r = null;
   public int l = 0;
   public int C = 1024;
   public int e = 0;
   public boolean new = false;
   public int a = 0;
   public int do = 0;
   public int[] B = null;
   public int goto = 1;
   public int[] if = null;
   public int H = 0;
   public ajd[] E = null;
   public ajd[] x = null;
   public static final int d = 0;
   public static final int c = 1;
   public static final int w = 2;
   public static final int F = 3;
   public static final int for = 4;
   public static final int case = 5;
   public static final int q = 6;
   public static final int o = 7;
   public static final int s = 0;
   public static final int I = 1;
   public static final int j = 2;
   public static final int m = 3;
   public static final int char = 128;
   public static final int A = 1;
   public static final int G = 2;
   public static final int n = 4;
   public static final int k = 8;
   public static final int int = 16;
   public static final int g = 32;
   public static final int u = 60;
   public static final int else = 63;
   public static final int i = 128;
   public static final int p = 1;
   public static final int try = 2;
   public static final int y = 6;
   public static final int byte = 128;

   public w0(Properties var1, String var2) {
      this.void = f(var2);
      this.b = char(var2);
      this.t = g(var1.getProperty("matchBlocks"));
      this.h = this.try(var1.getProperty("matchTiles"));
      this.D = if(var1.getProperty("method"));
      this.v = this.case(var1.getProperty("tiles"));
      this.f = else(var1.getProperty("connect"));
      this.long = do(var1.getProperty("faces"));
      this.z = g(var1.getProperty("metadata"));
      this.r = j(var1.getProperty("biomes"));
      this.l = h(var1.getProperty("minHeight"));
      this.C = h(var1.getProperty("maxHeight"));
      this.e = h(var1.getProperty("renderPass"));
      this.new = c(var1.getProperty("innerSeams"));
      this.a = h(var1.getProperty("width"));
      this.do = h(var1.getProperty("height"));
      this.B = g(var1.getProperty("weights"));
      this.goto = byte(var1.getProperty("symmetry"));
   }

   private String[] try(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String[] var2 = qs.if(var1, " ");

         for(int var3 = 0; var3 < var2.length; ++var3) {
            String var4 = var2[var3];
            if (var4.endsWith(".png")) {
               var4 = var4.substring(0, var4.length() - 4);
            }

            if (var4.startsWith("/ctm/")) {
               var4 = var4.substring(1);
            }

            var2[var3] = var4;
         }

         return var2;
      }
   }

   private static String f(String var0) {
      String var1 = var0;
      int var2 = var0.lastIndexOf(47);
      if (var2 >= 0) {
         var1 = var0.substring(var2 + 1);
      }

      int var3 = var1.lastIndexOf(46);
      if (var3 >= 0) {
         var1 = var1.substring(0, var3);
      }

      return var1;
   }

   private static String char(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0 ? "" : var0.substring(0, var1);
   }

   private static yn[] j(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var1 = qs.if(var0, " ");
         ArrayList var2 = new ArrayList();

         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            yn var5 = e(var4);
            if (var5 == null) {
               qs.for("Biome not found: " + var4);
            } else {
               var2.add(var5);
            }
         }

         yn[] var6 = (yn[])((yn[])var2.toArray(new yn[var2.size()]));
         return var6;
      }
   }

   private static yn e(String var0) {
      for(int var1 = 0; var1 < yn.G.length; ++var1) {
         yn var2 = yn.G[var1];
         if (var2 != null && var2.i.equals(var0)) {
            return var2;
         }
      }

      return null;
   }

   private String[] case(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         String[] var3 = qs.if(var1, " ,");

         label57:
         for(int var4 = 0; var4 < var3.length; ++var4) {
            String var5 = var3[var4];
            if (var5.contains("-")) {
               String[] var6 = qs.if(var5, "-");
               if (var6.length == 2) {
                  int var7 = qs.a(var6[0], -1);
                  int var8 = qs.a(var6[1], -1);
                  if (var7 >= 0 && var8 >= 0) {
                     if (var7 > var8) {
                        qs.for("Invalid interval: " + var5 + ", when parsing: " + var1);
                        continue;
                     }

                     int var9 = var7;

                     while(true) {
                        if (var9 > var8) {
                           continue label57;
                        }

                        var2.add(String.valueOf(var9));
                        ++var9;
                     }
                  }
               }
            }

            var2.add(var5);
         }

         String[] var10 = (String[])((String[])var2.toArray(new String[var2.size()]));

         for(int var11 = 0; var11 < var10.length; ++var11) {
            String var12 = var10[var11];
            if (!var12.startsWith("/")) {
               var12 = this.b + "/" + var12;
            }

            if (var12.endsWith(".png")) {
               var12 = var12.substring(0, var12.length() - 4);
            }

            if (var12.startsWith("/ctm/")) {
               var12 = var12.substring(1);
            }

            var10[var11] = var12;
         }

         return var10;
      }
   }

   private static int h(String var0) {
      if (var0 == null) {
         return -1;
      } else {
         int var1 = qs.a(var0, -1);
         if (var1 < 0) {
            qs.for("Invalid number: " + var0);
         }

         return var1;
      }
   }

   private static int a(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         int var2 = qs.a(var0, -1);
         if (var2 < 0) {
            qs.for("Invalid number: " + var0);
            return var1;
         } else {
            return var2;
         }
      }
   }

   private static boolean c(String var0) {
      return var0 == null ? false : var0.toLowerCase().equals("true");
   }

   private static int byte(String var0) {
      if (var0 == null) {
         return 1;
      } else if (var0.equals("opposite")) {
         return 2;
      } else if (var0.equals("all")) {
         return 6;
      } else {
         qs.for("Unknown symmetry: " + var0);
         return 1;
      }
   }

   private static int do(String var0) {
      if (var0 == null) {
         return 63;
      } else {
         String[] var1 = qs.if(var0, " ,");
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            int var5 = d(var4);
            var2 |= var5;
         }

         return var2;
      }
   }

   private static int d(String var0) {
      if (var0.equals("bottom")) {
         return 1;
      } else if (var0.equals("top")) {
         return 2;
      } else if (var0.equals("north")) {
         return 4;
      } else if (var0.equals("south")) {
         return 8;
      } else if (var0.equals("east")) {
         return 32;
      } else if (var0.equals("west")) {
         return 16;
      } else if (var0.equals("sides")) {
         return 60;
      } else if (var0.equals("all")) {
         return 63;
      } else {
         qs.for("Unknown face: " + var0);
         return 128;
      }
   }

   private static int else(String var0) {
      if (var0 == null) {
         return 0;
      } else if (var0.equals("block")) {
         return 1;
      } else if (var0.equals("tile")) {
         return 2;
      } else if (var0.equals("material")) {
         return 3;
      } else {
         qs.for("Unknown connect: " + var0);
         return 128;
      }
   }

   private static int[] g(String var0) {
      if (var0 == null) {
         return null;
      } else {
         ArrayList var1 = new ArrayList();
         String[] var2 = qs.if(var0, " ,");

         for(int var3 = 0; var3 < var2.length; ++var3) {
            String var4 = var2[var3];
            if (var4.contains("-")) {
               String[] var11 = qs.if(var4, "-");
               if (var11.length != 2) {
                  qs.for("Invalid interval: " + var4 + ", when parsing: " + var0);
               } else {
                  int var6 = qs.a(var11[0], -1);
                  int var7 = qs.a(var11[1], -1);
                  if (var6 >= 0 && var7 >= 0 && var6 <= var7) {
                     for(int var8 = var6; var8 <= var7; ++var8) {
                        var1.add(var8);
                     }
                  } else {
                     qs.for("Invalid interval: " + var4 + ", when parsing: " + var0);
                  }
               }
            } else {
               int var5 = qs.a(var4, -1);
               if (var5 < 0) {
                  qs.for("Invalid number: " + var4 + ", when parsing: " + var0);
               } else {
                  var1.add(var5);
               }
            }
         }

         int[] var9 = new int[var1.size()];

         for(int var10 = 0; var10 < var9.length; ++var10) {
            var9[var10] = (Integer)var1.get(var10);
         }

         return var9;
      }
   }

   private static int if(String var0) {
      if (var0 == null) {
         return 1;
      } else if (var0.equals("ctm")) {
         return 1;
      } else if (var0.equals("horizontal")) {
         return 2;
      } else if (var0.equals("vertical")) {
         return 6;
      } else if (var0.equals("top")) {
         return 3;
      } else if (var0.equals("random")) {
         return 4;
      } else if (var0.equals("repeat")) {
         return 5;
      } else if (var0.equals("fixed")) {
         return 7;
      } else {
         qs.for("Unknown method: " + var0);
         return 0;
      }
   }

   public boolean a(String var1) {
      if (this.void != null && this.void.length() > 0) {
         if (this.b == null) {
            qs.for("No base path found: " + var1);
            return false;
         } else {
            if (this.t == null) {
               this.t = this.if();
            }

            if (this.h == null) {
               this.h = this.a();
            }

            if (this.t == null && this.h == null) {
               qs.for("No matchBlocks or matchTiles specified: " + var1);
               return false;
            } else if (this.D == 0) {
               qs.for("No method: " + var1);
               return false;
            } else if (this.v != null && this.v.length > 0) {
               if (this.f == 0) {
                  this.f = this.do();
               }

               if (this.f == 128) {
                  qs.for("Invalid connect in: " + var1);
                  return false;
               } else if (this.e > 0) {
                  qs.for("Render pass not supported: " + this.e);
                  return false;
               } else if ((this.long & 128) != 0) {
                  qs.for("Invalid faces in: " + var1);
                  return false;
               } else if ((this.goto & 128) != 0) {
                  qs.for("Invalid symmetry in: " + var1);
                  return false;
               } else {
                  switch(this.D) {
                  case 1:
                     return this.long(var1);
                  case 2:
                     return this.void(var1);
                  case 3:
                     return this.int(var1);
                  case 4:
                     return this.for(var1);
                  case 5:
                     return this.goto(var1);
                  case 6:
                     return this.new(var1);
                  case 7:
                     return this.b(var1);
                  default:
                     qs.for("Unknown method: " + var1);
                     return false;
                  }
               }
            } else {
               qs.for("No tiles specified: " + var1);
               return false;
            }
         }
      } else {
         qs.for("No name found: " + var1);
         return false;
      }
   }

   private int do() {
      if (this.t != null) {
         return 1;
      } else {
         return this.h != null ? 2 : 128;
      }
   }

   private int[] if() {
      if (!this.void.startsWith("block")) {
         return null;
      } else {
         int var1 = "block".length();

         int var2;
         for(var2 = var1; var2 < this.void.length(); ++var2) {
            char var3 = this.void.charAt(var2);
            if (var3 < '0' || var3 > '9') {
               break;
            }
         }

         if (var2 == var1) {
            return null;
         } else {
            String var5 = this.void.substring(var1, var2);
            int var4 = qs.a(var5, -1);
            return var4 < 0 ? null : new int[]{var4};
         }
      }
   }

   private String[] a() {
      ajd var1 = i(this.void);
      return var1 == null ? null : new String[]{this.void};
   }

   private static ajd i(String var0) {
      c3 var1 = qs.q();
      return var1 == null ? null : var1.int.if(var0);
   }

   private boolean long(String var1) {
      if (this.v == null) {
         this.v = this.case("0-11 16-27 32-43 48-58");
      }

      if (this.v.length < 47) {
         qs.for("Invalid tiles, must be at least 47: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean void(String var1) {
      if (this.v == null) {
         this.v = this.case("12-15");
      }

      if (this.v.length != 4) {
         qs.for("Invalid tiles, must be exactly 4: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean new(String var1) {
      if (this.v == null) {
         qs.for("No tiles defined for vertical: " + var1);
         return false;
      } else if (this.v.length != 4) {
         qs.for("Invalid tiles, must be exactly 4: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean for(String var1) {
      if (this.v != null && this.v.length > 0) {
         if (this.B != null && this.B.length != this.v.length) {
            qs.for("Number of weights must equal the number of tiles: " + var1);
            this.B = null;
         }

         if (this.B != null) {
            this.if = new int[this.B.length];
            int var2 = 0;

            for(int var3 = 0; var3 < this.B.length; ++var3) {
               var2 += this.B[var3];
               this.if[var3] = var2;
            }

            this.H = var2;
         }

         return true;
      } else {
         qs.for("Tiles not defined: " + var1);
         return false;
      }
   }

   private boolean goto(String var1) {
      if (this.v == null) {
         qs.for("Tiles not defined: " + var1);
         return false;
      } else if (this.a > 0 && this.a <= 16) {
         if (this.do > 0 && this.do <= 16) {
            if (this.v.length != this.a * this.do) {
               qs.for("Number of tiles does not equal width x height: " + var1);
               return false;
            } else {
               return true;
            }
         } else {
            qs.for("Invalid height: " + var1);
            return false;
         }
      } else {
         qs.for("Invalid width: " + var1);
         return false;
      }
   }

   private boolean b(String var1) {
      if (this.v == null) {
         qs.for("Tiles not defined: " + var1);
         return false;
      } else if (this.v.length != 1) {
         qs.for("Number of tiles should be 1 for method: fixed.");
         return false;
      } else {
         return true;
      }
   }

   private boolean int(String var1) {
      if (this.v == null) {
         this.v = this.case("66");
      }

      if (this.v.length != 1) {
         qs.for("Invalid tiles, must be exactly 1: " + var1);
         return false;
      } else {
         return true;
      }
   }

   public void a(bb var1) {
      if (this.h != null) {
         this.E = a(this.h, var1);
      }

      if (this.v != null) {
         this.x = a(this.v, var1);
      }

   }

   private static ajd[] a(String[] var0, bb var1) {
      if (var0 == null) {
         return null;
      } else {
         aj var2 = qs.q().for().int();
         ArrayList var3 = new ArrayList();

         for(int var4 = 0; var4 < var0.length; ++var4) {
            String var5 = var0[var4];
            String var6 = var5;
            if (!var5.contains("/")) {
               var6 = "textures/blocks/" + var5;
            }

            String var7 = "/" + var6 + ".png";
            boolean var8 = var2.if(var7, true);
            if (!var8) {
               qs.for("File not found: " + var7);
            }

            ajd var9 = var1.a(var5);
            var3.add(var9);
         }

         ajd[] var10 = (ajd[])((ajd[])var3.toArray(new ajd[var3.size()]));
         return var10;
      }
   }
}
