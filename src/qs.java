import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import net.minecraft.client.Minecraft;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class qs {
   public static final String for = "OptiFine";
   public static final String o = "1.5.1";
   public static final String new = "HD_U";
   public static final String i = "B1";
   public static final String h = "OptiFine_1.5.1_HD_U_B1";
   private static String n = null;
   private static ke p = null;
   private static Minecraft else = null;
   private static Thread m = null;
   private static int e = 16;
   private static int do = 16;
   private static Map d = new HashMap();
   private static long case = 0L;
   private static DisplayMode a = null;
   private static int char = 0;
   private static int if = 0;
   public static boolean k = false;
   private static PrintStream c;
   public static final Boolean g;
   public static final Float b;
   public static final Boolean void;
   public static final Boolean int;
   public static final Integer goto;
   public static final Integer byte;
   public static final Float l;
   public static final Boolean long;
   public static final Integer q;
   public static final Integer j;
   public static final Integer try;
   public static final Boolean f;

   public static String L() {
      return "OptiFine_1.5.1_HD_U_B1";
   }

   private static void W() {
      do("");
      do(L());
      do("" + new Date());
      do("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
      do("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      do("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
      do("LWJGL: " + Sys.getVersion());
      do("OpenGL: " + GL11.glGetString(7937) + " version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936));
      int var0 = O();
      String var1 = "" + var0 / 10 + "." + var0 % 10;
      do("OpenGL Version: " + var1);
      if (!GLContext.getCapabilities().OpenGL12) {
         do("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
      }

      if (!GLContext.getCapabilities().GL_NV_fog_distance) {
         do("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
      }

      if (!GLContext.getCapabilities().GL_ARB_occlusion_query) {
         do("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
      }

   }

   public static boolean h() {
      return GLContext.getCapabilities().GL_NV_fog_distance;
   }

   public static boolean H() {
      return GLContext.getCapabilities().GL_ARB_occlusion_query;
   }

   private static int O() {
      return !GLContext.getCapabilities().OpenGL11 ? 10 : (!GLContext.getCapabilities().OpenGL12 ? 11 : (!GLContext.getCapabilities().OpenGL13 ? 12 : (!GLContext.getCapabilities().OpenGL14 ? 13 : (!GLContext.getCapabilities().OpenGL15 ? 14 : (!GLContext.getCapabilities().OpenGL20 ? 15 : (!GLContext.getCapabilities().OpenGL21 ? 20 : (!GLContext.getCapabilities().OpenGL30 ? 21 : (!GLContext.getCapabilities().OpenGL31 ? 30 : (!GLContext.getCapabilities().OpenGL32 ? 31 : (!GLContext.getCapabilities().OpenGL33 ? 32 : (!GLContext.getCapabilities().OpenGL40 ? 33 : 40)))))))))));
   }

   public static void a(ke var0) {
      if (p == null) {
         if (!Display.isCreated()) {
            return;
         }

         W();
         k();
      }

      p = var0;
      else = p.au;
      m = Thread.currentThread();
      if (p != null) {
         char = p.k;
      }

      t();
   }

   public static void t() {
      try {
         ThreadGroup var0 = Thread.currentThread().getThreadGroup();
         if (var0 == null) {
            return;
         }

         int var1 = (var0.activeCount() + 10) * 2;
         Thread[] var2 = new Thread[var1];
         var0.enumerate(var2, false);
         byte var3 = 5;
         byte var4 = 5;
         if (P()) {
            var4 = 3;
         }

         m.setPriority(var3);

         for(int var5 = 0; var5 < var2.length; ++var5) {
            Thread var6 = var2[var5];
            if (var6 != null && var6 instanceof amm) {
               var6.setPriority(var4);
            }
         }
      } catch (Throwable var7) {
         for(var7.getMessage());
      }

   }

   public static boolean aa() {
      return Thread.currentThread() == m;
   }

   private static void k() {
      ajz var0 = new ajz();
      var0.start();
   }

   public static boolean j() {
      int var0 = try();
      return var0 > 0;
   }

   public static int try() {
      return p == null ? goto : p.z;
   }

   public static int ac() {
      return p == null ? byte : (p.do ? 9986 : 9984);
   }

   public static boolean ay() {
      float var0 = C();
      return var0 > l + 1.0E-5F;
   }

   public static float C() {
      return l;
   }

   public static boolean l() {
      return !h() ? false : (p == null ? false : p.case == 2);
   }

   public static boolean n() {
      return p == null ? false : p.case == 1;
   }

   public static boolean av() {
      return p == null ? false : p.case == 3;
   }

   public static float s() {
      return p == null ? b : p.char;
   }

   public static boolean az() {
      return p == null ? int : p.ai;
   }

   public static boolean x() {
      return !az() ? false : (p == null ? false : p.for);
   }

   public static boolean I() {
      return p == null ? long : p.e;
   }

   public static int K() {
      return p == null ? q : p.r;
   }

   public static void for(String var0) {
      c.print("[OptiFine] ");
      c.println(var0);
   }

   public static void do(String var0) {
      for(var0);
   }

   public static int ae() {
      return p != null ? p.f : 1;
   }

   public static boolean G() {
      return p != null ? p.aO : true;
   }

   public static boolean ab() {
      return p.s == 0 ? p.ag : p.s == 2;
   }

   public static boolean aq() {
      return p.ae == 0 ? p.ag : p.ae == 2;
   }

   public static boolean c() {
      return p.s == 3;
   }

   public static boolean o() {
      return p.bv == 0 ? p.ag : p.bv == 2;
   }

   public static boolean am() {
      return p.bv == 3;
   }

   public static boolean e() {
      return p.bk == 0 ? p.ag : p.bk == 2;
   }

   public static boolean X() {
      return p.t == 0 ? p.ag : p.t == 2;
   }

   public static boolean ai() {
      return p.g == 0 ? p.ag : p.g == 2;
   }

   public static int if(int var0, int var1, int var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   public static float a(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   public static float a(float var0) {
      return var0 < 0.0F ? 0.0F : (var0 > 1.0F ? 1.0F : var0);
   }

   public static boolean g() {
      return p != null ? p.A != 2 : true;
   }

   public static boolean p() {
      return p != null ? p.A == 1 : true;
   }

   public static boolean i() {
      return p != null ? p.aq : true;
   }

   public static boolean at() {
      return p != null ? p.R != 2 : true;
   }

   public static boolean M() {
      return p != null ? p.R == 1 : true;
   }

   public static boolean aC() {
      return p != null ? p.J : true;
   }

   public static boolean an() {
      return p != null ? p.p : true;
   }

   public static boolean V() {
      return p != null ? p.bg : true;
   }

   public static boolean E() {
      return p != null ? p.av : true;
   }

   public static boolean au() {
      return p != null ? p.n : true;
   }

   public static boolean for() {
      return p != null ? p.v : true;
   }

   public static boolean char() {
      return p != null ? p.a4 : true;
   }

   public static boolean ak() {
      return p != null ? p.a : true;
   }

   public static boolean as() {
      return p != null ? p.void : true;
   }

   public static boolean U() {
      return p != null ? p.b : true;
   }

   public static float else() {
      return p != null ? p.br : 0.0F;
   }

   private static Method a(Class var0, String var1, Object[] var2) {
      Method[] var3 = var0.getMethods();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Method var5 = var3[var4];
         if (var5.getName().equals(var1) && var5.getParameterTypes().length == var2.length) {
            return var5;
         }
      }

      for("No method found for: " + var0.getName() + "." + var1 + "(" + a(var2) + ")");
      return null;
   }

   public static String a(Object[] var0) {
      StringBuffer var1 = new StringBuffer(var0.length * 5);

      for(int var2 = 0; var2 < var0.length; ++var2) {
         Object var3 = var0[var2];
         if (var2 > 0) {
            var1.append(", ");
         }

         var1.append(String.valueOf(var3));
      }

      return var1.toString();
   }

   public static Minecraft T() {
      return else;
   }

   public static c3 q() {
      return else == null ? null : else.vb;
   }

   public static c9 int() {
      return else == null ? null : else.vl;
   }

   public static int F() {
      return e;
   }

   public static int aA() {
      return do;
   }

   public static void do(int var0) {
      do = var0;
   }

   public static void a(int var0) {
      e = var0;
   }

   public static int f() {
      return 64;
   }

   public static ajd a(yy var0, int var1, int var2, int var3, int var4, ajd var5) {
      if (!Y()) {
         return var5;
      } else {
         ajd var6 = ct.void;
         byte var7 = 2;
         if (var5 == ct.C) {
            var6 = ct.F;
            var7 = 110;
         }

         if (ag()) {
            --var2;
            switch(var4) {
            case 2:
               --var3;
               break;
            case 3:
               ++var3;
               break;
            case 4:
               --var1;
               break;
            case 5:
               ++var1;
            }

            int var8 = var0.new(var1, var2, var3);
            if (var8 != var7) {
               return var5;
            }
         }

         return var6;
      }
   }

   public static ajd a(yy var0, int var1, int var2, int var3, int var4) {
      if (!Y()) {
         return ct.q;
      } else {
         if (ag()) {
            switch(var4) {
            case 2:
               --var3;
               break;
            case 3:
               ++var3;
               break;
            case 4:
               --var1;
               break;
            case 5:
               ++var1;
            }

            int var5 = var0.new(var1, var2, var3);
            if (var5 != 78 && var5 != 80) {
               return ct.q;
            }
         }

         return ct.w;
      }
   }

   public static boolean Y() {
      return p == null ? false : p.aW != 3;
   }

   public static boolean ag() {
      return p == null ? false : p.aW == 2;
   }

   public static long if() {
      return case;
   }

   public static void a(long var0) {
      case = var0;
   }

   public static boolean byte() {
      return p == null ? true : p.j;
   }

   public static boolean ar() {
      return p == null ? true : p.E;
   }

   public static boolean r() {
      return p == null ? true : p.bw;
   }

   public static boolean do() {
      return p == null ? true : p.G;
   }

   public static void if(long var0) {
      try {
         Thread.currentThread();
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

   }

   public static boolean long() {
      return p == null ? false : p.y == 1;
   }

   public static boolean ax() {
      return p == null ? false : p.y == 0 || p.y == 2;
   }

   public static boolean void() {
      return p == null ? false : p.y == 3;
   }

   public static boolean D() {
      return p == null ? false : p.m;
   }

   public static int af() {
      return 1;
   }

   public static int aw() {
      return 0;
   }

   public static boolean a(int var0, int var1, int var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static boolean new() {
      return af() > 1 ? true : aw() > 0;
   }

   public static boolean case() {
      return p == null ? false : p.try;
   }

   public static boolean R() {
      return p == null ? false : p.h;
   }

   public static Dimension a() {
      if (a == null) {
         return null;
      } else if (p == null) {
         return new Dimension(a.getWidth(), a.getHeight());
      } else {
         String var0 = p.d;
         if (var0.equals("Default")) {
            return new Dimension(a.getWidth(), a.getHeight());
         } else {
            String[] var1 = if(var0, " x");
            return var1.length < 2 ? new Dimension(a.getWidth(), a.getHeight()) : new Dimension(a(var1[0], -1), a(var1[1], -1));
         }
      }
   }

   public static int a(String var0, int var1) {
      try {
         return var0 == null ? var1 : Integer.parseInt(var0);
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public static float a(String var0, float var1) {
      try {
         return var0 == null ? var1 : Float.parseFloat(var0);
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public static String[] if(String var0, String var1) {
      StringTokenizer var2 = new StringTokenizer(var0, var1);
      ArrayList var3 = new ArrayList();

      while(var2.hasMoreTokens()) {
         String var4 = var2.nextToken();
         var3.add(var4);
      }

      String[] var5 = (String[])((String[])((String[])var3.toArray(new String[var3.size()])));
      return var5;
   }

   public static DisplayMode goto() {
      return a;
   }

   public static void a(DisplayMode var0) {
      a = var0;
   }

   public static DisplayMode[] A() {
      try {
         DisplayMode[] var0 = Display.getAvailableDisplayModes();
         ArrayList var1 = new ArrayList();

         for(int var2 = 0; var2 < var0.length; ++var2) {
            DisplayMode var3 = var0[var2];
            if (a == null || var3.getBitsPerPixel() == a.getBitsPerPixel() && var3.getFrequency() == a.getFrequency()) {
               var1.add(var3);
            }
         }

         DisplayMode[] var5 = (DisplayMode[])((DisplayMode[])((DisplayMode[])var1.toArray(new DisplayMode[var1.size()])));
         d1 var6 = new d1();
         Arrays.sort(var5, var6);
         return var5;
      } catch (Exception var4) {
         var4.printStackTrace();
         return new DisplayMode[]{a};
      }
   }

   public static String[] m() {
      DisplayMode[] var0 = A();
      String[] var1 = new String[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         DisplayMode var3 = var0[var2];
         String var4 = "" + var3.getWidth() + "x" + var3.getHeight();
         var1[var2] = var4;
      }

      return var1;
   }

   public static DisplayMode a(Dimension var0) throws LWJGLException {
      DisplayMode[] var1 = Display.getAvailableDisplayModes();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         DisplayMode var3 = var1[var2];
         if (var3.getWidth() == var0.width && var3.getHeight() == var0.height && (a == null || var3.getBitsPerPixel() == a.getBitsPerPixel() && var3.getFrequency() == a.getFrequency())) {
            return var3;
         }
      }

      return a;
   }

   public static boolean d() {
      return p != null ? p.C : true;
   }

   public static boolean J() {
      return p != null ? p.F : true;
   }

   public static boolean ah() {
      return p != null ? p.c : true;
   }

   public static boolean Z() {
      return p != null ? p.X : true;
   }

   public static boolean w() {
      return p != null ? p.l : true;
   }

   public static void if(String var0) {
      int var1 = GL11.glGetError();
      if (var1 != 0) {
         String var2 = GLU.gluErrorString(var1);
         for("OpenGlError: " + var1 + " (" + var2 + "), at: " + var0);
      }

   }

   public static boolean N() {
      return p != null ? p.o : true;
   }

   public static boolean b() {
      return p != null ? p.bt : true;
   }

   public static boolean y() {
      return p != null ? p.byte : true;
   }

   public static boolean ad() {
      return p != null ? p.K : true;
   }

   public static boolean z() {
      return p != null ? p.a2 : true;
   }

   public static boolean aj() {
      return p != null ? p.u != 3 : false;
   }

   public static boolean al() {
      return p != null ? p.if : false;
   }

   public static boolean Q() {
      return p != null ? p.u == 2 : false;
   }

   public static String[] if(File var0) throws IOException {
      ArrayList var1 = new ArrayList();
      FileInputStream var2 = new FileInputStream(var0);
      InputStreamReader var3 = new InputStreamReader(var2, "ASCII");
      BufferedReader var4 = new BufferedReader(var3);

      while(true) {
         String var5 = var4.readLine();
         if (var5 == null) {
            String[] var6 = (String[])((String[])((String[])var1.toArray(new String[var1.size()])));
            return var6;
         }

         var1.add(var5);
      }
   }

   public static String a(File var0) throws IOException {
      FileInputStream var1 = new FileInputStream(var0);
      return a((InputStream)var1, "ASCII");
   }

   public static String a(InputStream var0) throws IOException {
      return a(var0, "ASCII");
   }

   public static String a(InputStream var0, String var1) throws IOException {
      InputStreamReader var2 = new InputStreamReader(var0, var1);
      BufferedReader var3 = new BufferedReader(var2);
      StringBuffer var4 = new StringBuffer();

      while(true) {
         String var5 = var3.readLine();
         if (var5 == null) {
            return var4.toString();
         }

         var4.append(var5);
         var4.append("\n");
      }
   }

   public static ke S() {
      return p;
   }

   public static String ap() {
      return n;
   }

   public static void int(String var0) {
      n = var0;
   }

   public static int a(String var0, String var1) {
      String[] var2 = a(var0);
      String[] var3 = a(var1);
      String var4 = var2[0];
      String var5 = var3[0];
      if (!var4.equals(var5)) {
         return var4.compareTo(var5);
      } else {
         int var6 = a(var2[1], -1);
         int var7 = a(var3[1], -1);
         if (var6 != var7) {
            return var6 - var7;
         } else {
            String var8 = var2[2];
            String var9 = var3[2];
            return var8.compareTo(var9);
         }
      }
   }

   private static String[] a(String var0) {
      if (var0 != null && var0.length() > 0) {
         String var1 = var0.substring(0, 1);
         if (var0.length() <= 1) {
            return new String[]{var1, "", ""};
         } else {
            int var2;
            for(var2 = 1; var2 < var0.length() && Character.isDigit(var0.charAt(var2)); ++var2) {
            }

            String var3 = var0.substring(1, var2);
            if (var2 >= var0.length()) {
               return new String[]{var1, var3, ""};
            } else {
               String var4 = var0.substring(var2);
               return new String[]{var1, var3, var4};
            }
         }
      } else {
         return new String[]{"", "", ""};
      }
   }

   public static int if(int var0) {
      var0 = var0 ^ 61 ^ var0 >> 16;
      var0 += var0 << 3;
      var0 ^= var0 >> 4;
      var0 *= 668265261;
      var0 ^= var0 >> 15;
      return var0;
   }

   public static int a(int var0, int var1, int var2, int var3) {
      int var4 = if(var3 + 37);
      var4 = if(var4 + var0);
      var4 = if(var4 + var2);
      var4 = if(var4 + var1);
      return var4;
   }

   public static void a(Minecraft var0) {
      ex var1 = var0.vm;
      if (var1 != null) {
         av var2 = var0.hV();
         if (var2 != null) {
            ss var3 = var1.j;
            if (var3 != null && var3.f().new() == 1) {
               xl var4 = var1.n;
               if (var4 != null) {
                  int var5 = var4.if;
                  if (var5 == 0) {
                     ak5 var6 = var2.aS(var5);
                     if (var6 != null) {
                        long var7 = var6.t();
                        long var9 = var7 % 24000L;
                        if (long()) {
                           if (var9 <= 1000L) {
                              var6.if(var7 - var9 + 1001L);
                           }

                           if (var9 >= 11000L) {
                              var6.if(var7 - var9 + 24001L);
                           }
                        }

                        if (void()) {
                           if (var9 <= 14000L) {
                              var6.if(var7 - var9 + 14001L);
                           }

                           if (var9 >= 22000L) {
                              var6.if(var7 - var9 + 24000L + 14001L);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public static ak5 v() {
      if (else == null) {
         return null;
      } else {
         ex var0 = else.vm;
         if (var0 == null) {
            return null;
         } else {
            xl var1 = var0.n;
            if (var1 == null) {
               return null;
            } else {
               int var2 = var1.if;
               av var3 = else.hV();
               if (var3 == null) {
                  return null;
               } else {
                  ak5 var4 = var3.aS(var2);
                  return var4;
               }
            }
         }
      }
   }

   public static int ao() {
      if (if < 1) {
         if = Runtime.getRuntime().availableProcessors();
      }

      return if;
   }

   public static boolean aB() {
      return ao() <= 1;
   }

   public static boolean P() {
      return ao() > 1 ? false : (p == null ? true : p.aa);
   }

   public static boolean B() {
      return ao() > 1 ? false : (p == null ? true : p.i);
   }

   public static int u() {
      if (p == null) {
         return 10;
      } else {
         int var0 = p.B / 16;
         return var0 <= 16 ? 10 : var0;
      }
   }

   static {
      c = new PrintStream(new FileOutputStream(FileDescriptor.out));
      g = true;
      b = 0.2F;
      void = false;
      int = false;
      goto = 0;
      byte = 9984;
      l = 0.1F;
      long = false;
      q = 0;
      j = 25;
      try = 3;
      f = false;
   }
}
