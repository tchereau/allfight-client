import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class bb implements ajc {
   public final int char;
   public final String case;
   public final String byte;
   public final String try;
   private final HashMap new = new HashMap();
   private BufferedImage int = new BufferedImage(64, 64, 2);
   private bh for;
   private be do;
   private final List if = new ArrayList();
   private final Map a = new HashMap();

   public bb(int var1, String var2, String var3, BufferedImage var4) {
      this.char = var1;
      this.case = var2;
      this.byte = var3;
      this.try = ".png";
      this.int = var4;
   }

   public void a() {
      this.a.clear();
      vf.do(vf.U, this);
      int var1;
      int var2;
      if (this.char == 0) {
         pa[] var3 = pa.x;
         var1 = var3.length;

         for(var2 = 0; var2 < var1; ++var2) {
            pa var4 = var3[var2];
            if (var4 != null) {
               var4.a((ajc)this);
            }
         }

         Minecraft.ih().vl.a((ajc)this);
         cl.e.a((ajc)this);
         e.a(this);
         r.a(this);
      }

      abr[] var24 = abr.ai;
      var1 = var24.length;

      for(var2 = 0; var2 < var1; ++var2) {
         abr var25 = var24[var2];
         if (var25 != null && var25.if() == this.char) {
            var25.a((ajc)this);
         }
      }

      HashMap var26 = new HashMap();
      bg var5 = bc.do().do(this.case);
      this.new.clear();
      this.if.clear();
      be var6 = bc.do().a("missingno", 2, this.int.getWidth(), this.int.getHeight(), 10496, 6408, 9728, 9728, false, this.int);
      bd var7 = new bd(var6);
      var5.do(var7);
      var26.put(var7, Arrays.asList(var6));
      Iterator var8 = this.a.keySet().iterator();
      ArrayList var9 = new ArrayList();

      List var12;
      while(var8.hasNext()) {
         String var10 = (String)var8.next();
         String var11 = this.for(var10) + this.try;
         var12 = bc.do().a(var10, var11, (bh)null);
         var9.add(var12);
      }

      int var27 = this.a((List)var9);
      qs.for("Tile size for " + this.case + ": " + var27);
      Iterator var28 = var9.iterator();

      while(var28.hasNext()) {
         var12 = (List)var28.next();
         if (!var12.isEmpty()) {
            this.a(var12, var27);
         }
      }

      var28 = var9.iterator();

      while(var28.hasNext()) {
         var12 = (List)var28.next();
         if (!var12.isEmpty()) {
            bd var13 = new bd((be)var12.get(0));
            var5.do(var13);
            var26.put(var13, var12);
         }
      }

      try {
         var5.do();
      } catch (bf var23) {
         throw var23;
      }

      this.do = var5.if();
      this.do.do(var27);
      var8 = var5.a().iterator();

      while(var8.hasNext()) {
         bi var29 = (bi)var8.next();
         bd var31 = var29.do();
         be var32 = var31.int();
         String var14 = var32.case();
         List var15 = (List)var26.get(var31);
         bh var16 = (bh)this.a.get(var14);
         boolean var17 = false;
         if (var16 == null) {
            var17 = true;
            var16 = bh.a(var14);
            if (!var14.equals("missingno")) {
               Minecraft.ih().a().if("Couldn't find premade icon for " + var14 + " doing " + this.case);
            }
         }

         var16.a(this.do, var15, var29.if(), var29.a(), var31.int().new(), var31.int().try(), var31.a());
         this.new.put(var14, var16);
         if (!var17) {
            this.a.remove(var14);
         }

         if (var15.size() > 1) {
            this.if.add(var16);
            String var18 = this.for(var14) + ".txt";
            aj var19 = Minecraft.ih().uT.int();
            boolean var20 = !var19.if("/" + this.byte + var14 + ".png", false);

            try {
               InputStream var21 = var19.a("/" + var18, var20);
               Minecraft.ih().a().a("Found animation info for: " + var18);
               var16.a(new BufferedReader(new InputStreamReader(var21)));
            } catch (IOException var22) {
            }
         }
      }

      this.for = (bh)this.new.get("missingno");
      var8 = this.a.values().iterator();

      while(var8.hasNext()) {
         bh var30 = (bh)var8.next();
         var30.a(this.for);
      }

      this.a.putAll(this.new);
      this.do.a("debug.stitched_" + this.case + ".png");
      vf.do(vf.byte, this);
      this.do.byte();
   }

   public void for() {
      if (this.if.size() > 0) {
         this.if().if(0);
         this.do.if(true);
         Iterator var1 = this.if.iterator();

         while(true) {
            bh var2;
            do {
               do {
                  do {
                     do {
                        if (!var1.hasNext()) {
                           this.do.if(false);
                           return;
                        }

                        var2 = (bh)var1.next();
                     } while((var2 == ct.X || var2 == ct.Q) && !qs.g());
                  } while((var2 == ct.try || var2 == ct.do) && !qs.at());
               } while((var2 == ct.M || var2 == ct.K) && !qs.aC());
            } while(var2 == ct.m && !qs.i());

            var2.else();
         }
      }
   }

   public be if() {
      return this.do;
   }

   public ajd a(String var1) {
      if (var1 == null) {
         (new RuntimeException("Don't register null!")).printStackTrace();
      }

      bh var2 = (bh)this.a.get(var1);
      if (var2 == null) {
         var2 = bh.a(var1);
         var2.a(this.a.size());
         this.a.put(var1, var2);
      }

      return var2;
   }

   public ajd do() {
      return this.for;
   }

   private String for(String var1) {
      int var2 = var1.indexOf(":");
      if (var2 > 0) {
         String var3 = var1.substring(0, var2);
         String var4 = var1.substring(var2 + 1);
         return "mods/" + var3 + "/" + this.byte + var4;
      } else {
         return var1.startsWith("ctm/") ? var1 : this.byte + var1;
      }
   }

   public bh if(String var1) {
      return (bh)this.a.get(var1);
   }

   private int a(List var1) {
      int[] var2 = new int[16];
      Iterator var3 = var1.iterator();

      int var6;
      while(var3.hasNext()) {
         List var4 = (List)var3.next();
         if (!var4.isEmpty()) {
            be var5 = (be)var4.get(0);
            if (var5 != null) {
               var6 = ct.do(var5.new());
               int var7 = ct.do(var5.try());
               int var8 = Math.max(var6, var7);
               if (var8 < var2.length) {
                  int var10002 = var2[var8]++;
               }
            }
         }
      }

      int var9 = 4;
      int var10 = 0;

      int var11;
      for(var11 = 0; var11 < var2.length; ++var11) {
         var6 = var2[var11];
         if (var6 > var10) {
            var9 = var11;
            var10 = var6;
         }
      }

      if (var9 < 4) {
         var9 = 4;
      }

      var11 = ct.a(var9);
      return var11;
   }

   private void a(List var1, int var2) {
      if (!var1.isEmpty()) {
         be var3 = (be)var1.get(0);
         int var4 = Math.max(var3.new(), var3.try());
         if (var4 < var2) {
            for(int var5 = 0; var5 < var1.size(); ++var5) {
               be var6 = (be)var1.get(var5);
               var6.for(var2);
            }

         }
      }
   }

   public bh do(String var1) {
      return (bh)this.a.get(var1);
   }

   public boolean a(String var1, bh var2) {
      if (!this.a.containsKey(var1)) {
         this.a.put(var1, var2);
         return true;
      } else {
         return false;
      }
   }
}
