import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class an7 {
   public static ajy try = new ajy();
   private static Map char = new HashMap();
   private static Set case = new HashSet();
   private static Set byte = new HashSet();
   protected ajw new;
   public final long int = System.currentTimeMillis();
   public static long for;
   public static long do;
   public static long if;
   public static long a;
   public boolean else = false;

   static void a(int var0, boolean var1, boolean var2, Class var3) {
      if (try.byte(var0)) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      } else if (char.containsKey(var3)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var3);
      } else {
         try.a(var0, var3);
         char.put(var3, var0);
         if (var1) {
            case.add(var0);
         }

         if (var2) {
            byte.add(var0);
         }

      }
   }

   public static an7 a(ajw var0, int var1) {
      try {
         Class var2 = (Class)try.for(var1);
         return var2 == null ? null : (an7)var2.newInstance();
      } catch (Exception var3) {
         var3.printStackTrace();
         var0.do("Skipping packet with id " + var1);
         return null;
      }
   }

   public static void a(DataOutputStream var0, byte[] var1) {
      var0.writeShort(var1.length);
      var0.write(var1);
   }

   public static byte[] if(DataInputStream var0) {
      short var1 = var0.readShort();
      if (var1 < 0) {
         throw new IOException("Key was smaller than nothing!  Weird key!");
      } else {
         byte[] var2 = new byte[var1];
         var0.readFully(var2);
         return var2;
      }
   }

   public final int do() {
      return (Integer)char.get(this.getClass());
   }

   public static an7 a(ajw var0, DataInputStream var1, boolean var2, Socket var3) {
      boolean var4 = false;
      an7 var5 = null;
      int var6 = var3.getSoTimeout();

      int var9;
      try {
         var9 = var1.read();
         if (var9 == -1) {
            return null;
         }

         if (var2 && !byte.contains(var9) || !var2 && !case.contains(var9)) {
            throw new IOException("Bad packet id " + var9);
         }

         var5 = a(var0, var9);
         if (var5 == null) {
            throw new IOException("Bad packet id " + var9);
         }

         var5.new = var0;
         if (var5 instanceof aop) {
            var3.setSoTimeout(1500);
         }

         var5.for(var1);
         ++for;
         do += (long)var5.for();
      } catch (EOFException var8) {
         var0.do("Reached end of stream");
         return null;
      }

      ajr.a(var9, (long)var5.for());
      ++for;
      do += (long)var5.for();
      var3.setSoTimeout(var6);
      return var5;
   }

   public static void a(an7 var0, DataOutputStream var1) {
      var1.write(var0.do());
      var0.a(var1);
      ++if;
      a += (long)var0.for();
   }

   public static void a(String var0, DataOutputStream var1) {
      if (var0.length() > 32767) {
         throw new IOException("String too big");
      } else {
         var1.writeShort(var0.length());
         var1.writeChars(var0);
      }
   }

   public static String a(DataInputStream var0, int var1) {
      short var2 = var0.readShort();
      if (var2 > var1) {
         throw new IOException("Received string length longer than maximum allowed (" + var2 + " > " + var1 + ")");
      } else if (var2 < 0) {
         throw new IOException("Received string length is less than zero! Weird string!");
      } else {
         StringBuilder var3 = new StringBuilder();

         for(int var4 = 0; var4 < var2; ++var4) {
            var3.append(var0.readChar());
         }

         return var3.toString();
      }
   }

   public abstract void for(DataInputStream var1);

   public abstract void a(DataOutputStream var1);

   public abstract void a(an6 var1);

   public abstract int for();

   public boolean if() {
      return false;
   }

   public boolean a(an7 var1) {
      return false;
   }

   public boolean a() {
      return false;
   }

   public String toString() {
      String var1 = this.getClass().getSimpleName();
      return var1;
   }

   public static abp do(DataInputStream var0) {
      abp var1 = null;
      short var2 = var0.readShort();
      if (var2 >= 0) {
         byte var3 = var0.readByte();
         short var4 = var0.readShort();
         var1 = new abp(var2, var3, var4);
         var1.int = a(var0);
      }

      return var1;
   }

   public static void a(abp var0, DataOutputStream var1) {
      if (var0 == null) {
         var1.writeShort(-1);
      } else {
         var1.writeShort(var0.new);
         var1.writeByte(var0.if);
         var1.writeShort(var0.new());
         aqv var2 = null;
         if (var0.d().char() || var0.d().c()) {
            var2 = var0.int;
         }

         a(var2, var1);
      }

   }

   public static aqv a(DataInputStream var0) {
      short var1 = var0.readShort();
      if (var1 < 0) {
         return null;
      } else {
         byte[] var2 = new byte[var1];
         var0.readFully(var2);
         return aqk.a(var2);
      }
   }

   protected static void a(aqv var0, DataOutputStream var1) {
      if (var0 == null) {
         var1.writeShort(-1);
      } else {
         byte[] var2 = aqk.a(var0);
         var1.writeShort((short)var2.length);
         var1.write(var2);
      }

   }

   static {
      a(0, true, true, aon.class);
      a(1, true, true, aog.class);
      a(2, false, true, ao5.class);
      a(3, true, true, apf.class);
      a(4, true, false, ani.class);
      a(5, true, false, anq.class);
      a(6, true, false, anj.class);
      a(7, false, true, aoo.class);
      a(8, true, false, ano.class);
      a(9, true, true, anz.class);
      a(10, true, true, aob.class);
      a(11, true, true, aoa.class);
      a(12, true, true, an8.class);
      a(13, true, true, an9.class);
      a(14, false, true, an4.class);
      a(15, false, true, am8.class);
      a(16, true, true, anw.class);
      a(17, true, false, aot.class);
      a(18, true, true, apl.class);
      a(19, false, true, an3.class);
      a(20, true, false, apn.class);
      a(22, true, false, anf.class);
      a(23, true, false, apx.class);
      a(24, true, false, apr.class);
      a(25, true, false, app.class);
      a(26, true, false, apv.class);
      a(28, true, false, anr.class);
      a(29, true, false, an1.class);
      a(30, true, false, aof.class);
      a(31, true, false, aoe.class);
      a(32, true, false, aoc.class);
      a(33, true, false, aod.class);
      a(34, true, false, ane.class);
      a(35, true, false, any.class);
      a(38, true, false, aos.class);
      a(39, true, false, anl.class);
      a(40, true, false, ans.class);
      a(41, true, false, am9.class);
      a(42, true, false, an0.class);
      a(43, true, false, anp.class);
      a(51, true, false, aom.class);
      a(52, true, false, apd.class);
      a(53, true, false, ana.class);
      a(54, true, false, anb.class);
      a(55, true, false, and.class);
      a(56, true, false, aok.class);
      a(60, true, false, aor.class);
      a(61, true, false, aoj.class);
      a(62, true, false, aoh.class);
      a(63, true, false, aoi.class);
      a(70, true, false, aoq.class);
      a(71, true, false, apt.class);
      a(100, true, false, aoz.class);
      a(101, true, true, ao0.class);
      a(102, false, true, ao1.class);
      a(103, true, false, aow.class);
      a(104, true, false, aoy.class);
      a(105, true, false, aox.class);
      a(106, true, true, ao3.class);
      a(107, true, true, anv.class);
      a(108, false, true, ao2.class);
      a(130, true, true, ang.class);
      a(131, true, false, ao4.class);
      a(132, true, false, anc.class);
      a(200, true, false, apj.class);
      a(201, true, false, an2.class);
      a(202, true, true, an5.class);
      a(203, true, true, aph.class);
      a(204, false, true, ao9.class);
      a(205, false, true, apb.class);
      a(206, true, false, ann.class);
      a(207, true, false, ank.class);
      a(208, true, false, ant.class);
      a(209, true, false, anm.class);
      a(250, true, true, aov.class);
      a(252, true, true, anh.class);
      a(253, true, false, anx.class);
      a(254, false, true, aop.class);
      a(255, true, true, aou.class);
   }
}
