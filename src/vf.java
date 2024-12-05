import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class vf {
   public static ac2 H = new ac2("ModLoader");
   public static m else;
   public static m L;
   public static m u;
   public static ac2 x;
   public static m try;
   public static m E;
   public static m C;
   public static ac2 J;
   public static sw for;
   public static m p;
   public static ac2 X;
   public static m O;
   public static ac2 A;
   public static sw B;
   public static ac2 a;
   public static m new;
   public static m R;
   public static m y;
   public static m V;
   public static m l;
   public static m f;
   public static m t;
   public static m n;
   public static m N;
   public static ac2 I;
   public static m K;
   public static m v;
   public static m o;
   public static m q;
   public static m i;
   public static m F;
   public static m U;
   public static m byte;
   public static ac2 b;
   public static m do;
   public static m char;
   public static m long;
   public static ac2 d;
   public static m s;
   public static m M;
   public static ac2 S;
   public static m D;
   public static m G;
   public static ac2 m;
   public static m Q;
   public static ac2 T;
   public static m int;
   public static ac2 c;
   public static pv z;
   public static ac2 j;
   public static m r;
   public static ac2 w;
   public static pv W;
   public static ac2 case;
   public static m if;
   public static m h;
   public static m P;
   public static ac2 k;
   public static sw e;
   public static sw goto;
   public static ac2 void;
   public static m g;

   public static void do(m var0, Object... var1) {
      try {
         Method var2 = var0.if();
         if (var2 == null) {
            return;
         }

         var2.invoke((Object)null, var1);
      } catch (Throwable var3) {
         a(var3, (Object)null, var0, var1);
      }

   }

   public static boolean int(m var0, Object... var1) {
      try {
         Method var2 = var0.if();
         if (var2 == null) {
            return false;
         } else {
            Boolean var3 = (Boolean)var2.invoke((Object)null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         a(var4, (Object)null, var0, var1);
         return false;
      }
   }

   public static int a(m var0, Object... var1) {
      try {
         Method var2 = var0.if();
         if (var2 == null) {
            return 0;
         } else {
            Integer var3 = (Integer)var2.invoke((Object)null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         a(var4, (Object)null, var0, var1);
         return 0;
      }
   }

   public static float for(m var0, Object... var1) {
      try {
         Method var2 = var0.if();
         if (var2 == null) {
            return 0.0F;
         } else {
            Float var3 = (Float)var2.invoke((Object)null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         a(var4, (Object)null, var0, var1);
         return 0.0F;
      }
   }

   public static String new(m var0, Object... var1) {
      try {
         Method var2 = var0.if();
         if (var2 == null) {
            return null;
         } else {
            String var3 = (String)var2.invoke((Object)null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         a(var4, (Object)null, var0, var1);
         return null;
      }
   }

   public static Object if(m var0, Object... var1) {
      try {
         Method var2 = var0.if();
         if (var2 == null) {
            return null;
         } else {
            Object var3 = var2.invoke((Object)null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         a(var4, (Object)null, var0, var1);
         return null;
      }
   }

   public static void for(Object var0, m var1, Object... var2) {
      try {
         if (var0 == null) {
            return;
         }

         Method var3 = var1.if();
         if (var3 == null) {
            return;
         }

         var3.invoke(var0, var2);
      } catch (Throwable var4) {
         a(var4, var0, var1, var2);
      }

   }

   public static boolean int(Object var0, m var1, Object... var2) {
      try {
         Method var3 = var1.if();
         if (var3 == null) {
            return false;
         } else {
            Boolean var4 = (Boolean)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return false;
      }
   }

   public static int new(Object var0, m var1, Object... var2) {
      try {
         Method var3 = var1.if();
         if (var3 == null) {
            return 0;
         } else {
            Integer var4 = (Integer)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return 0;
      }
   }

   public static float do(Object var0, m var1, Object... var2) {
      try {
         Method var3 = var1.if();
         if (var3 == null) {
            return 0.0F;
         } else {
            Float var4 = (Float)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return 0.0F;
      }
   }

   public static String a(Object var0, m var1, Object... var2) {
      try {
         Method var3 = var1.if();
         if (var3 == null) {
            return null;
         } else {
            String var4 = (String)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return null;
      }
   }

   public static Object if(Object var0, m var1, Object... var2) {
      try {
         Method var3 = var1.if();
         if (var3 == null) {
            return null;
         } else {
            Object var4 = var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         a(var5, var0, var1, var2);
         return null;
      }
   }

   public static Object a(sw var0) {
      return a((Object)null, (sw)var0);
   }

   public static Object a(Object var0, sw var1) {
      try {
         Field var2 = var1.if();
         if (var2 == null) {
            return null;
         } else {
            Object var3 = var2.get(var0);
            return var3;
         }
      } catch (Throwable var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void a(sw var0, Object var1) {
      a((Object)null, (sw)var0, (Object)var1);
   }

   public static void a(Object var0, sw var1, Object var2) {
      try {
         Field var3 = var1.if();
         if (var3 == null) {
            return;
         }

         var3.set(var0, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public static void a(pv var0, Object... var1) {
      try {
         Object var2 = a(B);
         if (var2 == null) {
            return;
         }

         Constructor var3 = var0.a();
         if (var3 == null) {
            return;
         }

         Object var4 = var3.newInstance(var1);
         for(var2, r, var4);
      } catch (Throwable var5) {
         var5.printStackTrace();
      }

   }

   public static boolean a(Class[] var0, Class[] var1) {
      if (var0.length != var1.length) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            Class var3 = var0[var2];
            Class var4 = var1[var2];
            if (var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   private static void a(boolean var0, String var1, m var2, Object[] var3, Object var4) {
      String var5 = var2.if().getDeclaringClass().getName();
      String var6 = var2.if().getName();
      String var7 = "";
      if (var0) {
         var7 = " static";
      }

      qs.for(var1 + var7 + " " + var5 + "." + var6 + "(" + qs.a(var3) + ") => " + var4);
   }

   private static void a(boolean var0, String var1, m var2, Object[] var3) {
      String var4 = var2.if().getDeclaringClass().getName();
      String var5 = var2.if().getName();
      String var6 = "";
      if (var0) {
         var6 = " static";
      }

      qs.for(var1 + var6 + " " + var4 + "." + var5 + "(" + qs.a(var3) + ")");
   }

   private static void a(boolean var0, String var1, sw var2, Object var3) {
      String var4 = var2.if().getDeclaringClass().getName();
      String var5 = var2.if().getName();
      String var6 = "";
      if (var0) {
         var6 = " static";
      }

      qs.for(var1 + var6 + " " + var4 + "." + var5 + " => " + var3);
   }

   private static void a(Throwable var0, Object var1, m var2, Object[] var3) {
      if (var0 instanceof InvocationTargetException) {
         var0.printStackTrace();
      } else {
         if (var0 instanceof IllegalArgumentException) {
            qs.for("*** IllegalArgumentException ***");
            qs.for("Method: " + var2.if());
            qs.for("Object: " + var1);
            qs.for("Parameter classes: " + qs.a(a(var3)));
            qs.for("Parameters: " + qs.a(var3));
         }

         qs.for("*** Exception outside of method ***");
         qs.for("Method deactivated: " + var2.if());
         var2.a();
         var0.printStackTrace();
      }
   }

   private static Object[] a(Object[] var0) {
      if (var0 == null) {
         return new Class[0];
      } else {
         Class[] var1 = new Class[var0.length];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Object var3 = var0[var2];
            if (var3 != null) {
               var1[var2] = var3.getClass();
            }
         }

         return var1;
      }
   }

   static {
      else = new m(H, "renderWorldBlock");
      L = new m(H, "renderInvBlock");
      u = new m(H, "renderBlockIsItemFull3D");
      x = new ac2("FMLRenderAccessLibrary");
      try = new m(x, "renderWorldBlock");
      E = new m(x, "renderInventoryBlock");
      C = new m(x, "renderItemAsFull3DBlock");
      J = new ac2("LightCache");
      for = new sw(J, "cache");
      p = new m(J, "clear");
      X = new ac2("BlockCoord");
      O = new m(X, "resetPool");
      A = new ac2("net.minecraftforge.common.MinecraftForge");
      B = new sw(A, "EVENT_BUS");
      a = new ac2("net.minecraftforge.common.ForgeHooks");
      new = new m(a, "onLivingSetAttackTarget");
      R = new m(a, "onLivingUpdate");
      y = new m(a, "onLivingAttack");
      V = new m(a, "onLivingHurt");
      l = new m(a, "onLivingDeath");
      f = new m(a, "onLivingDrops");
      t = new m(a, "onLivingFall");
      n = new m(a, "onLivingJump");
      N = new m(a, "isLivingOnLadder");
      I = new ac2("net.minecraftforge.client.ForgeHooksClient");
      K = new m(I, "onDrawBlockHighlight");
      v = new m(I, "orientBedCamera");
      o = new m(I, "dispatchRenderLast");
      q = new m(I, "onTextureLoadPre");
      i = new m(I, "onTextureLoad");
      F = new m(I, "setRenderPass");
      U = new m(I, "onTextureStitchedPre");
      byte = new m(I, "onTextureStitchedPost");
      b = new ac2("cpw.mods.fml.common.FMLCommonHandler");
      do = new m(b, "instance");
      char = new m(b, "handleServerStarting");
      long = new m(b, "handleServerAboutToStart");
      d = new ac2("cpw.mods.fml.client.FMLClientHandler");
      s = new m(d, "instance");
      M = new m(d, "isLoading");
      S = new ac2(xl.class);
      D = new m(S, "getSkyRenderer");
      G = new m(S, "getCloudRenderer");
      m = new ac2("net.minecraftforge.client.IRenderHandler");
      Q = new m(m, "render");
      T = new ac2("net.minecraftforge.common.DimensionManager");
      int = new m(T, "getStaticDimensionIDs");
      c = new ac2("net.minecraftforge.event.world.WorldEvent$Load");
      z = new pv(c, new Class[]{y6.class});
      j = new ac2("net.minecraftforge.event.EventBus");
      r = new m(j, "post");
      w = new ac2("net.minecraftforge.event.world.ChunkWatchEvent$UnWatch");
      W = new pv(w, new Class[]{zi.class, ak2.class});
      case = new ac2(pa.class);
      if = new m(case, "getBedDirection");
      h = new m(case, "isBedFoot");
      P = new m(case, "canRenderInPass");
      k = new ac2(aiw.class);
      e = new sw(k, "captureDrops");
      goto = new sw(k, "capturedDrops");
      void = new ac2(aiz.class);
      g = new m(void, "isCurativeItem");
   }
}
