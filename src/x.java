import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class x extends i5 {
   private static final Random iC = new Random();
   private float iB = 0.0F;
   private String iz = "missingno";
   private j6 iw;
   private j6 iA;
   private j6 iv;
   private int iu = 0;
   private String io;
   private int ic;
   private int it;
   private boolean ir = true;
   private static boolean iq = false;
   private static boolean ip = false;
   private String in;
   private static final String[] im = new String[]{"/title/bg/panorama0.png", "/title/bg/panorama1.png", "/title/bg/panorama2.png", "/title/bg/panorama3.png", "/title/bg/panorama4.png", "/title/bg/panorama5.png"};
   public static final String iD;
   private int il;
   private int ik;
   private int ij;
   private int ii;
   private int ig;
   private int is;
   private static boolean h9;
   private static long iy;
   private static long ie;
   private static long ib;
   private static String id;
   private static String ia;
   private static String ih;
   public static boolean ix;

   public x() {
      BufferedReader var1 = null;

      try {
         ArrayList var2 = new ArrayList();
         var1 = new BufferedReader(new InputStreamReader(x.class.getResourceAsStream("/title/splashes.txt"), Charset.forName("UTF-8")));

         String var3;
         while((var3 = var1.readLine()) != null) {
            var3 = var3.trim();
            if (var3.length() > 0) {
               var2.add(var3);
            }
         }

         do {
            this.iz = (String)var2.get(iC.nextInt(var2.size()));
         } while(this.iz.hashCode() == 125780783);
      } catch (IOException var12) {
      } finally {
         if (var1 != null) {
            try {
               var1.close();
            } catch (IOException var11) {
            }
         }

      }

      this.iB = iC.nextFloat();
   }

   public void dG() {
      ++this.iu;
   }

   public boolean dy() {
      return false;
   }

   protected void if(char var1, int var2) {
   }

   public void dA() {
      this.it = this.hW.vb.if(new BufferedImage(256, 256, 2));
      Calendar var1 = Calendar.getInstance();
      if (ie == 0L && ib == 0L) {
         ie = (new Date()).getTime() - 120000L;
         ib = (new Date()).getTime() - 120000L;
      }

      if (iy == 0L) {
         iy = (new Date()).getTime() - 120000L;
      }

      long var2 = ie;
      long var4 = (new Date()).getTime();
      long var6 = var4 - var2;
      long var8 = var6 / 1000L;
      if (var8 > 60L) {
         ie = (new Date()).getTime();

         try {
            this.a("allfightpvp.com:1600", "factions");
         } catch (IOException var16) {
            var16.printStackTrace();
         }
      }

      var2 = ib;
      var4 = (new Date()).getTime();
      var6 = var4 - var2;
      var8 = var6 / 1000L;
      if (var8 > 60L) {
         ib = (new Date()).getTime();

         try {
            this.a("hardcore.allfightpvp.com:25566", "hardcore");
         } catch (IOException var15) {
            var15.printStackTrace();
         }
      }

      if (h9 && !h9) {
         h9 = false;
      }

      aqy var10 = aqy.if();
      int var11 = this.hU / 4 + 48;
      if (this.hW.h6()) {
         this.if(var11, 24, var10);
      } else {
         this.a(var11, 24, var10);
      }

      this.a(var10, var11, 24);
      this.hT.add(new j6(3, this.hV / 2 + 43, var11 + -15 + 12, 160, 20, "Packs de Textures"));
      this.hT.add(new j6(0, this.hV / 2 + 43, var11 + 5 + 20, 160, 20, var10.a("menu.options")));
      this.hT.add(new j6(4, this.hV / 2 + 43, var11 + 95 + 12, 160, 20, "Quitter"));
      this.hT.add(new j6(5, this.hV / 2 + 43, var11 + 41 + 12, 160, 20, "Langage"));
      this.hT.add(new j6(7, this.hV / 2 + 43, var11 + 69 + 12, 160, 20, "TeamSpeak"));
      this.in = "";
      String var12 = System.getProperty("os_architecture");
      String var13 = System.getProperty("java_version");
      this.ik = this.hR.for(this.in);
      this.il = this.hR.for(iD);
      int var14 = Math.max(this.ik, this.il);
      this.ij = (this.hV - var14) / 2;
      this.ii = ((j6)this.hT.get(0)).hx - 24;
      this.ig = this.ij + var14;
      this.is = this.ii + 24;
   }

   private void a(aqy var1, int var2, int var3) {
      if (this.ir) {
         if (!iq) {
            iq = true;
            (new w(this, var1, var2, var3)).start();
         } else if (ip) {
            this.if(var1, var2, var3);
         }
      }

   }

   private void if(aqy var1, int var2, int var3) {
      this.hT.add(new j6(3, this.hV / 2 - 100, var2 + var3 * 2, var1.a("menu.online")));
   }

   private void a(int var1, int var2, aqy var3) {
      this.hT.add(new j6(1, this.hV / 2 - 200, var1, var3.a("§3 Jeu Solo §3")));
      this.hT.add(this.iA = new j6(2, this.hV / 2 - 200, var1 + var2 * 2, var3.a("§9 PVP Factions §9")));
      this.hT.add(this.iv = new j6(8, this.hV / 2 - 200, var1 + var2 * 3, var3.a("§c PVP Hardcore §c")));
      this.hT.add(new j6(6, this.hV / 2 - 200, var1 + 95 + 12, var3.a("Accès au site")));
   }

   private void if(int var1, int var2, aqy var3) {
      this.hT.add(new j6(11, this.hV / 2 - 100, var1, var3.a("menu.playdemo")));
      this.hT.add(this.iw = new j6(12, this.hV / 2 - 100, var1 + var2 * 1, var3.a("menu.resetdemo")));
      sg var4 = this.hW.im();
      ss var5 = var4.a("Demo_World");
      if (var5 == null) {
         this.iw.hu = false;
      }

   }

   private void a(String var1, String var2) throws IOException {
      er var3 = er.if(var1);
      Socket var4 = null;
      DataInputStream var5 = null;
      DataOutputStream var6 = null;

      try {
         var4 = new Socket();
         var4.setSoTimeout(3000);
         var4.setTcpNoDelay(true);
         var4.setTrafficClass(18);
         var4.connect(new InetSocketAddress(var3.if(), var3.a()), 3000);
         var5 = new DataInputStream(var4.getInputStream());
         var6 = new DataOutputStream(var4.getOutputStream());
         var6.write(254);
         var6.write(1);
         if (var5.read() != 255) {
            if (var2 == "hardcore") {
               ia = "§cInaccessible (End of Stream)§c";
            }

            if (var2 == "factions") {
               id = "§9Inaccessible (End of Stream)§9";
            }

            throw new IOException("Bad message");
         }

         String var7 = an7.a((DataInputStream)var5, 256);
         char[] var8 = var7.toCharArray();

         int var9;
         for(var9 = 0; var9 < var8.length; ++var9) {
            if (var8[var9] != 167 && var8[var9] != 0 && apc.if.indexOf(var8[var9]) < 0) {
               var8[var9] = '?';
            }
         }

         var7 = new String(var8);
         int var10;
         String[] var11;
         if (var7.startsWith("§") && var7.length() > 1) {
            var11 = var7.substring(1).split("\u0000");
            if (ajs.a(var11[0], 0) == 1) {
               var9 = ajs.a(var11[4], 0);
               var10 = ajs.a(var11[5], 0);
               if (var9 >= 0 && var10 >= 0) {
                  if (var2 == "hardcore") {
                     ia = "§c" + var9 + "/" + var10;
                  }

                  if (var2 == "factions") {
                     id = "§9 " + var9 + "/" + var10;
                  }
               } else {
                  if (var2 == "hardcore") {
                     ia = "§cInaccessible§c";
                  }

                  if (var2 == "factions") {
                     id = "§9Inaccessible§9";
                  }
               }
            } else {
               if (var2 == "hardcore") {
                  ia = "§cInaccessible§c";
               }

               if (var2 == "factions") {
                  id = "§9Inaccessible§9";
               }
            }
         } else {
            var11 = var7.split("§");
            var7 = var11[0];
            var9 = -1;
            var10 = -1;

            try {
               var9 = Integer.parseInt(var11[1]);
               var10 = Integer.parseInt(var11[2]);
            } catch (Exception var30) {
            }

            if (var9 >= 0 && var10 > 0) {
               if (var2 == "hardcore") {
                  ia = "§c" + var9 + "/" + var10 + "§c";
               }

               if (var2 == "factions") {
                  id = "§9 " + var9 + "/" + var10;
               }
            } else {
               if (var2 == "hardcore") {
                  ia = "§cInaccessible§c";
               }

               if (var2 == "factions") {
                  id = "§9Inaccessible§9";
               }
            }
         }
      } catch (Exception var31) {
         if (var2 == "hardcore") {
            ia = "§cInaccessible§c";
         }

         if (var2 == "factions") {
            id = "§9Inaccessible§9";
         }
      } finally {
         try {
            if (var5 != null) {
               var5.close();
            }
         } catch (Throwable var29) {
         }

         try {
            if (var6 != null) {
               var6.close();
            }
         } catch (Throwable var28) {
         }

         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (Throwable var27) {
         }

      }

   }

   protected void a(j6 var1) {
      if (var1.hv == 0) {
         this.hW.a((i5)(new jd(this, this.hW.u1)));
      }

      if (var1.hv == 5) {
         this.hW.a((i5)(new jh(this, this.hW.u1)));
      }

      if (var1.hv == 1) {
         ix = false;
         this.hW.a((i5)(new i2(this)));
      }

      if (var1.hv == 2) {
         this.hW.a((i5)(new e2((i5)null, this.hW, "allfightpvp.com", 1600)));
         ix = false;
      }

      if (var1.hv == 8) {
         aj var10000 = this.hW.uT.int();
         ai var10001 = this.hW.uT;
         if (var10000 != ai.new()) {
            var10001 = this.hW.uT;
            this.hW.uT.a(ai.new());
            this.hW.vb.new();
            this.hW.vl.case();
         }

         ix = true;
         this.hW.a((i5)(new e2((i5)null, this.hW, "hardcore.allfightpvp.com", 25566)));
      }

      if (var1.hv == 3) {
         this.hW.a((i5)(new ag(this, (ke)null)));
      }

      Desktop var2;
      URI var3;
      if (var1.hv == 7) {
         var2 = null;

         try {
            var3 = new URI("ts3server://ts.allfightpvp.com");
            if (Desktop.isDesktopSupported()) {
               var2 = Desktop.getDesktop();
               var2.browse(var3);
            }
         } catch (Exception var6) {
         }
      }

      if (var1.hv == 4) {
         this.hW.h2();
      }

      if (var1.hv == 6) {
         var2 = null;

         try {
            var3 = new URI("http://allfightpvp.com");
            if (Desktop.isDesktopSupported()) {
               var2 = Desktop.getDesktop();
               var2.browse(var3);
            }
         } catch (Exception var5) {
         }
      }

      if (var1.hv == 11) {
         this.hW.a("Demo_World", "Demo_World", ale.W);
      }

      if (var1.hv == 12) {
         sg var7 = this.hW.im();
         ss var8 = var7.a("Demo_World");
         if (var8 != null) {
            j2 var4 = i2.a(this, var8.l(), 12);
            this.hW.a((i5)var4);
         }
      }

   }

   public void do(boolean var1, int var2) {
      if (var1 && var2 == 12) {
         sg var6 = this.hW.im();
         var6.a();
         var6.for("Demo_World");
         this.hW.a((i5)this);
      } else if (var2 == 13) {
         if (var1) {
            try {
               Class var3 = Class.forName("java.awt.Desktop");
               Object var4 = var3.getMethod("getDesktop").invoke((Object)null);
               var3.getMethod("browse", URI.class).invoke(var4, new URI("http://tinyurl.com/javappc"));
            } catch (Throwable var5) {
               var5.printStackTrace();
            }
         }

         this.hW.a((i5)this);
      }

   }

   private void do(int var1, int var2, float var3) {
      c4 var4 = c4.G;
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      GLU.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glDisable(2884);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      byte var5 = 8;

      for(int var6 = 0; var6 < var5 * var5; ++var6) {
         GL11.glPushMatrix();
         float var7 = ((float)(var6 % var5) / (float)var5 - 0.5F) / 64.0F;
         float var8 = ((float)(var6 / var5) / (float)var5 - 0.5F) / 64.0F;
         float var9 = 0.0F;
         GL11.glTranslatef(var7, var8, var9);
         GL11.glRotatef(ajs.try(((float)this.iu + var3) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-((float)this.iu + var3) * 0.1F, 0.0F, 1.0F, 0.0F);

         for(int var10 = 0; var10 < 6; ++var10) {
            GL11.glPushMatrix();
            if (var10 == 1) {
               GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var10 == 2) {
               GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var10 == 3) {
               GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var10 == 4) {
               GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var10 == 5) {
               GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            }

            this.hW.vb.for(im[var10]);
            var4.if();
            var4.if(16777215, 255 / (var6 + 1));
            float var11 = 0.0F;
            var4.a(-1.0D, -1.0D, 1.0D, (double)(0.0F + var11), (double)(0.0F + var11));
            var4.a(1.0D, -1.0D, 1.0D, (double)(1.0F - var11), (double)(0.0F + var11));
            var4.a(1.0D, 1.0D, 1.0D, (double)(1.0F - var11), (double)(1.0F - var11));
            var4.a(-1.0D, 1.0D, 1.0D, (double)(0.0F + var11), (double)(1.0F - var11));
            var4.for();
            GL11.glPopMatrix();
         }

         GL11.glPopMatrix();
         GL11.glColorMask(true, true, true, false);
      }

      var4.a(0.0D, 0.0D, 0.0D);
      GL11.glColorMask(true, true, true, true);
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      GL11.glDepthMask(true);
      GL11.glEnable(2884);
      GL11.glEnable(3008);
      GL11.glEnable(2929);
   }

   private void h(float var1) {
      GL11.glBindTexture(3553, this.it);
      this.hW.vb.do();
      GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glColorMask(true, true, true, false);
      c4 var2 = c4.G;
      var2.if();
      byte var3 = 3;

      for(int var4 = 0; var4 < var3; ++var4) {
         var2.a(1.0F, 1.0F, 1.0F, 1.0F / (float)(var4 + 1));
         int var5 = this.hV;
         int var6 = this.hU;
         float var7 = (float)(var4 - var3 / 2) / 256.0F;
         var2.a((double)var5, (double)var6, (double)this.gH, (double)(0.0F + var7), 0.0D);
         var2.a((double)var5, 0.0D, (double)this.gH, (double)(1.0F + var7), 0.0D);
         var2.a(0.0D, 0.0D, (double)this.gH, (double)(1.0F + var7), 1.0D);
         var2.a(0.0D, (double)var6, (double)this.gH, (double)(0.0F + var7), 1.0D);
      }

      var2.for();
      GL11.glColorMask(true, true, true, true);
      this.hW.vb.do();
   }

   private void for(int var1, int var2, float var3) {
      GL11.glViewport(0, 0, 256, 256);
      this.do(var1, var2, var3);
      GL11.glDisable(3553);
      GL11.glEnable(3553);
      this.h(var3);
      this.h(var3);
      this.h(var3);
      this.h(var3);
      this.h(var3);
      this.h(var3);
      this.h(var3);
      this.h(var3);
      GL11.glViewport(0, 0, this.hW.vo, this.hW.vn);
      c4 var4 = c4.G;
      var4.if();
      float var5 = this.hV > this.hU ? 120.0F / (float)this.hV : 120.0F / (float)this.hU;
      float var6 = (float)this.hU * var5 / 256.0F;
      float var7 = (float)this.hV * var5 / 256.0F;
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      var4.a(1.0F, 1.0F, 1.0F, 1.0F);
      int var8 = this.hV;
      int var9 = this.hU;
      var4.a(0.0D, (double)var9, (double)this.gH, (double)(0.5F - var6), (double)(0.5F + var7));
      var4.a((double)var8, (double)var9, (double)this.gH, (double)(0.5F - var6), (double)(0.5F - var7));
      var4.a((double)var8, 0.0D, (double)this.gH, (double)(0.5F + var6), (double)(0.5F - var7));
      var4.a(0.0D, 0.0D, (double)this.gH, (double)(0.5F + var6), (double)(0.5F + var7));
      var4.for();
   }

   private static String d(String var0) {
      String var1 = "";

      try {
         URL var2 = new URL(var0);
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));

         char var5;
         int var7;
         for(boolean var4 = false; (var7 = var3.read()) != -1; var1 = var1 + var5) {
            var5 = (char)var7;
         }
      } catch (Exception var6) {
         System.out.println(var6);
      }

      var1 = var1.replace("\\n", "\n");
      var1 = var1.replace("\\247", "§");
      return var1;
   }

   public void new(int var1, int var2, int var3, int var4) {
      c4 var5 = c4.G;
      var5.if();
      var5.a((double)var1, (double)(var2 + var4), 0.0D, 0.0D, 1.0D);
      var5.a((double)(var1 + var3), (double)(var2 + var4), 0.0D, 1.0D, 1.0D);
      var5.a((double)(var1 + var3), (double)var2, 0.0D, 1.0D, 0.0D);
      var5.a((double)var1, (double)var2, 0.0D, 0.0D, 0.0D);
      var5.for();
   }

   public void if(int var1, int var2, float var3) {
      this.for(var1, var2, var3);
      c4 var4 = c4.G;
      short var5 = 274;
      int var6 = this.hV / 2 - var5 / 2;
      byte var7 = 30;
      this.a(0, 0, this.hV, this.hU, -2130706433, 16777215);
      this.a(0, 0, this.hV, this.hU, 0, Integer.MIN_VALUE);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

      try {
         BufferedImage var9;
         if (!h9) {
            String var8 = "http://allfightpvp.net/skin_gen.php?ratio=3&player=" + this.hW.vg.if + "&a=0&w=13&displayHairs=true";
            var9 = ImageIO.read(new URL(var8));
            ImageIO.write(var9, "png", new File(Minecraft.hQ(), "skin.png"));
            h9 = true;
         } else {
            File var20 = new File(Minecraft.hQ(), "skin.png");
            var9 = ImageIO.read(var20);
            this.hW.vb.a(var9, 1);
            this.new(var6 - 100, var7 - 18, var9.getWidth(), var9.getHeight());
         }
      } catch (Exception var19) {
      }

      this.hW.vb.for("/title/mclogo2.png");
      this.if(var6 + -40, var7 + 5, 0, 5, 155, 60);
      this.if(var6 + 80, var7 + 2, 0, 65, 200, 60);
      var4.a(16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.hV / 2 + 150), 10.0F, 0.0F);
      GL11.glScalef(0.6F, 0.6F, 0.6F);
      this.hW.vb.for("/gui/book.png");
      this.if(0, 0, 0, 0, 175, 180);
      GL11.glScalef(1.4F, 1.4F, 1.5F);
      long var21 = iy;
      long var10 = (new Date()).getTime();
      long var12 = var10 - var21;
      long var14 = var12 / 1000L;
      if (var14 > 60L) {
         iy = (new Date()).getTime();
         ih = d("http://allfightpvp.com/lanceur/event.txt");
      }

      this.if(ih, -15);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.hV / 2 + 90), 70.0F, 0.0F);
      GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
      float var16 = 1.8F - ajs.do(ajs.try((float)(Minecraft.h1() % 1000L) / 1000.0F * 3.1415927F * 2.0F) * 0.1F);
      var16 = var16 * 100.0F / (float)(this.hR.for(this.iz) + 16);
      GL11.glScalef(var16, var16, var16);
      this.a(this.hR, this.iz, 0, -8, 16776960);
      GL11.glPopMatrix();
      this.if(this.hR, "§cBonjour§e§l " + this.hW.vg.if + " §c!", this.hV / 2 - 163, this.hU / 4 + 30, 16777215);
      String var17 = "Version 0.8 AllFight Saison 2 - 2013";
      if (this.hW.h6()) {
         var17 = var17 + " Demo";
      }

      this.if(this.hR, var17, 2, this.hU - 10, 16777215);
      String var18 = "Accès aux serveurs :";
      this.if(this.hR, var18, this.hV / 2 - 190, this.hU / 4 + 48 + 32, 16777215);
      if (this.in != null && this.in.length() > 0) {
         a(this.ij - 2, this.ii - 2, this.ig + 2, this.is - 1, 1428160512);
         this.if(this.hR, this.in, this.ij, this.ii, 16777215);
         this.if(this.hR, iD, (this.hV - this.il) / 2, ((j6)this.hT.get(0)).hx - 12, 16777215);
      }

      if (this.iv.l(this.iv.hs) == 2) {
         this.iv.hw = ia;
      } else {
         this.iv.hw = "§c PVP Hardcore §c";
      }

      if (this.iA.l(this.iA.hs) == 2) {
         this.iA.hw = id;
      } else {
         this.iA.hw = "§9 PVP Factions §9";
      }

      super.if(var1, var2, var3);
   }

   private void if(String var1, int var2) {
      int var3 = 20;
      String[] var4 = var1.split("\n");
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         this.hR.if(var7, var2 + 40, var3, 16777215, false);
         var3 += 10;
      }

   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      if (this.in.length() > 0 && var1 >= this.ij && var1 <= this.ig && var2 >= this.ii && var2 <= this.is) {
         e3 var4 = new e3(this, "http://tinyurl.com/javappc", 13);
         var4.eo();
         this.hW.a((i5)var4);
      }

   }

   static Minecraft a(x var0) {
      return var0.hW;
   }

   static void a(x var0, aqy var1, int var2, int var3) {
      var0.if(var1, var2, var3);
   }

   static boolean n(boolean var0) {
      ip = var0;
      return var0;
   }

   static {
      iD = "Please click " + aqj.try + "here" + aqj.int + " for more information.";
   }
}
