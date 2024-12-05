import java.util.List;
import java.util.Random;

public class v2 {
   private static final vo[] if = new vo[]{new vo(vz.class, 30, 0, true), new vo(v1.class, 10, 4), new vo(vn.class, 10, 4), new vo(vm.class, 10, 3), new vo(vq.class, 5, 2), new vo(vw.class, 5, 1)};
   private static final vo[] a = new vo[]{new vo(vt.class, 25, 0, true), new vo(vv.class, 15, 5), new vo(vs.class, 5, 10), new vo(vu.class, 5, 10), new vo(vy.class, 10, 3, true), new vo(vx.class, 7, 2), new vo(vr.class, 5, 2)};

   private static vp if(vo var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      Class var8 = var0.if;
      Object var9 = null;
      if (var8 == vz.class) {
         var9 = vz.i(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == v1.class) {
         var9 = v1.k(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vn.class) {
         var9 = vn.goto(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vm.class) {
         var9 = vm.else(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vq.class) {
         var9 = vq.long(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vw.class) {
         var9 = vw.f(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vt.class) {
         var9 = vt.c(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vs.class) {
         var9 = vs.b(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vu.class) {
         var9 = vu.d(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vy.class) {
         var9 = vy.h(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vx.class) {
         var9 = vx.g(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vv.class) {
         var9 = vv.e(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == vr.class) {
         var9 = vr.void(var1, var2, var3, var4, var5, var6, var7);
      }

      return (vp)var9;
   }

   // $FF: synthetic method
   static vp a(vo var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return if(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static vo[] if() {
      return if;
   }

   // $FF: synthetic method
   static vo[] a() {
      return a;
   }
}
