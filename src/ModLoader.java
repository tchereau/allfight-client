import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Map.Entry;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public final class ModLoader {
   private static final Map t = new HashMap();
   private static final Map int = new HashMap();
   private static final File d = new File(Minecraft.hQ(), "/config/");
   private static final File new;
   public static Level c;
   private static Map for;
   private static long y;
   private static Field else;
   private static Field do;
   private static Field g;
   private static boolean m;
   private static final Map u;
   private static final Map A;
   private static Minecraft v;
   private static final Map k;
   private static String e;
   private static Map h;
   private static final File s;
   private static final Logger j;
   private static FileHandler goto;
   private static Method p;
   private static Method void;
   private static final File l;
   private static final LinkedList f;
   private static int byte;
   private static final Map q;
   private static final Map n;
   public static final Properties i;
   private static yn[] w;
   public static final String b = "ModLoader 1.5.1";
   private static e5 x;
   private static final List case;
   private static final Map r;
   private static final Map long;
   private static final Map try;
   private static final Map z;
   private static final Map if;
   private static y a;
   private static y char;
   private static y o;

   public static void a(akl var0, String var1, String var2) {
      try {
         if (var0.a().contains(".")) {
            String[] var3 = var0.a().split("\\.");
            if (var3.length == 2) {
               String var4 = var3[1];
               a("achievement." + var4, var1);
               a("achievement." + var4 + ".desc", var2);
               a(akf.class, var0, 1, aqz.if("achievement." + var4));
               a(akl.class, var0, 3, aqz.if("achievement." + var4 + ".desc"));
            } else {
               a(akf.class, var0, 1, var1);
               a(akl.class, var0, 3, var2);
            }
         } else {
            a(akf.class, var0, 1, var1);
            a(akl.class, var0, 3, var2);
         }
      } catch (IllegalArgumentException var5) {
         j.throwing("ModLoader", "AddAchievementDesc", var5);
         a((Throwable)var5);
      } catch (SecurityException var6) {
         j.throwing("ModLoader", "AddAchievementDesc", var6);
         a((Throwable)var6);
      } catch (NoSuchFieldException var7) {
         j.throwing("ModLoader", "AddAchievementDesc", var7);
         a((Throwable)var7);
      }

   }

   public static void a(xu var0, Class var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         if (!aiw.class.isAssignableFrom(var1)) {
            Exception var6 = new Exception(var1.getCanonicalName() + " is not an entity.");
            j.throwing("ModLoader", "addEntityTracker", var6);
            a((Throwable)var6);
         }

         try.put(var1, new g(var0, var1, var2, var3, var4, var5));
      }
   }

   public static Map a() {
      return Collections.unmodifiableMap(try);
   }

   public static int a(int var0, int var1) {
      j.finest("Finding fuel for " + var0);
      int var2 = 0;

      for(Iterator var3 = f.iterator(); var3.hasNext() && var2 == 0; var2 = ((xu)var3.next()).a(var0, var1)) {
      }

      if (var2 != 0) {
         j.finest("Returned " + var2);
      }

      return var2;
   }

   public static void a(Map var0) {
      if (!m) {
         do();
         j.fine("Initialized");
      }

      Iterator var1 = f.iterator();

      while(var1.hasNext()) {
         xu var2 = (xu)var1.next();
         var2.a(var0);
      }

   }

   public static int do(String var0) {
      try {
         String[] var1 = (String[])((String[])((String[])else.get((Object)null)));
         List var2 = Arrays.asList(var1);
         ArrayList var3 = new ArrayList();
         var3.addAll(var2);
         if (!var3.contains(var0)) {
            var3.add(var0);
         }

         int var4 = var3.indexOf(var0);
         else.set((Object)null, var3.toArray(new String[0]));
         return var4;
      } catch (IllegalArgumentException var5) {
         j.throwing("ModLoader", "AddArmor", var5);
         a((String)"An impossible error has occured!", (Throwable)var5);
      } catch (IllegalAccessException var6) {
         j.throwing("ModLoader", "AddArmor", var6);
         a((String)"An impossible error has occured!", (Throwable)var6);
      }

      return -1;
   }

   public static void if(yn var0) {
      yn[] var1 = tl.byte;
      List var2 = Arrays.asList(var1);
      ArrayList var3 = new ArrayList();
      var3.addAll(var2);
      if (!var3.contains(var0)) {
         var3.add(var0);
      }

      tl.byte = (yn[])((yn[])((yn[])var3.toArray(new yn[0])));
   }

   public static void a(ao6 var0) {
      case.add(var0);
   }

   public static void a(abr var0, aq8 var1) {
      z.put(var0, var1);
   }

   public static void a(net.minecraft.a.a var0) {
      ar1 var1 = var0.gM();
      if (var1 instanceof ao7) {
         ao7 var2 = (ao7)var1;
         Iterator var3 = case.iterator();

         while(var3.hasNext()) {
            ao6 var4 = (ao6)var3.next();
            var2.a(var4);
         }

         var3 = z.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var5 = (Entry)var3.next();
            rh.er.a(var5.getKey(), var5.getValue());
         }
      }

   }

   public static void a(String var0, String var1) {
      a(var0, "en_US", var1);
   }

   public static void a(String var0, String var1, String var2) {
      Object var3;
      if (h.containsKey(var1)) {
         var3 = (Map)h.get(var1);
      } else {
         var3 = new HashMap();
         h.put(var1, var3);
      }

      ((Map)var3).put(var0, var2);
   }

   public static void a(int var0, anu var1) {
      Object var2 = null;
      if (r.containsKey(var0)) {
         var2 = (List)r.get(var0);
      } else {
         var2 = new LinkedList();
         r.put(var0, var2);
      }

      ((List)var2).add(var1);
   }

   public static List a(int var0) {
      if (var0 != -1) {
         return r.containsKey(var0) ? Collections.unmodifiableList((List)r.get(var0)) : null;
      } else {
         LinkedList var1 = new LinkedList();
         Iterator var2 = r.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            var1.addAll(var3);
         }

         return var1;
      }
   }

   private static void a(ClassLoader var0, String var1) {
      try {
         String var2 = var1.split("\\.")[0];
         if (var2.contains("$")) {
            return;
         }

         if (i.containsKey(var2) && (i.getProperty(var2).equalsIgnoreCase("no") || i.getProperty(var2).equalsIgnoreCase("off"))) {
            return;
         }

         Package var3 = ModLoader.class.getPackage();
         if (var3 != null) {
            var2 = var3.getName() + "." + var2;
         }

         Class var4 = var0.loadClass(var2);
         if (!xu.class.isAssignableFrom(var4)) {
            return;
         }

         if(var4);
         xu var5 = (xu)var4.newInstance();
         if (var5 != null) {
            f.add(var5);
            j.fine("Mod Initialized: \"" + var5.toString() + "\" from " + var1);
            System.out.println("Mod Initialized: " + var5.toString());
         }
      } catch (Throwable var6) {
         j.fine("Failed to load mod from \"" + var1 + "\"");
         System.out.println("Failed to load mod from \"" + var1 + "\"");
         j.throwing("ModLoader", "addMod", var6);
         a(var6);
      }

   }

   public static void a(Object var0, String var1) {
      a(var0, "en_US", var1);
   }

   public static void a(Object var0, String var1, String var2) {
      String var3 = null;
      Exception var4;
      if (var0 instanceof abr) {
         abr var5 = (abr)var0;
         if (var5.int() != null) {
            var3 = var5.int() + ".name";
         }
      } else if (var0 instanceof pa) {
         pa var7 = (pa)var0;
         if (var7.long() != null) {
            var3 = var7.long() + ".name";
         }
      } else if (var0 instanceof abp) {
         abp var8 = (abp)var0;
         String var6 = abr.ai[var8.new].int(var8);
         if (var6 != null) {
            var3 = var6 + ".name";
         }
      } else {
         var4 = new Exception(var0.getClass().getName() + " cannot have name attached to it!");
         j.throwing("ModLoader", "AddName", var4);
         a((Throwable)var4);
      }

      if (var3 != null) {
         a(var3, var1, var2);
      } else {
         var4 = new Exception(var0 + " is missing name tag!");
         j.throwing("ModLoader", "AddName", var4);
         a((Throwable)var4);
      }

   }

   public static void a(abp var0, Object... var1) {
      aai.if().if(var0, var1);
   }

   public static void if(abp var0, Object... var1) {
      aai.if().a(var0, var1);
   }

   public static void a(int var0, abp var1, float var2) {
      aam.if().a(var0, var1, var2);
   }

   public static void a(Class var0, int var1, int var2, int var3, ah9 var4) {
      a(var0, var1, var2, var3, var4, (yn[])null);
   }

   public static void a(Class var0, int var1, int var2, int var3, ah9 var4, yn[] var5) {
      if (var0 == null) {
         throw new IllegalArgumentException("entityClass cannot be null");
      } else if (var4 == null) {
         throw new IllegalArgumentException("spawnList cannot be null");
      } else {
         if (var5 == null) {
            var5 = w;
         }

         for(int var6 = 0; var6 < var5.length; ++var6) {
            List var7 = var5[var6].a(var4);
            if (var7 != null) {
               boolean var8 = false;
               Iterator var9 = var7.iterator();

               while(var9.hasNext()) {
                  ym var10 = (ym)var9.next();
                  if (var10.char == var0) {
                     var10.a = var1;
                     var10.goto = var2;
                     var10.else = var3;
                     var8 = true;
                     break;
                  }
               }

               if (!var8) {
                  var7.add(new ym(var0, var1, var2, var3));
               }
            }
         }

      }
   }

   public static void a(String var0, int var1, int var2, int var3, ah9 var4) {
      a(var0, var1, var2, var3, var4, (yn[])null);
   }

   public static void a(String var0, int var1, int var2, int var3, ah9 var4, yn[] var5) {
      Class var6 = (Class)for.get(var0);
      if (var6 != null && aig.class.isAssignableFrom(var6)) {
         a(var6, var1, var2, var3, var4, var5);
      }

   }

   public static void a(y6 var0, int var1, int var2, int var3) {
      ajg var4 = (ajg)var0.if(var1, var2, var3);
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.r(); ++var5) {
            abp var6 = var4.do(var5);
            if (var6 != null) {
               double var7 = var0.o.nextDouble() * 0.8D + 0.1D;
               double var9 = var0.o.nextDouble() * 0.8D + 0.1D;

               afk var11;
               for(double var12 = var0.o.nextDouble() * 0.8D + 0.1D; var6.if > 0; var0.new(var11)) {
                  int var14 = var0.o.nextInt(21) + 10;
                  if (var14 > var6.if) {
                     var14 = var6.if;
                  }

                  var6.if -= var14;
                  var11 = new afk(var0, (double)var1 + var7, (double)var2 + var9, (double)var3 + var12, new abp(var6.new, var14, var6.new()));
                  double var15 = 0.05D;
                  var11.ai = var0.o.nextGaussian() * var15;
                  var11.ah = var0.o.nextGaussian() * var15 + 0.2D;
                  var11.ag = var0.o.nextGaussian() * var15;
                  if (var6.a()) {
                     var11.ba().do((aqv)var6.b().do());
                  }
               }

               var4.if(var5, (abp)null);
            }
         }
      }

   }

   public static List else() {
      return Collections.unmodifiableList(f);
   }

   public static Logger new() {
      return j;
   }

   public static Minecraft if() {
      if (v == null) {
         try {
            ThreadGroup var0 = Thread.currentThread().getThreadGroup();
            int var1 = var0.activeCount();
            Thread[] var2 = new Thread[var1];
            var0.enumerate(var2);

            int var3;
            for(var3 = 0; var3 < var2.length; ++var3) {
               System.out.println(var2[var3].getName());
            }

            for(var3 = 0; var3 < var2.length; ++var3) {
               if (var2[var3].getName().equals("Minecraft main thread")) {
                  v = (Minecraft)a((Class)Thread.class, (Object)var2[var3], (String)"target");
                  break;
               }
            }
         } catch (SecurityException var4) {
            j.throwing("ModLoader", "getMinecraftInstance", var4);
            throw new RuntimeException(var4);
         } catch (NoSuchFieldException var5) {
            j.throwing("ModLoader", "getMinecraftInstance", var5);
            throw new RuntimeException(var5);
         }
      }

      return v;
   }

   public static Object a(Class var0, Object var1, int var2) throws IllegalArgumentException, SecurityException, NoSuchFieldException {
      try {
         Field var3 = var0.getDeclaredFields()[var2];
         var3.setAccessible(true);
         return var3.get(var1);
      } catch (IllegalAccessException var4) {
         j.throwing("ModLoader", "getPrivateValue", var4);
         a((String)"An impossible error has occured!", (Throwable)var4);
         return null;
      }
   }

   public static Object a(Class var0, Object var1, String var2) throws IllegalArgumentException, SecurityException, NoSuchFieldException {
      try {
         Field var3 = var0.getDeclaredField(var2);
         var3.setAccessible(true);
         return var3.get(var1);
      } catch (IllegalAccessException var4) {
         j.throwing("ModLoader", "getPrivateValue", var4);
         a((String)"An impossible error has occured!", (Throwable)var4);
         return null;
      }
   }

   public static int a(xu var0, boolean var1) {
      int var2 = byte++;
      t.put(var2, var0);
      int.put(var2, var1);
      return var2;
   }

   private static void do() {
      m = true;

      try {
         v = Minecraft.ih();
         v.u6 = new g4(v);
         for = (Map)a(air.class, (Object)((Object)null), 0);
         a = (y)a(aa.class, (Object)v.uX, 1);
         char = (y)a(aa.class, (Object)v.uX, 2);
         o = (y)a(aa.class, (Object)v.uX, 3);
         do = Field.class.getDeclaredField("modifiers");
         do.setAccessible(true);
         g = az.class.getDeclaredFields()[0];
         g.setAccessible(true);
         else = bz.class.getDeclaredFields()[3];
         do.setInt(else, else.getModifiers() & -17);
         else.setAccessible(true);
         Field[] var0 = yn.class.getDeclaredFields();
         LinkedList var1 = new LinkedList();

         for(int var2 = 0; var2 < var0.length; ++var2) {
            Class var3 = var0[var2].getType();
            if ((var0[var2].getModifiers() & 8) != 0 && var3.isAssignableFrom(yn.class)) {
               yn var4 = (yn)var0[var2].get((Object)null);
               if (!(var4 instanceof yd) && !(var4 instanceof x3)) {
                  var1.add(var4);
               }
            }
         }

         w = (yn[])((yn[])((yn[])var1.toArray(new yn[0])));

         try {
            void = n4.class.getDeclaredMethod("a", Class.class, String.class);
         } catch (NoSuchMethodException var6) {
            void = n4.class.getDeclaredMethod("addMapping", Class.class, String.class);
         }

         void.setAccessible(true);

         try {
            p = air.class.getDeclaredMethod("a", Class.class, String.class, Integer.TYPE);
         } catch (NoSuchMethodException var5) {
            p = air.class.getDeclaredMethod("addMapping", Class.class, String.class, Integer.TYPE);
         }

         p.setAccessible(true);
      } catch (SecurityException var8) {
         j.throwing("ModLoader", "init", var8);
         a((Throwable)var8);
         throw new RuntimeException(var8);
      } catch (NoSuchFieldException var9) {
         j.throwing("ModLoader", "init", var9);
         a((Throwable)var9);
         throw new RuntimeException(var9);
      } catch (NoSuchMethodException var10) {
         j.throwing("ModLoader", "init", var10);
         a((Throwable)var10);
         throw new RuntimeException(var10);
      } catch (IllegalArgumentException var11) {
         j.throwing("ModLoader", "init", var11);
         a((Throwable)var11);
         throw new RuntimeException(var11);
      } catch (IllegalAccessException var12) {
         j.throwing("ModLoader", "init", var12);
         a((Throwable)var12);
         throw new RuntimeException(var12);
      }

      try {
         for();
         if (i.containsKey("loggingLevel")) {
            c = Level.parse(i.getProperty("loggingLevel"));
         }

         if (i.containsKey("grassFix")) {
            c2.Y = Boolean.parseBoolean(i.getProperty("grassFix"));
         }

         j.setLevel(c);
         if ((s.exists() || s.createNewFile()) && s.canWrite() && goto == null) {
            goto = new FileHandler(s.getPath());
            goto.setFormatter(new SimpleFormatter());
            j.addHandler(goto);
         }

         j.fine("ModLoader 1.5.1 Initializing...");
         System.out.println("ModLoader 1.5.1 Initializing...");
         File var13 = new File(ModLoader.class.getProtectionDomain().getCodeSource().getLocation().toURI());
         l.mkdirs();
         a(var13);
         byte();
         Iterator var14 = f.iterator();

         while(var14.hasNext()) {
            xu var15 = (xu)var14.next();
            var15.if();
            j.fine("Mod Loaded: \"" + var15.toString() + "\"");
            System.out.println("Mod Loaded: " + var15.toString());
            if (!i.containsKey(var15.getClass().getSimpleName())) {
               i.setProperty(var15.getClass().getSimpleName(), "on");
            }
         }

         Iterator var16 = f.iterator();

         while(var16.hasNext()) {
            xu var17 = (xu)var16.next();
            var17.a();
         }

         System.out.println("Done.");
         i.setProperty("loggingLevel", c.getName());
         i.setProperty("grassFix", Boolean.toString(c2.Y));
         v.u1.aw = a(v.u1.aw);
         v.u1.int();
         int();
         case();
      } catch (Throwable var7) {
         j.throwing("ModLoader", "init", var7);
         a("ModLoader has failed to initialize.", var7);
         if (goto != null) {
            goto.close();
         }

         throw new RuntimeException(var7);
      }
   }

   private static void int() {
      int var0;
      String var1;
      for(var0 = 0; var0 < pa.x.length; ++var0) {
         if (!aka.u.containsKey(16777216 + var0) && pa.x[var0] != null && pa.x[var0].byte()) {
            var1 = aqz.a("stat.mineBlock", pa.x[var0].p());
            aka.void[var0] = (new akh(16777216 + var0, var1, var0)).new();
            aka.q.add(aka.void[var0]);
         }
      }

      for(var0 = 0; var0 < abr.ai.length; ++var0) {
         if (!aka.u.containsKey(16908288 + var0) && abr.ai[var0] != null) {
            var1 = aqz.a("stat.useItem", abr.ai[var0].new());
            aka.char[var0] = (new akh(16908288 + var0, var1, var0)).new();
            if (var0 >= pa.x.length) {
               aka.r.add(aka.char[var0]);
            }
         }

         if (!aka.u.containsKey(16973824 + var0) && abr.ai[var0] != null && abr.ai[var0].char()) {
            var1 = aqz.a("stat.breakItem", abr.ai[var0].new());
            aka.byte[var0] = (new akh(16973824 + var0, var1, var0)).new();
         }
      }

      HashSet var2 = new HashSet();
      Iterator var3 = aai.if().a().iterator();

      while(var3.hasNext()) {
         aag var4 = (aag)var3.next();
         if (var4.a() != null) {
            var2.add(var4.a().new);
         }
      }

      var3 = aam.if().a().values().iterator();

      while(var3.hasNext()) {
         abp var7 = (abp)var3.next();
         var2.add(var7.new);
      }

      Iterator var8 = var2.iterator();

      while(var8.hasNext()) {
         int var5 = (Integer)var8.next();
         if (!aka.u.containsKey(16842752 + var5) && abr.ai[var5] != null) {
            String var6 = aqz.a("stat.craftItem", abr.ai[var5].new());
            aka.goto[var5] = (new akh(16842752 + var5, var6, var5)).new();
         }
      }

   }

   public static boolean a(Class var0) {
      Minecraft var1 = if();
      return var0 == null ? var1.u8 == null : (var1.u8 == null && var0 != null ? false : var0.isInstance(var1.u8));
   }

   public static boolean a(String var0) {
      Iterator var1 = f.iterator();

      while(var1.hasNext()) {
         xu var2 = (xu)var1.next();
         if (var0.contentEquals(var2.for())) {
            return true;
         }
      }

      return false;
   }

   public static void for() throws IOException {
      d.mkdir();
      if ((new.exists() || new.createNewFile()) && new.canRead()) {
         FileInputStream var0 = new FileInputStream(new);
         i.load(var0);
         var0.close();
      }

   }

   public static BufferedImage a(c3 var0, String var1) throws Exception {
      ai var2 = (ai)a(c3.class, (Object)var0, 10);
      InputStream var3 = var2.int().a(var1);
      if (var3 == null) {
         throw new Exception("Image not found: " + var1);
      } else {
         BufferedImage var4 = ImageIO.read(var3);
         if (var4 == null) {
            throw new Exception("Image corrupted: " + var1);
         } else {
            return var4;
         }
      }
   }

   public static void if(aek var0, abp var1) {
      Iterator var2 = f.iterator();

      while(var2.hasNext()) {
         xu var3 = (xu)var2.next();
         var3.a(var0, var1);
      }

   }

   public static void a(float var0, Minecraft var1) {
      var1.uG.if();
      var1.uG.if();
      var1.uG.a("modtick");
      if (!m) {
         do();
         j.fine("Initialized");
      }

      if (e == null || aqy.if().int() != e) {
         Properties var2 = null;

         try {
            var2 = (Properties)a(aqy.class, (Object)aqy.if(), 1);
         } catch (SecurityException var12) {
            j.throwing("ModLoader", "AddLocalization", var12);
            a((Throwable)var12);
         } catch (NoSuchFieldException var13) {
            j.throwing("ModLoader", "AddLocalization", var13);
            a((Throwable)var13);
         }

         e = aqy.if().int();
         if (var2 != null) {
            if (h.containsKey("en_US")) {
               var2.putAll((Map)h.get("en_US"));
            }

            if (!e.contentEquals("en_US") && h.containsKey(e)) {
               var2.putAll((Map)h.get(e));
            }
         }
      }

      long var14 = 0L;
      Iterator var4;
      Entry var5;
      if (var1.vk != null && var1.vk.ap != null) {
         var14 = var1.vk.ap.t();
         var4 = u.entrySet().iterator();

         label115:
         while(true) {
            do {
               if (!var4.hasNext()) {
                  break label115;
               }

               var5 = (Entry)var4.next();
            } while(y == var14 && (Boolean)var5.getValue());

            if (!((xu)var5.getKey()).a(var0, var1)) {
               var4.remove();
            }
         }
      }

      if (var1.u8 != null) {
         var4 = A.entrySet().iterator();

         label102:
         while(true) {
            do {
               if (!var4.hasNext()) {
                  break label102;
               }

               var5 = (Entry)var4.next();
            } while(y == var14 && (Boolean)var5.getValue() && var1.vk != null && var1.vk.ap != null);

            if (!((xu)var5.getKey()).a(var0, var1, var1.u8)) {
               var4.remove();
            }
         }
      }

      if (y != var14) {
         var4 = k.entrySet().iterator();

         label85:
         while(var4.hasNext()) {
            var5 = (Entry)var4.next();
            Iterator var6 = ((Map)var5.getValue()).entrySet().iterator();

            while(true) {
               Entry var7;
               boolean var9;
               boolean[] var10;
               boolean var11;
               do {
                  do {
                     if (!var6.hasNext()) {
                        continue label85;
                     }

                     var7 = (Entry)var6.next();
                     int var8 = ((k2)var7.getKey()).int;
                     if (var8 < 0) {
                        var8 += 100;
                        var9 = Mouse.isButtonDown(var8);
                     } else {
                        var9 = Keyboard.isKeyDown(var8);
                     }

                     var10 = (boolean[])((boolean[])((boolean[])var7.getValue()));
                     var11 = var10[1];
                     var10[1] = var9;
                  } while(!var9);
               } while(var11 && !var10[0]);

               ((xu)var5.getKey()).a((k2)var7.getKey());
            }
         }
      }

      y = var14;
      var1.uG.if();
      var1.uG.a("render");
      var1.uG.a("gameRenderer");
   }

   public static void a(aek var0, i5 var1) {
      if (!m) {
         do();
         j.fine("Initialized");
      }

      Minecraft var2 = if();
      if (var2.vk == var0 && var1 != null) {
         var2.a(var1);
      }

   }

   public static void a(x0 var0, int var1, int var2, y6 var3) {
      if (!m) {
         do();
         j.fine("Initialized");
      }

      Random var4 = new Random(var3.b());
      long var5 = var4.nextLong() / 2L * 2L + 1L;
      long var7 = var4.nextLong() / 2L * 2L + 1L;
      var4.setSeed((long)var1 * var5 + (long)var2 * var7 ^ var3.b());
      Iterator var9 = f.iterator();

      while(var9.hasNext()) {
         xu var10 = (xu)var9.next();
         if (var3.n.a()) {
            var10.a(var3, var4, var1 << 4, var2 << 4);
         } else if (var3.n.int) {
            var10.if(var3, var4, var1 << 4, var2 << 4);
         }
      }

   }

   private static void a(File var0) throws FileNotFoundException, IOException {
      j.finer("Adding mods from " + var0.getCanonicalPath());
      ClassLoader var1 = ModLoader.class.getClassLoader();
      String var2;
      if (!var0.isFile() || !var0.getName().endsWith(".jar") && !var0.getName().endsWith(".zip")) {
         if (var0.isDirectory()) {
            Package var9 = ModLoader.class.getPackage();
            if (var9 != null) {
               String var10 = var9.getName().replace('.', File.separatorChar);
               var0 = new File(var0, var10);
            }

            j.finer("Directory found.");
            File[] var11 = var0.listFiles();
            if (var11 != null) {
               for(int var12 = 0; var12 < var11.length; ++var12) {
                  var2 = var11[var12].getName();
                  if (var11[var12].isFile() && var2.startsWith("mod_") && var2.endsWith(".class")) {
                     a(var1, var2);
                  }
               }
            }
         }
      } else {
         j.finer("Zip found.");
         URL var3 = var0.toURI().toURL();
         FileInputStream var4 = new FileInputStream(var0);
         ZipInputStream var5 = new ZipInputStream(var4);
         var2 = null;

         while(true) {
            while(true) {
               ZipEntry var6;
               String var7;
               do {
                  var6 = var5.getNextEntry();
                  if (var6 == null) {
                     var4.close();
                     return;
                  }

                  var7 = var6.getName();
               } while(var6.isDirectory());

               if (var7.startsWith("mod_") && var7.endsWith(".class")) {
                  a(var1, var7);
               } else {
                  String var8;
                  if (var7.startsWith("resources/streaming/")) {
                     var8 = var7.substring(20);
                     char.a(var8, new URL(String.format("jar:%s!/%s", var3, var7)));
                  } else if (var7.startsWith("resources/music/")) {
                     var8 = var7.substring(16);
                     o.a(var8, new URL(String.format("jar:%s!/%s", var3, var7)));
                  } else if (var7.startsWith("resources/sound/")) {
                     var8 = var7.substring(16);
                     a.a(var8, new URL(String.format("jar:%s!/%s", var3, var7)));
                  }
               }
            }
         }
      }

   }

   public static void a(aov var0) {
      if (var0.cu.equals("ML|OpenTE")) {
         try {
            DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0.cv));
            int var2 = var1.read();
            int var3 = var1.readInt();
            int var4 = var1.readInt();
            int var5 = var1.readInt();
            int var6 = var1.readInt();
            byte var7 = (byte)var1.read();
            eu var8 = v.vk;
            if (var8.a6 != var7) {
               return;
            }

            if (long.containsKey(var3)) {
               xu var9 = (xu)long.get(var3);
               if (var9 != null) {
                  il var10 = var9.a(var8, var3, var4, var5, var6);
                  if (var10 == null) {
                     return;
                  }

                  v.a((i5)var10);
                  var8.fP.new = var2;
               }
            }
         } catch (IOException var11) {
            var11.printStackTrace();
         }
      } else if (n.containsKey(var0.cu)) {
         xu var12 = (xu)n.get(var0.cu);
         if (var12 != null) {
            var12.a(x, var0);
         }
      }

   }

   public static void a(akx var0, aov var1) {
      if (n.containsKey(var1.cu)) {
         xu var2 = (xu)n.get(var1.cu);
         if (var2 != null) {
            var2.a(var0, var1);
         }
      }

   }

   public static void a(xu var0, int var1) {
      long.put(var1, var0);
   }

   public static void a(aoz var0) {
   }

   public static void a(ak2 var0, ad1 var1, int var2, int var3, int var4, int var5) {
      try {
         Field var6 = ak2.class.getDeclaredFields()[16];
         var6.setAccessible(true);
         int var7 = var6.getInt(var0);
         var7 = var7 % 100 + 1;
         var6.setInt(var0, var7);
         ByteArrayOutputStream var8 = new ByteArrayOutputStream();
         DataOutputStream var9 = new DataOutputStream(var8);
         var9.write(var7);
         var9.writeInt(var2);
         var9.writeInt(var3);
         var9.writeInt(var4);
         var9.writeInt(var5);
         var9.write(var0.a6);
         var0.pV.if((an7)(new aov("ML|OpenTE", var8.toByteArray())));
         var0.fP = var1;
         var0.fP.new = var7;
         var0.fP.a((adv)var0);
      } catch (Exception var10) {
         var10.printStackTrace();
      }

   }

   public static k2[] a(k2[] var0) {
      LinkedList var1 = new LinkedList();
      var1.addAll(Arrays.asList(var0));
      Iterator var2 = k.values().iterator();

      while(var2.hasNext()) {
         Map var3 = (Map)var2.next();
         var1.addAll(var3.keySet());
      }

      return (k2[])((k2[])((k2[])var1.toArray(new k2[0])));
   }

   public static void a(pa var0) {
      a(var0, (Class)null);
   }

   public static void a(pa var0, Class var1) {
      try {
         if (var0 == null) {
            throw new IllegalArgumentException("block parameter cannot be null.");
         }

         int var2 = var0.void;
         aaz var3 = null;
         if (var1 != null) {
            var3 = (aaz)var1.getConstructor(Integer.TYPE).newInstance(var2 - 256);
         } else {
            var3 = new aaz(var2 - 256);
         }

         if (pa.x[var2] != null && abr.ai[var2] == null) {
            abr.ai[var2] = var3;
         }
      } catch (IllegalArgumentException var4) {
         j.throwing("ModLoader", "RegisterBlock", var4);
         a((Throwable)var4);
      } catch (IllegalAccessException var5) {
         j.throwing("ModLoader", "RegisterBlock", var5);
         a((Throwable)var5);
      } catch (SecurityException var6) {
         j.throwing("ModLoader", "RegisterBlock", var6);
         a((Throwable)var6);
      } catch (InstantiationException var7) {
         j.throwing("ModLoader", "RegisterBlock", var7);
         a((Throwable)var7);
      } catch (InvocationTargetException var8) {
         j.throwing("ModLoader", "RegisterBlock", var8);
         a((Throwable)var8);
      } catch (NoSuchMethodException var9) {
         j.throwing("ModLoader", "RegisterBlock", var9);
         a((Throwable)var9);
      }

   }

   public static void a(Class var0, String var1, int var2) {
      try {
         p.invoke((Object)null, var0, var1, var2);
      } catch (IllegalArgumentException var4) {
         j.throwing("ModLoader", "RegisterEntityID", var4);
         a((Throwable)var4);
      } catch (IllegalAccessException var5) {
         j.throwing("ModLoader", "RegisterEntityID", var5);
         a((Throwable)var5);
      } catch (InvocationTargetException var6) {
         j.throwing("ModLoader", "RegisterEntityID", var6);
         a((Throwable)var6);
      }

   }

   public static void a(Class var0, String var1, int var2, int var3, int var4) {
      a(var0, var1, var2);
      air.if.put(var2, new aiq(var2, var3, var4));
   }

   public static void a(xu var0, k2 var1, boolean var2) {
      Object var3 = (Map)k.get(var0);
      if (var3 == null) {
         var3 = new HashMap();
      }

      boolean[] var4 = new boolean[]{var2, false};
      ((Map)var3).put(var1, var4);
      k.put(var0, var3);
   }

   public static void a(xu var0, String var1) {
      if (var1.length() < 16) {
         n.put(var1, var0);
      } else {
         throw new RuntimeException(String.format("Invalid channel name: %s. Must be less than 16 characters.", var1));
      }
   }

   public static void a(Class var0, String var1) {
      a(var0, var1, (ay)null);
   }

   public static void a(Class var0, String var1, ay var2) {
      try {
         void.invoke((Object)null, var0, var1);
         if (var2 != null) {
            az var3 = az.void;
            Map var4 = (Map)g.get(var3);
            var4.put(var0, var2);
            var2.a(var3);
         }
      } catch (IllegalArgumentException var5) {
         j.throwing("ModLoader", "RegisterTileEntity", var5);
         a((Throwable)var5);
      } catch (IllegalAccessException var6) {
         j.throwing("ModLoader", "RegisterTileEntity", var6);
         a((Throwable)var6);
      } catch (InvocationTargetException var7) {
         j.throwing("ModLoader", "RegisterTileEntity", var7);
         a((Throwable)var7);
      }

   }

   public static void a(yn var0) {
      yn[] var1 = tl.byte;
      List var2 = Arrays.asList(var1);
      ArrayList var3 = new ArrayList();
      var3.addAll(var2);
      if (var3.contains(var0)) {
         var3.remove(var0);
      }

      tl.byte = (yn[])((yn[])((yn[])var3.toArray(new yn[0])));
   }

   public static void a(Class var0, ah9 var1) {
      a(var0, var1, (yn[])null);
   }

   public static void a(Class var0, ah9 var1, yn[] var2) {
      if (var0 == null) {
         throw new IllegalArgumentException("entityClass cannot be null");
      } else if (var1 == null) {
         throw new IllegalArgumentException("spawnList cannot be null");
      } else {
         if (var2 == null) {
            var2 = w;
         }

         for(int var3 = 0; var3 < var2.length; ++var3) {
            List var4 = var2[var3].a(var1);
            if (var4 != null) {
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  ym var6 = (ym)var5.next();
                  if (var6.char == var0) {
                     var5.remove();
                  }
               }
            }
         }

      }
   }

   public static void a(String var0, ah9 var1) {
      a(var0, var1, (yn[])null);
   }

   public static void a(String var0, ah9 var1, yn[] var2) {
      Class var3 = (Class)for.get(var0);
      if (var3 != null && aig.class.isAssignableFrom(var3)) {
         a(var3, var1, var2);
      }

   }

   public static boolean if(int var0) {
      return !int.containsKey(var0) ? var0 == 35 : (Boolean)int.get(var0);
   }

   public static void a(c2 var0, pa var1, int var2, int var3) {
      xu var4 = (xu)t.get(var3);
      if (var4 != null) {
         var4.a(var0, var1, var2, var3);
      }

   }

   public static boolean a(c2 var0, yy var1, int var2, int var3, int var4, pa var5, int var6) {
      xu var7 = (xu)t.get(var6);
      return var7 == null ? false : var7.a(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void case() throws IOException {
      d.mkdir();
      if ((new.exists() || new.createNewFile()) && new.canWrite()) {
         FileOutputStream var0 = new FileOutputStream(new);
         i.store(var0, "ModLoader Config");
         var0.close();
      }

   }

   public static void if(String var0) {
      Iterator var1 = f.iterator();

      while(var1.hasNext()) {
         xu var2 = (xu)var1.next();
         var2.a(var0);
      }

   }

   public static void a(akx var0, String var1) {
      Iterator var2 = f.iterator();

      while(var2.hasNext()) {
         xu var3 = (xu)var2.next();
         var3.a(var0, var1);
      }

   }

   public static void a(e5 var0, aog var1) {
      x = var0;
      if (n.size() > 0) {
         aov var2 = new aov();
         var2.cu = "REGISTER";
         StringBuilder var3 = new StringBuilder();
         Iterator var4 = n.keySet().iterator();
         var3.append((String)var4.next());

         while(var4.hasNext()) {
            var3.append("\u0000");
            var3.append((String)var4.next());
         }

         var2.cv = var3.toString().getBytes(Charset.forName("UTF8"));
         var2.ct = var2.cv.length;
         a((an7)var2);
      }

      Iterator var5 = f.iterator();

      while(var5.hasNext()) {
         xu var6 = (xu)var5.next();
         var6.if(var0);
      }

   }

   public static void char() {
      Iterator var0 = f.iterator();

      while(var0.hasNext()) {
         xu var1 = (xu)var0.next();
         var1.a(x);
      }

      x = null;
   }

   public static void a(an7 var0) {
      if (x != null) {
         x.for(var0);
      }

   }

   public static void a(akx var0, an7 var1) {
      if (var0 != null) {
         var0.if(var1);
      }

   }

   public static void a(xu var0, boolean var1, boolean var2) {
      if (var1) {
         u.put(var0, var2);
      } else {
         u.remove(var0);
      }

   }

   public static void if(xu var0, boolean var1, boolean var2) {
      if (var1) {
         A.put(var0, var2);
      } else {
         A.remove(var0);
      }

   }

   public static void a(Class var0, Object var1, int var2, Object var3) throws IllegalArgumentException, SecurityException, NoSuchFieldException {
      try {
         Field var4 = var0.getDeclaredFields()[var2];
         var4.setAccessible(true);
         int var5 = do.getInt(var4);
         if ((var5 & 16) != 0) {
            do.setInt(var4, var5 & -17);
         }

         var4.set(var1, var3);
      } catch (IllegalAccessException var6) {
         j.throwing("ModLoader", "setPrivateValue", var6);
         a((String)"An impossible error has occured!", (Throwable)var6);
      }

   }

   public static void a(Class var0, Object var1, String var2, Object var3) throws IllegalArgumentException, SecurityException, NoSuchFieldException {
      try {
         Field var4 = var0.getDeclaredField(var2);
         int var5 = do.getInt(var4);
         if ((var5 & 16) != 0) {
            do.setInt(var4, var5 & -17);
         }

         var4.setAccessible(true);
         var4.set(var1, var3);
      } catch (IllegalAccessException var6) {
         j.throwing("ModLoader", "setPrivateValue", var6);
         a((String)"An impossible error has occured!", (Throwable)var6);
      }

   }

   private static void if(Class var0) throws IllegalArgumentException, IllegalAccessException, IOException, SecurityException, NoSuchFieldException, NoSuchAlgorithmException, DigestException {
      LinkedList var1 = new LinkedList();
      Properties var2 = new Properties();
      int var3 = 0;
      int var4 = 0;
      File var5 = new File(d, var0.getSimpleName() + ".cfg");
      if (var5.exists() && var5.canRead()) {
         var2.load(new FileInputStream(var5));
      }

      if (var2.containsKey("checksum")) {
         var4 = Integer.parseInt(var2.getProperty("checksum"), 36);
      }

      Field[] var6;
      int var7 = (var6 = var0.getDeclaredFields()).length;

      for(int var8 = 0; var8 < var7; ++var8) {
         Field var9 = var6[var8];
         if ((var9.getModifiers() & 8) != 0 && var9.isAnnotationPresent(j.class)) {
            var1.add(var9);
            Object var10 = var9.get((Object)null);
            var3 += var10.hashCode();
         }
      }

      StringBuilder var21 = new StringBuilder();
      Iterator var22 = var1.iterator();

      while(true) {
         j var12;
         String var13;
         Object var14;
         Object var18;
         double var19;
         Field var23;
         do {
            do {
               while(true) {
                  do {
                     do {
                        if (!var22.hasNext()) {
                           var2.put("checksum", Integer.toString(var3, 36));
                           if (!var2.isEmpty() && (var5.exists() || var5.createNewFile()) && var5.canWrite()) {
                              var2.store(new FileOutputStream(var5), var21.toString());
                           }

                           return;
                        }

                        var23 = (Field)var22.next();
                     } while((var23.getModifiers() & 8) == 0);
                  } while(!var23.isAnnotationPresent(j.class));

                  Class var11 = var23.getType();
                  var12 = (j)var23.getAnnotation(j.class);
                  var13 = var12.do().length() != 0 ? var12.do() : var23.getName();
                  var14 = var23.get((Object)null);
                  StringBuilder var15 = new StringBuilder();
                  if (var12.if() != Double.NEGATIVE_INFINITY) {
                     var15.append(String.format(",>=%.1f", var12.if()));
                  }

                  if (var12.a() != Double.POSITIVE_INFINITY) {
                     var15.append(String.format(",<=%.1f", var12.a()));
                  }

                  StringBuilder var16 = new StringBuilder();
                  if (var12.for().length() > 0) {
                     var16.append(" -- ");
                     var16.append(var12.for());
                  }

                  var21.append(String.format("%s (%s:%s%s)%s\n", var13, var11.getName(), var14, var15, var16));
                  if (var4 == var3 && var2.containsKey(var13)) {
                     String var17 = var2.getProperty(var13);
                     var18 = null;
                     if (var11.isAssignableFrom(String.class)) {
                        var18 = var17;
                     } else if (var11.isAssignableFrom(Integer.TYPE)) {
                        var18 = Integer.parseInt(var17);
                     } else if (var11.isAssignableFrom(Short.TYPE)) {
                        var18 = Short.parseShort(var17);
                     } else if (var11.isAssignableFrom(Byte.TYPE)) {
                        var18 = Byte.parseByte(var17);
                     } else if (var11.isAssignableFrom(Boolean.TYPE)) {
                        var18 = Boolean.parseBoolean(var17);
                     } else if (var11.isAssignableFrom(Float.TYPE)) {
                        var18 = Float.parseFloat(var17);
                     } else if (var11.isAssignableFrom(Double.TYPE)) {
                        var18 = Double.parseDouble(var17);
                     }
                     break;
                  }

                  j.finer(var13 + " not in config, using default: " + var14);
                  var2.setProperty(var13, var14.toString());
               }
            } while(var18 == null);

            if (!(var18 instanceof Number)) {
               break;
            }

            var19 = ((Number)var18).doubleValue();
         } while(var12.if() != Double.NEGATIVE_INFINITY && var19 < var12.if() || var12.a() != Double.POSITIVE_INFINITY && var19 > var12.a());

         j.finer(var13 + " set to " + var18);
         if (!var18.equals(var14)) {
            var23.set((Object)null, var18);
         }
      }
   }

   private static void byte() throws Exception {
      HashMap var0 = new HashMap();
      Iterator var1 = else().iterator();

      while(var1.hasNext()) {
         xu var2 = (xu)var1.next();
         var0.put(var2.getClass().getSimpleName(), var2);
      }

      LinkedList var18 = new LinkedList();
      int var3 = 0;

      label125:
      while(var18.size() != f.size() && var3 <= 10) {
         Iterator var4 = f.iterator();

         while(true) {
            xu var5;
            int var7;
            label121:
            while(true) {
               String var6;
               do {
                  while(true) {
                     do {
                        if (!var4.hasNext()) {
                           ++var3;
                           continue label125;
                        }

                        var5 = (xu)var4.next();
                     } while(var18.contains(var5));

                     var6 = var5.int();
                     if (var6 != null && var6.length() != 0 && var6.indexOf(58) != -1) {
                        break;
                     }

                     var18.add(var5);
                  }
               } while(var3 <= 0);

               var7 = -1;
               int var8 = Integer.MIN_VALUE;
               int var9 = Integer.MAX_VALUE;
               String[] var10;
               if (var6.indexOf(59) > 0) {
                  var10 = var6.split(";");
               } else {
                  var10 = new String[]{var6};
               }

               int var11 = 0;

               while(true) {
                  if (var11 >= var10.length) {
                     break label121;
                  }

                  String var12 = var10[var11];
                  if (var12.indexOf(58) != -1) {
                     String[] var13 = var12.split(":");
                     String var14 = var13[0];
                     String var15 = var13[1];
                     if (var14.contentEquals("required-before") || var14.contentEquals("before") || var14.contentEquals("after") || var14.contentEquals("required-after")) {
                        if (var15.contentEquals("*")) {
                           if (!var14.contentEquals("required-before") && !var14.contentEquals("before")) {
                              if (var14.contentEquals("required-after") || var14.contentEquals("after")) {
                                 var7 = var18.size();
                              }
                              break label121;
                           }

                           var7 = 0;
                           break label121;
                        }

                        if ((var14.contentEquals("required-before") || var14.contentEquals("required-after")) && !var0.containsKey(var15)) {
                           throw new Exception(String.format("%s is missing dependency: %s", var5, var15));
                        }

                        xu var16 = (xu)var0.get(var15);
                        if (!var18.contains(var16)) {
                           break;
                        }

                        int var17 = var18.indexOf(var16);
                        if (!var14.contentEquals("required-before") && !var14.contentEquals("before")) {
                           if (var14.contentEquals("required-after") || var14.contentEquals("after")) {
                              var7 = var17 + 1;
                              if (var7 > var8) {
                                 var8 = var7;
                              } else {
                                 var7 = var8;
                              }
                           }
                        } else {
                           var7 = var17;
                           if (var17 < var9) {
                              var9 = var17;
                           } else {
                              var7 = var9;
                           }
                        }
                     }
                  }

                  ++var11;
               }
            }

            if (var7 != -1) {
               var18.add(var7, var5);
            }
         }
      }

      f.clear();
      f.addAll(var18);
   }

   public static void a(aek var0, abp var1, ajg var2) {
      Iterator var3 = f.iterator();

      while(var3.hasNext()) {
         xu var4 = (xu)var3.next();
         var4.a(var0, var1, var2);
      }

   }

   public static void a(aek var0, abp var1) {
      Iterator var2 = f.iterator();

      while(var2.hasNext()) {
         xu var3 = (xu)var2.next();
         var3.if(var0, var1);
      }

   }

   public static void a(String var0, Throwable var1) {
      Minecraft var2 = if();
      if (var2 != null) {
         var2.int(new aqh(var0, var1));
      } else {
         throw new RuntimeException(var1);
      }
   }

   private static void a(Throwable var0) {
      a("Exception occured in ModLoader", var0);
   }

   public static String try() {
      StringBuilder var0 = new StringBuilder();
      var0.append("Mods loaded: ");
      var0.append(else().size() + 1);
      var0.append('\n');
      var0.append("ModLoader 1.5.1");
      var0.append('\n');
      Iterator var1 = else().iterator();

      while(var1.hasNext()) {
         xu var2 = (xu)var1.next();
         var0.append(var2.for());
         var0.append(' ');
         var0.append(var2.do());
         var0.append('\n');
      }

      return var0.toString();
   }

   public static void a(String var0, bh var1) {
      if.put(var0, var1);
   }

   public static bh for(String var0) {
      return !if.containsKey(var0) ? null : (bh)if.get(var0);
   }

   static {
      new = new File(d, "ModLoader.cfg");
      c = Level.FINER;
      for = null;
      y = 0L;
      else = null;
      do = null;
      g = null;
      m = false;
      u = new HashMap();
      A = new HashMap();
      v = null;
      k = new HashMap();
      e = null;
      h = new HashMap();
      s = new File(Minecraft.hQ(), "ModLoader.txt");
      j = Logger.getLogger("ModLoader");
      goto = null;
      p = null;
      void = null;
      l = new File(Minecraft.hQ(), "/mods/");
      f = new LinkedList();
      byte = 1000;
      q = new HashMap();
      n = new HashMap();
      i = new Properties();
      x = null;
      case = new LinkedList();
      r = new HashMap();
      long = new HashMap();
      try = new HashMap();
      z = new HashMap();
      if = new HashMap();
   }
}
