public class xs {
   public static xr a(aqv var0) {
      int var1 = var0.goto("xPos");
      int var2 = var0.goto("zPos");
      xr var3 = new xr(var1, var2);
      var3.new = var0.int("Blocks");
      var3.try = new xv(var0.int("Data"), 7);
      var3.byte = new xv(var0.int("SkyLight"), 7);
      var3.case = new xv(var0.int("BlockLight"), 7);
      var3.char = var0.int("HeightMap");
      var3.else = var0.if("TerrainPopulated");
      var3.int = var0.void("Entities");
      var3.for = var0.void("TileEntities");
      var3.do = var0.void("TileTicks");

      try {
         var3.goto = var0.long("LastUpdate");
      } catch (ClassCastException var5) {
         var3.goto = (long)var0.goto("LastUpdate");
      }

      return var3;
   }

   public static void a(xr var0, aqv var1, yi var2) {
      var1.a("xPos", var0.if);
      var1.a("zPos", var0.a);
      var1.a("LastUpdate", var0.goto);
      int[] var3 = new int[var0.char.length];

      for(int var4 = 0; var4 < var0.char.length; ++var4) {
         var3[var4] = var0.char[var4];
      }

      var1.a("HeightMap", var3);
      var1.a("TerrainPopulated", var0.else);
      aqm var16 = new aqm("Sections");

      int var7;
      for(int var5 = 0; var5 < 8; ++var5) {
         boolean var6 = true;

         for(var7 = 0; var7 < 16 && var6; ++var7) {
            for(int var8 = 0; var8 < 16 && var6; ++var8) {
               for(int var9 = 0; var9 < 16; ++var9) {
                  int var10 = var7 << 11 | var9 << 7 | var8 + (var5 << 4);
                  byte var11 = var0.new[var10];
                  if (var11 != 0) {
                     var6 = false;
                     break;
                  }
               }
            }
         }

         if (!var6) {
            byte[] var19 = new byte[4096];
            xz var20 = new xz(var19.length, 4);
            xz var21 = new xz(var19.length, 4);
            xz var22 = new xz(var19.length, 4);

            for(int var23 = 0; var23 < 16; ++var23) {
               for(int var12 = 0; var12 < 16; ++var12) {
                  for(int var13 = 0; var13 < 16; ++var13) {
                     int var14 = var23 << 11 | var13 << 7 | var12 + (var5 << 4);
                     byte var15 = var0.new[var14];
                     var19[var12 << 8 | var13 << 4 | var23] = (byte)(var15 & 255);
                     var20.a(var23, var12, var13, var0.try.a(var23, var12 + (var5 << 4), var13));
                     var21.a(var23, var12, var13, var0.byte.a(var23, var12 + (var5 << 4), var13));
                     var22.a(var23, var12, var13, var0.case.a(var23, var12 + (var5 << 4), var13));
                  }
               }
            }

            aqv var24 = new aqv();
            var24.a("Y", (byte)(var5 & 255));
            var24.a("Blocks", var19);
            var24.a("Data", var20.if);
            var24.a("SkyLight", var21.if);
            var24.a("BlockLight", var22.if);
            var16.a((aqd)var24);
         }
      }

      var1.a("Sections", (aqd)var16);
      byte[] var17 = new byte[256];

      for(int var18 = 0; var18 < 16; ++var18) {
         for(var7 = 0; var7 < 16; ++var7) {
            var17[var7 << 4 | var18] = (byte)(var2.a(var0.if << 4 | var18, var0.a << 4 | var7).try & 255);
         }
      }

      var1.a("Biomes", var17);
      var1.a("Entities", (aqd)var0.int);
      var1.a("TileEntities", (aqd)var0.for);
      if (var0.do != null) {
         var1.a("TileTicks", (aqd)var0.do);
      }

   }
}
